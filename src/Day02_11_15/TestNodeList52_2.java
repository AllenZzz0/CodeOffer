package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 两个链表的第一个公共节点
 * 计算两个链表的长度，在计算差值，然后让长的先走差值，最后比较是否相等
 * @author: zhangsh
 * @create: 2019-11-18 14:13
 **/
public class TestNodeList52_2 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int countA = 0;
        int countB = 0;
        ListNode a1 = headA;
        ListNode b1 = headB;

        while (a1 != null || b1 != null){
            if (a1 != null){
                countA++;
                a1 = a1.next;
            }
            if(b1 != null){
                countB++;
                b1 = b1.next;
            }
        }
        int margin;
        ListNode a2 = headA;
        ListNode b2 = headB;
        if (countA > countB){
            margin = countA - countB;
            while (margin >0){
                a2 = a2.next;
                margin--;
            }
        }else {
            margin = countB -countA;
            while (margin>0){
                b2 = b2.next;
                margin--;
            }
        }
        while (a2 != null && b2 !=null){
            if (a2 == b2){
                return a2;
            }
            a2= a2.next;
            b2= b2.next;
        }
        return null;



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
        ListNode headA = node1;
        node1.val = 2;
        node2.val =6;
        ListNode headB = node1;




//        ListNode node8 = new ListNode(5);
//        ListNode node9 = new ListNode(7);
//        ListNode node10 = new ListNode(9);
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//        node9.next = node10;
        ListNode test1 = getIntersectionNode(node1,node3);
        System.out.println(test1.val);
//test2
//        ListNode node1 = new ListNode(1);
        //test3
//        node1.next = null;
//        ListNode node1 = null;
//        ListNode test1 = reverseList(node1);
//        while (test1!=null){
//            System.out.println(test1.val);
//            test1 = test1.next;
//        }
    }

}
