package Day03_11_18_Tree;

import java.util.HashMap;

/**
 * @program: StudyCode
 * @description: 从中序遍历和后序遍历重建二叉树
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * @author: zhangsh
 * @create: 2019-11-18 15:50
 **/
public class TestTree7_2 {

    //后序遍历
    int[] postorder;
    //中序遍历
    int[] inorder;
    //存储中序遍历的值，key为树的值，value是下标
    HashMap<Integer, Integer> idx_map = new HashMap<>();

    /**
     *
     * @param in_left 中序遍历的左边界
     * @param in_right 中序遍历的右边界
     * @param postLeft 后序遍历的左边界
     * @param postRight 后序遍历的右边界
     * @return
     */
    public TreeNode helper(int in_left, int in_right, int postLeft, int postRight){
        if (in_left > in_right || postLeft > postRight) {
            return null;
        }
        int root_val = postorder[postRight];
        TreeNode root = new TreeNode(root_val);
        int rootIndex = idx_map.get(root_val);
        root.left = helper(in_left, rootIndex - 1, postLeft, postRight - in_right + rootIndex - 1);
        root.right = helper(rootIndex + 1, in_right, postRight - in_right + rootIndex, postRight - 1);

        return root;
    }
    public TreeNode buildTree(int[] postorder, int[] inorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        int idx = 0;
        for (Integer val : inorder){
            idx_map.put(val,idx++);
        }


        return helper(0, inorder.length - 1, 0, postorder.length - 1);

    }

    public static void main(String[] args) {
        int[] postorder={9,15,7,20,3};
        int[] inorder={9,3,15,20,7};
        TestTree7_2 a = new TestTree7_2();
        TreeNode test1 = a.buildTree(postorder,inorder);


    }



}
