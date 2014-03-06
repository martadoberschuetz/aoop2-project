package project;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui extends JFrame{

	JFrame mainFrame;
	JMenu swimmerMenu;
	JMenu galaMenu;
	JMenu competitionMenu;
	JMenu adminMenu;
	
	//for testing purposes only:
	public static void main(String[] abc){
		
		Gui mainFrame = new Gui();
		mainFrame.setVisible(true);
		
	}
	
	public Gui(){
		
		//setting the frame properties
		setTitle("Swim Gala Manager");
		setSize(500,300);
		setLocation(50, 50);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//setting the container properties
		Container container;
		container = getContentPane();
		container.setLayout(new FlowLayout()); //anonymous sth....??
		
		//menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		swimmerMenu = new JMenu("Swimmer");
		menuBar.add(swimmerMenu);
		galaMenu = new JMenu("Gala");
		menuBar.add(galaMenu);
		competitionMenu = new JMenu("Competition");
		menuBar.add(competitionMenu);
		adminMenu = new JMenu("Admin");
		menuBar.add(adminMenu);
		
		//menu and menu items
		JMenuItem item;
		
		item = new JMenuItem("Register");
		swimmerMenu.add(item);
		item = new JMenuItem("Amend");
		swimmerMenu.add(item);
		item = new JMenuItem("Deactivate");
		swimmerMenu.add(item);
		item = new JMenuItem("View");
		swimmerMenu.add(item);
		
		item = new JMenuItem("Register");
		galaMenu.add(item);
		item = new JMenuItem("Amend");
		galaMenu.add(item);
		item = new JMenuItem("Cancel");
		galaMenu.add(item);
		item = new JMenuItem("View");
		galaMenu.add(item);
		
		item = new JMenuItem("View qualifying swimmers");
		competitionMenu.add(item);
		item = new JMenuItem("Do I qualify?");
		competitionMenu.add(item);
		item = new JMenuItem("Enter a gala");
		competitionMenu.add(item);
		
		item = new JMenuItem("Load");
		adminMenu.add(item);
		item = new JMenuItem("Save");
		adminMenu.add(item);
		
		
		
		
	}
	
}
