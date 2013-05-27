/*
    Add Two Numbers

    You are given two linked lists representing two non-negative numbers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;

        while(l1 != null && l2 != null)
        {
            int v = l1.val + l2.val + carry;
            carry = v/10;
            l3.next = new ListNode(v%10);

            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }

        while(l1 != null)
        {
            int v = l1.val + carry;
            carry = v/10;
            l3.next = new ListNode(v%10);

            l1 = l1.next;
            l3 = l3.next;
        }

        while(l2 != null)
        {
            int v = l2.val + carry;
            carry = v/10;
            l3.next = new ListNode(v%10);

            l2 = l2.next;
            l3 = l3.next;
        }

        if(carry > 0)
        {
            l3.next = new ListNode(carry);
        }

        return head.next;
    }

    //more neat code
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0)
        {
            int n1 = (l1 == null) ? 0 : l1.val;
            int n2 = (l2 == null) ? 0 : l2.val;
            int v = n1 + n2 + carry;
            carry = v/10;

            l3.next = new ListNode(v%10);

            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
            l3 = l3.next;
        }

        return head.next;
    }
}
