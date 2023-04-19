public class IdenticalTree{
    public static int identical(TreeNode root1,TreeNode root2){
        if(roo1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val==root2.val){
            return identical(root1.left,root2.right) || identical(root1.right,root2.right);
        }
        return false;
    }
}