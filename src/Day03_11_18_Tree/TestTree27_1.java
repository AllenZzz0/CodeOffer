package Day03_11_18_Tree;

/**
 * @program: StudyCode
 * @description: 二叉树的镜像
 * @author: zhangsh
 * @create: 2019-11-26 14:26
 **/
public class TestTree27_1 {
    public void Mirror(TreeNode root){
        if (root == null){
            return;
        }
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }


    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

}
