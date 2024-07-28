import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    class Node {
        int val;
        //Node next;
        Set<Integer> canReachNode = new HashSet<>();
        Set<Integer> cannotReachNode = new HashSet<>();

        Node(int val) {
            this.val = val;
        }

        public Set<Integer> getAllNeighbors() {
            cannotReachNode.addAll(canReachNode);
            return cannotReachNode;
        }

//        @Override
//        public String toString() {
//            return val + "->" + (next != null ? next.val : null);
//        }
    }
    public int minReorder(int n, int[][] connections) {
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        for (int[] connection : connections) {
            //nodes[connection[0]].next = nodes[connection[1]];
            nodes[connection[0]].canReachNode.add(connection[1]);
            nodes[connection[1]].cannotReachNode.add(connection[0]);
        }

        boolean[] visited = new boolean[n];
        return countReordersByDFS(nodes, visited);
    }

    private int countReordersByDFS(Node[] nodes, boolean[] visited) {
        Stack<Node> stack = new Stack<>();
        int changeRoadCounter = 0;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
               // System.out.println("pushing 1: " + nodes[i]);
                stack.push(nodes[i]);
            }

            while (!stack.isEmpty()) {
                Node currentNode = stack.pop();
               // System.out.println("Popping::" + currentNode);
                if (visited[currentNode.val]) {
                    continue;
                }
                visited[currentNode.val] = true;

                for (Integer neighbor : currentNode.getAllNeighbors()) {
                    if (!visited[neighbor]) {
                      //  System.out.println("pushing 2: " + nodes[i]);
                        stack.push(nodes[neighbor]);
                        if (currentNode.canReachNode.contains(neighbor)) {
                            ++changeRoadCounter;
                        }
                    }
                }
            }
        }
        return changeRoadCounter;
    }
}
