package FilesDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String data = "This is the data were are writing from a file.";
		//FileWriter output = new FileWriter();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter in some text.");
		String data = s.nextLine();
		data = data + "\n";
		System.out.println("This is data: "+data);
		
		try {
			//Create a writer object using the FileWriter class
			System.out.println("Enter in filename");
			//Scanner s = new Scanner(System.in);
			
			String fName = s.next(); 
			
			File file = new File(fName);
			
			boolean check = file.createNewFile();
			if(check){
			System.out.println("The new file is created");
			}
			else{
			System.out.println("The file is already exists!");
			}
			
			
			
			FileWriter output = new FileWriter(fName);
			//output = new FileWriter("myfile.txt");
			
			
			//output.write(data);
			output.append(data);
			System.out.println("Data is written to the file.");
			output.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			//output.close();
			System.out.println("File operation complete.");
			
		}
				
				
	}

}
