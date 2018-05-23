package gui;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class Cfg {
	private static String atmsn;
	private static String bankCode;
	private static String bankName;
	private static String branchCode;
	private static String branchName;
	private static String serverAddr;

	static{
		Reader r = null;
		JSONParser parser = new JSONParser();
		JSONObject obj = null;
		try {
			r = new FileReader("atm_cfg.json");
			obj = (JSONObject) parser.parse(r);
			
			atmsn = (String) obj.get("atmsn");
			bankCode = (String) obj.get("bank");
			bankName = (String) obj.get("name");
			branchCode = (String) obj.get("branchCode");
			branchName = (String) obj.get("branchName");
			serverAddr = (String) obj.get("server");
			
			r.close();
		} catch (IOException e) {
			System.err.println("[ERROR] Cann't open configuration file");
		} catch (ParseException e) {
			System.err.println("[ERROR] Json parsing failed.");
		}
	}
	
	public static String getAtmsn() {
		return atmsn;
	}
	
	public static String getBankCode() {
		return bankCode;
	}

	public static String getBankName() {
		return bankName;
	}

	public static String getBranchCode() {
		return branchCode;
	}

	public static String getBranchName() {
		return branchName;
	}

	public static String getServerAddr() {
		return serverAddr;
	}
}
