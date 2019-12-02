package Day05_11_26;

import java.util.Stack;

/**
 * @program: StudyCode
 * @description: 弹出栈中最小的值
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的 min 函数。
 * @author: zhangsh
 * @create: 2019-11-28 11:30
 **/
public class Test30_1 {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStatck = new Stack<>();

    public void push(int node){
        dataStack.push(node);
//        minStatck.push(minStatck.isEmpty()? node : (minStatck.peek()>node?node:minStatck.peek()));
        minStatck.push(minStatck.isEmpty()? node : Math.min(minStatck.peek(),node));

    }

    public void pop(){
        dataStack.pop();
        minStatck.pop();
    }

    public int top(){
        return dataStack.peek();
    }
    public int min(){
        return minStatck.peek();
    }

    public static void main(String[] args) {
        Test30_1 test30_1 = new Test30_1();
        test30_1.push(2);
        test30_1.push(1);
        test30_1.push(4);
        test30_1.push(6);
        test30_1.pop();
        test30_1.pop();
        test30_1.push(0);
        System.out.println(test30_1.min());
    }
}
