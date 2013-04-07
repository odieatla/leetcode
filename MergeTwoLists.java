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
pub
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        // Start typing your Java solution below
        // DO NOT write main() function

        ListNode cur = new ListNode(0);
        ListNode curhead = cur;

        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                cur.next = l1;
                l1 = l1.next;
            }
            else
            {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if(l1 == null) //l1 is all in the final list, or l1 is always null
        {
            cur.next = l2;
        }
        if(l2 == null) //l2 is all in the final list, or l2 is always null
        {
            cur.next = l1;
        }

        return curhead.next;
    }
}
