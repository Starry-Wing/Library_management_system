package client.administrator;

import library.Administrator;
import library.BookShelf;
import library.ReaderShelf;

public class Demo {
	
	static BookShelf bookShelf=new BookShelf();
	static ReaderShelf readerShelf=new ReaderShelf();
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AdministratorWindow administratorWindow=new AdministratorWindow(bookShelf, readerShelf);
		administratorWindow.open();

	}

}
