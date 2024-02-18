package Digital_Clock;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame{

	
	private JLabel heading;
	private JLabel clockLable;
	
	public MyWindow() {
		super.setTitle("Digital Clock");
		super.setSize(700,700 );
		setLocationRelativeTo(null);
		this.createGUI(); 
		this.StartClock();
		setVisible(true);
	}
	
	

	public void createGUI()
	{
		 heading =new JLabel("My Clock");
		 clockLable=new JLabel("Clock");
		 
		 heading .setFont(getFont());
		 clockLable.setFont(getFont());
		 
		 this.setLayout(new GridLayout(2, 1));
		 
		 this.add(heading);
		 
		 this.add(clockLable);
		 
	}
	private void StartClock() {
		
		Timer timer=new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dateTime=new Date().toLocaleString();
				clockLable.setText(dateTime);
			}
			
		} );
		
		timer.start();
		
		
	/*	Thread t=new Thread() {
			public void run() {
				try
				{
					while(true)
					{
						Date d=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("hh : mm : ss a");
						String dateTime=sdf.format(d);
						clockLable.setText(dateTime);
						
						Thread.sleep(1000);
						Thread.currentThread().sleep(1000);
					}
				
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		};
		t.start();*/
		
	}
	
	
	
	
}
