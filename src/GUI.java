import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;

/**
    * The Main class contains the main method that creates an instance of FrameHandler
    * to handle the different panels that will be displayed in the JFrame. It creates
    * and sets up the JFrame with a specified size and location, and adds four different
    * panels - Login, RedirectScreen, ManagerUI, and Server. The content pane is initialized
    * to the login screen, where if a manager logs in, they will go to the RedirectScreen and 
    * if a server logs in, they will go directly to the server panel. The FrameHandler handles
    * switching between frames in the overall GUI.
    */
public class GUI {

    public static void main(String[] args) {
        
        FrameHandler frame_handler = new FrameHandler();
        
        JFrame frame = new JFrame("POS");
        frame_handler.frame = frame;
        frame.setSize(new Dimension(1200, 800));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        frame.setSize(screenSize.width, screenSize.height);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

//        Image icon = Toolkit.getDefaultToolkit().getImage("../misc/smoothie_king.jpg");
//        frame.setIconImage(icon);

        Login login_panel = new Login(frame, frame_handler);
        Redirect redirect_panel = new Redirect(frame, frame_handler);
        Manager manager_panel = new Manager(frame, frame_handler);
        Cashier cashier_panel = new Cashier(frame, frame_handler);

        frame_handler.login = login_panel;
        frame_handler.redirect = redirect_panel;
        frame_handler.manager = manager_panel;
        frame_handler.cashier = cashier_panel;

        frame.add(login_panel);
        frame.add(redirect_panel);
        frame.add(manager_panel);
        frame.add(cashier_panel);
        frame.setContentPane(login_panel);
        frame.setVisible(true);
    }
}