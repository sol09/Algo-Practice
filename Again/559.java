//559. Maximum Depth of N-ary Tree

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
    public int maxDepth(Node root) {
        int depth=0;
        
        if(root==null)
            return 0;
        
        if(root.children.isEmpty())
            return 1;
        
        List<Integer> dep = new ArrayList<Integer>();
        for(Node n : root.children) {
            dep.add(maxDepth(n));
        }
        return Collections.max(dep)+1;
    }
}

/* 이진트리가 아니라서 자식 노드를 List에 넣고 List를 활용해서 푸는 문제. 은 이진트리와 거의 유사함. 시간복잡도: 35.72%, 공간복잡도: 98.08% */
