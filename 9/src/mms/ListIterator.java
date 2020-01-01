package mms;
/*
*Assignment number :9.4
*File Name : ListIterator.java
*Name : Ilan Weiss
*Student ID : 302634654
*Email : ilan.weiss@post.idc.ac.il
*/
/*
 * Represents an iterator of a linked list.
 */
public class ListIterator {

    // current position in the list (cursor)
    Node current;

    /** Constructs a list iterator,
     *  starting at the given node */
    public ListIterator(Node node) {
        current = node;
    }

    /** Checks if this iterator has more
     *  nodes to process */
    public boolean hasNext() {
        return (current.next != null); 
    }

    /** Returns the current element in the list
     * and advances the cursor */
    public MemoryBlock next() {
    	Node currentNode = current;
       	current = current.next;
    	return currentNode.block;
        
    }
}