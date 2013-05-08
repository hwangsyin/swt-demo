package swt.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MathSin {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Math: sin(x)");
		shell.open();
		
		double measure = 100;
		double xMeasure = 600;
		float step = 0.001f;
		GC gc = new GC(shell);
		gc.setForeground(display.getSystemColor(SWT.COLOR_RED));
		
		gc.drawPoint(100, 100);
		double x1 = 0;
		int x, y;
		for(;Math.abs(2*Math.PI - x1) >= step; x1 = x1 + step) {
			x = (int)(x1 * (xMeasure/(2*Math.PI)));
			y = (int)(measure - Math.sin(x1) * measure);
			
			gc.drawPoint(x, y);
		}
		
		gc.dispose();
		System.out.print("draw end");
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();
	}

}
