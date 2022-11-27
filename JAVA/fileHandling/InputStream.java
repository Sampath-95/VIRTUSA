package fileHandling;
import java.io.*;
class InputStream
{
	public static void main(String args[]) throws IOException
	{
		int i;
		
//		    f1="C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt";
			FileInputStream fin = new FileInputStream("C:\\Users\\banga\\OneDrive\\Desktop\\Java.txt");
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			
		if(fin!=null) fin.close();
	}
}