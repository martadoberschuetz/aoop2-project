package aoop2_project;

//import GUI and event handling packages
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import aoop2_project.Swimmer.Gender;
import aoop2_project.Swimmer.Status;

public class RegisterSwimmerFrame extends JFrame{
	
	// all labels
	private JLabel enterDetailsLabel;
	private JLabel forenameLabel;
	private JLabel surnameLabel;
	private JLabel dateOfBirthLabel;
	private JLabel genderLabel;
	
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	
	private JLabel medicalConditionsLabel;
	private JLabel medicationsLabel;
	
	private JLabel nextOfKinNameLabel;
	private JLabel nextOfKinPhoneNumberLabel;
	
	private JLabel swimClubNameLabel;
	private JLabel statusLabel;
	private JLabel swimmerLevelLabel;
	
	
	// textfields and comboboxes
	private JTextField forenameTextField;
	private JTextField surnameTextField;
	private JDateChooser dateOfBirthChosen;
	private JComboBox<Gender> genderComboBox;
	private JComboBox<Status> statusComboBox;
	private JTextField phoneNumberTextField;
	private JTextField emailTextField;
	private JTextField medicalConditionsTextField;
	private JTextField medicationTextField;
	private JTextField nextOfKinNameTextField;
	private JTextField nextOfKinPhoneNumberTextField;
	private JComboBox<String> swimClubNameComboBox;
	
	private JButton submitButton;
	private JButton cancelButton;
	
	private JPanel contentPanel;	
	
	private Font fontHeading = new Font("Verdana", Font.BOLD, 18);
	private Font fontSubHeading = new Font("Verdana", Font.BOLD, 16);
	private Font fontLabel = new Font("Verdana", Font.PLAIN, 12);
	private Font fontMenu = new Font("Verdana", Font.PLAIN, 12);
	private Font fontTextField = new Font("Verdana", Font.PLAIN, 11);
	private Font fontButton = new Font("Verdana", Font.PLAIN, 11);
	private Font fontChecks = new Font("Verdana", Font.PLAIN,13);
	
	private Gender[] genders = {Gender.female, Gender.male};
	private Status[] status = {Status.active, Status.inactive};
	private String[] swimClubs = {"Killarney Swimming Club", "Kingdom Masters Swimming Club", "AerLingus Swimming Club",
									"Cork Masters", "Dolphin Swimming Club", "Limerick Masters", "NAC"};
	
