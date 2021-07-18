package client.administrator.bookmanagement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import library.Book;
import library.BookManagement;
import library.BookShelf;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DeleteBookWindow {


	private BookManagement bookManagement;
	private BookShelf bookShelf;
	private Book book;
	private Text text;
	
	public DeleteBookWindow(BookManagement bookManagement) {
		this.bookManagement=bookManagement;
	}
	
	private void deleteBook() {
		bookShelf=bookManagement.getBookShelf();
		book=bookShelf.getBookfromISBN(text.getText());
		if (book==null) {
			System.out.printf("图书馆没有此书，删除失败\n");
		}else {
			bookShelf.deleteBook(book);
		}
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(468, 356);
		shell.setText("删除图书");
		
		Label lblisbn = new Label(shell, SWT.NONE);
		lblisbn.setBounds(58, 107, 175, 35);
		lblisbn.setText("\u6240\u5220\u4E66\u7C4D\u7684ISBN\u7F16\u53F7\uFF1A");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(238, 104, 175, 26);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteBook();
			}
		});
		btnNewButton.setBounds(157, 196, 118, 47);
		btnNewButton.setText("确认删除");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
