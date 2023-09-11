package Oops_practices;

public class WithoutStringTo {
    int rollNo;
    String name;
    String city;

    WithoutStringTo(int rollNo,String name,String city){
    
    this.rollNo=rollNo;
    this.name=name;
    this.city=city;
}
   // public String toString(){
  //      return rollNo+ " " +name+ " " +city; 
   // }
    public static void main(String[] args) {
    WithoutStringTo s1 = new WithoutStringTo(1,"yaswin" ,"Duddukuru");
    WithoutStringTo s2 = new WithoutStringTo(2, "Krish", "Rajamundry");
    System.out.println(s1);
    System.out.println(s2);
}
}


