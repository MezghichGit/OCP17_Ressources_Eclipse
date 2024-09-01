package com.sip.ocp17.day15_07072024;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) throws URISyntaxException {
		/*
		Path path1 = Paths.get("pandas","cuddly.png");
		Path path2 = Paths.get("c:","zooinfo","November","employees.txt");
		Path path3 = Paths.get("/","home","zoodirector"); 
		/*Path path1 = Paths.get("pandas/cuddly.png");
		Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
		Path path3 = Paths.get("/home/zoodirector");*/
		/*System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
		Path path4 = FileSystems.getDefault().getPath("c:","zooinfo","November","employees.txt");
		System.out.println(path4);
		//Path path5 = Paths.get(new URI("http://www.wiley.com"));
		//System.out.println(path5);
		FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
		Path path = fileSystem.getPath("duck.txt"); */
		
		File file = new File("pandas/cuddly.png");
		Path path = file.toPath();
		
		Path path1 = Paths.get("cuddly.png");
		File file1 = path.toFile(); 

	}

}
