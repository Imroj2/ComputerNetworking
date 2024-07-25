package ServerClient;


import java.net.Inet4Address;  
import java.util.Arrays;  
import java.net.InetAddress;  
public class AddressTypes  
{  
public static void main(String[] arg) throws Exception  
{  
InetAddress ip =  Inet4Address.getByName("www.javatpoint.com");  
InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");  
byte addr[]={56, 0, 0, 0};  
System.out.println("ip : "+ip);  
System.out.print("\nip1 : "+ip1);  
InetAddress ip2 =  InetAddress.getByAddress(addr);  
System.out.print("\nip2 : "+ip2);  
System.out.print("\nAddress : " +Arrays.toString(ip.getAddress()));  
System.out.print("\nHost Address : " +ip.getHostAddress());  
System.out.print("\nisAnyLocalAddress : " +ip.isAnyLocalAddress());  
System.out.print("\nisLinkLocalAddress : " +ip.isLinkLocalAddress());  
System.out.print("\nisLoopbackAddress : " +ip.isLoopbackAddress());  
System.out.print("\nisMCGlobal : " +ip.isMCGlobal());  
System.out.print("\nisMCLinkLocal : " +ip.isMCLinkLocal());  
System.out.print("\nisMCNodeLocal : " +ip.isMCNodeLocal());  
System.out.print("\nisMCOrgLocal : " +ip.isMCOrgLocal());  
System.out.print("\nisMCSiteLocal : " +ip.isMCSiteLocal());  
System.out.print("\nisMulticastAddress : " +ip.isMulticastAddress());  
System.out.print("\nisSiteLocalAddress : " +ip.isSiteLocalAddress());  
System.out.print("\nhashCode : " +ip.hashCode());  
System.out.print("\n Is ip1 == ip2 : " +ip.equals(ip2));  
}  
}  
