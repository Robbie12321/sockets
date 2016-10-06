package server;

import java.net.*;
import java.util.*;


public class IPFinderServer {
	public static String ROBBIE = "hello";
	public static void main(String[] args) {
		String host;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter host name to find IP: ");
		host = input.next();
		try
		{
			InetAddress address = InetAddress.getByName(host);
			System.out.println("IP address of host: "+address.toString());	
		}
		catch (UnknownHostException UhEx)
		{	
			System.out.println("Could not find " + host);
		}
	}

}
