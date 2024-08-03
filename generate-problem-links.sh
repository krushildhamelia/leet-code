#!/usr/bin/env bash
cd solutions

for filename in *.java; do
    fileNameWithoutJava=$(echo ${filename} | cut -d "." -f 1) #Do not use spaces in assignment operations else it won't work [General Bash Hint]
    echo "https://leetcode.com/problems/$fileNameWithoutJava/description/"
done
