package ControlStatements;

public class NestIf {
	
	public static void main (String[] args) {
		String lang = "C++";
		
		if(lang == "HLL & IL") {
			if(lang == "python") {
				System.out.println("language is python");
			}
		}
		else if(lang == "C++") {
			System.out.println("language is C++");
		}
		
		else if(lang == "Java") {
			System.out.println("language is Java");
		}
		
		else {
		   System.out.println(lang);
		}
	}

}