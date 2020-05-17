package com.sapient.files;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileRunner {
	
public static void main(String[] args) throws IOException {
		
	
		Scanner sc = new Scanner(System.in);
		String directoryName = sc.nextLine();
		Path currentDirectory = Paths.get("." + directoryName );
		Files.list(currentDirectory).forEach(System.out::println);

	}

}
