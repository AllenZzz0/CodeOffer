package Day04_11_20;

/**
 * @program: StudyCode
 * @description: 斐波那契数列
 * @author: zhangsh
 * @create: 2019-11-20 15:32
 **/
public class Test_10_1 {
    public int fibonacci(int n){
        if(n == 0)return 0;
        if (n<=2)return 1;
        //f(1)
        int first = 1;
        //f(2)=f(1)+f(0)
        int second = 1;
        //f(2)
        int result =1;
        for (int i=3;i<=n;i++){
            //f(3)=f(1)+f(2)
            result = first +second;
            //下面是为4准备的
            //记录f(2)的值
            first = second;
            //记录f(3)的值
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Test_10_1  te = new Test_10_1();
        System.out.println(te.fibonacci(4));
    }
}
