package anySort;

import java.util.ArrayList;
import java.util.List;

//in best case - O(n), average and worst - O(n log n)
public class TreesortAlgorithm {
	//resultset
	private List<Integer> sortedData = new ArrayList<>();
	//creating our main node
	Node root;
	//initialize it to null in constructor
	TreesortAlgorithm(){
		root = null;
	}
	//main logic for adding elements to the tree
	public void addNode(int key) {
		//initialize new node by given key
		Node newNode = new Node(key);
		//if we do not have a root for the current subtree, we create it
		if(root == null) {
			root = newNode;
		//else take focus node like our current root
		}else {
			Node focusNode = root;
			
			//creating parent node(it also is a root for the current subtree)
			Node parent;
			//iterate until finding min element
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
	//traversing a sorted tree
	public void inOrderTraverseTree(Node focusNode) {
		//if this node is existing
		if (focusNode != null) {
			//first check the left child
			inOrderTraverseTree(focusNode.leftChild);
			//add this to result list
			sortedData.add(focusNode.key);
			//after check the right child
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	//filling nodes from the input array
	public void treeInsert(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			addNode(arr[i]);
		}
	}
	public List<Integer> getSortedData() {
		return sortedData;
	}

}
//class to creating node entity
class Node{
	int key;
	
	//left and right values to current node
	Node leftChild, rightChild;
	//constructor
	Node(int key) {
		this.key = key;
		//leftChild=rightChild=null;
	}
	
	
}