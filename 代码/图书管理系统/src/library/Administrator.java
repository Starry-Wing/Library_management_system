package library;

public class Administrator {
	
	public BookManagement bookManagement;
	public ReaderManagement readerManagement;
	
	public Administrator(BookShelf bookShelf,ReaderShelf readerShelf) {
		this.bookManagement=new BookManagement(bookShelf);
		this.readerManagement=new ReaderManagement(readerShelf);
	}//�Թ��캯���ķ�ʽ����ͼ�����ʵ���Ͷ��߹���ʵ��
	

//	public BookManagement createBookManagement() {
//		return new BookManagement();
//	}//����ʵ������ͼ�������
//
//	public ReaderManagement createReaderManagement() {
//		return new ReaderManagement();
//	}//����ʵ�����Ķ��߹�����

}
