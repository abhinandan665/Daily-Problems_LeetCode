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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1,last=-1,min=Integer.MAX_VALUE,i=1;
        ListNode prev=head,curr=head.next,next=curr.next;
        while(next!=null){
            if((curr.val>prev.val&&curr.val>next.val)||(curr.val<prev.val&&curr.val<next.val)){
                if(first==-1) first=i;
                else min=Math.min(min,i-last);
                last=i;
            }
            prev=curr;
            curr=next;
            next=next.next;
            i++;
        }
        if(first==last) return new int[]{-1,-1};
        return new int[]{min,last-first};
    }
}