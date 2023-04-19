import java.util.*;
public class Treeidentical
{
    public static boolean identical(TreeNode root,TreeNode subtree)
    {
        if(root==null && subtree==null)
        {
            return true;
        }
        if(root==null || subtree==null)
        {
            return false;
        }
        if(root.data==subtree.data)
        {
            return identical(root.left,subtree.left) || identical(root.right,subtree.right);
        }
        return false;

    }
    public boolean isSubTree(TreeNode root,TreeNode subtree)
    {
        if(subtree==null)
        {
            return true;
        }
        if(root==null)
        {
            return false;
        }
        if(root.data==subtree.data)
        {
            if(identical(root,subtree))
            {
                return true;
            }
        }
        return isSubTree(root.left,subtree.left) || isSubTree(root.right,subtree.right);
    }
}