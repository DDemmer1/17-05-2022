package de.demmer.dennis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Application {
	
	public static void main(String[] args) {
		
		ArrayList<Book> bookList1 = new ArrayList<>();
		
		bookList1.add(new Book("Buch1", 645641654));
		bookList1.add(new Book("Buch2", 9879815));
		bookList1.add(new Book("Buch3", 6685476));
		bookList1.add(new Book("Buch4", 78846545));

		
		//Methode1 im Konstruktor
		ArrayList<Book> bookList2 = new ArrayList<>(bookList1);
		bookList2.add(new Book("Buch5",897516514));
		bookList2.add(new Book("Buch6",648789145));
		bookList2.add(new Book("Buch7",98798456));
		bookList2.add(new Book("Buch8",012654656));
		
		//Methode2 addAll
		bookList1.addAll(bookList2);
		
		
		//Methode3 for-each
		for(Book book : bookList1) {
			bookList2.add(book);
		}
		
		HashSet<Book> bookSet = new HashSet<Book>(bookList2);
		bookSet.addAll(bookList2);
		
		
//		System.out.println(bookSet.size());
//		System.out.println(bookSet);
		
				//key , value
		HashMap<String, Book> bookMap = new HashMap<>();
		
		
		bookMap.put("dfg544df", new Book("BuchMap", 468789653));
		bookMap.put("vsd56g4", new Book("Buchno2", 96879851));
		bookMap.put("df6g54df6g", new Book("Hafsfaws", 46677));

		Book bookAusMap = bookMap.get("dfg544df");
		
//		System.out.println(bookAusMap);
		
		for(Entry<String, Book> entry : bookMap.entrySet()) {
			
			String s = entry.getKey();
			Book b = entry.getValue();
			
			System.out.println(s);
			System.out.println(b);
			System.out.println("----------");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
