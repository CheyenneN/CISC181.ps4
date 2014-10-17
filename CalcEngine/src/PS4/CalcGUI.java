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
import PS4.CalcEngine;

public class CalcGUI {

	private JFrame frame;
	private JTextField textInA;
	private JTextField textYears;
	private JTextField textAIR;
	private JTextField textFVSum;

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
			public void actionPerformed(ActionEvent arg0) {
				
				double Amount = Double.parseDouble(textInA.getText());
                double Years = Double.parseDouble(textYears.getText());
                double InterestRate = Double.parseDouble(textAIR.getText());

                // Set future value text box equal
                textFVSum.setText(PS4.CalcEngine.Calculation(Amount, Years, InterestRate));
			}
		});
		btnCalculate.setBounds(317, 213, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		textInA = new JTextField();
		textInA.setBounds(320, 21, 86, 20);
		frame.getContentPane().add(textInA);
		textInA.setColumns(10);
		
		textYears = new JTextField();
		textYears.setBounds(320, 52, 86, 20);
		frame.getContentPane().add(textYears);
		textYears.setColumns(10);
		
		textAIR = new JTextField();
		textAIR.setBounds(320, 83, 86, 20);
		frame.getContentPane().add(textAIR);
		textAIR.setColumns(10);
		
		textFVSum = new JTextField();
		textFVSum.setBounds(320, 114, 86, 20);
		frame.getContentPane().add(textFVSum);
		textFVSum.setColumns(10);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(10, 24, 112, 14);
		frame.getContentPane().add(lblInvestmentAmount);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblYears);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(10, 86, 133, 14);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(10, 117, 77, 14);
		frame.getContentPane().add(lblFutureValue);
		
		
	}
}
