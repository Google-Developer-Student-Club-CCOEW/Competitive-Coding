import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int val){ this.val=val;}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val=val;
			this.left=left;
			this.right=right;
		}
	}

	static TreeNode reverseOddLevels(TreeNode root) {
		ArrayDeque<TreeNode> dq = new ArrayDeque<>();
		dq.add(root);
		int level=0;
		while(dq.size()>0) {
			int s = dq.size();
			if(lvl%2==1) {
				ArrayList <TreeNode> list = new ArrayList<>();
				ArrayList <Integer> list1 = new ArrayList<>();
				for(int i=0;i<s;i++) {
					TreeNode p = dq.pop();
					if(p.left!=null) dq.add(p.left);
					if(p.right!=null) dq.add(p.right);
					list.add(p);
					list1.add(p.val);
				}
				for(int i=0,j=s-1;i<s;i++,j--) {
					list.get(i).val=list1.get(j);
				}
			}
      else 
      {
				for(int i=0;i<s;i++) {
					TreeNode p = dq.pop();
					if(p.left!=null) dq.add(p.left);
					if(p.right!=null) dq.add(p.right);
				}
			}
			levrl++;
		}
		return root;
		
	}
}
