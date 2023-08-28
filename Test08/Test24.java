package Test08;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test24 {
    List<Integer> list= new LinkedList<>();
    public static void main(String[] args) {
        Test24 test24 =  new Test24();
//        int Tree root= {1,null,2,3};
        System.out.println(test24.postorderTraversal());
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.left);

        helper(root.right);
        list.add(root.val);
    }
}
