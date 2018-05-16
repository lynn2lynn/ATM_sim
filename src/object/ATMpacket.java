package object;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ATMpacket {
	private char[] _accountNumber;
	private char[] _password;
	long _timeval;
	
	int _bankNumber;
	int _bankNumberCurrent; 
	
	public ATMpacket() {
		_timeval = System.currentTimeMillis();
	}
	
	public String stampToDate(){//时间戳转为时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date(_timeval));
    }

	public char[] get_account() {
		return _accountNumber;
	}

	public void set_account(char[] _account) {
		this._accountNumber = _account;
	}

	public char[] get_password() {
		return _password;
	}

	public void set_password(char[] _password) {
		this._password = _password;
	}
	
	public static void main(String[] args) {
		ATMpacket p = new ATMpacket();
		System.out.println(p.stampToDate());
	}
}

