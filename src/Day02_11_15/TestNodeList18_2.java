package Day02_11_15;

import org.w3c.dom.NodeList;

/**
 * @program: StudyCode
 * @description: 删除重复的全部节点1-2-2-3  1-3
 * 主意头结点也是可能会重复的，所以头结点也可能被删除
 * 解决方法，创建一个临时节点来充当根节点
 * @author: zhangsh
 * @create: 2019-11-15 14:01
 **/
public class TestNodeList18_2 {
    //pHead是头结点
    public static ListNode deleteDup(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        //如果是这种情况
        //      1 --> 1 --> 1 --> 2 --> 3
        //     head  next
        //1.则需要移动next直到出现与当前head.value不相等的情况（含null）
        //2.并且此时的head已经不能要了，因为已经head是重复的节点
        //--------------else-------------
        //      1 --> 2 --> 3
        //     head  next
        //3.如果没有出现1的情况，则递归返回的节点就作为head的子节点
        ListNode next = pHead.next;
        if(next.val == pHead.val){
            while (next != null && pHead.val == next.val){
                next = next.next;
            }
            pHead = deleteDup(next);
        } else {
            pHead.next = deleteDup(next);
        }
        return pHead;

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
        ListNode a = deleteDup(node1);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }
    }
}
