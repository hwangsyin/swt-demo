package swt.widget;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonTest {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Widget: Button");
		
		shell.open();
		
		Image image = new Image(display, "resources/surface.jpg");
		
		Button btn = new Button(shell, SWT.ARROW_UP);
		btn.setBounds(0,0,image.getBounds().width,image.getBounds().height);
		//btn.setText("°´Å¥");
		btn.setImage(image);
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();
	}

}
