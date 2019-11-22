package Day04_11_20;

/**
 * @program: StudyCode
 * @description: 数值的整数次方
 * 下面的讨论中 x 代表 base，n 代表 exponent。
 * 因为 (x*x)n/2 可以通过递归求解，并且每次递归 n 都减小一半，因此整个算法的时间复杂度为 O(logN)。
 * 斐波那契数列
 * @author: zhangsh
 * @create: 2019-11-22 11:07
 **/
public class Test_16_1 {
    public static double Power(double base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        //用来记录指数是否是负数
        boolean up = false;
        if (exponent<0){
            exponent = -exponent;
            up = true;
        }
        //base*base ^ exponent/2 = base ^ exponent
        double pow = Power(base *base,exponent/2);
        //奇数的话就在x一个base，偶数的话就直接返回pow就行
        if (exponent %2 != 0){
            pow = pow *base;
        }
        return up ? 1/pow : pow;
    }

    public static void main(String[] args) {
        System.out.println(Power(2, 2));
    }
}
