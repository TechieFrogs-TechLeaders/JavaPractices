package Array_Assign;

public class FrequencyOfOddEven {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        int oddFrequency = 0;
        int evenFrequency = 0;

        int rows = arr.length;
        int col = arr[0].length;


        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
            if( arr[i][j] % 2 == 0){
                evenFrequency++;
            }
            else{
                oddFrequency++;
            }
        }
    }
    System.out.println("Frequency of odd numbers: " + oddFrequency);
    System.out.println("Frequency of even numbers: " + evenFrequency);
}
}    
