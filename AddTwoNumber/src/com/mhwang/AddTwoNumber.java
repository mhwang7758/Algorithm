package com.mhwang;

public class AddTwoNumber {

	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		// ���ж�
		if (l1 == null && l2 == null) return null;
		
		/**
		 * ����Ϊʲô����0����ʼ����
		 * ��Ϊ��Ŀ��˵����2���Ǹ����������2���ڵ㶼��0��ӣ���ô�½ڵ�Ҳ��0�������ֲ������ˡ�
		 * */
		ListNode newListNode = new ListNode(-1);
		ListNode temp = newListNode;
		int carry = 0;                            // ��λֵ
		while (true) {        
			// ���ĳ������Ľڵ�Ϊ�ն���һ����Ϊ�գ�
			// ����0����սڵ��ֵ��������ӵ�ֵҲ�ǲ�Ϊ�յĽڵ��ֵ
			int v1 = l1 == null ? 0 : l1.val;
			int v2 = l2 == null ? 0 : l2.val;
			int sum = v1 + v2 + carry;            // ����Ҫע������ϸ�����Ľ�λֵ
			carry = sum / 10;                   
			temp.val = sum % 10;
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			
			if (l1 == null && l2 == null){
				break;
			}
			
			// �����¸��ڵ㸳ֵ
			temp.next = new ListNode(-1);
			temp = temp.next;
			
		}   
		// �������2���ڵ���ӻ��н�λ����ѽ�λֵ����
		if (carry == 1){
			temp.next = new ListNode(carry);
		}
		return newListNode;
	}
	
	public static void main(String[] args) {
		// ����2������
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
