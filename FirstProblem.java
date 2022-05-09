package problem1;
import java. io.*; 

public class FirstProblem {
	public static void main(String args[ ] ){ 
		
		File fileObj = new File("c:\\java\\abc.txt") ; 
		try {
			if (fileObj.exists()) {
				System.out.println("file already exists");
			}
			else {
				fileObj.createNewFile();
				System.out.println("new file created by the name of abc ");
			}
			if(fileObj.isDirectory()) {
				System.out.println("abc is a directory");
				
			}
			else {
				System.out.println("abc is not a directory");
				
			}
			if(fileObj.isFile()) {
				System.out.println("abc is a file");
				
			}
			System.out.println("file name is : "+fileObj.getName());
			System.out.println("file path is : "+fileObj.getPath());
			System.out.println("file absolute path is : "+fileObj.getAbsolutePath());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
 } 
	
}
