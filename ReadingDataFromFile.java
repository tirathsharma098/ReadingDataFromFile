// Reading data from a file.
import java.util.*;
import java.io.*;

public class ReadingDataFromFile{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		Scanner userChoice = new Scanner(System.in);
		String fileName;
		int choice=0;
		System.out.println("In this program you can Read data of files \n \n ....");
		
		do{
			System.out.println("Enter the file name Whose data you want to read");
			fileName = userInput.nextLine();
			File fileObj = new File(fileName);
			if(fileObj.exists()){
				try{
					Scanner tempReader = new Scanner(fileObj);
					while(tempReader.hasNextLine()){
						System.out.println(tempReader.nextLine());
					}
				}catch(FileNotFoundException e){
					System.out.println("An error Occured.");
					e.printStackTrace();
				}
			}else{
				System.out.println("You Entered Wrong Input, Please be sure that you have provided Correct");
				System.out.println(" file name with extension");
			}
			System.out.println("To Read Data Again press 1 else 0 : ");
			choice = userChoice.nextInt();
		}while(choice == 1);
	}
}