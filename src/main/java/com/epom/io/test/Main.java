package com.epom.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StringWriter;

import com.epom.io.watch.NameFilter;

/**
 * @author Vasyl Zarva.
 */
public class Main {

	private static final String FILE = "temp.out";

	public static void main(String[] args) {
		final TestSerial fromMemory = new TestSerial("1234567890", "Matviichenko");
		write(FILE, fromMemory);

		System.out.println("------");

		TestSerial fromFs = read(FILE);

 		print(fromMemory);
		System.out.println("------");
		print(fromFs);
	}
	private static void print(final TestSerial fromFs) {
		System.out.println("id " + fromFs.getId() );
		System.out.println("name " + fromFs.getName() );
		System.out.println("value " + fromFs.getValue() );
		System.out.println("toString " + fromFs.toString() );
	}

	private static void write(final String name, final TestSerial o) {
		try (final FileOutputStream fos = new FileOutputStream(name);
			 final ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(o);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static TestSerial read(final String name) {
		try (FileInputStream fis = new FileInputStream(name);
			 ObjectInputStream oin = new ObjectInputStream(fis);) {
			return  (TestSerial) oin.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}


	private static class TestSerial implements Serializable {

		private static final long serialVersionUID = 1L;

		private String id;

		private String name;

		private int value;

		public TestSerial(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
}
