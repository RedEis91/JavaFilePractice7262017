//run this program to create a new file called "names.txt"
//how to handle text and binary files in java

//imports entire java.io package collection
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tank to hold file
        File myFile = new File("names.txt");

        Scanner scan = new Scanner(System.in);

        //any error the program can't handle at runtime is known as an Exception
        //PrintWriter class has method built in to say: "Hey, I know you're going to be looking for a file"
        //In case you don't have access to that file, for whatever reason...
        //surround your print-writer with a try/catch to catch the exception
        try {
            //pipe  to stream file into tank             //pump, which by default deletes data from file
            PrintWriter p = new PrintWriter(new FileOutputStream(myFile, true));
//            p.println("First line!!! Wohooo!");
            System.out.println("Please enter a line:");
            //takes in user input to add line to file
            String input = scan.nextLine();
            p.println(input);//save user input to the file
            p.close();

            //need to handle the FileNotFoundException
        } catch (IOException e) {
            System.out.println("File not found!!!!");
            e.printStackTrace();
            System.out.println(e);
        }

    }
}


