package Day03_11_18_Tree;

import java.util.*;

/**
 * @program: StudyCode
 * @description: 分层打印树 z型打印
 * @author: zhangsh
 * @create: 2019-11-28 15:08
 **/
public class TestTree32_3 {
    public ArrayList<List<Integer>> PrintFromTopToBottom(TreeNode root) {
        if (root == null){
            return null;
        }
        //存放未弹出的节点，弹出一个就把他的左右节点添加进来
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()){
            int cut = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (cut >0){
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left!=null){
                    queue.add(t.left);
                }
                if (t.right != null){
                    queue.add(t.right);
                }
                cut--;

            }
            if (reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            result.add(list);
        }
        return result;
    }
}
