package Week_3.Day_2;

class Remove_Node {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;

        ListNode node = head;
        int len = 0 ;
        while(node!=null) {
            len++;
            node = node.next;
        }
        int a = len - n ;
        if(a==0) return head.next;
        node = head;
        for(int i = 1; i < a ; i++) {
            node = node.next;
        }
        ListNode pre = node, curr = null, Next = null;
        if(pre!=null) curr=pre.next;
        if(curr!=null) Next = curr.next;
        pre.next=Next;

        return head;
        
    }
}