import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class FindElements {
    private Set<Integer> values; // HashSet to store recovered values

    public FindElements(TreeNode root) {
        values = new HashSet<>();
        recoverTree(root, 0); // Recover the tree starting from root
    }

    private void recoverTree(TreeNode node, int value) {
        if (node == null) return;

        node.val = value;
        values.add(value);

        recoverTree(node.left, 2 * value + 1);  // Left child
        recoverTree(node.right, 2 * value + 2); // Right child
    }

    public boolean find(int target) {
        return values.contains(target); // O(1) lookup in HashSet
    }
}

// Test the implementation
public class FindElementsContaminatedBinaryTree {
    public static void main(String[] args) {
        // Constructing a contaminated binary tree (Example)
        TreeNode root = new TreeNode();
        root.left = new TreeNode();
        root.right = new TreeNode();
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();

        // Initialize FindElements and recover the tree
        FindElements obj = new FindElements(root);

        // Test cases
        System.out.println(obj.find(1)); // true
        System.out.println(obj.find(2)); // true
        System.out.println(obj.find(3)); // true
        System.out.println(obj.find(5)); // false
    }
}
