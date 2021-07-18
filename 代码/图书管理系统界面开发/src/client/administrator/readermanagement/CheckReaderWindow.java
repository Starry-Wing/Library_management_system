package client.administrator.readermanagement;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import library.ReaderManagement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CheckReaderWindow {
	private Text text;
	private ReaderManagement readerManagement;

	public CheckReaderWindow(ReaderManagement readerManagement) {
		this.readerManagement=readerManagement;
	}
	
	private void checkReader() {
		readerManagement.checkFromID(text.getText());
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(541, 402);
		shell.setText("查看借阅情况");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(241, 99, 146, 33);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(126, 102, 89, 33);
		lblNewLabel.setText("读者ID:");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				checkReader();
			}
		});
		button.setBounds(174, 197, 146, 63);
		button.setText("\u786E\u5B9A");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
