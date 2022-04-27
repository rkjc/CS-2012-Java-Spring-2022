package package2Medium;

import java.io.File;

// this class displays the file properties of the target file

public class TestFileClass {
  public static void main(String[] args) {
	  
    File bob = new File("writeOneFile.txt");
    
    System.out.println("Absolute path is " + bob.getAbsolutePath());
    
    System.out.println("Does it exist? " + bob.exists());
    System.out.println("-------------------------------" );
    System.out.println("The file has " + bob.length() + " bytes");
    System.out.println("Can it be read? " + bob.canRead());
    System.out.println("Can it be written? " + bob.canWrite());
    System.out.println("Is it a directory? " + bob.isDirectory());
    System.out.println("Is it a file? " + bob.isFile());
    System.out.println("Is it absolute? " + bob.isAbsolute());
    System.out.println("Is it hidden? " + bob.isHidden());
    System.out.println("Last modified on " + new java.util.Date(bob.lastModified()));
    
  }
}
