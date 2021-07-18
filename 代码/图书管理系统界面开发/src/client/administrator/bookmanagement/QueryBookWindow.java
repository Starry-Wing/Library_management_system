package client.administrator.bookmanagement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import library.BookShelf;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class QueryBookWindow {

//	/**
//	 * Launch the application.
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		try {
//			QueryBookWindow window = new QueryBookWindow();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	private BookShelf bookShelf;
	private Text text;
	
	public QueryBookWindow(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
	}
	
	private void queryBookFromISBN(String ISBN) {
		bookShelf.queryBookFromISBN(ISBN);
	}
	
	private void queryBookFromName(String name) {
		bookShelf.queryBookFromName(name);
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(443, 419);
		shell.setText("查找图书");
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(104, 35, 219, 128);
		
		Button ISBNRadioButton = new Button(group, SWT.RADIO);
		ISBNRadioButton.setBounds(34, 41, 147, 20);
		ISBNRadioButton.setText("按ISBN编号查找");
		
		Button nameRadioButton = new Button(group, SWT.RADIO);
		nameRadioButton.setBounds(34, 80, 119, 20);
		nameRadioButton.setText("按书名查找");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(122, 183, 180, 42);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str=text.getText();
				if (ISBNRadioButton.getSelection()) {
					queryBookFromISBN(str);
				}else if(nameRadioButton.getSelection()){
					queryBookFromName(str);
				}else {
					
				}
			}
		});
		btnNewButton.setBounds(136, 260, 153, 57);
		btnNewButton.setText("查找");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
