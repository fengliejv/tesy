package tree;

/**
 * Created by fengliejv on 2017/11/6.
 */
public class LowestCommonAncestorofaBinarySearchTree235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        if(p.val==root.val||q.val==root.val){
            return root;
        }
        if((p.val>root.val&&q.val<root.val)||(p.val<root.val&&q.val>root.val)){
            return root;
        }
        if(root.val>p.val){
            return lowestCommonAncestor(root.left,p,q);
        }else {
            return lowestCommonAncestor(root.right,p,q);
        }
    }
}
