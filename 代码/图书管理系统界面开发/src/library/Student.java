package library;

import java.util.ArrayList;
import java.util.List;

public class Student implements Reader {

	final static String identity="学生";
	
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
			System.out.printf("该账号已被注册！\n");
		}else {
			this.ID=ID;
			this.password=password;
			this.name=name;
			readerShelf.addReader(this);
			//this.readerShelf=readerShelf;
			System.out.printf("账号注册成功！\n");
		}
	}//注册

	public void signIn(String ID,String password,BookShelf bookShelf) {
		if (this.ID==ID&&this.password==password) {
			isSignIn=true;
			this.bookShelf=bookShelf;
			System.out.printf("登录成功！\n");
		}else {
			System.out.printf("账号或密码错误！\n");
		}
	}//登录

	public void queryBook(String bookname) {
		if(isSignIn) {
			bookShelf.queryBookFromName(bookname);
		}else {
			System.out.printf("未登录！");
		}

	}//查询图书信息

	public void borrow(Book book) {
		if (isSignIn) {
			if(bookShelf.isHaveBook(book)) {
				if (book.getBorrowed()==false) {
					borrowedBooks.add(book);
					book.setBorrowed(true);
					System.out.printf("成功借出该书\n");
				}else {
					System.out.printf("该书已借出\n");
				}
			}else {
				System.out.printf("图书馆没有该书\n");
			}
		}else {
			System.out.printf("未登录！");
		}

	}//借书

	public void returnBook(Book book) {
		if (isSignIn) {
			book.setBorrowed(false);
			borrowedBooks.remove(book);
			System.out.printf("成功归还该书\n");
		}else {
			System.out.printf("未登录！");
		}

	}//还书
	
	public void showBorrowedBooks() {
		if (isSignIn) {
			for(int i=0;i<borrowedBooks.size();i++) {
				System.out.printf("书名：%s;作者：%s;ISBN：%s;\n",borrowedBooks.get(i).getName(),borrowedBooks.get(i).getAuthor(),borrowedBooks.get(i).getISBN());
			}
		}else {
			System.out.printf("未登录！");
		}

	}
	
	public void setPassword(String password) {
		if (isSignIn) {
			this.password=password;
		}else {
			System.out.printf("未登录！");
		}

	}
	
	public void setName(String password) {
		if (isSignIn) {
			this.name=password;
		}else {
			System.out.printf("未登录！");
		}

	}

}
