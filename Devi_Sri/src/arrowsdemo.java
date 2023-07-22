//switch with arrows
    class Arrows {
    public static void main(String[] args){

        int number=50;
        switch(number){
            case 20,30->System.out.println(" number equals to 20");
            case 40,50->System.out.println(" number not equals to 20");
            case 60 ->System.out.println("sixety");
        default ->System.out.println("nothing matched");

            }

        }
    }







class ArrowsExample {
    public static void main(String[] args){

        int number=70;
        switch(number){
            case 1,2->
            System.out.println(" number equals 1,2");
            case 3,4->
            System.out.println(" number  equals to 3,4");
            case 5,6 ->
            System.out.println("number  equals to 5,6");
            default ->
            System.out.println("nothing matched");

            }

        }
    }    