package client.administrator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import client.administrator.readermanagement.CheckReaderWindow;
import client.administrator.readermanagement.ShowAllReadersWindow;
import client.administrator.readermanagement.UrgeReaderWindow;
import library.ReaderManagement;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class ReaderManagementWindow {

	private ReaderManagement readerManagement;
	
	public ReaderManagementWindow(ReaderManagement readerManagement) {
		this.readerManagement=readerManagement;
	}
	
	private void openCheckReaderWindow() {
		try {
			CheckReaderWindow checkReaderWindow=new CheckReaderWindow(readerManagement);
			checkReaderWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void openUrgeReaderWindow() {
		try {
			UrgeReaderWindow urgeReaderWindow=new UrgeReaderWindow();
			urgeReaderWindow.open();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void openShowAllBooksWindow() {
		try {
			ShowAllReadersWindow showAllReadersWindow=new ShowAllReadersWindow();
			showAllReadersWindow.open();
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
		shell.setSize(535, 409);
		shell.setText("读者管理");
		
		Button CheckReaderButton = new Button(shell, SWT.NONE);
		CheckReaderButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openCheckReaderWindow();
			}
		});
		CheckReaderButton.setBounds(95, 117, 122, 59);
		CheckReaderButton.setText("查看读者信息");
		
		Button UrgeReaderButton = new Button(shell, SWT.NONE);
		UrgeReaderButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openUrgeReaderWindow();
			}
		});
		UrgeReaderButton.setBounds(282, 117, 122, 59);
		UrgeReaderButton.setText("催还");
		
		Button showAllReadersButton=new Button(shell, SWT.NONE);
		showAllReadersButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openShowAllBooksWindow();
			}
		});
		showAllReadersButton.setBounds(185, 225, 140, 59);
		showAllReadersButton.setText("显示所有读者");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
