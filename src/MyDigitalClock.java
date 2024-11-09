import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



class MyFrames extends JFrame{

	
	private static final long serialVersionUID = 1L;
	Calendar calnder;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrames(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock");
		
		this.setLayout(new GridLayout(0,1));
		this.setSize(800,300);
	    this.setBounds(550, 300, 300, 330);
	    
		
		this.setResizable(true);
		

		timeFormat =new SimpleDateFormat("hh:mm:ss a");
		dayFormat =new SimpleDateFormat("EEEE");
		dateFormat =new SimpleDateFormat("MMMMM dd, yyyy");
		
		
		
		
		timeLabel= new JLabel();
		timeLabel.setFont(new Font("Digital-7",Font.PLAIN,70));
		timeLabel.setBackground(new Color(60,42,33));
		timeLabel.setForeground(new Color(255,249,178)); 
		
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		

		
		timeLabel.setOpaque(true);
		this.add(timeLabel);
		
		
		dayLabel= new JLabel();
		dayLabel.setFont(new Font("Chalkduster",Font.PLAIN,35));
		dayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dayLabel.setForeground(new Color(63,7,19));
		dayLabel.setBackground(new Color(231,231,222));
		
		
		
		
		dayLabel.setOpaque(true);
		this.add(dayLabel);
		
		
		
		dateLabel= new JLabel();
		dateLabel.setFont(new Font("Apple Chancery",Font.PLAIN,35));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		//dateLabel.setBackground(new Color(0,20,255));
		dateLabel.setBackground(Color.BLACK);
		dateLabel.setForeground(new Color(0,246,255));
		dateLabel.setOpaque(true);
		
		this.add(dayLabel);
		this.add(dateLabel);
		
		
		this.setVisible(true);
		
		
		setTime();
		
		
	}
	public void setTime() {
		
		while(true) {
		time=timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		
		
		day=dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		
		date=dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	
	

}
public class MyDigitalClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new MyFrames();
      
	}

}

