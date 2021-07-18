package library;

public class Administrator {
	
	public BookManagement bookManagement;
	public ReaderManagement readerManagement;
	
	public Administrator(BookShelf bookShelf,ReaderShelf readerShelf) {
		this.bookManagement=new BookManagement(bookShelf);
		this.readerManagement=new ReaderManagement(readerShelf);
	}//以构造函数的方式创建图书管理实例和读者管理实例
	

//	public BookManagement createBookManagement() {
//		return new BookManagement();
//	}//返回实例化的图书管理类
//
//	public ReaderManagement createReaderManagement() {
//		return new ReaderManagement();
//	}//返回实例化的读者管理类

}
