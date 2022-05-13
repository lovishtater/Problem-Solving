/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect (Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> levelNodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curNode = queue.poll();
                levelNodes.add(curNode);
                if (curNode.left != null) {
                    queue.add(curNode.left);
                }
                if (curNode.right != null) {
                    queue.add(curNode.right);
                }
            }

            for (int i = 0; i < levelNodes.size() - 1; i++) {
                Node node = levelNodes.get(i);
                node.next = levelNodes.get(i + 1);
            }
        }

        return root;
    }
}