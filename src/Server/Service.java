package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


import log.LogDir;
import log.Message;

public class Service implements Runnable {
	private Socket socket;
	Message msgHello = new Message(System.currentTimeMillis(), "*", "*", Message.KEEPALIVE_NO, 0,"*");
	
	public Service(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			
			System.out.println("[MSG] a new ATM got online.");
			while(true){
				String data = "";
				if(is.ready()){
					data = is.readLine();
					System.out.println("[MSG] received: " + data);
					Message msg = Message.parse(data);
					os.println(new Message(System.currentTimeMillis(),msg.getAccountNumber(),msg.getPassword(),msg.getOperation(),msg.getDeal(),msg.getOtherAccount()).toString());	
					os.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
