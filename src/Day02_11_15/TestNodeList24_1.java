package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 反转链表---使用递归
 * @author: zhangsh
 * @create: 2019-11-18 10:28
 **/
public class TestNodeList24_1 {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        //test1
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = null;
//test2
//        ListNode node1 = new ListNode(1);
        //test3
//        node1.next = null;
        ListNode node1 = null;
        ListNode test1 = reverseList(node1);
        while (test1!=null){
            System.out.println(test1.val);
            test1 = test1.next;
        }
    }

}
