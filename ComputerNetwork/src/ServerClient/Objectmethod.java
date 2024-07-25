package ServerClient;

import java.net.URL;

public class Objectmethod {    
    public static void main(String[] args) {    
        try {    
            URL url = new URL("https://www.google.com/home");    
        
            System.out.println("Protocol: " + url.getProtocol());    
            System.out.println("Host Name: " + url.getHost());    
            System.out.println("Port Number: " + (url.getPort() == -1 ? "Default" : url.getPort()));    
            System.out.println("Default Port Number: " + url.getDefaultPort());    
            System.out.println("Query String: " + url.getQuery());    
            System.out.println("Path: " + url.getPath());    
            System.out.println("File: " + url.getFile());    
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
}
