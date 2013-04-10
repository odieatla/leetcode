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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode p2 = new ListNode(2);

        ListNode tool = new ListNode(0);
        tool.next = head;

        ListNode pre = tool;

        while(tool.next != null & tool.next.next != null)
        {
            p2 = tool.next.next;

            tool.next.next = p2.next;
            p2.next = tool.next;
            tool.next = p2;

            if(pre.next == head)
            {
                pre.next = p2;
            }

            tool = tool.next.next;
            
        }

        return prep.next;
    }
}
