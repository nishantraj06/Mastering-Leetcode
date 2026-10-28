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
 //

//2181. Merge Nodes in Between Zeros
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        ListNode ans = temp;
        head = head.next;
        int sum = 0 ;
        while(head != null){
            if(head.val == 0 ){
                head.val=sum;
                temp.next = head;
                temp = head;
                sum = 0;
            }else{
                sum+=head.val;
            }
            head = head.next;
        }
        temp.next = null;
        return ans.next;
    }
}