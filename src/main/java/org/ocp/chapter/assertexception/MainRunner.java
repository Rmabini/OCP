package org.ocp.chapter.assertexception;

import java.nio.file.FileSystemException;

public class MainRunner {
 
	public static void main(String[] args) {
		exercise1();
	}
	
	/*
	 * The caller needs to provide try catch because of the check exception
	*/
	private static void exercise1(){
		
		Base ch = new Child();
		try {
			ch.method();
		} catch (FileSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Base {
	public void method() throws FileSystemException{
		System.out.println("From Parent");
	}
}

class Child extends Base {
	
	/* Cannot throw more general exception being override
	 * Can 
	 * Have or be created without exception
	 * Have throw more specialize than the parent
	 *  e.g throws FileNotFoundException
	*/
	@Override
	public void method() {
	      System.out.println("From Child");	
	}
}