package fizzbuzz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class FizzBuzzGUI {

	public void displayGUI() {
		JFrame frame = new JFrame("FizzBuzz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		contentPane.setOpaque(true);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		StringBuilder toolTip = new StringBuilder();
		toolTip.append("<html><h1 align=\"center\">FizzBuzz</h1>");
		toolTip.append("Gib eine Zahl ein.<br>");
		toolTip.append("Ist diese durch 3 teilbar, so erh&auml;lst du das Ergebnis Fizz.<br>");
		toolTip.append("Ist diese durch 5 teilbar, so erh&auml;lst du das Ergebnis Buzz.<br>");
		toolTip.append("Ist diese durch 3 und 5 teilbar, so erh&auml;lst du das Ergebnis FizzBuzz.<br>");
		toolTip.append("Ansonsten ist das Ergebnis die Zahl selbst.</html>");

		JLabel label1 = new JLabel(toolTip.toString());
		label1.setLocation(5, 5);
		label1.setSize(400, 150);
		contentPane.add(label1);
		
		final String defaultTextFieldText = "Zahl eingeben";

		final JTextField textField = new JTextField(defaultTextFieldText);
		textField.setSize(100, 30);
		textField.setLocation(80, 155);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});

		textField.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
				if (defaultTextFieldText.equals(textField.getText())) {
					textField.setText("");
				}
			}

			public void keyReleased(KeyEvent e) {
				if (defaultTextFieldText.equals(textField.getText())) {
					textField.setText("");
				}
			}

			public void keyPressed(KeyEvent e) {
				if (defaultTextFieldText.equals(textField.getText())) {
					textField.setText("");
				}
			}
		});

		contentPane.add(textField);

		JButton button = new JButton("Gib aus");
		button.setSize(100, 30);
		button.setLocation(200, 155);
		contentPane.add(button);

		JLabel label = new JLabel("Ergebnis");
		label.setSize(220, 30);
		label.setLocation(80, 200);
		EmptyBorder eBorder = new EmptyBorder(2, 10, 2, 10); // oben, rechts,
																// unten, links
		LineBorder lBorder = new LineBorder(new Color(100, 100, 100));
		label.setBorder(BorderFactory.createCompoundBorder(lBorder, eBorder));
		contentPane.add(label);
		button.addActionListener(new MyListener(textField, label, defaultTextFieldText));

		frame.setContentPane(contentPane);
		frame.setSize(410, 300);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
}

class MyListener implements ActionListener {
	private JTextField textField;
	private JLabel label;
	private String defaultTextFieldText;

	public MyListener(JTextField tf, JLabel l, String text) {
		this.textField = tf;
		this.label = l;
		this.defaultTextFieldText = text;
	}

	public void actionPerformed(ActionEvent ae) {
		String text = this.textField.getText();

		StringBuilder ergebnisText = new StringBuilder();
		ergebnisText.append("Die Zahl ").append(text).append(" ergibt: ");
		String s;
		try {
			s = FizzBuzz.fizzBuzz(Integer.parseInt(text));
		} catch (NumberFormatException ex) {
			s = "keine Zahl";
		}

		ergebnisText.append(s);

		this.label.setText(ergebnisText.toString());
		this.textField.setText(this.defaultTextFieldText);
		this.textField.requestFocus();
	}
}
