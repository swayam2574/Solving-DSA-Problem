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
    static int[] mirror = new int[100000];
    public boolean isPalindrome(ListNode head) {
        // ___________________________
        if (head == null || head.next == null) return true;
        int i = 0;
        ListNode temp = head;
        while(temp != null){
            mirror[i++] = temp.val;
            temp = temp.next;
        }
        
        int l = 0;
        while (l < i) {
            if (mirror[l++] != mirror[--i])
                return false;
        }
        return true;


        // ___________________________
        // if (head == null || head.next == null) return true;
        // ListNode slow = head;
        // ListNode fast = head;

        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // ListNode prev = null;
        // while (slow != null) {
        //     ListNode next = slow.next;
        //     slow.next = prev;
        //     prev = slow;
        //     slow = next;
        // }

        // ListNode first = head;
        // ListNode second = prev;

        // while (second != null) {
        //     if (first.val != second.val) return false;
        //     first = first.next;
        //     second = second.next;
        // }

        // return true;

        // ____________________________
        // if (head == null || head.next == null) return true;
        // List<Integer> list = new ArrayList();
        // ListNode temp = head;
        // while(temp != null){
        //     list.add(temp.val);
        //     temp= temp.next;
        // }
        // int l=0, r=list.size()-1;
        // while(l<r){
        //     if(list.get(l++)!=list.get(r--)) return false;
        // }
        // return true;


    }
}