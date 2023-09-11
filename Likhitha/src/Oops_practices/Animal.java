package Oops_practices;

public class Animal {
    public static String name = null;
    String s;
    void nature(){
        System.out.println("Animal");
    }
}
 class Fish extends Animal {
 
    String color;
    private String name;
 
    
    @Override
    void nature()
    {
        System.out.println("Aquatic Animal");
    }

 


 

    public static void main(String[] args)
    {
        
        Animal a = new Fish();
 
        
        Animal.name = "GoldFish";
 
        
        Fish f = new Fish();
 
        
        f.name = "Whale";
        f.color = "Blue";
 
    
        System.out.println("Object a");
        System.out.println("Name: " + a.name);
 
        
        a.nature();
 

        System.out.println("Object f");
        System.out.println("Name: " + f.name);
        System.out.println("Color: " + f.color);
        f.nature();
    }
}

    

