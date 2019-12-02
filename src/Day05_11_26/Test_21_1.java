package Day05_11_26;

/**
 * @program: StudyCode
 * @description: 调整数组顺序让奇数位于偶数之前
 * @author: zhangsh
 * @create: 2019-11-26 10:15
 **/
public class Test_21_1 {
    public static int[] sortArrayByParity(int[] A) {
        if (A.length==0 || A == null){
            return null;
        }
        int pBegin = 0;
        int pEnd = A.length -1 ;
        while (pBegin < pEnd){
            while (pBegin < pEnd && !isEven(A[pBegin])){
                pBegin ++;

            }
            while (pBegin < pEnd && isEven(A[pEnd])){
                pEnd --;
            }
            if (pBegin < pEnd){
                int temp = A[pBegin];
                A[pBegin] = A[pEnd];
                A[pEnd] = temp;
            }
        }

        return A;
    }
    public static boolean isEven(int n){
        return (n % 2) == 0;
    }

    public static void main(String[] args) {
        int[] a ={1,1};
        int[] test =sortArrayByParity(a);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

}
