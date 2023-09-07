package OOPS;

public class JaggedArray {
    static void arraycopt(Object src, int srcPos , Object des, int destPos, int length){

    }
    public static void main(String[] args) {
        int arr[][] = new int[3][];
         
        String str[] = { "Hello" , "World" , "Bye" , "Tech" , "Leaders" , "Software"};

        String str1[] = new String[4];

        System.arraycopy(str,2,str1,0,4);
        //System.out.println(String.valueOf(str1));
        System.out.println("copy method : ");
        for(String i : str1){
            System.out.println(i);
        }
        System.out.println();

        
        System.out.println("cloning method : ");
        String str2[] = str.clone();
        for (String i  : str2) {
            System.out.println(i);
        }
        int arr1[][] = new int[][]{{ 3, 4, 5},{ 6, 7, 8, 9}};

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];
        
        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length ; j++){
                arr[i][j] = count++;
            }
        }

        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }

        System.out.println("The jagged array arr1 : ");
        for(int i = 0; i < arr1.length ; i++){
            for(int j = 0; j < arr1[i].length ; j++){
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println();
        }

    System.out.println("To get the classname of array");  
    System.out.println(arr.getClass().getName());  

    System.out.println("To get the classname of array1");  
    System.out.println(arr1.getClass().getName());  
    }
}
