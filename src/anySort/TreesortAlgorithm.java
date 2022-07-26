package anySort;

import java.util.ArrayList;
import java.util.List;

public class TreesortAlgorithm {
	private List<Integer> sortedData = new ArrayList<>();
	
	Node root;
	TreesortAlgorithm(){
		root = null;
	}
	public void addNode(int key) {
		Node newNode = new Node(key);
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild=newNode;
						return;
					}
				}else {
					focusNode=focusNode.rightChild;
					
					if (focusNode==null) {
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
		
	}
	public void inOrderTraverseTree(Node focusNode) {
		
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			
			sortedData.add(focusNode.key);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	public void treeInsert(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			addNode(arr[i]);
		}
	}
	public List<Integer> getSortedData() {
		return sortedData;
	}

}

class Node{
	int key;
	
	Node leftChild, rightChild;

	Node(int key) {
		this.key = key;
		//leftChild=rightChild=null;
	}
	
	
}