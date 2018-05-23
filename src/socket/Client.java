package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import gui.Cfg;
import log.Message;

public class Client {

	Socket client;
	PrintWriter pw;
	BufferedReader br;

	public Client() {
		initClient();
	}

	public void initClient() {
		try {
			client = new Socket(Cfg.getServerAddr(), 2333);
			pw = new PrintWriter(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void closeClient() {
		try {
			this.client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMSG(Message msg) {
		
		pw.println(msg.toString());
		pw.flush();
		System.out.println("$$ send "+msg.toString());
	}

	public Message ReciveMSG() {
		try {
			while (true) {
				if (br.ready()) {
					Message msgRecive = Message.parse(br.readLine());
					return msgRecive;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {

		Socket cli;
		try {
			cli = new Socket("192.168.1.101", 2333);
			PrintWriter pw = new PrintWriter(cli.getOutputStream());

			BufferedReader br = new BufferedReader(new InputStreamReader(cli.getInputStream()));

			pw.println("12 0001000100000001 123456 6 0 *");
			pw.flush();

			String data = br.readLine();
			System.out.println(data);
			cli.close();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}
}
