package com.mhwang;

public class AddTwoNumber {

	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		// 空判断
		if (l1 == null && l2 == null) return null;
		
		/**
		 * 这里为什么不用0作初始化？
		 * 因为题目中说明是2个非负整数，如果2个节点都是0相加，那么新节点也是0，就区分不出来了。
		 * */
		ListNode newListNode = new ListNode(-1);
		ListNode temp = newListNode;
		int carry = 0;                            // 进位值
		while (true) {        
			// 如果某个链表的节点为空而另一个不为空，
			// 则用0代替空节点的值，这样相加的值也是不为空的节点的值
			int v1 = l1 == null ? 0 : l1.val;
			int v2 = l2 == null ? 0 : l2.val;
			int sum = v1 + v2 + carry;            // 这里要注意加上上个计算的进位值
			carry = sum / 10;                   
			temp.val = sum % 10;
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			
			if (l1 == null && l2 == null){
				break;
			}
			
			// 继续下个节点赋值
			temp.next = new ListNode(-1);
			temp = temp.next;
			
		}   
		// 如果最后的2个节点相加还有进位，则把进位值加上
		if (carry == 1){
			temp.next = new ListNode(carry);
		}
		return newListNode;
	}
	
	public static void main(String[] args) {
		// 生成2个链表
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode newListNode = addTwoNumbers(l1, l2);
		
		while (true) {
			System.out.print(newListNode.val);
			newListNode = newListNode.next;
			if (newListNode == null) break;
			System.out.print("->");
		}

	}

}