	public RegisterSwimmerFrame(){
		
		contentPanel = new JPanel();
		contentPanel.setLayout(null);
		add(contentPanel);
		
		setLocation(50, 50);
		setSize(750, 450);
		setTitle("Swimmer Registration");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		enterDetailsLabel = new JLabel("Please enter Swimmer's details");
		enterDetailsLabel.setBounds(10, 10, 400, 25);
		enterDetailsLabel.setFont(fontSubHeading);
		contentPanel.add(enterDetailsLabel);
		
		// panel for swimmer's personal details
		JPanel personalDetailsPanel = new JPanel();
		personalDetailsPanel.setBounds(10, 60, 350, 150);
		personalDetailsPanel.setLayout(null);
		personalDetailsPanel.setFont(fontLabel);
		personalDetailsPanel.setBorder(BorderFactory.createTitledBorder("Personal details"));
		contentPanel.add(personalDetailsPanel);
				
		forenameLabel = new JLabel("Forename:");
		forenameLabel.setBounds(20, 20, 100, 25);
		forenameLabel.setFont(fontLabel);
		personalDetailsPanel.add(forenameLabel);
				
		forenameTextField = new JTextField();
		forenameTextField.setBounds(120, 20, 200, 22);
		forenameTextField.setFont(fontTextField);
		personalDetailsPanel.add(forenameTextField);
		
		surnameLabel = new JLabel("Surname:");
		surnameLabel.setBounds(20, 50, 75, 25);
		surnameLabel.setFont(fontLabel);
		personalDetailsPanel.add(surnameLabel);
		
		surnameTextField = new JTextField();
		surnameTextField.setBounds(120, 50, 200, 22);
		surnameTextField.setFont(fontTextField);
		personalDetailsPanel.add(surnameTextField);
		
		dateOfBirthLabel = new JLabel("Date of birth:");
		dateOfBirthLabel.setBounds(20, 80, 85, 25);
		dateOfBirthLabel.setFont(fontLabel);
		personalDetailsPanel.add(dateOfBirthLabel);
		
		dateOfBirthChosen = new JDateChooser();
		dateOfBirthChosen.setBounds(120, 80, 200, 22);
		dateOfBirthChosen.setFont(fontTextField);
		personalDetailsPanel.add(dateOfBirthChosen);
		
		genderLabel = new JLabel("Gender:");
		genderLabel.setBounds(20, 110, 75, 25);
		genderLabel.setFont(fontLabel);
		personalDetailsPanel.add(genderLabel);
		
		genderComboBox = new JComboBox<Gender>(genders);
		genderComboBox.setBounds(120, 110, 200, 22);
		genderComboBox.setFont(fontTextField);
		personalDetailsPanel.add(genderComboBox);
		
		// panel for swimmer's contact information
		JPanel contactInformationPanel = new JPanel();
		contactInformationPanel.setBounds(10, 220, 350, 90);
		contactInformationPanel.setLayout(null);
		contactInformationPanel.setFont(fontLabel);
		contactInformationPanel.setBorder(BorderFactory.createTitledBorder("Contact details"));
		contentPanel.add(contactInformationPanel);
		
		phoneNumberLabel = new JLabel("Phone number:");
		phoneNumberLabel.setBounds(20, 20, 100, 25);
		phoneNumberLabel.setFont(fontLabel);
		contactInformationPanel.add(phoneNumberLabel);
		
		phoneNumberTextField = new JTextField();
		phoneNumberTextField.setBounds(120, 20, 200, 22);
		phoneNumberTextField.setFont(fontTextField);
		contactInformationPanel.add(phoneNumberTextField);
		
		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(20, 50, 100, 25);
		emailLabel.setFont(fontLabel);
		contactInformationPanel.add(emailLabel);
		
		phoneNumberTextField = new JTextField();
		phoneNumberTextField.setBounds(120, 50, 200, 22);
		phoneNumberTextField.setFont(fontTextField);
		contactInformationPanel.add(phoneNumberTextField);
		
		
		
		/*
		statusLabel = new JLabel("Status:");
		statusLabel.setBounds(20, 20, 75, 25);
		statusLabel.setFont(fontLabel);
		contactInformationPanel.add(statusLabel);
		
		statusComboBox = new JComboBox<Status>(status);
		statusComboBox.setBounds(120, 20, 200, 22);
		statusComboBox.setFont(fontTextField);
		contactInformationPanel.add(statusComboBox);*/
		
		
		
		/*
			
		// panel address
		JPanel panelAddress = new JPanel();
		panelAddress.setBounds(10, 190, 350, 120);
		panelAddress.setLayout(null);
		panelAddress.setFont(fontLabel);
		panelAddress.setBorder(BorderFactory.createTitledBorder("Address"));
		contentPanel.add(panelAddress);
		
		streetLabel = new JLabel("Street:");
		streetLabel.setBounds(10, 20, 75, 25);
		streetLabel.setFont(fontLabel);
		panelAddress.add(streetLabel);
		
		streetField = new JTextField();
		streetField.setBounds(90, 20, 200, 22);
		streetField.setFont(fontTextField);
		panelAddress.add(streetField);
		
		townLabel = new JLabel("Town:");
		townLabel.setBounds(10, 50, 75, 25);
		townLabel.setFont(fontLabel);
		panelAddress.add(townLabel);
		
		townField = new JTextField();
		townField.setBounds(90, 50, 200, 22);
		townField.setFont(fontTextField);
		panelAddress.add(townField);
		
		countyLabel = new JLabel("County:");
		countyLabel.setBounds(10, 80, 75, 25);
		countyLabel.setFont(fontLabel);
		panelAddress.add(countyLabel);
		
		countyField = new JTextField();
		countyField.setBounds(90, 80, 200, 22);
		countyField.setFont(fontTextField);
		panelAddress.add(countyField);
				
		
		// panel other details
		JPanel panelOtherDetails = new JPanel();
		panelOtherDetails.setBounds(10, 315, 350, 180);
		panelOtherDetails.setLayout(null);
		panelOtherDetails.setFont(fontLabel);
		panelOtherDetails.setBorder(BorderFactory.createTitledBorder("Other Details"));
		contentPanel.add(panelOtherDetails);		
		
		dobLabel = new JLabel("Date of birth:");
		dobLabel.setBounds(10, 20, 100, 25);
		dobLabel.setFont(fontLabel);
		panelOtherDetails.add(dobLabel);
		
		dateChooser  = new JDateChooser();
		dateChooser.setBounds(100, 20, 150, 22);
		panelOtherDetails.add(dateChooser);
		
		phoneLabel = new JLabel("Phone:");
		phoneLabel.setBounds(10, 50, 75, 25);
		phoneLabel.setFont(fontLabel);
		panelOtherDetails.add(phoneLabel);
		
		phoneField = new JTextField();
		phoneField.setBounds(90, 50, 200, 22);
		phoneField.setFont(fontTextField);
		panelOtherDetails.add(phoneField);
		
		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(10, 80, 75, 25);
		emailLabel.setFont(fontLabel);
		panelOtherDetails.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(90, 80, 200, 22);
		emailField.setFont(fontTextField);
		panelOtherDetails.add(emailField);
		
		//password
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 110, 75, 25);
		passwordLabel.setFont(fontLabel);
		panelOtherDetails.add(passwordLabel);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(90, 110, 200, 22);
		passwordField1.setFont(fontTextField);
		panelOtherDetails.add(passwordField1);
		
		//password confirmation
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 140, 75, 25);
		passwordLabel.setFont(fontLabel);
		panelOtherDetails.add(passwordLabel);
		
		passwordField2 = new JPasswordField();
		passwordField2.setBounds(90, 140, 200, 22);
		passwordField2.setFont(fontTextField);
		panelOtherDetails.add(passwordField2);
		
		// buttons
		submitButton = new JButton("Submit Details");
		submitButton.setBounds(50, 510, 120, 30);
		submitButton.setFont(fontButton);
		submitButton.addActionListener(new ButtonHandler());
		contentPanel.add(submitButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(200, 510, 120, 30);
		cancelButton.setFont(fontButton);
		cancelButton.addActionListener(new ButtonHandler());
		contentPanel.add(cancelButton);
		
		*/
		
	}
	
	public static void main(String[] abc){
		
		RegisterSwimmerFrame newFrame = new RegisterSwimmerFrame();
		newFrame.setVisible(true);
		
	}
	
	
}
