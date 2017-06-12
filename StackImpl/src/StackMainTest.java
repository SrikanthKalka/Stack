
public class StackMainTest {

	public static void main(String[] args) {

		StackImpl stackArrayObj = new StackImpl();
		
		stackArrayObj.pushElement(05);
		stackArrayObj.pushElement(10);
		stackArrayObj.pushElement(15);
		stackArrayObj.pushElement(20);
		stackArrayObj.pushElement(25);
		
		stackArrayObj.printStackElements();
		
		System.out.println("Pop Success: "+stackArrayObj.pop());
		
		stackArrayObj.printStackElements();
		
	}

}
