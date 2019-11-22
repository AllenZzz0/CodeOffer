package Day02_11_15;

import static Day02_11_15.TestNodeList18_1.deleteNode;

/**
 * @program: StudyCode
 * @description: 查找链表倒数第k个节点
 * 第一种方法如果直接暴力方法的话，需要循环两遍链表才能找到倒数K那个位置，正着数也就是n-K+1那个位置
 * 需要先遍历一遍计算出n的个数，在去找k的位置
 * 第二种方法：使用2个指针，两个都从前往后走，一个先走k-1步，然后第二个指针开始走，等第一个到结尾的时候，第二个正好在倒数k位置
 * @author: zhangsh
 * @create: 2019-11-15 15:05
 **/
public class TestNodeList22_1 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n ==0){
            return null;
        }
        ListNode p1 = head;
        for (int i =0;i<n-1;i++){
            if(p1.next != null){
                p1 = p1.next;
            }else {
                return null;
            }

        }

        ListNode p2 = head;
        while (p1.next !=null){
            p2 = p2.next;
            p1 = p1.next;
        }

        return p2;

    }
    public static void main(String[] args) {
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
        ListNode p2 = removeNthFromEnd(node1,1);
        System.out.println("倒数第K个元素是"+p2.val);
        while (node1 != null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
}
