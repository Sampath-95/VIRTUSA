package fileHandling;
import java.io.*;
public class File_ReadWrite {

	//File copy from from one to another
	
	public static void main(String[] args) throws IOException{
//		 TODO Auto-generated method stub
		
//		File before=new File("C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt");
		File after=new File("C:\\Users\\banga\\OneDrive\\Desktop\\File.txt");
//			
//				if(before.exists()) {
//					before.renameTo(after);
//					System.out.println("File name Successfully Changed");
//				}
		
//		if(before.createNewFile()) {
//			System.out.println("File Created\nHello, Welcome to java programming..!");
//		}
//		else {
//			System.out.println("File Already created");
//		}
		if(after.createNewFile()) {
			System.out.println("File Created\nHello, Welcome to java programming..!");
		}
		else {
			System.out.println("File Already created");
		}
			
//	file to file copy
			FileInputStream f= new FileInputStream("C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt");
			FileOutputStream w=new FileOutputStream("C:\\Users\\banga\\OneDrive\\Desktop\\File.txt");		
			int i;
		while((i=f.read())!=-1) {
			w.write(i);
		}
		System.out.println("File Copied Successfully");
	}}






















