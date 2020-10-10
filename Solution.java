public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(0);
        ListNode p3 = new ListNode(-4);
        head.add(p1);
        p1.add(p2);
        p2.add(p3);
        p3.add(p1);

        System.out.println(detectCycle(head).val);

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        // 先判断是否有环
        ListNode p1 = head, p2 = head;
        boolean isCycle = false;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                isCycle = true;
                break;
            }
        }

        // 有环
        if (isCycle) {
            ListNode ptr = head;
            while (ptr != p1) {
                ptr = ptr.next;
                p1 = p1.next;
            }
            return ptr;
        } else {
            return null;
        }
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