package library;

import java.util.ArrayList;
import java.util.List;

public class Student implements Reader {

	final static String identity="ѧ��";
	
	private String ID="";

	private String password="";

	private String name="";

	private List<Book> borrowedBooks=new ArrayList<Book>();
	
	private boolean isSignIn=false;
	
	//private ReaderShelf readerShelf;
	private BookShelf bookShelf;
	
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}

	public void signUp(String ID,String password,String name,ReaderShelf readerShelf) {
		if (readerShelf.isHaveReader(ID)) {
			System.out.printf("���˺��ѱ�ע�ᣡ\n");
		}else {
			this.ID=ID;
			this.password=password;
			this.name=name;
			readerShelf.addReader(this);
			//this.readerShelf=readerShelf;
			System.out.printf("�˺�ע��ɹ���\n");
		}
	}//ע��

	public void signIn(String ID,String password,BookShelf bookShelf) {
		if (this.ID==ID&&this.password==password) {
			isSignIn=true;
			this.bookShelf=bookShelf;
			System.out.printf("��¼�ɹ���\n");
		}else {
			System.out.printf("�˺Ż��������\n");
		}
	}//��¼

	public void queryBook(String bookname) {
		if(isSignIn) {
			bookShelf.queryBookFromName(bookname);
		}else {
			System.out.printf("δ��¼��");
		}

	}//��ѯͼ����Ϣ

	public void borrow(Book book) {
		if (isSignIn) {
			if(bookShelf.isHaveBook(book)) {
				if (book.getBorrowed()==false) {
					borrowedBooks.add(book);
					book.setBorrowed(true);
					System.out.printf("�ɹ��������\n");
				}else {
					System.out.printf("�����ѽ��\n");
				}
			}else {
				System.out.printf("ͼ���û�и���\n");
			}
		}else {
			System.out.printf("δ��¼��");
		}

	}//����

	public void returnBook(Book book) {
		if (isSignIn) {
			book.setBorrowed(false);
			borrowedBooks.remove(book);
			System.out.printf("�ɹ��黹����\n");
		}else {
			System.out.printf("δ��¼��");
		}

	}//����
	
	public void showBorrowedBooks() {
		if (isSignIn) {
			for(int i=0;i<borrowedBooks.size();i++) {
				System.out.printf("������%s;���ߣ�%s;ISBN��%s;\n",borrowedBooks.get(i).getName(),borrowedBooks.get(i).getAuthor(),borrowedBooks.get(i).getISBN());
			}
		}else {
			System.out.printf("δ��¼��");
		}

	}
	
	public void setPassword(String password) {
		if (isSignIn) {
			this.password=password;
		}else {
			System.out.printf("δ��¼��");
		}

	}
	
	public void setName(String password) {
		if (isSignIn) {
			this.name=password;
		}else {
			System.out.printf("δ��¼��");
		}

	}

}
