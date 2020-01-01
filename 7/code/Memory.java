
/** Represents a random access memory (RAM) unit.
 *  A Memory is an indexed sequence of registers. 
 *  The Memory enables reading from, or writing to, any individual register according to a given index. 
 *  The index is typically called "address". The addresses run from 0 to the memory's size, minus 1. */  

public class Memory {

    private Register[] m;  // an array of Register objects
	
    /** Constructs a memory of size registers, and sets all the register values to 0. */
    public Memory(int size) {
       // Put your code here
    }
	
    /** Sets the values of all the registers in this memory to 0. */
    public void reset() {
        // Put your code here
    }

    /** Returns the value of the register whose address is the given address. */
    public int getValue(int address) {
        // Put your code here
    }

    /** Sets the register in the given address to the given value. */
    public void setValue(int address, int value) {
        // Put your code here
    }		
	
    /** Returns a subset of the memory's contents, as a formated string. Specifically:
     *  Returns the first 10 registers (where the top of the program normally resides)
     *  and the bottom 10 registers (where the variables normally reside).
     *  For each register, returns the register's address and value. */
     public String toString() {
         // Put your code here
    } 	
}
