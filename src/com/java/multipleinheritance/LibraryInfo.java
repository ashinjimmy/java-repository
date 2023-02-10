package com.java.multipleinheritance;

public class LibraryInfo extends PaidBooks implements StoryBooks, Novels {

	@Override
	public void romanticNovels() {
		System.out.println("Read Romantic Novels ....");
	}

	@Override
	public void crimeThrillerNovels() {
		System.out.println("Read Crime Thriller Novels ....");
	}

	@Override
	public void kinderBooks() {
		System.out.println("Read Kinder Story Books ....");
	}

	@Override
	public void comicBooks() {
		System.out.println("Read Comic Story Books ....");
	}

}
