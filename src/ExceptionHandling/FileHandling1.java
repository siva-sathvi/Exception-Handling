package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   File f=new File("C:\\TextFile\\resume2.txt");
  // System.out.println(f.delete());
  // System.out.println(f.createNewFile());
	//or
   /*if (f.exists()) {
	   f.delete();
	   System.out.println(f.createNewFile());
   }*/
 //  System.out.println(f.isHidden());
   System.out.println(f.canWrite());
	}

}
