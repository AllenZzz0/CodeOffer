package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 两个链表的第一个公共节点
 * 方法三：双指针法
 * 创建两个指针 pApA 和 pBpB，分别初始化为链表 A 和 B 的头结点。然后让它们向后逐结点遍历。
 * 当 pApA 到达链表的尾部时，将它重定位到链表 B 的头结点 (你没看错，就是链表 B); 类似的，当 pBpB 到达链表的尾部时，将它重定位到链表 A 的头结点。
 * 若在某一时刻 pApA 和 pBpB 相遇，则 pApA/pBpB 为相交结点。
 * 想弄清楚为什么这样可行, 可以考虑以下两个链表: A={1,3,5,7,9,11} 和 B={2,4,9,11}，相交于结点 9。 由于 B.length (=4) < A.length (=6)，pBpB 比 pApA 少经过 22 个结点，会先到达尾部。将 pBpB 重定向到 A 的头结点，pApA 重定向到 B 的头结点后，pBpB 要比 pApA 多走 2 个结点。因此，它们会同时到达交点。
 * 如果两个链表存在相交，它们末尾的结点必然相同。因此当 pApA/pBpB 到达链表结尾时，记录下链表 A/B 对应的元素。若最后元素不相同，则两个链表不相交。
 * @author: zhangsh
 * @create: 2019-11-18 14:13
 **/
public class TestNodeList52_1 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
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
        ListNode test1 = getIntersectionNode(headA,headB);
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
