package com.cg.exc;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileexc {
	public static void main(String args[]) throws IOException {
		FileInputStream fis =null;
		fis = new FileInputStream("E:\\myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		System.out.println((char)k);
		
		fis.close();
	}
}
