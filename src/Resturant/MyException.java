package Resturant;

import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class MyException extends Exception implements Serializable {

    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }

    int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Positive Number " + x));
            if (number <= 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input  Try Again");
            }
        } while (number <= 0);

        return number;
    }

    String checkEmail(String x) {
        String email;
        do {
            email = JOptionPane.showInputDialog("Enter Valid input for " + x + " !");
            if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
            }
        } while (!email.contains("@") || !email.contains("."));

        return email;
    }

    String checkPassLength(String x) {
        String password;
        do {
            password = JOptionPane.showInputDialog("Enter more than 8 char" + x );
            if (password.length() < 8)
            {
                JOptionPane.showMessageDialog(null, "Not Vaild  Try Again ");
            }
        } while (password.length() < 8);

        return password;
    }

}