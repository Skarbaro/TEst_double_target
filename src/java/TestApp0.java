package src0;

import infrastructure.config.utils.StringUtils;

public class TestApp {

    public static void main(String[] args) {
        StringUtils randomString = new StringUtils();
        logger.log(randomString.randomString("alphanumeric", 50));
    }
	
	public static void main(String[] args) {
      int nu1 = 3, nu2 = 12, sun;
	  int reg;
	  
      sun = nu1 + nu2;
      System.out.println("Sun of these numbers: " + sun);
   }

}