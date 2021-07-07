package library;

public class Demo {
	
	static BookShelf bookShelf=new BookShelf();
	static ReaderShelf readerShelf=new ReaderShelf();
	//创建书架对象和读者表对象

	static Book book1=new Book("0", "命运", "starwing");
	static Book book2=new Book("1", "灵罗娃娃", "格温");
	static Book book3=new Book("2", "地灵殿管理方案", "古明地觉");
	//创建三个图书对象
	
	static Administrator administrator=new Administrator(bookShelf, readerShelf);
	//创建图书管理员对象
	
	static Student student=new Student();
	//创建学生（读者）对象
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		operationOfAdministrator1();
		//管理员操作一，主要测试对图书的管理功能
		operationOfReader();
		//测试读者操作
		operationOfAdministrator2();
		//管理员操作二，主要测试对读者的管理功能

	}
	
	static private void operationOfReader() {

		student.signUp("starwing", "123456", "陌羽", readerShelf);
		//注册
		student.signIn("starwing", "123456", bookShelf);
		//登录
		student.borrow(book1);
		//借书
		student.queryBook("灵罗娃娃");
		//查询
		student.showBorrowedBooks();
		//还书
	}
	
	static private void operationOfAdministrator1() {

		administrator.bookManagement.addBook(book1);
		administrator.bookManagement.addBook(book2);
		administrator.bookManagement.addBook(book3);
		//添加图书
		administrator.bookManagement.showAllBooks();
		//显示所有图书
		
	}
	
	static private void operationOfAdministrator2() {
		administrator.readerManagement.check(student);
		//查看借阅情况
		administrator.readerManagement.urge(student, book1);
		//催还图书
	}
	

}
