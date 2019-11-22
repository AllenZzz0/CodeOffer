package Day02_11_15;

/**
 * @program: StudyCode
 * @description: 链表
 * @author: zhangsh
 * @create: 2019-11-15 10:50
 **/
public class ListNode {
    int val;
    ListNode next;
    public ListNode (int val){
        this.val = val;
    }
    public ListNode () {

    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }


}
