package library;

public class BookManagement {

	//private Book[] books;

	//private Book book;
	private BookShelf bookShelf;
	
	public BookManagement(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
	}//���췽��

	public void addBook(Book book) {
		//System.out.printf("11\n");
		this.bookShelf.addBook(book);;
	}//���ͼ��

	public void deleteBook(Book book) {
		this.bookShelf.deleteBook(book);
	}//ɾ��ͼ��

	public void reviseBook(Book book,Book book2) {
		this.bookShelf.reviseBook(book, book2);
	}//�޸�ͼ��
	
	public void showAllBooks() {
		System.out.printf("ͼ��չʾ��\n");
		this.bookShelf.showAllBooks();
	}//��ʾ����ͼ��


}
