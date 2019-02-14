package javaspringexamples.Tree;

public class TestHeightSearchInsertionLowestCommonAncestor {

	public static void main(String[] args) {

		// Create the binary search tree
		Node root = new Node(10);
		Node node_5 = root.setLeft(9).setLeft(5);
		node_5.setLeft(4);
		node_5.setRight(6);
		Node node_30 = root.setRight(20).setRight(30);
		node_30.setLeft(25);
		node_30.setRight(40);

		BinarySearchTree bt = new BinarySearchTree();
		System.out.println("Height of the tree : (must be 4)");
		System.out.println(bt.height(root));

		System.out.println("Insertion the value 3 :");
		bt.postOrder(bt.insert(root, 3));

		System.out.println("Searching the value 25 :");
		System.out.println(bt.search(root, 25));
		System.out.println("Searching the value 99 :");
		System.out.println(bt.search(root, 99));

		System.out.println("Finding the lowest common ancestor of 4 and 25 : (must be 10)");
		System.out.println(bt.findLCA(root, 4, 25).data);

		System.out.println("Finding the lowest common ancestor of 5 and 6 : (must be 5)");
		System.out.println(bt.findLCA(root, 5, 6).data);
	}
}
