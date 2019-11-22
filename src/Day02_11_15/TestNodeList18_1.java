package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 删除链表的节点
 * @author: zhangsh
 * @create: 2019-11-15 10:48
 **/
public class TestNodeList18_1 {
    public static ListNode deleteNode(ListNode pListHead,ListNode pDelNode){
        if(pListHead == null || pDelNode == null){
            return null;
        }
        //设置null头，为的是删除第一个节点用
        ListNode dumHead = new ListNode(-1);
        dumHead.next = pListHead;
        if(pDelNode.next != null){
            ListNode j = pDelNode.next;
            pDelNode.val = j.val;
            pDelNode.next = j.next;
        }else if(pListHead == pDelNode){
            dumHead.next = null;
        }else {
            ListNode pNode = pListHead;
            while (pNode.next != pDelNode){
               pNode = pNode.next;
            }
            pNode.next = null;

        }
        return  dumHead.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode a = deleteNode(node1,node5);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }

}
