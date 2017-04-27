package practice.algorithms.leetcode.medium.addtwonumbers;

import java.util.HashSet;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode prev =  new ListNode(0);
    	ListNode start = prev; 
    	int carry = 0;
    	while (l1 != null || l2 != null) {
            ListNode current = new ListNode(0);
            int sum =  (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry; 
    		current.val = sum % 10; 
    		carry = sum / 10;
            prev.next = current;
    		prev = current;
    		l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
    		
    	}
    	
    	if (carry != 0) {
    	    ListNode current = new ListNode(0);
    	    current.val = carry;
    	    prev.next = current;
    	}
    	return start.next;
    }
    
    public static void main (String[] args) {
    	
    	HashSet<String> set = new HashSet<String>(); 
    	set.add("1");
    	set.add("2");
    	System.out.println(set.stream().reduce("", String::concat).toString());
    	
    	ListNode l1 = new ListNode(2);
    	l1.next = new ListNode(4); 
    	l1.next.next = new ListNode(3);
    	
    	ListNode l2 = new ListNode(5);
    	l2.next = new ListNode(6); 
    	l2.next.next = new ListNode(4); 
    	
    	ListNode l3 = new Solution().addTwoNumbers(l1, l2); 
    	while (l3 != null) {
    		System.out.println(l3.val);
    		l3 = l3.next;
    	}
    	
    	
    	ListNode l5 = new ListNode(5);
    	

    	ListNode l6 = new ListNode(5);
    	
    	
    	ListNode l7 = new Solution().addTwoNumbers(l5, l6); 
    	while (l7 != null) {
    		System.out.println(l7.val);
    		l7 = l7.next;
    	}
    }
}


class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
