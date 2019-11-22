package Day02_11_15;





import java.util.Stack;

/**
 * @program: StudyCode
 * @description: 从尾到头打印链表
 * @author: zhangsh
 * @create: 2019-11-15 09:41
 **/
public class TestNodeList6_1 {
    public static void test6(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void test7(ListNode listNode){
       if (listNode != null){
           test7(listNode.next);
           System.out.println(listNode.val);
       }

    }
//    static class ListNode{
//        int val;
//        ListNode next = null;
//        ListNode(int val){
//            this.val = val;
//        }
//        // 添加新的结点
//        public void add(int newval) {
//            ListNode newNode = new ListNode(newval);
//            if(this.next == null)
//                this.next = newNode;
//            else
//                this.next.add(newval);
//        }
//
//    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        a.add(5);
        a.add(6);
        a.add(7);
//        test6(a);
        test7(a);

    }

}
