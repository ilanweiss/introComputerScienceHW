/*
*Assignment number :9.3
*File Name : LinkedList.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
package mms;

/**
 * Represents a list of Nodes. The list has a "first" pointer, which points to the first node in the list,
 * a "last" pointer, which points to the last node in the list, and a size, which is the number of nodes in the list.  
 */
public class LinkedList {

	Node tail;
	Node head;
	int size;
	
	/**
	 * Constructs a new doubly-connected linked list.
	 */ 
	public LinkedList () {
		MemoryBlock dummy;
		dummy = new MemoryBlock(0,0);
		tail = new Node(dummy);
		dummy = new MemoryBlock(0,0);
		head = new Node(dummy);
		tail.next = head;
		head.previous = tail;
		size = 2;
	}
	
	/**
	 * Gets the node located at the given index in this list. 
	 * 
	 * @param index
	 *        the index of the node to retrieve, between 0 and size
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than the list's size
	 * @return the node at the given index
	 */		
	public Node getNode(int index) {
        if ((index < 0)||(index >= size)) 
        	throw new IllegalArgumentException();
        Node tempNode = tail;
        if (index < size-1){
    		for (int i = 0; i < index; i++){
    			tempNode = tempNode.next;
    			}
        	}
        return tempNode;
	}
	/**
	 * Creates a new Node object that points to the given memory block, and inserts the
	 * node to this list immediately prior to the given index (position in this list).
	 * <p>
	 * If the given index is 0, the new node becomes the first node in this list.
	 * <p>
	 * If the given index equals the size of this list, the new node becomes the last 
	 * node in this list.
	 * 
	 * @param block
	 *        the memory block to be inserted into the list
	 * @param index
	 *        the index before which the memory block should be inserted
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than the list's size
	 */
	public void add(int index, MemoryBlock block) {
		if ((index < 1) || (index > size-1))
				throw new IllegalArgumentException();
		else if (index == 1){
			addFirst(block);
		}
		else if ((index == size-1) && (index != 1))
			addLast(block);
		else if ((index != size-1) && (index != 1))
		{
				Node newNode = new Node(block);
				newNode.previous = getNode(index-1);
				newNode.next = getNode(index);
				getNode(index-1).next = newNode;
				getNode(index).previous = newNode;
				size++;
		}
	}
	

	/**
	 * Creates a new node with a reference to the given memory block, and appends it to the end of this list
	 * (the node will become the list's last node).
	 * 
	 * @param block
	 *        the given memory block
	 */
	public void addLast(MemoryBlock block) {
		Node clone = head.previous; 
		Node newNode = new Node(block);
		newNode.previous = clone;
		newNode.next = head;
		head.previous = newNode;
		clone.next = newNode;
		size++;
	}
	/**
	 * Creates a new node with a reference to the given memory block, and inserts it at the beginning of this list
	 * (the node will become the list's first node).
	 * 
	 * @param block
	 *        the given memory block
	 */
	public void addFirst(MemoryBlock block) {
		Node clone = tail.next;  
		Node newNode = new Node(block);
		newNode.next = clone;
		newNode.previous = tail;
		tail.next = newNode;
		clone.previous = newNode;
		size++;
	}

	/**
	 * Gets the memory block located at the given index in this list.
	 * 
	 * @param index
	 *        the index of the retrieved memory block
	 * @return the memory block at the given index
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than or equal to size
	 */
	public MemoryBlock getBlock(int index) {
		if (( index < 1 ) || ( index > size - 1 ))
			throw new IllegalArgumentException();
		 return getNode(index).block;
		  
	}	

	/**
	 * Gets the index of the node pointing to the given memory block.
	 * 
	 * @param block
	 *        the given memory block
	 * @return the index of the block, or -1 if the block is not in this list
	 */
	public int indexOf(MemoryBlock block) {
		for (int i = 1; i < size - 1; i++){
			if ( block.equals( getBlock( i ) ) )
				return i;
		}
    	return (-1);
	}

	/**
	 * Removes the given node from this list.	
	 * 
	 * @param node
	 *        the node that will be removed from this list
	 */
	public void remove(Node node) {
		Node cloneNode = node;
		int index = indexOf(cloneNode.block);
		if (index != (-1)){
			getNode(index - 1).next = cloneNode.next;
			getNode(index + 1).previous = cloneNode.previous;
			size--;
			
		}
	}

	/**
	 * Removes from this list the node which is located at the given index.
	 * 
	 * @param index the location of the node that has to be removed.
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than or equal to size
	 */
	public void remove(int index) {
		if ((index < 1) || (index > size))
			throw new IllegalArgumentException();
		else{
			remove(getNode(index));
			}
	}

	/**
	 * Removes from this list the node pointing to the given memory block.
	 * 
	 * @param block the memory block that should be removed from the list
	 * @throws IllegalArgumentException
	 *         if the given memory block is not in this list
	 */
	public void remove(MemoryBlock block) {
		if (indexOf(block) == (-1))
			throw new IllegalArgumentException();
		else
			remove(indexOf(block));
	}

	/**
	 * Returns an iterator over this list, starting with the first element.
	 */
	public ListIterator iterator(){
		return new ListIterator(tail.next);
	}
	
	/**
	 * A textual representation of this list, useful for debugging.
	 */
	public String toString() {
		String str = "";
		for (int i = 1 ; i < size - 1; i++ ){
			str = str + getBlock(i);
		}
		return str;
	}
}