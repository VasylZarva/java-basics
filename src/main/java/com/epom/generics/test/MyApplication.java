package com.epom.generics.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epom.generics.Employer;

/**
 * @author Vasyl Zarva.
 */
public class MyApplication {

	public static void main(String[] args) {
		EmployerContentPrinter employerContentPrinter = new EmployerContentPrinter();
		employerContentPrinter.getContent().add(new Employer("Vova", "Matviichenko", 25));
		employerContentPrinter.getContent().add(new Employer("Vasyl", "Zarva", 28));

		employerContentPrinter.print();

		System.out.println("------------");

		NumberContentPrinter numberContentPrinter = new NumberContentPrinter();
		numberContentPrinter.getContent().add(2);
		numberContentPrinter.getContent().add(2523452L);
		numberContentPrinter.getContent().add(23.3F);

		numberContentPrinter.print();

		PrinterUtil.addToCollection(2, numberContentPrinter.getContent());
		PrinterUtil.addToCollection(3, numberContentPrinter.getContent());
		PrinterUtil.addMyElement(new Employer("Vasyl", "Zarva", 28), employerContentPrinter.getContent());

		Number num = PrinterUtil.getFirstFromCollection(numberContentPrinter.getContent());
		System.out.println("First : " + num);

		Map<Integer, Employer> map = new HashMap<>();
		PrinterUtil.addToMap(new Employer("Vasyl", "Zarva", 28), map);

	}

	public static void insertElements(Collection<? super A> list){
		list.add(new A());
		list.add(new B());
		list.add(new C());
	}

	public static class A { }
	public static class B extends A { }
	public static class C extends A { }
}
