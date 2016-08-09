package org.ocp.chapter.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RunnerMain {
	
	public static void main(String[] args) {
		//exercise1();
		//exercise2();
		//exercise3();
		//exercise4();
		//exercise5();
		//exercise6();
		//exercise7();
		//exercise8();
		//exercise9();
		//exercise10();
		//exercise11();
		//exercise12();
		//exercise13();
		//exercise14();
		//exercise15();
		//exercise16();
		//exercise17();
		//exercise18();
		//exercise19();
		//exercise20();
		//exercise21();
		//exercise22();
		//exercise23();
		exercise24();
		
	}
	
	private static void exercise24(){
		try(InputStream in = new FileInputStream("test/test.sql");
			OutputStream out = new FileOutputStream("test1/test.sql")	
				){
			Files.copy(in, Paths.get("test2/folder/test.sql"));
			Files.copy(Paths.get("test", "test.sql"), out);
			
		                                                        	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void exercise23(){
		Path path = Paths.get("test/test.sql");
		Path path2 = Paths.get("test3/test.sql");

		try {
			Files.copy(path, path2);
			System.out.println(path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void exercise22(){
		Path path = Paths.get("test");
		Path path2 = Paths.get("test3");
		
		try {
			Files.copy(path, path2);
			System.out.println(path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Files.createDirectories was able to create files and folder having
	 * parent and child even if the all folder was not available
	*/
	private static void exercise21(){
		Path path = Paths.get("test2/folder");
		try {
			System.out.println(path.toAbsolutePath());
			Files.createDirectories(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	    Files.createDirectory 
	    will throw No SuchFileException if the parent of file being created
	    is not available
	    e.g creating folder1 under test2, before folder1 can be created we need
	    test2 folder to exist. Used Files.createDirectories instead Of the former.
	    	
	*/	
	private static void exercise20(){
		Path path = Paths.get("test2/folder1");
		try {
			System.out.println(path);
			Files.createDirectory(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	    Files.isSameFile(path,path)
	    return a boolean if both file is logical and physically same location
	    can be used in symbolic link comparison
	*/
	private static void exercise19(){
		Path path = Paths.get("/folder");
		Path path2 = Paths.get(".");
		
		try {
			System.out.println(Files.isSameFile(path,path2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
	private static void exercise18() {
		try {
			Path path = Paths.get(".").toRealPath();
			Path path1 = Paths.get("Hello.txt");
			System.out.println(path.resolve(path1));
			Path path2 = path.resolve(path1);
			System.out.println("Path exist "+ Files.exists(path2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private static void exercise17() {
		Path path = Paths.get("/data");
		Path path1 =  Paths.get("/user/home");
		Path relativePath = path.relativize(path1);
		System.out.println(path.relativize(path1));
		System.out.println(path.resolve(relativePath).normalize());
		
	}


	private static void exercise16() {
		Path path = Paths.get("./../../test.txt");
		try {
			System.out.println(path.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void exercise15() {
		Path path = Paths.get("/folder/folder1/folder2");
		System.out.println(path.subpath(1,23));
	}


	private static void exercise14() {
		Path path = Paths.get("folder/folder1/folder2/folder3");
		System.out.println(path.subpath(0, 1));
		System.out.println(path.subpath(0, 2).isAbsolute());
		System.out.println(path.subpath(0, 2).toAbsolutePath());
	}


	private static void exercise13() {
		Path path = Paths.get("folder/folder2/folder3");
		System.out.println(path.toAbsolutePath());
	}


	private static void exercise12() {
		Path path = Paths.get("/folder/folder1/folder2/folder3/hello.txt");
		Path currentParent = path.getParent();
		System.out.println("File Name "+path.getFileName());
		System.out.println("File get Root "+path.getRoot());
		while ((currentParent = currentParent.getParent()) !=null){
			System.out.println(currentParent.getParent());
		} 
	}


	private static void exercise11() {
		Path path = Paths.get("/folder/folder1/folder2/folder3/folder4/hello.txt");
	    for (int i = 0; i < path.getNameCount(); i++) {
	    	System.out.println(path.getName(i));
			
		}	
	}

	private static void exercise10(){
		Path path = Paths.get("/folder", "folder2","folder3");
		System.out.println(path.getName(1));
	}
	
	private static void exercise9() {
		Path path = Paths.get("/folder", "folder2","folder3");
		System.out.println(path.getNameCount());
		
	}

	private static void exercise8(){
		
		Path path = Paths.get("/testProject", "hello.txt");
		System.out.println(path.getParent().normalize().toAbsolutePath());
	}
	
	private static void exercise7() {
		File[] roots= File.listRoots();
		for (File file : roots) {
			System.out.println(file);
		}
		Iterable<Path> iterable = FileSystems.getDefault().getRootDirectories();
		for (Path path : iterable) {
			System.out.println(path);
		}
		
	}

	private static void exercise6() {
		Path path = Paths.get("Hello.txt");
		try {
			System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void exercise5() {
		Path path = Paths.get("Hello.txt");
		File file = path.toFile();
		System.out.println(file.getAbsolutePath());
	}

	private static void exercise4() {
		try {
			FileSystem fileSystem = FileSystems.getFileSystem(new URI("https://www.selikoff.net"));
		    Path path = fileSystem.getPath("duck.txt");
		    System.out.println(path);
		    
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void exercise3() {
		Path path = FileSystems.getDefault().getPath("/testFolder");
		Path path2 =FileSystems.getDefault().getPath("folder","Hello.txt");
		System.out.println(path.resolve(path2.normalize()));
	}

	private static void exercise2(){
		Path path = Paths.get("/../testFolder/../folder");
		Path path2 = Paths.get("/test2");
		
		System.out.println(path.relativize(path2));
		System.out.println(path2.normalize());
		
	}
	
	private static void exercise1() {
		Path path = Paths.get("/testFolder/../folder");
		Path path2 = Paths.get("file","Hello.txt");
		System.out.println(path.resolve(path2));
	//	System.out.println(path.relativize(path2));
	}

}
