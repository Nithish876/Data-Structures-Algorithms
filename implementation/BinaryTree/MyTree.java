class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
     TreeNode(int val){
         this.val =val;
         this.right = null;
         this.left = null;
     }
}
class BinaryTree{
    TreeNode root;
    
    public BinaryTree(){
        root = null;
    }
    
    public void createSampleTree(){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

    }
    
    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
}

    public void printPretty(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) return;
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);
        if (node.left != null || node.right != null) {
            printPretty(node.left, prefix + (isLeft ? "│   " : "    "), true);
            printPretty(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
}

    public void printTree(TreeNode node, int space) {
        if (node == null) return;  
        space += 5; 
        printTree(node.right, space); 
        System.out.println();
        for (int i = 5; i < space; i++) System.out.print(" ");
            System.out.println(node.val); 
            printTree(node.left, space);
        }
    }

public class MyTree{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.createSampleTree();
        // tree.inorder(tree.root);
        // tree.printTree(tree.root,0);
        tree.printPretty(tree.root, "", false);

    }
}
