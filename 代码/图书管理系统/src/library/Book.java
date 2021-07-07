package library;

public class Book {

	private String ISBN;

	private String name;

	private String author;

	public boolean isBorrowed;

	//private Reader reader;

	public Book(String ISBN,String name,String author) {
		// TODO 自动生成的构造函数存根
		this.ISBN=ISBN;
		this.name=name;
		this.author=author;
		this.isBorrowed=false;
	}//构造图书
	
	public String getISBN() {
		return ISBN;
	}//返回该书的ISBN
	
	public String getName() {
		return name;
	}//返回该书的书名
	
	public String getAuthor() {
		return author;
	}//返回该书的作者名
	
	public String getBorrwedString() {
		if (this.isBorrowed) {
			return "已借出";
		}else {
			return "可借阅";
		}
	}


}
