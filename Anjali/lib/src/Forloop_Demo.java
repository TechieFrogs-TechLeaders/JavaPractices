public class Forloop_Demo {
    int o;
    public static void main(String[] args) {
        for(int n=3;n<=5;n++){
            System.out.println(n);

        }

        /*for(int z=4;z<=10;z--){
            System.out.println("infinite loop:"+z);
        }*/

        int u=1;
        for( ;u<=7;u++)
        {
            System.out.println("without initialization :"+u);
        }

        float f=4.8f;
        for(f=1;f<=5.9;f++){
            System.out.println("float :"+ f);
        }
        

        float d=4.8f;
        for(d=1.4f;d<=5.9;d++){
            System.out.println("float values of d :"+ d);
        }


        //infinite values not giving condition
        
        /*for(int i=7; ;i++)
        {
            System.out.println("without condition infinite values :"+ i);
        }*/
        
        
    }
    
}
