package Day01_11_14;

/**
 * @program: StudyCode
 * @description: 数组中重复的数字在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复的次数。请找出数组中任意一个重复的数字。
 * 例如如果输入长度为7的数组{2,3,1,0,2,5,3},那么对应的输出是重复的数字2或者3。
 * @author: zhangsh
 * @create: 2019-11-14 11:22
 **/
public class Test3_1 {
    public static boolean test3(int[] arr){

        if(arr.length <2 || arr == null){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            //只要该位置上存放的不是它自己就一直交互下去
            while (arr[i] != i ){
                //出现相等说明有重复的，例如上面的arr[5]位置和(arr[5]的值为2)arr[2]上面的值相同
                if(arr[i] == arr[arr[i]]){
                    System.out.println(arr[i]);
                    return true;
                }
            swap(arr , arr[i] ,i);
            }
        }

        return false;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {2,3,1,0,2,5,3};
        boolean result = test3(arr);
        System.out.println(result);
    }

}
