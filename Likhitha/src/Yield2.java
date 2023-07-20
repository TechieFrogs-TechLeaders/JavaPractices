public class Yield2 {
    public static void main(String[] args) {
        int a=14;
        int cost = switch(a+4) {
      case 15,17,19:
            System.out.println("Cost is reached to a");
            yield 1;
      case 12,86,38:
            System.out.println("Cost is not reached to a ");
            yield 2;
      default:
            System.out.println("Not related");
            yield 3;
       };
   }
}
