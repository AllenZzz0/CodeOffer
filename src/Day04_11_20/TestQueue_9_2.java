package Day04_11_20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @program: StudyCode
 * @description: 用两个队列实现栈
 * @author: zhangsh
 * @create: 2019-11-19 16:22
 **/
public class TestQueue_9_2<T> {
    private Queue<T> queue1 = new LinkedList<T>();
    private Queue<T> queue2 = new LinkedList<T>();

    public boolean push(T t){
        if(!queue1.isEmpty()){
            return queue1.offer(t);
        } else {
           return queue2.offer(t);
        }
    }
    /**
     * 弹出并删除元素
     */
    public T pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (!queue1.isEmpty() && queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if (queue1.isEmpty() && !queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }

        return null;
    }


    public static void main(String[] args) {
        TestQueue_9_2<Integer> te = new TestQueue_9_2<Integer>();
        te.push(1);
        te.push(2);
        te.push(3);
        te.push(4);
        te.push(5);
        te.pop();
        System.out.println(te.toString());



    }
}
