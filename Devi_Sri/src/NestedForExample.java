public class NestedForExample {
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            
        for(int j=1;j<=3;j++){
                System.out.println(i+"  "+j);
        }
        }
        }
}



class PyramidExample{
        public static void main(String[] args){
                for(int i=1;i<=5;i++){
                        
                for(int j=1;j<=i;j++){
                        System.out.print("j");
                }
                System.out.println();
                }
        }
}


class ReversePyramidExample{
        public static void main(String[] args){
                for(int i=1;i<=5;i++){
                        
                for(int j=5;j>=i;j--){
                        System.out.print("@");
                }
                System.out.println();
                }
        }
}



        class Example1{
        public static void main(String[] args){
                for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                if(i==2 && j==2)  {
                }
                System.out.print("*");
                break; 
                
                }
        }
}
        }

