package Day04_11_20;

/**
 * @program: StudyCode
 * @description: 青蛙跳台阶问题
 * Fib(n)=Fib(n−1)+Fib(n−2)
 * @author: zhangsh
 * @create: 2019-11-20 15:32
 **/
public class Test_10_2 {
    public int fibonacci(int n){
        if(n == 1)return 1;

        //f(1)=1
        int first = 1;
        //f(2)=2
        int second = 2;

        for (int i=3;i<=n;i++){

            int third = first +second;
            first = second;
            second = third;


        }
        return second;
    }

    public static void main(String[] args) {
        Test_10_2 te = new Test_10_2();
        System.out.println(te.fibonacci(4));
    }
}
