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
        Deque<Integer> stack = new ArrayDeque<>();

        ListNode pointer = head;

        while (pointer != null) {
            stack.push(pointer.val);
            pointer = pointer.next;
        }

        // reset pointer
        pointer = head;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            if (value != pointer.val) {
                return false;
            }
            pointer = pointer.next;
        }
        return true;
    }
}