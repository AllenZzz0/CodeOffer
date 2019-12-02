package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 查找链表中的环入口节点
 * @author: zhangsh
 * @create: 2019-11-26 11:04
 **/
public class TestNodeList23_1 {
    //判断是否含有环,有环的话返回相遇节点，没有环就返回空
    public ListNode hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            //如果没有环的话，走的快的指针会先到尾部
            if (fast == null || fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast;

    }

    public ListNode getEntryNode(ListNode head){
        ListNode meetingNode = hasCycle(head);
        if (meetingNode ==null){
            return null;
        }
        //计算环中节点的个数
        int count = 1;
        ListNode nextNode = meetingNode;
        while (nextNode.next != meetingNode){
            nextNode = nextNode.next;
            count++;
        }
        //定义两个指针，指向头结点，然后让一个先走count步，剩下的那个在走，这样他们一直走下去一定会相遇
        //相遇节点就是环的入口，例如走一遍需要6步，其中环需要4步，让第一个节点先走4步，第二个节点再开始走，这样
        //一起走两步正好在环的入口节点相遇
        ListNode firstNode = head;
        ListNode secondNode = head;
        for (int i=0; i<count;i++){
            firstNode = firstNode.next;
        }
        while (firstNode != secondNode){
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return firstNode;


    }


}
