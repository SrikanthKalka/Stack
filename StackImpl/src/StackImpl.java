/**
 * Last-In-First-out(LIFO):
 * 
 * Definition: "First inserted element should be deleted in the last".
 * 
 * PUSH(): A new element should be inserted at top of the old elements (Existing) 
 * 
 * POP() : The recent inserted element should be deleted.
 * 
 * @author srikanth
 *
 */
public class StackImpl {

	public int[] stackObject;
	public int stackSize;
	public int top;

	StackImpl() {

		stackSize = 1;
		top = -1; // No elements in the stack [we can assume it as index of the
					// stack]
		stackObject = new int[stackSize]; // initially created array with single
											// element

	}

	/**
	 * 
	 * step 1 : First do we need to check, in our stack there is a space to
	 * insert new element it can be check by using top element index and size of
	 * the stack.
	 * 
	 * step 2: if stack has an empty space, go ahead and insert an element in to
	 * the StackObject array by incrementing top element]
	 * 
	 * step 3: else go ahead and resize the stack (two times of old
	 * stacksize),then copy old stack array object daata into the newer
	 * stackObject array.
	 * 
	 * continue step-2;
	 * 
	 */
	public void pushElement(int newElement) {

		if (top >= stackSize - 1)
			resizeSize();

		stackObject[++top] = newElement;
		
	}

	private void resizeSize() {

		int[] temp = stackObject;
		stackSize = stackSize * 2;
		stackObject = new int[stackSize];

		// This loop helps us to copy the old stack_Array object data to newly
		// created stackObject
		// We are iterating the loop by using top element because, top returning
		// the old size of stack_Array.
		for (int i = 0; i <= top; i++) {
			stackObject[i] = temp[i];
		}
	}

	public int pop() {

		if (top < 0)
			return 0;

		return stackObject[top--];
		
	}

	/**
	 * To Print the stack element. Don't cofuse, it will print index 0 to higher 
	 */
	public void printStackElements() {

		for (int i = 0; i <= top; i++) {
			
			System.out.println("top--> "+i+" [  " + stackObject[i] + "  ]");

		}
		System.out.println("Top index is: "+top+"\n Size of the Stack is: "+stackSize);
	}

}
