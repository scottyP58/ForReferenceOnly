package HelloWorld;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.File;
import java.io.FilenameFilter;


class FileDemo implements FilenameFilter
{
  //@Override
  public boolean accept(File dir, String fileName)
  {
    return fileName.endsWith(".txt");
  }
}

	   
public class MyPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String currentPath = "";
		String[] fileNames;
		//FilenameFilter filter = ".txt";
		
		try {
			currentPath = new java.io.File(".").getCanonicalPath();
						
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//break;
		}
		
		File f = new File(currentPath);
		
		//fileNames = f.list();
		
		
		
		FilenameFilter filter = new FileDemo();
		
		fileNames = f.list(filter);
		
		System.out.println("Current dir:" + currentPath);
		
		
	      ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      
	      
	      for (String filename : fileNames) {
	            // Print the names of files and directories
	            //System.out.println(pathname);

		    list.add(filename);

	        }
	      
	      
	      
	    //  list.add("JavaFX");
	    //  list.add("Java");
	    //  list.add("WebGL");
	    //  list.add("OpenCV");
	    //  list.add("OpenNLP");
	    //  list.add("JOGL");
	    //  list.add("Hadoop");
	    //  list.add("HBase");
	    //  list.add("Java Script");
	    //  list.add("Flume");
	    //  list.add("Mahout");
	    //  list.add("Impala");
	      System.out.println("Contents of the array list: ");
	      
	   // Sorting ArrayList in ascending Order   
	     Collections.sort(list);
	      
	      for (String element : list){
	       //  if (element.contains("Java")){
	         //      System.out.println(element);
	        // }
	      
	    	  System.out.println(element);
	    	  
	      }
	      
	      list.clear();
		
		
		
	}

}
