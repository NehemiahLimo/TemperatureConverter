import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 
 */

/**
 * @author Limo C.N
 *
 */
public class Temperature extends JFrame{
	private JTextField ft=new JTextField(10);
	private JTextField cel=new JTextField(10);
	
	
	public Temperature(){
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(2,2,2,2));
		add(panel,BorderLayout.NORTH);
		panel.setBorder(new TitledBorder("Enter Temperature in Fahrenheit"));
		JLabel fahr=new JLabel("Fahrenheit");
		panel.add(fahr);
		
		panel.add(ft);
		
		JLabel degree=new JLabel("Celsius");
		panel.add(degree);
		
		panel.add(cel);
		cel.setEditable(false);
		
		
		JPanel con=new JPanel();
		con.setLayout(new FlowLayout());
		JButton convert=new JButton("CONVERT");
		con.add(convert);
		add(con, BorderLayout.SOUTH);
		
		
		convert.addActionListener(new ButtonListener());
	}

	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			double fah=Double.parseDouble(ft.getText());
			//double celsius=((Double.parseDouble(cel.getText()))*5/9-(32));
			
			cel.setText(String.format("%.2f", ((fah-32))*5/9));
			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Temperature temp=new Temperature();
		temp.setTitle("Temperature Converter");
		temp.setVisible(true);
		temp.setSize(300,300);
		temp.setLocationRelativeTo(null);
		temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//temp.pack();
	}

}
