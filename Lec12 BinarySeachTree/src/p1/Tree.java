package p1;

public class Tree {

	private Node root;
	
	
	public Tree() {
		root = null;
	}
	
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		} //current is the node to be deleted 
		
		//case 1 the current node has no children
		if (current.leftChild == null & current.rightChild == null) {
			if (current == root) {
				root = null; // the tree is empty
			} else if (isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}
		//case 2 if current has no right child, replace with left subtree
		else if (current.rightChild == null) { // no right child, must have left child
			if (current == root) {
				root = current.leftChild;
	
			} else if(isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		}
		
		else if(current.leftChild == null) { //no left child, must have right child
			if(current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		}
		else { //current has two children
			// get successor
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			}
				else {
					parent.rightChild = successor;
				}
			successor.leftChild = current.leftChild;
			
			}
		return true;
		}
	
	
	private Node getSuccessor(Node delNode)	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor != delNode.rightChild) { //if successor is not the right child
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public void insert(int iData, double dData) {
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.dData = dData;
		
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(iData < current.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
			} else {
				current = current.rightChild;
				if(current == null) {
					parent.rightChild = newNode;
					return;
				}
			}
		}
	}
	}
	
	public Node find(int key) {
		Node current = root;
		while (current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if (current == null) {
				return null;
			}
		}
		return current;
	}
}
