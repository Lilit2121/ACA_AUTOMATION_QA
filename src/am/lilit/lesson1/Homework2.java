package am.lilit.lesson1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Homework2 {

    public static void main(String[] args) {

        boolean isNetworkAvailable = netIsAvailable();
        if (isNetworkAvailable) {
            System.out.println("yes you have inet ");
        } else {
            System.out.println("no you do not have inet");
        }
    }

    private static boolean netIsAvailable() {
        try {
            final URL url = new URL("https://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }
}
