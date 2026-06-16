package Week_3.Day_2;

class Palindrome_List {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode slowpre = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slowpre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow; // this mid will point to the second mid in case of even and middle in case of odd
        if (slowpre != null) {
            slowpre.next = null;
        }
        ListNode pre = null;
        ListNode current = mid;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }


        ListNode left = head;
        ListNode right = pre;
        while (left != null && right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }

        return true;

    }
}