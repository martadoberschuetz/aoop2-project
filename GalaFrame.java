package aoop2_project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class GalaFrame extends JFrame{

	
		// all labels
		private JLabel enterDetailsLabel;
		private JLabel galaDateLabel;
		private JLabel galaCityLabel;
		private JLabel galaNameLabel;
		private JLabel galaCountryLabel;
		private JLabel galaPaymentLabel;
		private JLabel galaOrganiserNameLabel;
		private JLabel galaOrganiserPhoneNumberLabel;
		private JLabel galaOrganiserEmailLabel;
		private JLabel poolAddressLabel;
		private JLabel poolLengthLabel;
		private JLabel durationInDaysLabel;
		private JLabel typeOfTimingLabel;

		
		// textfields and comboboxes
		private JDateChooser dateOfGalaChosen;
		private JComboBox<String> galaCityComboBox;
		private JTextField galaNameTextField;
		private JComboBox<String> galaCountryComboBox;
		private JTextField galaPaymentTextField;
		private JTextField galaOrganiserNameTextField;
		private JTextField galaOrganiserPhoneNumberTextField;
		private JTextField galaOrganiserEmailTextField;
		private JTextField poolAddressTextField;
		private JTextField poolLengthTextField;
		private JTextField durationInDaysTextField;
		private JComboBox<String> typeOfTimingTextField;
		
		private JButton addGalaButton;
		private JButton cancelButton;
		
		private JPanel contentPanel;	
		
		private JLabel nationalGalaLabel;
		private JLabel internationalGalaLabel;
		private JRadioButton nationalGalaButton;
		private JRadioButton internationalGalaButton;
		
		private ButtonGroup groupTwoButtons;
		
		private Font fontHeading = new Font("Verdana", Font.BOLD, 18);
		private Font fontSubHeading = new Font("Verdana", Font.BOLD, 16);
		private Font fontLabel = new Font("Verdana", Font.PLAIN, 12);
		private Font fontMenu = new Font("Verdana", Font.PLAIN, 12);
		private Font fontTextField = new Font("Verdana", Font.PLAIN, 11);
		private Font fontButton = new Font("Verdana", Font.PLAIN, 11);
		private Font fontChecks = new Font("Verdana", Font.PLAIN,13);
		
		
		private String[] galaCitiesArray = {"Killarney", "Tralee", "Limerick", "Dublin", "Cork",
											"Paris", "Eindhoven", "Montreal", "Berlin", "Boston"};
		
		private String[] galaCountriesArray = {"Ireland", "France", "Holland", "Canada", "Germany", "USA"};
		
		private String[] typesOfTimingArray = {"electronic", "manual"};
	
	
	public GalaFrame(){
		
		createGalaFrame();
	}
	
	public static void main(String[] abc){
		
		GalaFrame galaFrame = new GalaFrame();
		galaFrame.setVisible(true);
	}

	private void createGalaFrame() {
		
		contentPanel = new JPanel();
		contentPanel.setLayout(null);
		add(contentPanel);
		
		setLocation(50, 50);
		setSize(500, 600);
		setTitle("Add Gala");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		enterDetailsLabel = new JLabel("Please enter gala's details");
		enterDetailsLabel.setBounds(10, 10, 400, 25);
		enterDetailsLabel.setFont(fontSubHeading);
		contentPanel.add(enterDetailsLabel);
		
		// panel for gala's details
		
		
		nationalGalaButton = new JRadioButton("National Gala", true);
		nationalGalaButton.setBounds(20, 60, 120, 25);
		contentPanel.add(nationalGalaButton);
		
		internationalGalaButton = new JRadioButton("International Gala");
		internationalGalaButton.setBounds(150, 60, 150, 25);
		contentPanel.add(internationalGalaButton);
		internationalGalaButton = new JRadioButton();
		
		groupTwoButtons = new ButtonGroup();
		groupTwoButtons.add(nationalGalaButton);
		groupTwoButtons.add(internationalGalaButton); //doesnt work?
		
		galaDateLabel = new JLabel("Date:");
		galaDateLabel.setBounds(20, 100, 85, 25);
		galaDateLabel.setFont(fontLabel);
		contentPanel.add(galaDateLabel);
		
		dateOfGalaChosen = new JDateChooser();
		dateOfGalaChosen.setBounds(220, 100, 220, 22);
		dateOfGalaChosen.setFont(fontTextField);
		contentPanel.add(dateOfGalaChosen);
		
		galaCityLabel = new JLabel("City:");
		galaCityLabel.setBounds(20, 130, 110, 25);
		galaCityLabel.setFont(fontLabel);
		contentPanel.add(galaCityLabel);
		
		galaCityComboBox = new JComboBox<String>(galaCitiesArray);
		//galaCityComboBox.setBounds(190, y, width, height);
		
		galaNameLabel = new JLabel("Name:");
		galaNameLabel.setBounds(20, 160, 85, 25);
		galaNameLabel.setFont(fontLabel);
		contentPanel.add(galaNameLabel);	
		
		
		
		galaCountryLabel = new JLabel("Country:");
		galaCountryLabel.setBounds(20, 190, 85, 25);
		galaCountryLabel.setFont(fontLabel);
		contentPanel.add(galaCountryLabel);
		
		
		
		galaPaymentLabel = new JLabel("Payment:");
		galaPaymentLabel.setBounds(20, 220, 85, 25);
		galaPaymentLabel.setFont(fontLabel);
		contentPanel.add(galaPaymentLabel);
		
		
		galaOrganiserNameLabel = new JLabel("Gala Organiser's name:");
		galaOrganiserNameLabel.setBounds(20, 250, 160, 25);
		galaOrganiserNameLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserNameLabel);
		
		
		galaOrganiserPhoneNumberLabel = new JLabel("Gala Organiser's phone number:");
		galaOrganiserPhoneNumberLabel.setBounds(20, 280, 210, 25);
		galaOrganiserPhoneNumberLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserPhoneNumberLabel);
		
		
		
		galaOrganiserEmailLabel = new JLabel("Gala Organiser's email:");
		galaOrganiserEmailLabel.setBounds(20, 310, 160, 25);
		galaOrganiserEmailLabel.setFont(fontLabel);
		contentPanel.add(galaOrganiserEmailLabel);
		
		
		poolAddressLabel = new JLabel("Pool address:");
		poolAddressLabel.setBounds(20, 340, 160, 25);
		poolAddressLabel.setFont(fontLabel);
		contentPanel.add(poolAddressLabel);
		
		
		poolLengthLabel = new JLabel("Pool length:");
		poolLengthLabel.setBounds(20, 370, 160, 25);
		poolLengthLabel.setFont(fontLabel);
		contentPanel.add(poolLengthLabel);
		
		
		durationInDaysLabel = new JLabel("Duration in days:");
		durationInDaysLabel.setBounds(20, 400, 160, 25);
		durationInDaysLabel.setFont(fontLabel);
		contentPanel.add(durationInDaysLabel);
		
		
		typeOfTimingLabel = new JLabel("Type of timing:");
		typeOfTimingLabel.setBounds(20, 430, 160, 25);
		typeOfTimingLabel.setFont(fontLabel);
		contentPanel.add(typeOfTimingLabel);
		
		// buttons
		addGalaButton = new JButton("Add");
		addGalaButton.setBounds(40, 500, 100, 30);
		addGalaButton.setFont(fontButton);
		contentPanel.add(addGalaButton);
		AddGalaButtonHandler registerSwimmerButtonHandler = new AddGalaButtonHandler();
		addGalaButton.addActionListener(registerSwimmerButtonHandler);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(160, 500, 100, 30);
		cancelButton.setFont(fontButton);
		contentPanel.add(cancelButton);
		CancelAddGalaButtonHandler cancelRegistartionButtonHandler = new CancelAddGalaButtonHandler();
		cancelButton.addActionListener(cancelRegistartionButtonHandler);
		
	}
	
	public class AddGalaButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	public class CancelAddGalaButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
}
