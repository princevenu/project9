package application;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class InputFile {
   public static LinkedList<Student> listOfStudentObjects= new LinkedList<>();

    public static void FileRead() throws IOException, InputMismatchException {

        BufferedReader bufReader = new BufferedReader(new FileReader("PlanetInfo.txt"));
        //using buffer to read the file

        String line = bufReader.readLine();  //open bufferreader to read the line

        while (line != null) {      //iterates till the end of the line.

            line.trim();

            String strArray[] = line.split(",");            //storing sentence in array of strings
            
            Student temp = new Student();
            temp.setId(strArray[0].trim());
            try {
            	double grades = 0;
            	for(int i = 1;i<6;i++) {
            		grades+= Double.parseDouble(strArray[i]);
            	}
            	temp.setAvg(grades/6);
            	
            	
            	
            	  
			} catch (Exception e) {
				// TODO: handle exception
			}
            
 
            
            	listOfStudentObjects.add(temp);
            

            line = bufReader.readLine(); 
        }
        bufReader.close(); //close the buffer reader
        printfile();
    }

    public static void printfile(){              // method to print the contents of file word by word
        for (Student s : listOfStudentObjects) {
            System.out.println(s.toString());
        }
    }

    public static LinkedList<Student> getListOfPlanetObjects() {  
        return listOfStudentObjects;
    }
}
