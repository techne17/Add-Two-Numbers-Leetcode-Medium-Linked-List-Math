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
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {


      if(l1==null && l2==null)  // If both lists are empty
          return null;
        else if(l1==null)       //If one list is empty
            return l2;
        else if(l2==null)
            return l1;


        int sum=0,carry=0;   

        ListNode head=null, prev=null;


        while(l1!=null || l2!=null)
        {
            
            sum=(l1==null?0:l1.val)   // if l1 reached end then consider value 0
                +(l2==null?0:l2.val)  //if l1 reached end then consider value 0
                +carry; 


            if(sum>9)       // if sum is two digit number
            {
                carry=1;
                sum=sum%10;
            }
            else
                carry=0;


            ListNode node2=new ListNode(sum);   //creating new node for result


            if(head==null)
            {
                head=node2;
            }
            else
                prev.next=node2;

                                
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;

             prev=node2;
        }


        if(carry!=0)        
        {
            ListNode node2=new ListNode(carry);
            prev.next=node2;   
        }

        return head;
    }
}

// Time Complexity -O(m+n)
//  m & n are lengths of LinkedList .


