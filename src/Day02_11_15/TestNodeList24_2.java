package Day02_11_15;

import java.util.List;

/**
 * @program: StudyCode
 * @description: 反转链表---使用迭代
 * @author: zhangsh
 * @create: 2019-11-18 10:28
 **/
public class TestNodeList24_2 {
    public static ListNode reverseList(ListNode head) {
       ListNode pre = null;
       ListNode cur = head;
       while (cur != null) {
           //存储下一个节点
           ListNode nextTemp = cur.next;
           //让当前节点指向前一个节点
           cur.next = pre;
           //把反转后的链表赋值给pre返回，
           pre = cur;
           //把剩下没反转过来的链表继续执行while
           cur = nextTemp;

       }
       return pre;
    }

    public static void main(String[] args) {
        //test1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
//test2
//        ListNode node1 = new ListNode(1);

//        node1.next = null;
        //test3
//        ListNode node1 = null;
        ListNode test1 = reverseList(node1);
        while (test1!=null){
            System.out.println(test1.val);
            test1 = test1.next;
        }
    }

}
