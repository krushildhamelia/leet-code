import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean winnerOfGame(String colors) {
//        StringBuilder sb = new StringBuilder(colors);
//
//        int size = sb.length() - 1;
//        char currentTurn = 'A'; // True = alice
//
//        //AAABABB
//        while(size > 1) {
//
//            int j = 1;
//            boolean wasRemoved = false;
//            while(j < size) {
//                boolean canRemove = sb.charAt(j-1) == currentTurn && sb.charAt(j + 1) == currentTurn && sb.charAt(j) == currentTurn;
//
//                if (canRemove) {
//                    System.out.println("j: " + j + ":" + sb.charAt(j) + ":" + sb + ":" + currentTurn);
//                    sb.deleteCharAt(j);
//                    currentTurn = currentTurn == 'A' ? 'B' : 'A';
//                    wasRemoved = true;
//                    break;
//                } else {
//                    j++;
//                }
//            }
//
//            if (!wasRemoved) {
//                return currentTurn == 'A' ? false : true;
//            }
//            size = sb.length() - 1;
//        }
//
//        return currentTurn == 'A' ? false : true;
        int alice = 0;
        int bob = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            boolean canRemove = colors.charAt(i) == colors.charAt(i - 1) && colors.charAt(i) == colors.charAt(i + 1);
            if (canRemove) {
                if (colors.charAt(i) == 'A') {
                    alice+=1;
                } else {
                    bob+=1;
                }
            }
//            System.out.println("canRemoveCounter" + canRemoveCounter);
        }
//        System.out.println(canRemoveCounter);
        return alice > bob;
    }
}