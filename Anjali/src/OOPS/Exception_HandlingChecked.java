package OOPS;

import java.io.FileReader;
import java.io.IOException;



public class Exception_HandlingChecked {
    public static void main(String[] args) {
        //FileReader is a class in Java used for reading character data from files

        try{
            FileReader reader = new FileReader("nonexistent.txt");
            //int data = reader.read();
            reader.close();
        }
        catch(IOException ie){
            System.out.println("An IOException occurred: " + ie.getMessage());
        }
        try{

            Class.forName("Exception");
        }
        catch(ClassNotFoundException ce){
            System.out.println(ce.getMessage());
            ce.printStackTrace();
        }
    }
}


