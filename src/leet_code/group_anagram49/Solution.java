package leet_code.group_anagram49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
           char[] sChar =  s.toCharArray();
            Arrays.sort(sChar);
            String sorted = new String(sChar);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }return new ArrayList<>(map.values());
    }
}
