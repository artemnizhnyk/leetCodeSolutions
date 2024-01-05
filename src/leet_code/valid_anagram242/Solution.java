package leet_code.valid_anagram242;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public boolean isAnagram(String s, String t) {

      char[] sChar = s.toCharArray();
      char[] tChar = t.toCharArray();

      Arrays.sort(sChar);
      Arrays.sort(tChar);

      return sChar.equals(tChar);
    }
}
