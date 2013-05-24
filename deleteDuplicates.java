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
    public ListNode deleteDuplicates(ListNode head)
    {
        // Start typing your Java solution below
        // DO NOT write main() function
        int val;
        if(head != null)
        {
            val = head.val - 1;
        }
        else
        {
            return head;
        }

        ListNode cur = new ListNode(val);
        ListNode l = head;

        while(l != null)
        {
            if(cur.val == l.val)
            {
                cur.next = null; //remove the duplicates at the end of the list,1->2->2->2
            }
            else
            {
                cur.next = l;
                cur = cur.next;
            }
            l = l.next;
        }
        return head;
    }
}
