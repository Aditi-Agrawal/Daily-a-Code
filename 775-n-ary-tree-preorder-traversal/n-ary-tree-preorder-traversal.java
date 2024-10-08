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
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        pre(root, list);
        return list;
    }

    private void pre(Node root,List<Integer> list){
        if(root==null){
            return;
        }

        if(root.children == null){
            list.add(root.val);
            return;
        }
        
        list.add(root.val);

        for(Node node : root.children){
            pre(node,list);
        }
    }
}