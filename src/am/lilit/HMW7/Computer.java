package am.lilit.HMW7;

public class Computer {
    public String cpu;
    public String ram;
    public String ssd;

    public Computer(String intel, String ram, String san) {
    }

    public static void main(String[] argc) {

        Computer first=new Computer("Intel","Ram","San");
        Computer second=new Computer("Intel","Ram2","San");
        Computer third=new Computer("Intel","Ram","San");

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(third));
        System.out.println(second.equals(first));
    }
}






