package cn.leagle.ch6;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * @Title: InnerClassTest
 * @Description: This program demonstrates the use of inner classes.
 * @author: leagle
 * @date: 2017年8月23日下午9:14:01
 */
public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * 
 * @Title: TalkingClock
 * @Description: A clock that prints the time in regular intervals.
 * @author: leagle
 * @date: 2017年8月23日下午9:15:13
 */
class TalkingClock {

	/**
	 * 
	 * @Title: TalkingClock   
	 * @Description: Constructs a talking clock
	 * @param interval the interval between message (in milliseconds)
	 * @param beep true if the clock should beep
	 */
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}

	/**
	 * 
	 * @Title: TalkingClock   
	 * @Description: Starts the clock.
	 */
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer timer = new Timer(interval, listener);
		timer.start();
	}

	private int interval;
	private boolean beep;

	public class TimePrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep)
				Toolkit.getDefaultToolkit().beep();
		}

	}

}
