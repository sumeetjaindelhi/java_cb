package lec_40_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
		
		TreeFunctions tree=new TreeFunctions(arr,-1);
		
		Queue<TreeNode> q=new LinkedList<>();
		
		q.add(tree.root);
		q.add(null);
		
		while(q.size()>1)
		{
			TreeNode rm=q.remove();
			
			if(rm==null)
			{
				q.add(null);
				System.out.println();
			}
			else
			{
			
			System.out.print(rm.val+" ->");
			
			if(rm.left!=null)
			{
				q.add(rm.left);
			}
			
			if(rm.right!=null)
			{
				q.add(rm.right);
			}
			
			}
		}
		

	}

}
