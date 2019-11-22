package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 合并两个排好序的链表---使用递归
 * @author: zhangsh
 * @create: 2019-11-18 10:28
 **/
public class TestNodeList25_1 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return  l1;
        }else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }

    }

    public static void main(String[] args) {
        //test1
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(6);
        ListNode node9 = new ListNode(8);
        ListNode node10 = new ListNode(10);
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = null;
        ListNode test1 = mergeTwoLists(node1,node6);
//test2
//        ListNode node1 = new ListNode(1);
        //test3
//        node1.next = null;
//        ListNode node1 = null;
//        ListNode test1 = reverseList(node1);
        while (test1!=null){
            System.out.println(test1.val);
            test1 = test1.next;
        }
    }

}
