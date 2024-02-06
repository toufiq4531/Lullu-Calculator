import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	
	Font font = new Font("cambria",Font.PLAIN,30);
	Font fontModel = new Font("cambria",Font.PLAIN,35);
	Font fontNum = new Font("cambria",Font.PLAIN,50);
	
	JTextField screen;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot;
	
	JButton btneq, btnplus, btnminus, btnmulti, btndivide;
	
	double num1, num2, result;
	String operator;
	
	public Calculator(){
		
		//main window which holds everything
		//our main application container
		super("Calculator");
		this.setSize(410,560);
		this.setLocation(500,100); //sets the location where the window will open on screen
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);

		
		//Container Panel
		JPanel container = new JPanel();
		container.setBounds(0,0,410,560);
		container.setBackground( new Color(53,242,181) ); //sets color with RGB code
		container.setLayout(null);
		
		//JLabel
		JLabel label = new JLabel("Model : Lullu Calculator"); //a label or text on the container panel
		label.setBounds(10,10,370,50); //defines the position of this text
		label.setFont(fontModel);
		
		//JTextField
		screen = new JTextField();
		screen.setFont(font);
		screen.setBounds(10,70,370,50);
		
		//buttons
		btn7 = new JButton("7");
		btn7.setFont(fontNum);
		btn7.setBackground(new Color(219,237,213));
		btn7.setBounds(15,135,80,80);
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setFont(fontNum);
		btn8.setBackground(new Color(219,237,213));
		btn8.setBounds(110,135,80,80);
		btn8.addActionListener(this);
		
		btn9 = new JButton("9");
		btn9.setFont(fontNum);
		btn9.setBackground(new Color(219,237,213));
		btn9.setBounds(205,135,80,80);
		btn9.addActionListener(this);
		
		btndivide = new JButton("/");
		btndivide.setFont(fontNum);
		btndivide.setBackground(new Color(219,237,213));
		btndivide.setBounds(300,135,80,80);
		btndivide.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setFont(fontNum);
		btn4.setBackground(new Color(219,237,213));
		btn4.setBounds(15,230,80,80);
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setFont(fontNum);
		btn5.setBackground(new Color(219,237,213));
		btn5.setBounds(110,230,80,80);
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setFont(fontNum);
		btn6.setBackground(new Color(219,237,213));
		btn6.setBounds(205,230,80,80);
		btn6.addActionListener(this);
		
		btnmulti = new JButton("*");
		btnmulti.setFont(fontNum);
		btnmulti.setBackground(new Color(219,237,213));
		btnmulti.setBounds(300,230,80,80);
		btnmulti.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setFont(fontNum);
		btn1.setBackground(new Color(219,237,213));
		btn1.setBounds(15,325,80,80);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(fontNum);
		btn2.setBackground(new Color(219,237,213));
		btn2.setBounds(110,325,80,80);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setFont(fontNum);
		btn3.setBackground(new Color(219,237,213));
		btn3.setBounds(205,325,80,80);
		btn3.addActionListener(this);
		
		btnminus = new JButton("-");
		btnminus.setFont(fontNum);
		btnminus.setBackground(new Color(219,237,213));
		btnminus.setBounds(300,325,80,80);
		btnminus.addActionListener(this);
		
		btndot = new JButton(".");
		btndot.setFont(fontNum);
		btndot.setBackground(new Color(219,237,213));
		btndot.setBounds(15,420,80,80);
		btndot.addActionListener(this);
		
		btn0 = new JButton("0");
		btn0.setFont(fontNum);
		btn0.setBackground(new Color(219,237,213));
		btn0.setBounds(110,420,80,80);
		btn0.addActionListener(this);
		
		btneq = new JButton("=");
		btneq.setFont(fontNum);
		btneq.setBackground(new Color(219,237,213));
		btneq.setBounds(205,420,80,80);
		btneq.addActionListener(this);
		
		btnplus = new JButton("+");
		btnplus.setFont(fontNum);
		btnplus.setBackground(new Color(219,237,213));
		btnplus.setBounds(300,420,80,80);
		btnplus.addActionListener(this);
		
		//=======================================//
		//panel container
		container.add(label);
		container.add(screen);
		
		container.add(btn7);
		container.add(btn8);
		container.add(btn9);
		
		container.add(btn4);
		container.add(btn5);
		container.add(btn6);
		
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		
		container.add(btndivide);
		container.add(btnmulti);
		container.add(btnminus);
		container.add(btnplus);
		container.add(btndot);
		container.add(btneq);
		container.add(btn0);
		
		//main container
		this.add(container);
		//display the window
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		//Get what is written on Button
		String command = e.getActionCommand();
		
		//Get the source of clicked Button
		
		//for Number Button
		if(btn7 == e.getSource() ||
		   btn8 == e.getSource() ||
		   btn9 == e.getSource() ||
		   btn4 == e.getSource() ||
		   btn5 == e.getSource() ||
		   btn6 == e.getSource() ||
		   btn1 == e.getSource() ||
		   btn2 == e.getSource() ||
		   btn3 == e.getSource() ||
		   btn0 == e.getSource() ||
		   btndot == e.getSource() ){
			System.out.println("Number Clicked");
			screen.setText(screen.getText()+command);
		}
		
		//for Operator Button
		else if(btndivide == e.getSource() ||
			    btnplus == e.getSource() ||
			    btnminus == e.getSource() ||
			    btnmulti == e.getSource()){
			System.out.println("Operator Clicked");
			num1 = Double.parseDouble(screen.getText());
			screen.setText("");
			//screen.setText(screen.getText()+command);
			operator = command;
			
			
		}
		
		else if(btneq == e.getSource()){
			num2 = Double.parseDouble(screen.getText());
			if(operator == "+"){
				result = num1 + num2;}
				
			else if(operator == "-"){
				result = num1 - num2;}
				
			else if(operator == "*"){
				result = num1 * num2;}

			else if(operator == "/"){
				result = num1 / num2;}
				
			screen.setText(""+result); //by concatting to space, result is turning into string
			num1 = result;
		}
		
	}
}