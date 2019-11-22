package Day04_11_20;

import java.util.Stack;

/**
 * @program: StudyCode
 * @description: 用两个栈实现队列
 * @author: zhangsh
 * @create: 2019-11-19 16:22
 **/
public class TestQueue_9_1 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void appendTail(int x){
        stack1.push(x);
    }
    public int deleteHead(){
        if (totalSize()!=0){
            //如果stack2为空的时候才能把值放进去，不为空说明还没删除完，进去的话顺序就变了
            if (stack2.isEmpty())
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
                return stack2.pop();


        }else {
            System.out.println("errord");
            return -1;
        }

    }
    public int totalSize(){
        return stack1.size()+stack2.size();
    }

    public static void main(String[] args) {
        TestQueue_9_1 te = new TestQueue_9_1();
        te.appendTail(1);
        te.appendTail(2);
        te.appendTail(13);
        te.appendTail(14);

        System.out.println(te.deleteHead());
        System.out.println(te.deleteHead());
        System.out.println(te.deleteHead());
        te.appendTail(16);
        System.out.println(te.deleteHead());
        System.out.println(te.deleteHead());


    }
}
