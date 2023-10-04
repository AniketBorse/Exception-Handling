/*3) define "MyException" as a checked exception.

define a class "Demo" with 
	public void show1(), public void show2() , public void show3() and main functions.

inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
	[ this method shouldn't handle the exception]

main() function should call "show1()" , 
show1() function should call "show2()",
show2() function should call "show3()"

show2() should not handle the exception but show1() should handle.*/


//MyException.java

package Day_8;

public class MyException extends Exception {
	public MyException() {
		super("Number should be less than 10");
	}
}

//Demo.java

package Day_8;

import java.util.Scanner;

public class Demo {
	public void show1() throws MyException {
		show2();
	}
	
	public void show2() throws MyException {
		show3();
	}

	public void show3() throws MyException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 10) {
			throw new MyException();
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) throws MyException {
		Demo d= new Demo();
		d.show1();
	}
}
