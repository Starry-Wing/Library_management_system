package library;

public class ReaderManagement {

	//private Reader[] readers;

	//private Reader reader;
	private ReaderShelf readerShelf;
	
	public ReaderManagement(ReaderShelf readerShelf) {
		this.readerShelf=readerShelf;
	}
	

	public void check(Reader reader) {
		System.out.printf("ID:%s\n",reader.getID());
		System.out.printf("姓名:%s\n",reader.getName());
		System.out.printf("所借阅书籍:\n");
		reader.showBorrowedBooks();
	}//查看借阅情况

	public void urge(Reader reader, Book book) {
		System.out.printf("%s,请尽快归还《%s》!",reader.getName(),book.getName());
	}//催还图书

}
