package client.administrator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import library.Administrator;
import library.BookShelf;
import library.ReaderShelf;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AdministratorWindow {


	private Administrator administrator;
	
	public AdministratorWindow(BookShelf bookShelf,ReaderShelf readerShelf) {
		// TODO �Զ����ɵĹ��캯�����
		this.administrator=new Administrator(bookShelf, readerShelf);
	}
	
	private void openBookManagementWindow() {
		try {
			BookManagementWindow bookManagementWindow=new BookManagementWindow(administrator.bookManagement);
			bookManagementWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	private void openReaderManagementWindow() {
		try {
			ReaderManagementWindow readerManagementWindow=new ReaderManagementWindow(administrator.readerManagement);
			readerManagementWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	


	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(546, 380);
		shell.setText("����Ա����");
		
		Button BookManagementButton = new Button(shell, SWT.NONE);
		BookManagementButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openBookManagementWindow();
			}
		});
		BookManagementButton.setBounds(87, 109, 122, 63);
		BookManagementButton.setText("ͼ�����");
		
		Button ReaderManagementButton = new Button(shell, SWT.NONE);
		ReaderManagementButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openReaderManagementWindow();
			}
		});
		ReaderManagementButton.setBounds(290, 109, 122, 63);
		ReaderManagementButton.setText("���߹���");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
