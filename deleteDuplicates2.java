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
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode l = head;
        ListNode pre = new ListNode(0);
        ListNode out_pre = pre;

        boolean dup = false;

        while(l != null)
        {
            if(l.next != null)
            {
                if(l.next.val == l.val)
                {
                    dup = true;
                    pre.next = null;
                }
                else
                {
                    if(!dup)
                    {
                        pre.next = l;
                        pre = pre.next;
                    }
                    dup = false;
                }
            }
            else
            {
                if(!dup)
                {
                    pre.next = l;
                }
            }
            l = l.next;
        }

        return out_pre.next;
    }
}
