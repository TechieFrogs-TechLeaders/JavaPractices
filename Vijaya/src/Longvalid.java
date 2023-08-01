import java.util.Scanner;
public class Longvalid {
    public static void main(String[] args) {
        Scanner Scanobj = new Scanner (System.in);
        System.out.println("long number is DBA");
             while(Scanobj.hasNext()) {
                if(Scanobj.hasNextLong(16)){
            System.out.println("FoundLong:"+Scanobj.next());
            Scanobj.close();
        }            


    }
  }     
}
    

