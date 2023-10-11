
import javax.swing.*;
import java.awt.event.*;

public class FrameHandler implements ActionListener {

    public JFrame frame;
    public Login login;
    public Redirect redirect;
    public Manager manager;
    public Cashier cashier;
    public int staff_id;

 /**
    * Handles the different actions that can be performed on the panels. It listens
    * for the action command from the event, and checks if the user is logging in
    * correctly. If the user is logging in correctly and is a manager, it sets the
    * content pane to the Redirect panel. Otherwise, it sets the content pane
    * to the Cashier panel. If the action command is for the Manager or Cashier,
    * it sets the content pane to the corresponding panel. Also handles the Home buttons
    * which take the user back to the login screen. After the content pane is
    * set, it repaints and revalidate the JFrame to display the new panel.
    * @author Linh Nguyen
    * @param e The ActionEvent object that triggered the listener.
    * @return void
    * @throws null
    */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        staff_id = login.staff_id;
        Boolean temp = false;
        if ("Login".equals(action) && (temp = login.is_manager())) {
            frame.setContentPane(redirect);
        }
        else if ("Manager View".equals(action)) {
            frame.setContentPane(manager);
        }
        else if ("Cashier View".equals(action) || ("Login".equals(action) && !temp)) {
            frame.setContentPane(cashier);
        }
        else if ("Home".equals(action)) {
            frame.setContentPane(login);
        }
        else if ("Back".equals(action)) {
            frame.setContentPane(redirect);
        }

        frame.repaint();
        frame.revalidate();
    }
}