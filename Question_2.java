*/2) on the developer side create an exception:
	NumberNotDivisibleBySevenException
	as a checked exception

create necessary jar and documentation.

on client side
	public class MyMath class with 
		public void disp(int num)
this disp() method will check if the number passed is not divisible by 7 , it will raise "NumberNotDivisibleBySevenException" or else it will simply display the number passed.
	[ this method shouldn't handle the exception]

	public class Demo
		main function 
		invoke "disp()" of "MyMath" class.*/

//NumberNotDivisibleBySevenException.java

package Day_8;

public class NumberNotDivisibleBySevenException extends Exception {
	public NumberNotDivisibleBySevenException() {
		super("Number is not divisible by 7");
	}
}

//MyMath.java

package Day_8;

public class MyMath {
	public int disp(int num)throws NumberNotDivisibleBySevenException {
		int d = num/7;
		if(num%7 !=0) {
			throw new NumberNotDivisibleBySevenException();
		}
		return d;
	}
}

//Demo.java

package Day_8;

public class Demo {
	public static void main(String[] args) throws NumberNotDivisibleBySevenException {
		MyMath m = new MyMath();
		System.out.println(m.disp(5));
	}
}
