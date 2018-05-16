package log;

import java.util.LinkedList;

public class OptionQueue {
	private LinkedList<Message> opq;
	
	public OptionQueue(){
		opq = new LinkedList<Message>();
	}
	
	public void push(Message msg) {
		opq.addLast(msg);
	}
	
	public Message pop() {
		return opq.removeFirst();
	}
	
	public LinkedList<Message> getOpq(){
		return this.opq;
	}
}
