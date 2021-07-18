package library;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

	//private Book[] books;
	
	private List<Book> books=new ArrayList<Book>();

	//private Book book;
	
	public boolean isHaveBook(Book book) {
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getISBN().equals(book.getISBN())) {
				return true;
			}
		}
		//System.out.printf("%s",book.getISBN());
		return false;
	}

	public void addBook(Book book) {
		//System.out.printf("11");
		if (isHaveBook(book)) {
			System.out.printf("ͼ������д��飬���ʧ��\n");
			System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
		else {
			books.add(book);
			System.out.printf("��ӳɹ�\n");
			System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
	}

	public void deleteBook(Book book) {
		if (isHaveBook(book)) {
			books.remove(book);
			System.out.printf("ɾ���ɹ�\n");
			System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
		else {
			System.out.printf("ͼ���û�д��飬ɾ��ʧ��");
			//System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
	}

	public void reviseBook(Book book,Book book2) {
		if (isHaveBook(book)) {
			books.remove(book);
			if(isHaveBook(book2)==false) {
				books.add(book2);
			}
			System.out.printf("�޸ĳɹ�\n");
			System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
		else {
			System.out.printf("ͼ���û�д��飬�޸�ʧ��");
			System.out.printf("ISBN��%s;������%s;���ߣ�%s;\n",book.getISBN(),book.getName(),book.getAuthor());
		}
	}

	public boolean queryBookFromName(String name) {
		for(int i=0;i<books.size();i++) {
			if (books.get(i).getName().equals(name)) {
				Book book=books.get(i);
				System.out.printf("ISBN��%s;������%s;���ߣ�%s;���������%s\n",book.getISBN(),book.getName(),book.getAuthor(),book.getBorrowedString());
				return true;
			}
		}
		System.out.printf("ͼ���û�д���\n");
		return false;
	}
	
	public boolean queryBookFromISBN(String ISBN) {
		for(int i=0;i<books.size();i++) {
			if (books.get(i).getISBN().equals(ISBN)) {
				Book book=books.get(i);
				System.out.printf("ISBN��%s;������%s;���ߣ�%s;���������%s\n",book.getISBN(),book.getName(),book.getAuthor(),book.getBorrowedString());
				return true;
			}	
		}
		System.out.printf("ͼ���û�д���\n");
		return false;
	}
	
	public Book getBookfromISBN(String ISBN) {
		for(int i=0;i<books.size();i++) {
			if (books.get(i).getISBN().equals(ISBN)) {
				return books.get(i);
			}
		}
		return null;
	}
	
	public Book getBookfromName(String name) {
		for(int i=0;i<books.size();i++) {
			if (books.get(i).getName().equals(name)) {
				return books.get(i);
			}
		}
		return null;
	}
	
	public void showAllBooks() {
		for(int i=0;i<books.size();i++) {
			System.out.printf("������%s;���ߣ�%s;ISBN��%s;���������%s;\n",books.get(i).getName(),books.get(i).getAuthor(),books.get(i).getISBN(),books.get(i).getBorrowedString());
		}
	}

}
