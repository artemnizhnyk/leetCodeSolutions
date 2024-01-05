package leet_code;

import leet_code.longest_consecutive_sequence128.Solution;

import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {

        Map<Integer,Integer> map = new TreeMap<>();
        map.put(1,3);
        map.put(2,2);
        map.put(3,4);
        map.put(4,1);
        System.out.println(map);

        int[] arr = new int[]{1,2,4,7,8,9};

        Solution.longestConsecutive2(arr);


}}
