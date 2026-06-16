package Week_3.Day_2;


//  Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Merge_List {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tail = new ListNode(-1);
        ListNode dummy = tail;          // works like an index -1 for an array 
        
// the core concept we are using here it we are updating, or we can say manipulating the pointers using a temporary pointer tail,
        while(list1!=null && list2!=null) {
            if(list1.val<list2.val) {
                tail.next=list1;
                list1=list1.next;
            }
            else {
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        // as other elements are already sorted we just need a link between our tail and unconnected elements
        if(list1!=null) {
            tail.next=list1;
         }
        if(list2!=null) {
            tail.next=list2;    
        }
        return dummy.next;
        
    }

}