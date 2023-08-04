public class Nested_For_loop {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            System.out.println(i);
            
            for(int j=1;j<=6;j++){
                System.out.println("Nested for :"+ "i:" +i+   "j :" +j);
            }
        System.out.println("outer for loop");    
        }

        for(int z=1;z>=7;z++){
            
            for(int h=1;h<=10;h++){
                System.out.println(h);
            }

        }
    }
}
