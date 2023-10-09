import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.Math.*;
import java.util.*;


/**
 * Handles actions for the GUI which switch between frames that are entirely separated from each other. For instance, from the login frame
 * to the RedirectScreen.
 */
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
    
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println(action);
        if (action == "Login" && login.is_manager()) {
            staff_id = login.staff_id;
            frame.setContentPane(redirect);
        }
        else if (action == "Manager View") {
            frame.setContentPane(manager);
        }
//        else if (action == "Server View") {
//            frame.setContentPane(server);
//        }
        else if (action == "Home") {
            frame.setContentPane(login);
        }

        frame.repaint();
        frame.revalidate();

    }
}