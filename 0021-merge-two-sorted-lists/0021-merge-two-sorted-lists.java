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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }

        ListNode curr1=new ListNode();
        curr1=list1;
        ListNode curr2=new ListNode();
        curr2=list2;
        
        ListNode temp=new ListNode();
        ListNode head=new ListNode();
        if(curr1.val<curr2.val){
            temp=curr1;
            curr1=curr1.next;
        }
        else{
            temp=curr2;
            curr2=curr2.next;
        }
        head=temp;
        while(curr1!=null && curr2!=null){
            if(curr1.val<=curr2.val){
                temp.next=curr1;
                curr1=curr1.next;
            }
            else{
                temp.next=curr2;
                curr2=curr2.next;
            }
            temp=temp.next;
        }
        if(curr1!=null){
            temp.next=curr1;
        }
        else if(curr2!=null){
            temp.next=curr2;
        }
        return head;

    }
}