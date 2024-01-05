package leet_code.longest_consecutive_sequence128;

import java.util.HashSet;

public class Solution {

    public int longestConsecutive(int[] nums) {

        int sequenceCount = 1;
        int sequenceCountMax = 1;

        for (int i = 1; i < nums.length; i++) {
         if (nums[i]==nums[i-1]+1) {
                sequenceCount++;
         } else if (nums[i]>nums[i-1]+1) {
             sequenceCount=1;
         }
             if (sequenceCount > sequenceCountMax) {
                 sequenceCountMax = sequenceCount;
             }

         }return sequenceCountMax;
    }

    public static int longestConsecutive2(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}

