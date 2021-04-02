package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {
	
	public static void main(String[] args) {
	   
      int num1 = 7, num2 = 35, sum;
      sum = num1 + num2;
      System.out.println("Sum of these numbers: " + sum);
	  
   }

Connection conn = null;
try {
  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=steve&password=blue"); // Sensitive
  String uname = "steve";
  String password = "blue";
  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=" + uname + "&password=" + password); // Sensitive

  java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
  
}
}
