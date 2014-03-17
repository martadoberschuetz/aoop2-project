package project;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;


//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


import project.Swimmer.Gender;
import project.Swimmer.Status;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	JFrame mainFrame;
	JMenu swimmerMenu;
	JMenu galaMenu;
	JMenu competitionMenu;
	JMenu adminMenu;
	
	ArrayList<Swimmer> arrayListOfSwimmers;
	
	//for testing purposes only:
	public static void main(String[] abc){
		
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
		
	}
	
	public MainFrame(){
		
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
		RegisterSwimmerHandler registerSwimmerHandler = new RegisterSwimmerHandler();
		item.addActionListener(registerSwimmerHandler);
		
		item = new JMenuItem("Amend");
		swimmerMenu.add(item);
		item = new JMenuItem("Deactivate");
		swimmerMenu.add(item);
		item = new JMenuItem("View");
		swimmerMenu.add(item);
		ViewSwimmersHandler viewSwimmersHandler = new ViewSwimmersHandler();
		item.addActionListener(viewSwimmersHandler);
		
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
		
		arrayListOfSwimmers = new ArrayList<Swimmer>();
		
	}
	
	
	class RegisterSwimmerHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			// TODO:
			// for future development:
			// RegisterSwimmerFrame swimmerForm = new RegisterSwimmerFrame();
			// swimmerForm.setVisible(true);
			
			// enter forename
			String forename = JOptionPane.showInputDialog("Forename?");
			
			// enter surname
			String surname = JOptionPane.showInputDialog("Surname?");
			
			// enter year in date of birth
			String year = JOptionPane.showInputDialog("Date of birth?\nYear?");
			int yearAsNumber = Integer.parseInt(year);
			
			// enter month in date of birth
			String month = JOptionPane.showInputDialog("Date of birth?\nMonth?");
			int monthAsNumber = Integer.parseInt(month);
			
			// enter day in date of birth
			String day = JOptionPane.showInputDialog("Date of birth?\nDay?");
			int dayAsNumber = Integer.parseInt(day);
			
			// date of birth
			GregorianCalendar dateOfBirth = new GregorianCalendar(yearAsNumber, monthAsNumber, dayAsNumber);
					
			// gender
			// TODO: combo box in future implementation
			String gender = JOptionPane.showInputDialog("Gender? Male or female?");
			Gender genderOfTypeGender = null;
			if (gender.toLowerCase().equals("male")){
				genderOfTypeGender = Gender.male;
			}else if(gender.toLowerCase().equals("female")){
				genderOfTypeGender = Gender.female;
			} 
			
			// phone number
			String phoneNumber = JOptionPane.showInputDialog("Phone number?");
			int phoneNumberAsNumber = Integer.parseInt(phoneNumber);
			
			// email
			String email = JOptionPane.showInputDialog("Email?");
			
			// medical conditions
			String medicalConditions = JOptionPane.showInputDialog("Medical conditions?");
			
			// medication
			String medication = JOptionPane.showInputDialog("Medication?");
			
			// name of the next of kin
			String nextOfKinName = JOptionPane.showInputDialog("Name of the next of kin?");
			
			// phone number for the next of kin
			String nextOfKinPhoneNumber = JOptionPane.showInputDialog("Phone number of the next of kin?");
			int nextOfKinPhoneNumberAsNumber = Integer.parseInt(nextOfKinPhoneNumber);
			
			// swim club name
			String swimClubName = JOptionPane.showInputDialog("Swim Club name?");
			
			// status
			String status = JOptionPane.showInputDialog("Status? Active or Inactive?");
			Status statusOfTypeStatus = null;
			if (status.toLowerCase().equals("active")){
				statusOfTypeStatus = Status.active;
			}else if(status.toLowerCase().equals("inactive")){
				statusOfTypeStatus = Status.inactive;
			} 
			
			Swimmer swimmer = new Swimmer(forename, surname, dateOfBirth, genderOfTypeGender, phoneNumberAsNumber, 
											email, medicalConditions, medication, nextOfKinName, 
											nextOfKinPhoneNumberAsNumber, swimClubName, statusOfTypeStatus);
			
			arrayListOfSwimmers.add(swimmer);
			
			JOptionPane.showMessageDialog(null, swimmer.toString());
			
		}
	}
	
	class ViewSwimmersHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for (Swimmer x: arrayListOfSwimmers){
				JOptionPane.showMessageDialog(null, x);
				
			}
			
		}
	
	}
	
}