package practice.algorithms.leetcode.medium.reversewordsinastring;

public class Solution {
    public String reverseWords(String s) {
        String[] splittedString = s.split(" ");
        String ret = "";
        if (splittedString.length == 0 || "".equalsIgnoreCase(s)) {
            return ret;
        }
        
        for (int i = splittedString.length - 1; i >= 0; i--) {
       
            if (splittedString[i].equalsIgnoreCase("")) {
                continue;
            }
            ret += splittedString[i] + " "; 
        }
        return ret.substring(0, ret.length() - 1).trim();
    }
}