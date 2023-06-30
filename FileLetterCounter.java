//6. File Letter Counter
//Write a program that asks the user to enter the name of a file, and then asks the user to
//enter a character. The program should count and display the number of times that the
//specified character appears in the file. Use Notepad or another text editor to create a
//sample file that can be used to test the program.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Scanner;

public class FileLetterCounter {
    
    public FileLetterCounter() {
        display();
    }

    //Identify file and characters  
    public int getCharacterCount(File file, char _char) {

        //Initialize count variable 
        int count = 0;

        //Initialiaze file reader and buffer ready to identify file
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            //Creat while and for loop to count characters
            while(bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == _char)
                    count++;
                }
            }

            //Close file reader and buffer 
            bufferedReader.close();
            fileReader.close();
        } 

        //Create a FileNotFoundException with printStack Trace
        catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return count;
            }

        //Display for entry of file, speicialized character, and display of total count 
        public void display() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fileName = in.nextLine();
            File file = new File(fileName);
            System.out.print("Enter character to count: ");
            char parseChar = in.next().charAt(0);
            System.out.print(MessageFormat.format("The character ''{0}'' appears in the file {2} {1} times.", parseChar, getCharacterCount(file, parseChar), file.getName()));
        }
        public static void main(String[] args) {
        new FileLetterCounter();
    }
}
