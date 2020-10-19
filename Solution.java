public class Solution {

    public static void main(String[] args) {
        // ListNode head = new ListNode(1);
        // ListNode p1 = new ListNode(2);
        // ListNode p2 = new ListNode(3);
        // ListNode p3 = new ListNode(4);
        // ListNode p4 = new ListNode(5);
        // head.add(p1);
        // p1.add(p2);
        // p2.add(p3);
        // p3.add(p4);
        // visitList(swapPairs(head));
        String S = "a##b#cd";
        String T = "cc#d";
        System.out.println(plt(7));
        System.out.println(fun(7));

    }

    public static int plt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return plt(n - 1) + plt(n - 2);
    }

    public static int fun(int n) {
        int result = 1;
        int p = 0, q = 0;
        // p作用是临时保存
        // q是f(x-1)
        // r是f(x)
        for (int i = 1; i <= n; i++) {
            p = q;
            q = result;
            result = p + q;
        }
        return result;
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