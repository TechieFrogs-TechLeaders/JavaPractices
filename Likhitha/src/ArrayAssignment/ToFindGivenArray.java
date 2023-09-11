package ArrayAssignment;

public class ToFindGivenArray {
  

    public static void main(String[] args) {
        int arr[] = {2,4,3,6,5};
        int toFind =7;
        boolean found = false;
         
        
        for(int n : arr) {//enhanced forloop
          if(n==toFind){
              found=true;
            break;
          }
        }
        
        if(found)
    
        System.out.println(toFind + " is found.");
      else
        System.out.println(toFind + " is not found.");
            
    }
}
