import java.util.Stack;

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
        // System.out.println(fun("pyplrza", "ppyypllrzzak"));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int i = stack.pop();
                    stack.push(stack.pop() - i);
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int j = stack.pop();
                    stack.push(stack.pop() - j);
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
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