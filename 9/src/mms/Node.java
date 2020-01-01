/*
*Assignment number :9.1
*File Name : Node.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/

package mms;
/**
 * Represents a node in a doubly linked list. Each node points to a MemoryBlock object. 
 */
public class Node {

	Node previous;
	Node next;
	MemoryBlock block;
	/**
	 * Constructs a new node pointing to the given memory block
	 * 
	 * @param block
	 *  
	 */
	public Node(MemoryBlock block) {
		this.previous = null;
		this.block = block;
		this.next = null;
	}
	
	/** Constructs a node with the given memory block.
	* The new node will point to the given
	* next node, and previous node. */
	public Node(MemoryBlock block, Node previous, Node next){
		this.previous = previous;
		this.block = block;
		this.next = next;
	}
	/**
	 * A textual representation of this node, useful for debugging.
	 * (See the test output for examples).
	 */
	public String toString() {
		return "" + block;
	}
}