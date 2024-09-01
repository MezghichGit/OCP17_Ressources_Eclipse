package com.sip.ocp17.day15_07072024;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExemplesFiles {

	public static void main(String[] args) {
		/*
		 * try { Files.copy(Paths.get("d:\\zoo"), Paths.get("d:\\zoo-save"));
		 * Files.copy(Paths.get("d:\\zoo\\zoo.txt"),
		 * Paths.get("d:\\zoo-save\\zoo-save.txt")); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		/*
		 * try { Files.move(Paths.get("d:\\zoo"), Paths.get("d:\\zoo-new"));
		 * Files.move(Paths.get("d:\\zoo-save\\zoo-save.txt"),
		 * Paths.get("d:\\zoo-new\\zoo-save.txt")); } catch (IOException e) {
		 * e.printStackTrace();
		 */
		/*
		 * Path path = Paths.get("d:\\zoo-new\\zoo-save.txt"); List<String> data = new
		 * ArrayList(); try (BufferedWriter writer = Files.newBufferedWriter(path,
		 * Charset.forName("UTF-16"))) { writer.write("Hello World"); } catch
		 * (IOException e) { e.printStackTrace();
		 * 
		 * }
		 */

		//Charset charset = Charset.defaultCharset();
		Path path = Paths.get("d:\\zoo-new\\zoo-save.txt");
		try {
			final List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
