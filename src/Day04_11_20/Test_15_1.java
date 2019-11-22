package Day04_11_20;

/**
 * @program: StudyCode
 * @description: 二进制中1的个数
 * n       : 10110100
 * n-1     : 10110011
 * n&(n-1) : 10110000
 * 先把n-1，会向高位借1，在把n和n-1进行一次与运算就会把n里面减少一个1，这样减少几次就说明有几个
 * @author: zhangsh
 * @create: 2019-11-22 10:47
 **/
public class Test_15_1 {
    public static int NumberOf1(int n){
        int count = 0;
        while (n!=0){
            count++;
            n =(n-1)&n;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(NumberOf1(Integer.bitCount(n)));
    }

}
