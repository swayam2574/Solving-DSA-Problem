/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
int index = 0;

    public List<Integer> preorder(Node root) {
        int size = countNodes(root);
        int[] arr = new int[size];

        fillPreorder(root, arr);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    private int countNodes(Node node) {
        if (node == null) return 0;

        int count = 1;
        if (node.children != null) {
            for (Node child : node.children) {
                count += countNodes(child);
            }
        }
        return count;
    }

    private void fillPreorder(Node node, int[] arr) {
        if (node == null) return;

        arr[index++] = node.val;

        if (node.children != null) {
            for (Node child : node.children) {
                fillPreorder(child, arr);
            }
        }
    }
}