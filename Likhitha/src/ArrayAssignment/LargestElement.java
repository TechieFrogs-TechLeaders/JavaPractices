package ArrayAssignment;

public class LargestElement {
     public static void main(String[] args) {
   int largest=0;
      int arr1[]={333,2,6,5,8,77,45,66,99,6,43,122};
      for(int i=0;i<arr1.length;i++){
       if(arr1[i]>largest){
        largest=arr1[i];
       }
        
    }
    System.out.println("largest Element is : "+largest);
  }
}

