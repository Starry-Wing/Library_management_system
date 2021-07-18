package client.administrator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import client.administrator.bookmanagement.AddBookWindow;
import client.administrator.bookmanagement.DeleteBookWindow;
import client.administrator.bookmanagement.QueryBookWindow;
import client.administrator.bookmanagement.ShowAllBooksWindow;
import library.Administrator;
import library.Book;
import library.BookManagement;
import library.BookShelf;
import library.ReaderManagement;
import library.ReaderShelf;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class BookManagementWindow {
	
	private BookManagement bookManagement;
	
	public BookManagementWindow(BookManagement bookManagement) {
		// TODO 自动生成的构造函数存根
		this.bookManagement=bookManagement;
	}
	

	
	private void openAddBookWindow() {
		try {
			AddBookWindow addBookWindow=new AddBookWindow(bookManagement);
			addBookWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	private void openDeleteBookWindow() {
		try {
			DeleteBookWindow deleteBookWindow=new DeleteBookWindow(bookManagement);
			deleteBookWindow.open();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void openQueryBookWindow() {
		try {
			QueryBookWindow queryBookWindow=new QueryBookWindow(bookManagement.getBookShelf());
			queryBookWindow.open();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void openShowAllBooksWindow() {
		try {
			ShowAllBooksWindow showAllBooksWindow=new ShowAllBooksWindow(bookManagement.getBookShelf());
			showAllBooksWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(674, 460);
		shell.setText("图书管理界面");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//System.out.printf("hello world");
				openAddBookWindow();
				
			}
		});
		btnNewButton.setBounds(48, 100, 118, 58);
		btnNewButton.setText("添加图书");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openDeleteBookWindow();
			}
		});
		btnNewButton_1.setBounds(255, 100, 118, 58);
		btnNewButton_1.setText("删除图书");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openQueryBookWindow();
			}
		});
		btnNewButton_2.setBounds(457, 100, 118, 58);
		btnNewButton_2.setText("查询图书");
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openShowAllBooksWindow();
			}
		});
		btnNewButton_3.setBounds(255, 240, 118, 76);
		btnNewButton_3.setText("显示所有图书");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
