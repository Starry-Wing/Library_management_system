package client.administrator.bookmanagement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import library.Book;
import library.BookManagement;
import library.BookShelf;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddBookWindow {
	private Text text;
	private Text text_1;
	private Text text_2;
	
	private BookManagement bookManagement;
	private Book book;
	
	public AddBookWindow(BookManagement bookManagement) {
		this.bookManagement=bookManagement;
	}
	
	
	private void setBook(String name,String ISBN,String author) {
		this.book=new Book(ISBN, name, author);
	}
	

	


	/**
	 * Launch the application.
	 * @param args
	 */


	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(515, 406);
		shell.setText("添加图书");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(79, 78, 76, 20);
		lblNewLabel.setText("书名：");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(79, 130, 76, 20);
		lblNewLabel_1.setText("ISBN：");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(79, 186, 76, 20);
		lblNewLabel_2.setText("作者：");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(151, 78, 204, 26);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(151, 130, 204, 26);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(151, 186, 204, 26);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setBook(text.getText(), text_1.getText(), text_2.getText());
				bookManagement.addBook(book);
			}
		});
		btnNewButton.setBounds(180, 254, 124, 44);
		btnNewButton.setText("确认添加");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
