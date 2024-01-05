package leet_code.top_k_frequent_element347;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int[] arr = new int[k];
        int position = 0;

        for (int i = 0; i < k; i++) {
            int frequency = 0;
            int maxFreqFigure = 0;
            for (Map.Entry<Integer, Integer> item : map.entrySet()) {
                if(item.getValue() > frequency){
                    frequency = item.getValue();
                    maxFreqFigure = item.getKey();
                }
            }
            arr[position] = maxFreqFigure;
            map.put(maxFreqFigure, 0);
            position++;
        }return arr;

    }
}
