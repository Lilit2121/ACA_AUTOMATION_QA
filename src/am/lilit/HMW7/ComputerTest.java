package am.lilit.HMW7;

public class ComputerTest {
    public String cpu;
    public String ram;
    public String ssd;

    public ComputerTest(String intel, String ram, String san) {
    }


    public static void main(String[] argc) {

        ComputerTest first=new ComputerTest("Intel","Ram","San");
        ComputerTest second=new ComputerTest("Intel","Ram2","San");
        ComputerTest third=new ComputerTest("Intel","Ram","San");

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));
        System.out.println(second.equals(first));
    }
}






