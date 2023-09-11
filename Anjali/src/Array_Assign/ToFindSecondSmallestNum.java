package Array_Assign;


public class ToFindSecondSmallestNum {
    public static void main(String[] args) {
            int arr[] = new int[]{ 4, 6, 10, 98, 67, 65 , 100 , 34};    // 4 6 10 34 65 67 98 100
    
            if(arr.length < 2){
                System.out.println("There is no Second Snallest number");
            }
            else{
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;
                for(int num : arr){
                    if(num < smallest){
                        secondSmallest = smallest;
                        smallest = num;
                        
                    }
                    else if( num < secondSmallest && num != smallest){
                        secondSmallest = num;
                    }
                }
                System.out.println("The 2rd smallest number in the array is: " + secondSmallest);
            }
        
    }
}
