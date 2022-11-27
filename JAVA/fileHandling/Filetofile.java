//PART – A
//
//1. Differentiate abstract method and concrete method with example.
//2. Define interface. Write the syntax for creating interface.
//3. Create a java program to remove all white spaces from a string.
//4. How will you reverse the elements of ArrayList.
//5. State the difference between exception and error.
//6. Differentiate throw and throws.
//7. State the purpose of finally clause in try catch block.
//8. Define stream. 
//9. Explain how data can be read from the input unit using BufferedReader.
//10. Write the syntax to open a file.
//
//PART –B	
//
////1. What is interface? How will you define and implement interface? Illustrate the concept of extending interfaces. Write a java program that illustrates interface concept. 
//2. Write a program in java to implement stack using interface.
//3. Define exception. Why it is needed? Explain the different types of exceptions and the exception hierarchy. Also discuss whether it is possible to use multiple catch blocks. Illustrate with necessary programs. 
////4. Write a program in java to perform read and write operations in file.
////5. Write a program in java to handle DivideByZero Exception and ArrayIndexOutOfBounds Exception with multiple catch blocks.
////6. Write a program in java to copy the contents of one file to another.
//7. Write a program in java to display the properties of file.
//

package fileHandling;

import java.io.*;

public class Filetofile {
		public static void main(String[] args) throws IOException 
		{
			// TODO Auto-generated method stub
			int i;
	//6th question
//			File f = new File("C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt");
//			if(f.createNewFile())
//				System.out.println("File Created Successfully");
			
			FileInputStream fin = new FileInputStream("C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt");
			System.out.println("File Size is "+fin.read());
			System.out.print("File contents are ");
			
			while((i=fin.read())!=-1) {
				System.out.print((char)(i));
			}

//			do
//			{
//				i = fin.read();
//				if(i != -1)
//					System.out.print((char)i);
//			} while(i != -1);
			
			
		}

}








