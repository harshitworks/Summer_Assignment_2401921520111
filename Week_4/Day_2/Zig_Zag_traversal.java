package Week_4.Day_2;
import java.util.*;

class Zig_Zag_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();

        // use the dequeu here : there will be two traversal one is like normal as we did in the previous bfs and another is , removing elements from the last and adding elements in the start of queue , therefore use dequeue . keep a boolean flag to know , normal traversal or backward traversal in the for loop 
        Deque<TreeNode> dq = new ArrayDeque<>();
        if(root!=null) dq.offer(root);
        boolean normal = true;

        while(!dq.isEmpty()) {
            int n = dq.size();
            List<Integer> internal = new ArrayList<>();

            for(int i = 0 ; i < n ; i++) {
                TreeNode node ;

                // addding in the queue normally: 
                if(normal) {
                node = dq.pollFirst(); 
                    if(node.left!=null) dq.offer(node.left);
                    if(node.right!=null) dq.offer(node.right);
                }
                else { // adding in the reverse order
                    node = dq.pollLast(); 
                    if(node.right!=null) dq.offerFirst(node.right);
                    if(node.left!=null) dq.offerFirst(node.left);
                }
                internal.add(node.val);

            }
            normal = !normal;
            outer.add(internal);
        }

        return outer;
    }
}