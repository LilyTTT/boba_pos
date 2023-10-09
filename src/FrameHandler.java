
import javax.swing.*;
import java.awt.event.*;

public class FrameHandler implements ActionListener {

    public JFrame frame;
    public Login login;
    public Redirect redirect;
    public Manager manager;
//    public Server server;
    public int staff_id;

    /**
    * Handles the different actions that can be performed on the panels. It listens
    * for the action command from the event, and checks if the user is logging in
    * correctly. If the user is logging in correctly and is a manager, it sets the
    * content pane to the RedirectScreen panel. Otherwise, it sets the content pane
    * to the Server panel. If the action command is for the ManagerView or ServerView,
    * it sets the content pane to the corresponding panel. Also handles the Home buttons
    * which take the user back to the login screen. After the content pane is
    * set, it repaints and revalidate the JFrame to display the new panel.
    * @param e The ActionEvent object that triggered the listener.
    */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if ("Login".equals(action) && login.is_manager()) {
            staff_id = login.staff_id;
            frame.setContentPane(redirect);
        }
        else if ("Manager View".equals(action)) {
            frame.setContentPane(manager);
        }
//        else if (action == "Server View") {
//            frame.setContentPane(server);
//        }
        else if ("Home".equals(action)) {
            frame.setContentPane(login);
        }

        frame.repaint();
        frame.revalidate();

    }
}