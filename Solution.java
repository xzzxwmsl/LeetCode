import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        // ListNode head = new ListNode(1);
        // ListNode p1 = new ListNode(0);
        // ListNode p2 = new ListNode(3);
        // ListNode p3 = new ListNode(1);
        // ListNode p4 = new ListNode(2);
        // ListNode p5 = new ListNode(1);
        // head.add(p1);
        // // p1.add(p2);
        // // p2.add(p3);
        // System.out.println(isPalindrome(head));
        // System.out.println(fun("pyplrza", "ppyypllrzzak"));
        System.out.println(validMountainArray(new int[] { 1,6,3 }));
    }

    public static boolean validMountainArray(int[] A) {
        if ((A.length < 3) || (A[A.length - 2] <= A[A.length - 1]) || (A[0] >= A[1]))
            return false;
        int left = 0, right = A.length - 1;
        while (left < right && A[left] < A[left + 1])
            left++;
        while (left < right && A[right] < A[right - 1])
            right--;
        return left == right;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 找到中间指针以及尾指针

        // 反转链表
        fast = reserveList(fast);
        while (head.next != null) {
            if (fast.val != head.val)
                return false;
            fast = fast.next;
            head = head.next;
        }

        return true;
    }

    public static ListNode reserveList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void visitList(ListNode listNode) {
        while (listNode != null) {
            System.out.printf("%d ", listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    public void add(ListNode a) {
        next = a;
    }
}