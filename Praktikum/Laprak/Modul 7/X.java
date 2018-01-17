import java.awt.*;
import java.awt.event.*;

public class X extends Frame {
	public static void main(String args[]){
		X x = new X();
		x.pack();
		x.setVisible(true);
	}
	private int count;
	public X(){
		final Label l = new Label("Count = "+count);
		add(l,BorderLayout.SOUTH);
		add(
			new Button("Hello "+l){
			{
				addActionListener (
					new ActionListener(){
						public void actionPerformed(ActionEvent ev){
							count++;
							l.setText("Count = "+count);
						}
					}
				);
			}
		}, BorderLayout.NORTH);
	}
}