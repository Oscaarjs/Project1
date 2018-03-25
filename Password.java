package Proj1;

public class Password {
	
	public static char[] generatePassword() {
		char[] symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); //initializing available symbols
		int length = (int) (Math.random()*5) + 8;
		char[] password = new char[length]; //Creating char array for symbols in password
		
		
		for (int i = 0; i < length; i++) {
			int rnd = (int) (Math.random()*symbols.length);  //Randomizing symbols from available symbols
			password[i] = symbols[rnd];
		}
	   return password;
		
	}
	
	public static boolean passwordCheck(String password) {
		if ((password.length() >= 8) &&
		        (password.length() <= 12)&&             // Checking whether the password matches 
		        (password.matches(".*[a-z]+.*")) &&     // the given requirments or not
		        (password.matches(".*[0-9]+.*")) &&
		        (password.matches(".*[A-Z]+.*")))
		         return true;
		     else
		         return false;
	}
    public static void main(String[] cmdln) {
    	int amount = 0;
    	int passwordsamounts = 1000;
    	for(int i = 0; i < passwordsamounts; i++) {             //generating n passwords aswell as checking them
    		System.out.println(Password.generatePassword());
    		char[] passarray = generatePassword();
    		String password = new String(passarray);
    		
    		if(passwordCheck(password)==true) {amount++;}
    	}
    	System.out.println(amount + " out of "+ passwordsamounts + " passwords met the requirements");
    }
}


