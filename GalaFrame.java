package aoop2_project;

import java.awt.Font;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





import aoop2_project.InternationalGala.TypeOfTiming;
import aoop2_project.Swimmer.Gender;
import aoop2_project.Swimmer.Status;

import com.toedter.calendar.JDateChooser;

public class GalaFrame {

	
		// all labels
		private JLabel enterDetailsLabel;
		private JLabel galaDateLabel;
		private JLabel galaCityLabel;
		private JLabel galaNameLabel;
		private JLabel galaCountryLabel;
		private JLabel galaPaymentLabel;
		private JLabel galaOrganiserNameLabel;
		private JLabel galaOrganiserPhoneNumberLabel;
		private JLabel poolAddressEmailLabel;
		private JLabel poolLengthLabel;
		private JLabel durationInDaysLabel;
		private JLabel typeOfTimingLabel;
		
		private String[] galaCities;
		
		// textfields and comboboxes
		private JTextField forenameTextField;
		private JTextField surnameTextField;
		private JDateChooser dateOfBirthChosen;
		private JComboBox<Gender> genderComboBox;
		private JComboBox<Status> statusComboBox;
		private JTextField phoneNumberTextField;
		private JTextField emailTextField;
		private JTextArea medicalConditionsTextArea;
		private JTextArea medicationTextArea;
		private JTextField nextOfKinNameTextField;
		private JTextField nextOfKinPhoneNumberTextField;
		private JComboBox<String> swimClubNameComboBox;
		private JComboBox<String> swimmerLevelComboBox;
		
		private JButton registerButton;
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
		private Status[] statuses = {Status.active, Status.inactive};
		private String[] swimClubs = {"Killarney Swimming Club", "Kingdom Masters Swimming Club", "AerLingus Swimming Club",
										"Cork Masters", "Dolphin Swimming Club", "Limerick Masters", "NAC"};
		private String[] swimmerLevel = {"Masters"};
	
	
	public GalaFrame(){
		createGalaFrame();
	}

