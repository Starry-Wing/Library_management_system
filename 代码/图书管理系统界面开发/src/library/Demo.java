package library;

public class Demo {
	
	static BookShelf bookShelf=new BookShelf();
	static ReaderShelf readerShelf=new ReaderShelf();
	//������ܶ���Ͷ��߱����

	static Book book1=new Book("0", "ͼ�����ϵͳ˵����", "������");
	static Book book2=new Book("1", "���ϿƼ���ѧ", "����");
	static Book book3=new Book("51201862902", "�������1806", "������");
	//��������ͼ�����
	
	static Administrator administrator=new Administrator(bookShelf, readerShelf);
	//����ͼ�����Ա����
	
	static Student student=new Student();
	//����ѧ�������ߣ�����
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		operationOfAdministrator1();
		//����Ա����һ����Ҫ���Զ�ͼ��Ĺ�����
		operationOfReader();
		//���Զ��߲���
		operationOfAdministrator2();
		//����Ա����������Ҫ���ԶԶ��ߵĹ�����

	}
	
	static private void operationOfReader() {

		student.signUp("starwing", "123456", "yzy", readerShelf);
		//ע��
		student.signIn("starwing", "123456", bookShelf);
		//��¼
		student.borrow(book1);
		//����
		student.queryBook("�������1806");
		//��ѯ
		student.showBorrowedBooks();
		//����
	}
	
	static private void operationOfAdministrator1() {

		administrator.bookManagement.addBook(book1);
		administrator.bookManagement.addBook(book2);
		administrator.bookManagement.addBook(book3);
		//���ͼ��
		administrator.bookManagement.showAllBooks();
		//��ʾ����ͼ��
		
	}
	
	static private void operationOfAdministrator2() {
		administrator.readerManagement.check(student);
		//�鿴�������
		administrator.readerManagement.urge(student, book1);
		//�߻�ͼ��
	}
	

}
