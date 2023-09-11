package Oops_practices;

import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
        } catch(IOException e) {
             System.out.println(e);
        }
        
        try{
        Class.forName("NonExistentClass");
      }
      catch(ClassNotFoundException ee){
        System.out.println(ee);
}
    
    }
}

