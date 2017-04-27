package practice.algorithms.leetcode.easy.mergetwolists;

public class Solution {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode mergedList = null;
		ListNode current = mergedList;
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				if (mergedList == null) {
					mergedList = new ListNode(l1.val);
					current = mergedList;
				} else {
					current.next = new ListNode(l1.val);
					current = current.next;
					
				}
				l1 = l1.next;
			} else {
				if (mergedList == null) {
					mergedList = new ListNode(l2.val);
					current = mergedList;
				} else {
					current.next = new ListNode(l2.val);
					current = current.next;				
				}
				l2 = l2.next;
			}
			
		}

		
		
		while (l1 != null) {

			if (mergedList == null) {
				mergedList = new ListNode(l1.val);
				current = mergedList;
			} else {
				current.next = new ListNode(l1.val);
				current = current.next;
			}
			l1 = l1.next;

		}

		
		while (l2 != null) {

			if (mergedList == null) {
				mergedList = new ListNode(l2.val);
				current = mergedList;
			} else {
				current.next = new ListNode(l2.val);
				current = current.next;
			}
			l2 = l2.next;

		}

		return mergedList;
	}

	public static void main(String[] args) {
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(2);
		list2.next.next = new ListNode(4);
		
		ListNode list1 = new ListNode(5);
		
		System.out.println(new Solution().mergeTwoLists(list1, list2));
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}