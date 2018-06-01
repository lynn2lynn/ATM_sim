package Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import gui.Cfg;

public class ServerS {

	public static int number = 0;
	public static void main(String[] args) {
		System.out.println("code: "+Cfg.getBankCode()+"\n"+
				"name: "+Cfg.getBankName());
		//System.out.println("Servers: "+Cfg.getServerList().toJSONString());
		
		serve();
	}
	
	@SuppressWarnings("resource")
	public static void serve(){
		ServerSocket server = null;
		ArrayList<Thread> ser = new ArrayList<>();
		
		try {
			server = new ServerSocket(2333);
		} catch (IOException e) {
			System.err.println("[ERROR] cannot cerate ServerSocket.");
			e.printStackTrace();
			return;
		}
		
		Socket socket = null;
		while (true) {
			try {
				socket = server.accept();
				Thread t = new Thread(new Service(socket));
				ser.add(t);
				t.start();
				number++;
				System.out.println("  new thread: "+t.getId());
				System.out.println("client number: "+number);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue;
			}
			
		}
	}
	
}
