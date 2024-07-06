package com.sip.ocp17.day14_06072024;

import java.io.*;



public class CopyFileSample {
/*
	public static void copyFile(File source, File target) {

		try (InputStream inputStream = new FileInputStream(source);

				OutputStream outputStream = new FileOutputStream(target)) {

			int read;

			while ((read = inputStream.read()) != -1) {
				System.out.println((char)read);
				outputStream.write(read);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}*/


/*
	public static void copyFileWithBuffer(File source, File target) throws IOException {

		try (InputStream is = new BufferedInputStream(new FileInputStream(source));

				OutputStream os = new BufferedOutputStream(new FileOutputStream(target))) {

			byte[] buffer = new byte[56];

			int lengthRead;

			while ((lengthRead = is.read(buffer)) > 0) {
				System.out.println(lengthRead);
				os.write(buffer, 0, lengthRead);

			}



		}

	}

*/
/*
	public static void copyText(File source, File target) throws IOException {

		try (Reader reader = new FileReader(source); Writer writer = new FileWriter(target)) {

			int read;

			while ((read = reader.read()) != -1) {
				System.out.println((char)read);
				writer.write(read);

			}



		}

	}
*/


	public static void copyTextWithBuffer(File source, File target) throws IOException {

		try (BufferedReader reader = new BufferedReader(new FileReader(source));

				BufferedWriter writer = new BufferedWriter(new FileWriter(target,true))) {

			String str;

			while ((str = reader.readLine()) != null) {
				System.out.println(str);
				writer.write(str);

				writer.newLine();

			}

		}

	}
	public static void main(String[] args) throws IOException {

		File file = new File("d:/zoo/zoo.txt");

		File fileD = new File("d:/zoo/zoo_copy.txt");

		 //CopyFileSample.copyFile(file, fileD);

		// CopyFileSample.copyFileWithBuffer(file, fileD);

		// CopyFileSample.copyText(file, fileD);

		CopyFileSample.copyTextWithBuffer(file, fileD);



	}



}


