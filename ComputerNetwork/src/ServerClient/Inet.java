package ServerClient;

import java.io.*;  
import java.net.*;  
public class Inet{  
public static void main(String[] args){  
try{  
InetAddress ip=InetAddress.getByName("www.imroj.com.np");  
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
}  