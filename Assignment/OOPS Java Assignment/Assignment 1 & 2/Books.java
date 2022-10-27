import java.util.*;

abstract class Publication
{
	
	String publisherName;
	int noOfPages;
	double price;
}

class Book extends Publication
{
	String bookName;
	int noOfAuthors;
	String authors[]=new String[noOfAuthors];
	Book(String bookName,int numbersOfAuthors,String authors[],int numOfPages,double price,String publisherName)
	{
		this.bookName=bookName;
		this.noOfAuthors=noOfAuthors;
		this.authors=authors;
		super.noOfPages=noOfPages;
		super.price=price;
		super.publisherName=publisherName;
	}
	
	void printBookDetails()
	{
		System.out.println("Book Name"+bookName);
		System.out.println("Total Authors of books"+noOfAuthors);
		System.out.println("Authors: ");
		for(String str: authors)
		{
			System.out.println(str);
		}
		System.out.println("Total Number of pages in Book: "+noOfPages);
		System.out.println("Cost of each book: "+price);
		System.out.println("oublished by: "+publisherName);
	}
	
}

class Journals extends Publication
{
	String journalName;
	
	Journals(String journalName,int noOfPages,double price,String publisherName)
	{
		this.journalName=journalName;
		super.noOfPages=noOfPages;
		super.price=price;
		super.publisherName=publisherName;
	}
	
	void printJournalDetails()
	{
		System.out.println("Journal name: "+journalName);
		System.out.println("Total Number of pages in Book: "+noOfPages);
		System.out.println("Cost of each book: "+price);
		System.out.println("oublished by: "+publisherName);
	}
}

class Library
{
		int noOfBooks;
		Book allBooks[]= new Book[50];
		int count;
		
		void add(Book b1)
		{
			count++;
			allBooks[count-1]= b1;
		}
		
		void remove(String bookName1)
		{
			for(int i = 0; i<allbooks.length; i++){
				if(allbooks[i].bookName == bookName1){
				for(int j=i+1; j<allbooks.length; j++){
					allbooks[i]=allbooks[j+1];
				}
				break;
				}
			}
		}
		void printBook(String bookName2){
		for(int i = 0; i<allbooks.length; i++){
			if(allbooks[i].bookName == bookName2){
				allbooks[i].printBookDetails();
				break;
			}
		}
	}
	
	void allBookPrice(){
		float sum=0;
		for(int i = 0; i<allbooks.length; i++){
			if(allbooks[i]==null){
				break;
			}
			sum+=allbooks[i].price;
		}
		System.out.println("All Book Price : "+sum);
	}
}

public class Books
{
	public static void main(String args[])
	{
		//Book(String bookName,int numbersOfAuthors,String authors[],
		//int numOfPages,double price,String publisherName)
		String arr[] = {"Yashwant Kanetkar"};
		Book b1= new Book("LetUs C",1,arr,460,297.00,"BPB Publications");	
	}
}