package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import log.Message;

public class Client {

	Socket client;
	
	public void initClient() {
		try {
			client = new Socket("192.168.1.100",2333);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//
	}
	
	public void closeClient() {
		try {
			this.client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMSG(Message msg) {
		PrintWriter pw;
		//BufferedReader br;
		try {
			pw = new PrintWriter(this.client.getOutputStream());
			//br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			pw.print(msg);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Message ReciveMSG() {
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			Message msgRecive = new Message();
			msgRecive.msgDeArchive(br.readLine());
			br.close();
			return msgRecive;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
//	public static void main(String[] args) {
//		
//		Socket cli;
//		try {
//			cli = new Socket("192.168.1.100",2333);
//			PrintWriter pw = new PrintWriter(cli.getOutputStream());
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(cli.getInputStream()));
//			
//			
//			pw.println("12 1234568 123456 1 100 *");
//			pw.flush();
//			
//			String data = br.readLine();
//			System.out.println(data);
//			cli.close();
//		} catch (UnknownHostException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		
//	}
}
