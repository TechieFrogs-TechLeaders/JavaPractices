 package BasicAssignment;
   public class Sandglass {
      public static void main(String[] args) {
      
      int numberOfRows = 6;
      
      for (int i= 0; i<= numberOfRows-1 ; i++) {

         for (int j=0; j<i; j++) {
            System.out.print(" ");
         }

         for (int k=i; k<=numberOfRows-1; k++) {
            System.out.print("*" + " ");
         }
         
         System.out.println();
      }
      
      for (int i= numberOfRows-1; i>= 0; i--) {
         
         for (int j=0; j<i; j++) {
            System.out.print(" ");
         }
        
         for (int k=i; k<=numberOfRows-1; k++) {
            System.out.print("*" + " ");
         }
        
         System.out.println();
      }
   }
}
