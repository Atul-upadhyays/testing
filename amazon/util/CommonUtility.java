package com.amazon.util;

public class CommonUtility {
		
	public String getUsername() {
		int randomnum = (int) Math.max(1000, 999999999);
		String username = "Sac" + String.valueOf(randomnum); //sac16185415464
		return username;
	}
}
