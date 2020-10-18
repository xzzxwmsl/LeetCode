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
        String[] s = new String[]{"","flow","flight"};
        System.out.println(fun(s));

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;
        while (p.next != null && p.next.next != null) {
            ListNode p1 = p.next;
            ListNode p2 = p.next.next;
            p.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            p = p1;
        }
        return newHead.next;
    }

    public static String fun(String[] strs) {
        StringBuilder re = new StringBuilder();

        try {
            int flag = 0;
            boolean over = false;
            while (true) {
                char c = strs[0].charAt(flag);
                for (String s : strs) {
                    if (c != s.charAt(flag)) {
                        over = true;
                        break;
                    }
                }
                if(over) break;
                flag++;
                re.append(c);
            }
        } catch (Exception e) {

        }

        return re.toString();
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