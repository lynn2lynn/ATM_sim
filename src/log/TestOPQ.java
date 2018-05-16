package log;

import java.util.Iterator;

public class TestOPQ {
	
	public static void main(String[] args) {
		OptionQueue opq = new OptionQueue();
		Message m1 = new Message();
		Message m2 = new Message();
		Message m3 = new Message();
		Message m4 = new Message();
		Message m5 = new Message();
		Message m6 = new Message();
		Message m7 = new Message();
		
		opq.push(m1);
		opq.push(m2);
		opq.push(m3);
		opq.push(m4);
		opq.push(m5);
		opq.push(m6);
		opq.push(m7);
		
		opq.pop();
		opq.pop();
		
		Iterator<Message> it = opq.getOpq().iterator();
		while(it.hasNext()) {
			it.next().printMessage();
		}
		
	}

}
