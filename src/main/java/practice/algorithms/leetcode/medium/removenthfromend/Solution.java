package practice.algorithms.leetcode.medium.removenthfromend;

public class Solution {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if (head == null) {
			return null;
		}
		
		// Get count
		ListNode current = head; 
		int count = 1;  
		while (current.next != null) {
			count++; 
			current = current.next; 
		}
		
		
		if (count - n < 0) {
			return null;
		}
		
		

		if (count == 1 && n == count) {
			return null;
		}
		
		
		current = head;
		
		int currentIndex = 0; 
		int targetIndex = count - n;
		ListNode prev = current;
		while (currentIndex != targetIndex) {
			prev = current;
			current = current.next;
			currentIndex++; 
		}
		
		if (targetIndex != 0) 
			prev.next = current.next;
		else 
			head = head.next;
		
		return head;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1); 
//		list.next = new ListNode(2); 
		System.out.println(new Solution().removeNthFromEnd(list, 1));

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}