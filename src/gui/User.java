package gui;

import log.LogDir;
import log.OptionQueue;
import socket.Client;

public class User {
	public static String accNo = null;
	public static String psw = null;
	public static double balance = 0;
	public static Client client = null;
	public static OptionQueue opq = new OptionQueue();
	public static LogDir log = new LogDir();	
}
