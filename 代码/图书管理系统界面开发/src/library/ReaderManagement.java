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
		System.out.printf("����:%s\n",reader.getName());
		System.out.printf("�������鼮:\n");
		reader.showBorrowedBooks();
	}//�鿴�������
	
	public void checkFromID(String ID) {
		Reader reader=readerShelf.getReaderFromID(ID);
		if (reader==null) {
			System.out.printf("û�ҵ��ö���\n");
		}else {
			check(reader);
		}
	}//��ID��������

	public void urge(Reader reader, Book book) {
		System.out.printf("%s,�뾡��黹��%s��!",reader.getName(),book.getName());
	}//�߻�ͼ��

}
