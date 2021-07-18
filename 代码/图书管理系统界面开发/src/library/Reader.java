package library;

public interface Reader{

	abstract String getID();//��ȡID

	abstract String getName();//��ȡ����

	abstract void signUp(String ID, String password, String name, ReaderShelf readerShelf);//ע��

	abstract void signIn(String ID, String password, BookShelf bookShelf);//��¼

	abstract void queryBook(String bookname);//��ѯͼ����Ϣ

	abstract void borrow(Book book);//����

	abstract void returnBook(Book book);//����

	abstract void showBorrowedBooks();//�鿴�ѽ��ͼ��

	abstract void setPassword(String password);//��������

	abstract void setName(String password);//��������

}