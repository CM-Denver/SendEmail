package com.sendmail;

public class Main {

	public static void main(String[] args) {
		SendMail mail = new SendMail();
		mail.sendEmail("to@gmail.com", "from@gmail.com", "password", "subject", "message" );
	}

}
