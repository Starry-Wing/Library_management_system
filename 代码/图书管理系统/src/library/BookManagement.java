package library;

public class BookManagement {

	//private Book[] books;

	//private Book book;
	private BookShelf bookShelf;
	
	public BookManagement(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
	}//构造方法

	public void addBook(Book book) {
		//System.out.printf("11\n");
		this.bookShelf.addBook(book);;
	}//添加图书

	public void deleteBook(Book book) {
		this.bookShelf.deleteBook(book);
	}//删除图书

	public void reviseBook(Book book,Book book2) {
		this.bookShelf.reviseBook(book, book2);
	}//修改图书
	
	public void showAllBooks() {
		System.out.printf("图书展示：\n");
		this.bookShelf.showAllBooks();
	}//显示所有图书


}
