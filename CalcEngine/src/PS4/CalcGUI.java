package PS4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setBounds(317, 213, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		textField = new JTextField();
		textField.setBounds(320, 21, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(320, 52, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(320, 83, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(320, 114, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(10, 24, 112, 14);
		frame.getContentPane().add(lblInvestmentAmount);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblYears);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(10, 86, 112, 14);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(10, 117, 77, 14);
		frame.getContentPane().add(lblFutureValue);
		
		
	}
}
