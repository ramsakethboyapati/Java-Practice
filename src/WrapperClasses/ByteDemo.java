package WrapperClasses;

public class ByteDemo {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=20;
		Byte obj2= new Byte(b1);
		Byte obj1=10;
		
		if(obj2==obj1) { //checks the values in both are not objects and
			//checks references if both are objects.
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		String str=obj1.toString();
		byte b4=Byte.parseByte(str);

	}

}
