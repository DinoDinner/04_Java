package com.multi.practice2.run;

import com.multi.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("해리포터와 불의잔", "믿음사", "J. K. 롤링");
		Book book3 = new Book("자바의정석", "A사", "남궁성", 30000, 0.2);
		
		System.out.println(book1.toString());
		System.out.println(book2);
		System.out.println(book3);
	}
}
