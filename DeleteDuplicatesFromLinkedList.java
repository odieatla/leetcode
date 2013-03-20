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

    if(head == null) return head;

    ListNode start = head;

    ListNode second = head.next;

    while(second != null)
    {
      if(head.val == second.val)
      {
        head.next = second.next;
      }
      else
      {
        head = second;
      }
      second = second.next;
    }

    return start;
  }
}
