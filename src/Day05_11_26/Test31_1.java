package Day05_11_26;

import java.util.Stack;

/**
 * @program: StudyCode
 * @description: 栈的压入，弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列 1,2,3,4,5 是某栈的压入顺序，序列 4,5,3,2,1 是该压栈序列对应的一个弹出序列，但 4,3,5,1,2 就不可能是该压栈序列的弹出序列。
 * @author: zhangsh
 * @create: 2019-11-28 13:55
 **/
public class Test31_1 {
    public static boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for (int pushIndex = 0, popIndex = 0; pushIndex<n; pushIndex++){
            //把值都放到新加的栈里面，如果到最后这个里面还有元素没被弹出就是false
            stack.push(pushSequence[pushIndex]);
            //如果stack的栈顶元素和pop相等就弹出，pop++
            //先判断&& !stack.isEmpty() 要不出现 java.util.EmptyStackException
            while (popIndex < n && !stack.isEmpty() && stack.peek()==popSequence[popIndex] ){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
        int[] pop = {4,3,5,1,2};
        System.out.println(IsPopOrder(push, pop));
    }
}
