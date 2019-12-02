package Day03_11_18_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: StudyCode
 * @description: 从上到下打印二叉树
 * //如果要是分层打印的话就每层new一个List存放每层的数据，外面放一个总的List存放每个子List
 * @author: zhangsh
 * @create: 2019-11-28 14:31
 **/
public class TestTree32_1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null){
            return null;
        }
       //存放未弹出的节点，弹出一个就把他的左右节点添加进来
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cut = queue.size();
            while (cut >0){
                TreeNode t = queue.poll();
                result.add(t.val);
                if (t.left!=null){
                    queue.add(t.left);
                }
                if (t.right != null){
                    queue.add(t.right);
                }
                cut--;

            }
        }
        return result;
    }
}
