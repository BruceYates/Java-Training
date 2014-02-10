package chapter_11;

//class MyException extends Exception { }

public class TestExceptions {
	
	public static void main(String [] args) {
	
		String test = "no";
		try {
			System.out.println("start try");
			doRisky(test);
			System.out.println("end try");
		} catch (MyException se) {
			System.out.println("scary exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end of main");
	}
	
	static void doRisky(String test) throws MyException {
		System.out.println("start risky");
		if ("yes".equals(test)) {
			throw new MyException();
		}
		System.out.println("end risky");
		//return;
	}
}
