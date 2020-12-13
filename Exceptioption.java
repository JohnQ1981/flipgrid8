package flipgrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptioption {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("//");
		} catch (FileNotFoundException e) {

			System.err.println("No File Found");
			//e.printStackTrace();
		}

		int i=5;
		int k=0;
		//int div=i/k;
		try {
			System.out.println("The  Division: "+ (i/k));
		}catch(ArithmeticException e) {
			e.getStackTrace();
			System.err.println("You cannot divide by Zero");
		}

	}

}
