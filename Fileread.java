import java.util.*;
import java.io.*;
class Fileread{
	public static void main(String[] args) throws IOException{
	
	int c;
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\java\\file\\abc.txt");
		while((c = fis.read())!=-1){
			 System.out.print((char)c);
		
	}

	}
}