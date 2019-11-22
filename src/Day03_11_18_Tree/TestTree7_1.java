package Day03_11_18_Tree;

import java.util.HashMap;

/**
 * @program: StudyCode
 * @description: 从中序遍历和前序遍历重建二叉树
 * @author: zhangsh
 * @create: 2019-11-18 15:50
 **/
public class TestTree7_1 {
    int pre_idx = 0;
    //前序遍历
    int[] preorder;
    //中序遍历
    int[] inorder;
    //存储中序遍历的值，key为树的值，value是下标
    HashMap<Integer, Integer> idx_map = new HashMap<>();
    public TreeNode helper(int in_left, int in_right){
        if (in_left == in_right){
            return null;
        }
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);

        int index = idx_map.get(root_val);

        pre_idx++;

        root.left = helper(in_left, index);
        root.right = helper(index+1,in_right);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        int idx = 0;
        for (Integer val : inorder){
            idx_map.put(val,idx++);
        }
        return helper(0,inorder.length);

    }

    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
        TestTree7_1 a = new TestTree7_1();
        TreeNode test1 = a.buildTree(preorder,inorder);


    }



}
