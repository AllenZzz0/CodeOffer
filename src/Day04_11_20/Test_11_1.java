package Day04_11_20;

/**
 * @program: StudyCode
 * @description: 旋转数组的最小数字（存在重复值）
 *( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * @author: zhangsh
 * @create: 2019-11-20 17:43
 **/
public class Test_11_1 {
    public static int findMin(int[] nums) {
        int left = 0,right = nums.length-1;
        while (left < right){
            int mid = (left + right) /2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else if(nums[mid]<nums[right]){
                right = mid;
            }else {
                right = right-1;
            }

        }
        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,1};
        System.out.println(findMin(nums));
    }
}
