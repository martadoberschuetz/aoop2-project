package project;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RegisterSwimmerFrame extends JFrame{

		// declare arraylist of swimmers
		ArrayList<Swimmer> swimmerArrayList;

		// declare frame measurements
		private static final int FRAME_WIDTH = 400;
		private static final int FRAME_HEIGHT = 600;
		private static final int FRAME_X_ORIGIN = 100;
		private static final int FRAME_Y_ORIGIN = 100;
		
		//declare panels
		private JPanel picturePanel;
		private JPanel dataEntryPanel;
		private JPanel buttonsPanel;
		
		// declare labels
		private JLabel forenameLabel;
		private JLabel surnameLabel;
		private JLabel dateOfBirthLabel;
		private JLabel genderLabel;
		private JLabel statusLabel;
		private JLabel phoneNumberLabel;
		private JLabel emailLabel;
		private JLabel medicalConditionsLabel;
		private JLabel medicationLabel;
		private JLabel nextOfKinNameLabel;
		private JLabel nextOfKinPhoneNumberLabel;
		private JLabel swimClubNameLabel;

		private JLabel image;

		// declare textfields
		private JTextField forenameTextField;
		private JTextField surnameTextField;
		private JTextField genderTextField;

		// declare buttons
		private JButton addButton;
		// private JButton clearButton
		
}