	private void createGalaFrame() {
		
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
		
		emailTextField = new JTextField();
		emailTextField.setBounds(120, 50, 200, 22);
		emailTextField.setFont(fontTextField);
		contactInformationPanel.add(emailTextField);
		
		// panel for swimmer's health status
		JPanel healthInformationPanel = new JPanel();
		healthInformationPanel.setBounds(380, 60, 350, 90);
		healthInformationPanel.setLayout(null);
		healthInformationPanel.setFont(fontLabel);
		healthInformationPanel.setBorder(BorderFactory.createTitledBorder("Health status"));
		contentPanel.add(healthInformationPanel);
		
		medicalConditionsLabel = new JLabel("Medical conditions:");
		medicalConditionsLabel.setBounds(10, 20, 120, 25);
		medicalConditionsLabel.setFont(fontLabel);
		healthInformationPanel.add(medicalConditionsLabel);
				
		medicalConditionsTextArea = new JTextArea(2, 20);
		medicalConditionsTextArea.setBounds(140, 20, 190, 22);
		medicalConditionsTextArea.setFont(fontTextField);
		healthInformationPanel.add(medicalConditionsTextArea);
		
		medicationsLabel = new JLabel("Medication:");
		medicationsLabel.setBounds(10, 50, 75, 25);
		medicationsLabel.setFont(fontLabel);
		healthInformationPanel.add(medicationsLabel);
		
		medicationTextArea = new JTextArea(4, 20);
		medicationTextArea.setBounds(140, 50, 190, 22);
		medicationTextArea.setFont(fontTextField);
		healthInformationPanel.add(medicationTextArea);
		
		// panel for swimmer's next of kin information
		JPanel nextOfKinInformationPanel = new JPanel();
		nextOfKinInformationPanel.setBounds(380, 160, 350, 90);
		nextOfKinInformationPanel.setLayout(null);
		nextOfKinInformationPanel.setFont(fontLabel);
		nextOfKinInformationPanel.setBorder(BorderFactory.createTitledBorder("Next of kin"));
		contentPanel.add(nextOfKinInformationPanel);
		
		nextOfKinNameLabel = new JLabel("Name:");
		nextOfKinNameLabel.setBounds(10, 20, 120, 25);
		nextOfKinNameLabel.setFont(fontLabel);
		nextOfKinInformationPanel.add(nextOfKinNameLabel);
				
		nextOfKinNameTextField = new JTextField();
		nextOfKinNameTextField.setBounds(140, 20, 190, 22);
		nextOfKinNameTextField.setFont(fontTextField);
		nextOfKinInformationPanel.add(nextOfKinNameTextField);
		
		nextOfKinPhoneNumberLabel = new JLabel("Phone Number:");
		nextOfKinPhoneNumberLabel.setBounds(10, 50, 100, 25);
		nextOfKinPhoneNumberLabel.setFont(fontLabel);
		nextOfKinInformationPanel.add(nextOfKinPhoneNumberLabel);
		
		nextOfKinPhoneNumberTextField = new JTextField();
		nextOfKinPhoneNumberTextField.setBounds(140, 50, 190, 22);
		nextOfKinPhoneNumberTextField.setFont(fontTextField);
		nextOfKinInformationPanel.add(nextOfKinPhoneNumberTextField);
		
		
		// panel for swimmer's swim club information
		JPanel swimClubInformationPanel = new JPanel();
		swimClubInformationPanel.setBounds(380, 260, 350, 120);
		swimClubInformationPanel.setLayout(null);
		swimClubInformationPanel.setFont(fontLabel);
		swimClubInformationPanel.setBorder(BorderFactory.createTitledBorder("Swimming Club"));
		contentPanel.add(swimClubInformationPanel);
		
		swimClubNameLabel = new JLabel("Swimming Club:");
		swimClubNameLabel.setBounds(10, 20, 120, 25);
		swimClubNameLabel.setFont(fontLabel);
		swimClubInformationPanel.add(swimClubNameLabel);
		
		swimClubNameComboBox = new JComboBox<String>(swimClubs);
		swimClubNameComboBox.setBounds(140, 20, 200, 22);
		swimClubNameComboBox.setFont(fontTextField);
		swimClubInformationPanel.add(swimClubNameComboBox);
		
		statusLabel = new JLabel("Status:");
		statusLabel.setBounds(10, 50, 75, 25);
		statusLabel.setFont(fontLabel);
		swimClubInformationPanel.add(statusLabel);
		
		statusComboBox = new JComboBox<Status>(statuses);
		statusComboBox.setBounds(140, 50, 200, 22);
		statusComboBox.setFont(fontTextField);
		swimClubInformationPanel.add(statusComboBox);
		
		swimmerLevelLabel = new JLabel("Level:");
		swimmerLevelLabel.setBounds(10, 80, 75, 25);
		swimmerLevelLabel.setFont(fontLabel);
		swimClubInformationPanel.add(swimmerLevelLabel);
		
		swimmerLevelComboBox = new JComboBox<String>(swimmerLevel);
		swimmerLevelComboBox.setBounds(140, 80, 200, 22);
		swimmerLevelComboBox.setFont(fontTextField);
		swimClubInformationPanel.add(swimmerLevelComboBox);
		
		
		// buttons
		registerButton = new JButton("Register");
		registerButton.setBounds(40, 350, 100, 30);
		registerButton.setFont(fontButton);
		contentPanel.add(registerButton);
		RegisterSwimmerButtonHandler registerSwimmerButtonHandler = new RegisterSwimmerButtonHandler();
		registerButton.addActionListener(registerSwimmerButtonHandler);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(160, 350, 100, 30);
		cancelButton.setFont(fontButton);
		contentPanel.add(cancelButton);
		CancelRegistrationButtonHandler cancelRegistartionButtonHandler = new CancelRegistrationButtonHandler();
		cancelButton.addActionListener(cancelRegistartionButtonHandler);
		
	}
	
	
}
