package am.lilit.HMW5;

public class Main {
    public static void main(String[] args) {
        Month month = Month.APR;
        switch (month) {
            case DEC:
            case JAN:
            case FEB:
                System.out.println("Winter");
                break;
            case MAR:
            case APR:
            case MAY:
                System.out.println("Spring");
                break;
            case JUN:
            case JUL:
            case AUG:
                System.out.println("Summer");
                break;
            case SEP:
            case OCT:
            case NOV:
                System.out.println("Autumn");
                break;
        }
    }
}