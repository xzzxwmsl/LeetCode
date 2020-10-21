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

        System.out.println(fun("pyplrza", "ppyypllrzzak"));

    }

    public static boolean fun(String name, String typed) {
        int namePos = 0;
        int typedPos = 0;
        boolean flag = true;
        while (namePos < name.length()) {
            char c = name.charAt(namePos);
            int numberOfChar = 0, numberOfChar2 = 0;
            for (; namePos < name.length(); namePos++) {
                if (c != name.charAt(namePos))
                    break;
                numberOfChar++;
            }
            for (; typedPos < typed.length(); typedPos++) {
                if (c != typed.charAt(typedPos))
                    break;
                numberOfChar2++;
            }
            if (numberOfChar2 < numberOfChar) {
                flag = false;
                break;
            }
        }
        return typedPos == typed.length() ? flag : false;
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