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
        System.out.println(backspaceCompare(S, T));

    }

    public static boolean backspaceCompare(String S, String T) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#' && s1.length() != 0) {
                s1.deleteCharAt(s1.length() - 1);
            } else if (c != '#') {
                s1.append(c);
            }
        }

        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if (c == '#' && s2.length() != 0) {
                s2.deleteCharAt(s2.length() - 1);
            } else if (c != '#') {
                s2.append(c);
            }
        }

        System.out.println(s1.toString() + ' ' + s2.toString());
        return s1.toString().equals(s2.toString());
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