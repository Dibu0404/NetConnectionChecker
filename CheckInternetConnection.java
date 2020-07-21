import java.net.URL;
import java.net.URLConnection;

class CheckInternetConnection{
    public static void main(String[] args) {
    try{
    URL u = new URL("https://www.google.com");
    URLConnection conn = u.openConnection();
    conn.connect();
    System.out.println("Internet Connection Establish");
    }
    catch(Exception e)
    {
    System.out.println("No Internet Connection Available");
    }

    }
    }
