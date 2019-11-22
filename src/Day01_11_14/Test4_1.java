package Day01_11_14;

/**
 * @program: StudyCode
 * @description: 二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author: zhangsh
 * @create: 2019-11-14 13:54
 **/
public class Test4_1 {
    public static boolean test3(int[][] arr,int target) {
        int len = arr.length -1;
        int i = 0;
        while ((len>=0) &&  (i <=arr.length-1)){
            if(arr[i][len] > target){
                len--;
            }else if(arr[i][len] < target){
                i++;
            }else{
                return true;
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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        boolean result = test3(arr,74);
        System.out.println(result);
    }
}
