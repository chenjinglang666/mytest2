package com.it.lianxi.util;

public class Test01 {
	public static void main(String[] args) {
		
		try {
			MailEyouUtil.sendMail("lisi@itheima.com", "list@itheima.com", "����", "����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
