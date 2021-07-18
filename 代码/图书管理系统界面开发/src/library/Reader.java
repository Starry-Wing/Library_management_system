package library;

public interface Reader{

	abstract String getID();//获取ID

	abstract String getName();//获取名字

	abstract void signUp(String ID, String password, String name, ReaderShelf readerShelf);//注册

	abstract void signIn(String ID, String password, BookShelf bookShelf);//登录

	abstract void queryBook(String bookname);//查询图书信息

	abstract void borrow(Book book);//借书

	abstract void returnBook(Book book);//还书

	abstract void showBorrowedBooks();//查看已借的图书

	abstract void setPassword(String password);//设置密码

	abstract void setName(String password);//设置名字

}