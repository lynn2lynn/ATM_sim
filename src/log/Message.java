package log;

public class Message{
	
	

	private static long msgSand = 0;
	
//	private long msgSec;
//	private boolean isCompleted;
	
	private long timeStamp;
	private String accountNumber;
	private String password;
	private int operation;
	private double deal;
	
	private String otherAccount;
	
	public Message() {
		super();
//		this.msgSec = ++Message.msgSand;
//		this.isCompleted = false;
		this.timeStamp = System.currentTimeMillis();
		
	}
	
	public Message(String accontNumber,String password,int operation,double deal,String other_accountNumber) {
		super();
//		this.msgSec = ++Message.msgSand;
//
//		this.isCompleted = false;
		this.timeStamp = System.currentTimeMillis();
		this.accountNumber = accontNumber;
		this.password = password;
		this.operation = operation;
		this.deal = deal;

		this.otherAccount = other_accountNumber;

	}
	public void setOperation(int x) {
		this.operation = x;
	}
	
	public int getOperation() {
		return this.operation;
	}
	
//	public long getMsgSec() {
//		return this.msgSec;
//	}
//	public boolean getIsCompleted() {
//		return this.isCompleted;
//	}
	
	public String msgArchive() {
		String str = this.timeStamp+"\t"
					+this.accountNumber+"\t"
					+this.password+"\t"
					+this.operation+"\t"
					+this.deal+"\t"
					+this.otherAccount+"\n";
		return str;
	}
	
	public void msgDeArchive(String amail) {
		String[] mailContent = amail.split("\\s+"); 

		if(mailContent.length == 10) {
			this.timeStamp = Long.parseLong(mailContent[0]);
			this.accountNumber = mailContent[1];
			this.password = mailContent[2];
			this.operation = Integer.parseInt(mailContent[3]);
			this.deal = Double.parseDouble(mailContent[4]);
			this.otherAccount = mailContent[5];
		}
	}
	
//	public void msgisComplete() {
//		this.isCompleted = true;
//	}
	
	public void printMessage() {
		
//		System.out.println("-----------("+this.msgSec+")-----------");
//		System.out.println(this.isCompleted);
		System.out.println(this.timeStamp);
		System.out.println(this.accountNumber);
		System.out.println(this.password);
		System.out.println(this.operation);
		System.out.println(this.deal);

		System.out.println(this.otherAccount);

	}
	
}
/**
 * 操作细化
 * @author LYNN
 * 存钱：故障（1）钱已经放进去了（2）钱还没放进去    操作细化：【1申请操作】点击“存款”，开始操作；【2硬件检验】放钱，有【判断】模拟机器验钞；【3操作完成】账户信息可以发生变化
 * 取钱：（1）金额减少，但是不吐钞（不考虑） （2）钱取出来 但是发生故障。
 * 转账：
 * 打印：重新打印即可
 */

