package practice.algorithms.leetcode.easy.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	String prefix = strs.length > 0 ? strs[0] : "";
    	for (int i = 1; i < strs.length; i++) {
    		prefix = commonPrefix(prefix, strs[i]); 
    	}
    	
    	return prefix; 
    }
    
    private String commonPrefix(String s1, String s2) {
    	int i = 1; 
    	
    	if (s1.length() >= s2.length()) {
	    	while (i <= s2.length() && s1.startsWith(s2.substring(0, i))) {
	    		i++;
	    	}
	    	return s2.substring(0, --i);
    	}
    	
    	if (s1.length() < s2.length()) { 
    		while (i <= s1.length() &&s2.startsWith(s1.substring(0, i))) {
	    		i++;
	    	}
    		return s1.substring(0, --i);
    	}
    	return "";
    	
    }
    
    public static void main (String[] args) {
    	String[] s = {"asdsdsad", "asddsdasd", "aaasssss", "aaaddddsss", "aaaddddsssww"}; 
    	System.out.println(new Solution().longestCommonPrefix(s));
    }
}