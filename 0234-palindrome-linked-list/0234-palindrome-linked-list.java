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
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; 
    }

    public ListNode findmid(ListNode head) {
        ListNode T = head;
        ListNode H = head;
        while (H.next != null && H.next.next != null) { 
           
            T = T.next;
             H = H.next.next;
        }
        return T; 
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode middle = findmid(head); 
        ListNode sechalfstart = reverse(middle.next); 

        ListNode firhalfstart = head;
        while (sechalfstart != null) {
            if (firhalfstart.val != sechalfstart.val) {
                return false;
            }
            firhalfstart = firhalfstart.next;
            sechalfstart = sechalfstart.next;
        }
        return true;
    }
}