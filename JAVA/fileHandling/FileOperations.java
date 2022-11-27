package fileHandling;
import java.io.*;
public class FileOperations {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\banga\\OneDrive\\Desktop\\File.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Created\nHello, Welcome to java programming..!");
			}
			else {
				System.out.println("File Already created");
			}
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
