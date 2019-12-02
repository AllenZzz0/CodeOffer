package Day03_11_18_Tree;

/**
 * @program: StudyCode
 * @description: 树的子结构，判断B树是A树的子树吗
 * @author: zhangsh
 * @create: 2019-11-26 13:58
 **/
public class TestTree26_1 {

    public boolean hasSubTree(TreeNode treeA,TreeNode treeB){
        if (treeA == null || treeB == null){
            return false;
        }
        //比较A树的根节点，左右子节点和树B对比，
        return isSubTreeWithRoot(treeA,treeB) || isSubTreeWithRoot(treeA.left,treeB) || isSubTreeWithRoot(treeA.right,treeB);

    }

    public boolean isSubTreeWithRoot(TreeNode treeA,TreeNode treeB){
        //树A是空的话直接返回
        if (treeA == null){
            return false;
        }
        //树b为空的话说明到底了直接返回
        if (treeB == null){
            return true;
        }
        //不相等就直接返回，要是boolean值的就不能比较大小，需要相减值在-0.0000001和0.0000001之间就算相等
        if (treeA.val != treeB.val){
            return false;
        }
        return isSubTreeWithRoot(treeA.left,treeB.left) && isSubTreeWithRoot(treeA.right,treeB.right);
    }

}
