/*4) on the developer side create following checked exception:
	InvalidLengthException
create necessary jar file and documentation.

on client side

public class Authenticator
	with
a parameterized constructor which takes String as a password.
this class also will have "done()" method with "successful authentication" message.
Parameterized constructor should check the length of the password passed if it is less than 5 or more that 9 , it should raise "InvalidLengthException" 
	[ constructor shouldn't handle the exception]

create a class "Demo" with main
	inside main function create the object of "Authenticator" class and invoke "done()" method.*/


//InvalidLengthException.java

package Day_8;

public class InvalidLengthException extends Exception {
	public InvalidLengthException() {
		super("Length should be greater than 5 and less than 9");
	}
}

//Authenticator.java

package Day_8;

public class Authenticator {
	public Authenticator(String password) throws InvalidLengthException{
		if(password.length()<5 || password.length()>9) {
			throw new InvalidLengthException();
		}
		demo();
	}
	
	public void demo() {
		System.out.println("Successful Authentication");
	}
	
	public static void main(String[] args) throws InvalidLengthException {
		String p = "12";
		Authenticator a = new Authenticator(p);
		System.out.println();
	}
}
