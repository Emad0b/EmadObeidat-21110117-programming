package final_Assignment;

import javax.swing.JOptionPane;

public class Event_Driven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstNumber=JOptionPane.showInputDialog("Enter the first number");
		String operator=JOptionPane.showInputDialog("Enter Operator:");
		String secondNumber=JOptionPane.showInputDialog("Enter the Second number");
		double num1=Double.parseDouble(firstNumber);
		double num2=Double.parseDouble(secondNumber);
		String op=String.format(operator);
		String result;
		double sum;
		switch(op) 
		{
		case "+":
		sum = num1+num2;
		result=num1+"+"+num2;
		JOptionPane.showMessageDialog(null, result+"="+sum,"Result",JOptionPane.PLAIN_MESSAGE);
		break;
		case "-":
			sum = num1-num2;
			result=num1+"-"+num2;
			JOptionPane.showMessageDialog(null, result+"="+sum,"Result",JOptionPane.PLAIN_MESSAGE);
		break;
		case "/":
			sum = num1/num2;
			result=num1+"/"+num2;
			JOptionPane.showMessageDialog(null, result+"="+sum,"Result",JOptionPane.PLAIN_MESSAGE);
		break;
		case "x":
			sum = num1*num2;
			result=num1+"X"+num2;
			JOptionPane.showMessageDialog(null, result+"="+sum,"Result",JOptionPane.PLAIN_MESSAGE);
		break;
		case "*":
			sum = num1*num2;
			result=num1+"X"+num2;
			JOptionPane.showMessageDialog(null, result+"="+sum,"Result",JOptionPane.PLAIN_MESSAGE);
		break;
		}
	}

}
