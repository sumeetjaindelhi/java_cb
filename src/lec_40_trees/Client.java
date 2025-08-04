package lec_40_trees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
		
		TreeFunctions tree=new TreeFunctions(arr,-1);
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		
		
		
	}

}
