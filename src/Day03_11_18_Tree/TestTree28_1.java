package Day03_11_18_Tree;

/**
 * @program: StudyCode
 * @description: 对称的二叉树
 * @author: zhangsh
 * @create: 2019-11-26 16:30
 **/
public class TestTree28_1 {
    public boolean isSymmetric(TreeNode root){

        return isMirror(root,root);

    }
    public boolean isMirror(TreeNode t1,TreeNode t2){
        //如果t1和t2都是null说明到底了开始return
        if (t1 == null && t2 == null){
            return true;
        }
        //如果只有一个为null说明不对称
        if (t1 ==null || t2==null){
            return false;
        }
        //当值相同并且后面的为true在继续往下
        return (t1.val == t2.val) &&
        isMirror(t1.left,t2.right) &&
        isMirror(t1.right,t2.left);
    }
}
