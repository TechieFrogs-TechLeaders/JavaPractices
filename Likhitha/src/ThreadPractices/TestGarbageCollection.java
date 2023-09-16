package ThreadPractices;

public class TestGarbageCollection {
    public void finalize(){
        System.out.println("Object is Garbage Collected");
    }


    public static void main(String[] args) {
        TestGarbageCollection s1 = new TestGarbageCollection();
        TestGarbageCollection s2 = new TestGarbageCollection();
            s1 = null;
            s2 = null;
            System.gc();
        }
}
