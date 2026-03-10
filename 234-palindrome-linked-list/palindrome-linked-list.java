/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // slow is now the middle and current;

        ListNode prev = null;
        ListNode next = null;
        if (fast != null) {
            slow = slow.next;
        }    
        while (slow != null) {
            next = slow.next; // save next
            slow.next = prev; // reverse arrow
            prev = slow;
            slow = next;
        }

        slow = head; // put slow back on head and compare with prev(reverse)

        while (prev != null) {
            if (slow.val != prev.val) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }
}