package ArrayAssignment;

public class SmallestArray {
    public static void main(String[] args) {
        int arr1[] = {2,4,28,43,9,1,5,45,36};
        int smallest =arr1[0] ;
        
        for(int i=1;i<arr1.length;i++){
        if(arr1[i]<smallest) {
            smallest=arr1[i];
        }
    }

            System.out.println("smallest number is:"+smallest);
        }
    }



