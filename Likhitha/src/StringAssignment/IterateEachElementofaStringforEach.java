public class IterateEachElementofaStringforEach {
    public static void main(String[] args) {
        String str = "Signitives";
        String name = "My Company Name is";
        System.out.println("Characters" +str+ "are:");
        for (char c : str.toCharArray()){
           
            System.out.println(c+" ,");
        }
        System.out.println(name.contains(name));
        System.out.println(name.indexOf("Name"));
    
    }
}
