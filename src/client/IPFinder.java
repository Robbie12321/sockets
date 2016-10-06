package client;

import java.net.*;
import java.util.*;
import server.IPFinderServer;


public class IPFinder {

	
	public static void main(String[] args) {
		String host;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter host name to find IP: ");
		host = input.next();
		try
		{
			InetAddress address = InetAddress.getByName(host);
			System.out.println("IP address of host: "+address.toString());	
			System.out.println("server string name: " + IPFinderServer.ROBBIE);
		}
		catch (UnknownHostException UhEx)
		{	
			System.out.println("Could not find " + host);
		}
	}

}
