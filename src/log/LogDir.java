package log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Map;

public class LogDir {
	
	private File log;
	private LinkedList<Message> undoneMails;
	
	public LogDir() {
		log = new File("log.txt");
		undoneMails = new LinkedList<Message>();
	}
	
	public boolean checkUndone() {
		this.readLog();
		if(undoneMails.size()==0)return false;
		return true;
	}
	
	public void initLog() {
		if(!this.checkUndone()) {//清空日志
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter(this.log);
				fileWriter.write("");
				fileWriter.flush();
				fileWriter.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
            
		}
		else {
			
		}
		
	}
	
	public void writeLog(Message msg){
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter(this.log,true));
			bw.write(msg.msgArchive());
			
			bw.flush();
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void readLog(){
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(this.log));
			String mail = new String();
			
			while(null != (mail = br.readLine())) {
				Message msg = new Message();
				msg.msgDeArchive(mail);
//				if(msg.getIsCompleted()) {
//					undoneMails.remove();
//				}
//				else {
//					undoneMails.add(msg);
//				}		
			}
			
			Iterator<Message> it = undoneMails.iterator();
			while(it.hasNext()) {
				Message msg = it.next();
//				System.out.println("++++++++undonemail: "+msg.getMsgSec()+"+++++++++++");
				msg.printMessage();
				//map.put(msg.getMsgSec(), msg.getIsCompleted());
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("日志文件不存在");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
