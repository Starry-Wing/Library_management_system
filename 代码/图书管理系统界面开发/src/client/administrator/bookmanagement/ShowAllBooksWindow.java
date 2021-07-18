package client.administrator.bookmanagement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import library.BookShelf;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ShowAllBooksWindow {


	private BookShelf bookShelf;
	
	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(491, 342);
		shell.setText("显示所有图书");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showAllBooks();
			}
		});
		button.setBounds(149, 112, 166, 56);
		button.setText("\u663E\u793A\u56FE\u4E66\u9986\u6240\u6709\u56FE\u4E66");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public ShowAllBooksWindow(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
	}
	
	private void showAllBooks() {
		bookShelf.showAllBooks();
	}
}
