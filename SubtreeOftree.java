public Boolean issubtree(Node root1.Node root2){
    if(root2==null){
        return true;
    }
    if(root1==null){
        false;
    }
    if(root1.val==root2.val){
        if(identical(root1,root2)){
            return true;
        }
    }
    return issubtree(root1.left,root2.left) || issubtree(root1.right,root2.right);
}
public static int identical(Node root1,Node root2){
    if(root1==null &root2==null){
        return true;
    }
    if(root1==null || root2==null){
        return false;
    }
    if(root1.val==root2.val){
        return identical(root1.left,root2.left)||identical(root1.right,root2.right);
    }
    return false;
}