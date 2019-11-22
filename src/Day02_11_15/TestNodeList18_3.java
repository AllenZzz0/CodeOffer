package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 删除重复的节点1-2-2-3  1-2-3
 * @author: zhangsh
 * @create: 2019-11-15 14:01
 **/
public class TestNodeList18_3 {
    //pHead是头结点
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(head.val == head.next.val){
            head = deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        ListNode a = deleteDuplicates(node1);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }
}
