package library;

public class Book {

	private String ISBN;

	private String name;

	private String author;

	public boolean isBorrowed;

	//private Reader reader;

	public Book(String ISBN,String name,String author) {
		// TODO �Զ����ɵĹ��캯�����
		this.ISBN=ISBN;
		this.name=name;
		this.author=author;
		this.isBorrowed=false;
	}//����ͼ��
	
	public String getISBN() {
		return ISBN;
	}//���ظ����ISBN
	
	public String getName() {
		return name;
	}//���ظ��������
	
	public String getAuthor() {
		return author;
	}//���ظ����������
	
	public String getBorrwedString() {
		if (this.isBorrowed) {
			return "�ѽ��";
		}else {
			return "�ɽ���";
		}
	}


}
