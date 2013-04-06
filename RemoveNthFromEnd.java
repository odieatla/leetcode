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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        // Start typing your Java solution
        // DO NOT write main() function

        ListNode start = head;
        ListNode end = head;

        //if(n == 0) return head; //--if this is the case, then end == start

        for(int i = 0; i < n; i++)
        {
            /*
             get the node(X) behind the target --
             from X,
             there are n-1 step left to reach the end of list - null node
            */
            end = end.next;
        }

        if(end == null) //meaning target is the head
        {
            return head.next;
        }

        while(end.next != null)
        {
            end = end.next;
            start = start.next; //get the node before target.
        }

        start.next = start.next.next;

        return head;
    }
}
