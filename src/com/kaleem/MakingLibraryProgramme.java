/*  Make a Library,Using java class "Library"
    use methods: addBook,issueBook,returnBook,showAvailablebooks
    properties:use array to store the available books,array to store the issue books.*/
                                                                                     
package com.kaleem;

class Library{
	String[] books= new String[1000];
	int noOfBooks=0;
	
	void addBook(String book) {
		
		books[noOfBooks]=book;
		System.out.println(book+" book has been added in our Library");
		noOfBooks++;
	}
	void showAvailableBooks() {
		System.out.println(" Right now available books in our library is:");
		for(String index: books) {
			if(index==null)
			     continue;
			System.out.println("* "+index);
		}
	}
	void returnBook(String book) {
		addBook(book);
	}
	void issueBooks(String n) {
		for(int i=0;i<books.length;i++) {
			if(books[i]==n) { 
				books[i]=null;
				return;
			}
		}
		noOfBooks--;
		System.out.println(n+" book has been issued to the student");
	}
	
} 
public class MakingLibraryProgramme {

	public static void main(String[] args) {
		
        Library centralLibrary=new Library();
      
        centralLibrary.addBook("C");
        centralLibrary.addBook("C++");
        
        centralLibrary.returnBook("DSA");
        
        centralLibrary.addBook("C#");
        centralLibrary.addBook("CoreJava 8");
        
        
        
        centralLibrary.issueBooks("C++");
        
        centralLibrary.showAvailableBooks();
        
        System.out.println("Total number of books count available in centralLibrary is "+centralLibrary.noOfBooks);
        
	}

}
