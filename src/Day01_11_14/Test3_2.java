package Day01_11_14;

/**
 * @program: StudyCode
 * @description: 不修改数组找出重复的数
 * @author: zhangsh
 * @create: 2019-11-14 13:54
 **/
public class Test3_2 {
    public static boolean test3(int[] arr){
        if(arr.length <2 || arr == null){
            return false;
        }
        int middle = arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>middle){

            }
        }

        return true;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
