import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", 
                                                      "Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) {
                System.exit(0);
            }

            int choice = JOptionPane.showConfirmDialog(null, 
                            "Do you want to proceed?", 
                            "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", 
                                              "Message", JOptionPane.INFORMATION_MESSAGE);
                break; 
            }
        }
    }
}