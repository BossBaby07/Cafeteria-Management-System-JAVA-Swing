package cafeteriaMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.*;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Cafeteria {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	
	
	double t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0, t9 = 0, t10 = 0,
			t11 = 0, t12 = 0, t13 = 0, t14 = 0, t15 = 0, t16 = 0, t17 = 0, t18 = 0, t19 = 0, t20 = 0, t21 = 0,
					t22 = 0, t23 = 0, t24 = 0, t25 = 0, t26 = 0, t27 = 0, t28 = 0, t29 = 0, t30 = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafeteria window = new Cafeteria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cafeteria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1366, 890);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 8));
		panel.setBounds(22, 123, 437, 392);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Chicken Burger");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 21, 147, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblBeefBurger = new JLabel("Beef Burger");
		lblBeefBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBeefBurger.setBounds(10, 54, 139, 22);
		panel.add(lblBeefBurger);
		
		JLabel lblGrilledCheeseSandwich = new JLabel("Grilled Cheese Sandwich");
		lblGrilledCheeseSandwich.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGrilledCheeseSandwich.setBounds(10, 87, 234, 22);
		panel.add(lblGrilledCheeseSandwich);
		
		JLabel lblSubSandwich = new JLabel("Sub Sandwich");
		lblSubSandwich.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubSandwich.setBounds(10, 120, 139, 22);
		panel.add(lblSubSandwich);
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPizza.setBounds(10, 153, 139, 22);
		panel.add(lblPizza);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPasta.setBounds(10, 186, 139, 22);
		panel.add(lblPasta);
		
		JLabel lblBakedPasta = new JLabel("Baked Pasta");
		lblBakedPasta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBakedPasta.setBounds(10, 219, 139, 22);
		panel.add(lblBakedPasta);
		
		JLabel lblNachos = new JLabel("Nachos");
		lblNachos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNachos.setBounds(10, 252, 139, 22);
		panel.add(lblNachos);
		
		JLabel lblSamosa = new JLabel("Samosa");
		lblSamosa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSamosa.setBounds(10, 285, 139, 22);
		panel.add(lblSamosa);
		
		JLabel lblKachori = new JLabel("Kachori");
		lblKachori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKachori.setBounds(10, 318, 139, 22);
		panel.add(lblKachori);
		
		JLabel lblPakora = new JLabel("Pakora");
		lblPakora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPakora.setBounds(10, 351, 139, 22);
		panel.add(lblPakora);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(291, 21, 120, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(291, 54, 120, 29);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(291, 87, 120, 29);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(291, 120, 120, 29);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(291, 153, 120, 29);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(291, 186, 120, 29);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(291, 219, 120, 29);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(291, 252, 120, 29);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(291, 285, 120, 29);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(291, 318, 120, 29);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(291, 351, 120, 29);
		panel.add(textField_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.GRAY, 8));
		panel_1.setBounds(469, 123, 252, 158);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblButterNaan = new JLabel("Butter Naan");
		lblButterNaan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblButterNaan.setBounds(10, 28, 147, 29);
		panel_1.add(lblButterNaan);
		
		JLabel lblGarlicNaan = new JLabel("Garlic Naan");
		lblGarlicNaan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGarlicNaan.setBounds(10, 68, 147, 29);
		panel_1.add(lblGarlicNaan);
		
		JLabel lblBakarKhani = new JLabel("Bakar Khani");
		lblBakarKhani.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBakarKhani.setBounds(10, 108, 147, 29);
		panel_1.add(lblBakarKhani);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(153, 28, 89, 29);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(153, 68, 89, 29);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_14.setColumns(10);
		textField_14.setBounds(153, 108, 89, 29);
		panel_1.add(textField_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.GRAY, 8));
		panel_2.setBounds(22, 526, 437, 215);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfDrinks.setBounds(20, 32, 147, 29);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfMeal.setBounds(20, 72, 147, 29);
		panel_2.add(lblCostOfMeal);
		
		JLabel costOfDrinks = new JLabel("");
		costOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		costOfDrinks.setBounds(223, 32, 183, 29);
		costOfDrinks.setBorder(new LineBorder(Color.BLACK, 2));
		panel_2.add(costOfDrinks);
		
		JLabel costOfMeal = new JLabel("0 tk");
		costOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		costOfMeal.setBorder(new LineBorder(Color.BLACK, 2));
		costOfMeal.setBounds(223, 72, 183, 29);
		panel_2.add(costOfMeal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.GRAY, 8));
		panel_3.setBounds(469, 526, 252, 215);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(10, 26, 95, 29);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubTotal.setBounds(10, 66, 95, 29);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(10, 115, 95, 29);
		panel_3.add(lblTotal);
		
		JLabel tax = new JLabel("");
		tax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tax.setBorder(new LineBorder(Color.BLACK, 2));
		tax.setBounds(115, 26, 127, 29);
		panel_3.add(tax);
		
		JLabel subTotal = new JLabel("");
		subTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subTotal.setBorder(new LineBorder(Color.BLACK, 2));
		subTotal.setBounds(115, 66, 127, 29);
		panel_3.add(subTotal);
		
		JLabel total = new JLabel("");
		total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		total.setBorder(new LineBorder(Color.BLACK, 2));
		total.setBounds(115, 115, 127, 29);
		panel_3.add(total);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(994, 123, 346, 618);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 26, 326, 581);
		panel_4.add(tabbedPane);
		
		JPanel panel_13 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_13, null);
		panel_13.setLayout(null);
		
		JTextPane txtReceipt = new JTextPane();
		txtReceipt.setBounds(10, 11, 301, 542);
		panel_13.add(txtReceipt);
		
		JPanel panel_10 = new JPanel();
		tabbedPane.addTab("Price List", null, panel_10, null);
		panel_10.setLayout(null);
		
		JTextPane txtpnChickenBurger = new JTextPane();
		txtpnChickenBurger.setText("Chicken Burger : 150 tk\r\nBeef Burger : 130 tk\r\nGarllic Cheese Sandwich : 140 tk\r\nSub Sandwich : 130 tk\r\nPizza : 500 tk\r\nPasta : 180 tk\r\nBaked Pasta : 280 tk\r\nNachos : 150 tk\r\nSamosa per piece : 10 tk\r\nKachori per piece : 10 tk\r\nPakora per piece : 5 tk\r\nButter Naan : 30 tk\r\nGarlic Naan : 25 tk\r\nBakor Khani : 15 tk\r\nGrilled Chicken : 90 tk\r\nKebab : 110 tk\r\nTandoori : 140 tk\r\nFried Rice : 65 tk\r\nWhite Rice : 35 tk\r\nKacchi Briyani : 150 tk\r\nKhichuri : 60 tk\r\nBeef : 80 tk\r\nChicken Curry : 85 tk\r\nVegetable : 50 tk\r\nDal Fry : 50 tk\r\nTea : 10 tk\r\nCoffee : 20 tk\r\nCold Coffee : 60 tk\r\nCoke : 20 tk\r\nJuice : 50 tk");
		txtpnChickenBurger.setBounds(10, 11, 301, 531);
		panel_10.add(txtpnChickenBurger);
		
		JPanel panel_12 = new JPanel();
		tabbedPane.addTab("User Manul", null, panel_12, null);
		panel_12.setLayout(null);
		
		JTextPane txtpnTextField = new JTextPane();
		txtpnTextField.setText("Text Field : write quantity of meal.\r\n\r\nButton Total : to see the total cost.\r\n\r\nButton Receipt : to see the receipt.\r\n\r\nButton Reset : to make every text field null.\r\n\r\nImportant : Create a folder in the (E:/) drive and must give a name \"Cafeteria Management System Billing Document\" \r\n\r\nThanks!\r\n\r\nButton Exit : Exit from the Application.");
		txtpnTextField.setBounds(10, 11, 301, 531);
		panel_12.add(txtpnTextField);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(22, 752, 1318, 88);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		//============================================ Total Bill Count ========================================================
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_1.getText().isEmpty()) {
					t1 = 0;		
				}else {
					t1 = Double.parseDouble(textField_1.getText());
				}
				
				double cBurger = t1;
				double pBurger = 150.0;
				double tcBurger = cBurger*pBurger;
				
				if(textField_2.getText().isEmpty()) {
					t2 = 0;		
				}else {
					t2 = Double.parseDouble(textField_2.getText());
				}
				
				double bBurger = t2;
				double pbBurger = 130.0;
				double tbBurger = bBurger*pbBurger;
				
				if(textField_3.getText().isEmpty()) {
					t3 = 0;		
				}else {
					t3 = Double.parseDouble(textField_3.getText());
				}
				
				double gSandwich = t3;
				double pSandwich = 140.0;
				double tSandwich = gSandwich*pSandwich;
				
				if(textField_4.getText().isEmpty()) {
					t4 = 0;		
				}else {
					t4 = Double.parseDouble(textField_4.getText());
				}
				
				double subSandwich = t4;
				double pSub = 130.0;
				double tSubSandwich = subSandwich*pSub;
				
				if(textField_5.getText().isEmpty()) {
					t5 = 0;		
				}else {
					t5 = Double.parseDouble(textField_5.getText());
				}
				
				
				double pizza = t5;
				double pPizza = 500;
				double tPizza = pizza*pPizza;
				
				if(textField_6.getText().isEmpty()) {
					t6 = 0;		
				}else {
					t6 = Double.parseDouble(textField_6.getText());
				}
				
				double pasta = t6;
				double pPasta = 180.0;
				double tPasta = pasta*pPasta;
				
				if(textField_7.getText().isEmpty()) {
					t7 = 0;		
				}else {
					t7 = Double.parseDouble(textField_7.getText());
				}
				
				double bPasta = t7;
				double pbPasta = 280.0;
				double tbPasta = bPasta*pbPasta;
				
				if(textField_8.getText().isEmpty()) {
					t8 = 0;		
				}else {
					t8 = Double.parseDouble(textField_8.getText());
				}
				
				double nachos = t8;
				double pNachos = 150.0;
				double tNachos = nachos*pNachos;
				
				if(textField_9.getText().isEmpty()) {
					t9 = 0;		
				}else {
					t9 = Double.parseDouble(textField_9.getText());
				}
				
				double samosa = t9;
				double pSamosa = 10.0;
				double tSamosa = samosa*pSamosa;
				
				if(textField_10.getText().isEmpty()) {
					t10 = 0;		
				}else {
					t10 = Double.parseDouble(textField_10.getText());
				}
				
				double kachori = t10;
				double pKachori = 10.0;
				double tKachori = kachori*pKachori;
				
				if(textField_11.getText().isEmpty()) {
					t11 = 0;		
				}else {
					t11 = Double.parseDouble(textField_11.getText());
				}
				
				double pakora = t11;
				double pPakora = 5.0;
				double tPakora = pakora*pPakora;
				
				if(textField_12.getText().isEmpty()) {
					t12 = 0;		
				}else {
					t12 = Double.parseDouble(textField_12.getText());
				}
				
				double naan = t12;
				double pNaan = 30.0;
				double tNaan = naan*pNaan;
				
				if(textField_13.getText().isEmpty()) {
					t13 = 0;		
				}else {
					t13 = Double.parseDouble(textField_13.getText());
				}
				
				double gNaan = t13;
				double pgNaan = 25.0;
				double tgNaan = gNaan*pgNaan;
				
				if(textField_14.getText().isEmpty()) {
					t14 = 0;		
				}else {
					t14 = Double.parseDouble(textField_14.getText());
				}
				
				double bakarKhani = t14;
				double pKhani = 15.0;
				double tBakarKhani = bakarKhani*pKhani;
				
				if(textField_15.getText().isEmpty()) {
					t15 = 0;		
				}else {
					t15 = Double.parseDouble(textField_15.getText());
				}
				
				double grilledChicken = t15;
				double pGrilledChicken = 90.0;
				double tGrilledChicken = grilledChicken*pGrilledChicken;
				
				if(textField_16.getText().isEmpty()) {
					t16 = 0;		
				}else {
					t16 = Double.parseDouble(textField_16.getText());
				}
				
				double kebab = t16;
				double pKebab = 110.0;
				double tKebab = kebab*pKebab;
				
				if(textField_17.getText().isEmpty()) {
					t17 = 0;		
				}else {
					t17 = Double.parseDouble(textField_17.getText());
				}
				
				double tandoori = t17;
				double pTandoori = 140.0;
				double tTandoori = tandoori*pTandoori;
				
				if(textField_18.getText().isEmpty()) {
					t18 = 0;		
				}else {
					t18 = Double.parseDouble(textField_18.getText());
				}
				
				double friedRice = t18;
				double pFriedRice = 65.0;
				double tFriedRice = friedRice*pFriedRice;
				
				if(textField_19.getText().isEmpty()) {
					t19 = 0;		
				}else {
					t19 = Double.parseDouble(textField_19.getText());
				}
				
				double whiteRice = t19;
				double pWhiteRice = 35.0;
				double tWhiteRice = whiteRice*pWhiteRice;
				
				if(textField_20.getText().isEmpty()) {
					t20 = 0;		
				}else {
					t20 = Double.parseDouble(textField_20.getText());
				}
				
				double briyani = t20;
				double pBriyani = 150.0;
				double tBriyani = briyani*pBriyani;
				
				if(textField_21.getText().isEmpty()) {
					t21 = 0;		
				}else {
					t21 = Double.parseDouble(textField_21.getText());
				}
				
				double khichuri = t21;
				double pKhichuri = 60.0;
				double tKhichuri = khichuri*pKhichuri;
				
				if(textField_22.getText().isEmpty()) {
					t22 = 0;		
				}else {
					t22 = Double.parseDouble(textField_22.getText());
				}
				
				double beef = t22;
				double pBeef = 80.0;
				double tBeef = beef*pBeef;
				
				if(textField_23.getText().isEmpty()) {
					t23 = 0;		
				}else {
					t23 = Double.parseDouble(textField_23.getText());
				}
				
				double chickenCurry = t23;
				double pChickenCurry = 85.0;
				double tChickenCurry = chickenCurry*pChickenCurry;
				
				if(textField_24.getText().isEmpty()) {
					t24 = 0;		
				}else {
					t24 = Double.parseDouble(textField_24.getText());
				}
				
				double vegetable = t24;
				double pVegetable = 50.0;
				double tVegetable = vegetable*pVegetable;
				
				if(textField_25.getText().isEmpty()) {
					t25 = 0;		
				}else {
					t25 = Double.parseDouble(textField_25.getText());
				}
				
				double dal = t25;
				double pDal = 50.0;
				double tDal = dal*pDal;
				
				String pMeal = String.format("%.2f", tcBurger+tbBurger+tSandwich+tSubSandwich+tPizza+tPasta+tbPasta+tNachos+tSamosa+tKachori+
						                             tPakora+tNaan+tgNaan+tBakarKhani+tGrilledChicken+tKebab+tTandoori+tFriedRice+tWhiteRice+
						                             tBriyani+tKhichuri+tBeef+tChickenCurry+tVegetable+tDal);
				
				costOfMeal.setText(pMeal+" tk");
				
				
				if(textField_26.getText().isEmpty()) {
					t26 = 0;		
				}else {
					t26 = Double.parseDouble(textField_26.getText());
				}
				
				
				double tea = t26;
				double pTea = 10.0;
				double tTea = tea*pTea;
				
				if(textField_27.getText().isEmpty()) {
					t27 = 0;		
				}else {
					t27 = Double.parseDouble(textField_27.getText());
				}
				
				double coffee = t27;
				double pCoffee = 20.0;
				double tCoffee = coffee*pCoffee;
				
				if(textField_28.getText().isEmpty()) {
					t28 = 0;		
				}else {
					t28 = Double.parseDouble(textField_28.getText());
				}
				
				double coldCoffee = t28;
				double pColdCoffee = 60.0;
				double tColdCoffee = coldCoffee*pColdCoffee;
				
				if(textField_29.getText().isEmpty()) {
					t29 = 0;		
				}else {
					t29 = Double.parseDouble(textField_29.getText());
				}
				
				double coke = t29;
				double pCoke = 20.0;
				double tCoke = coke*pCoke;
				
				if(textField_30.getText().isEmpty()) {
					t30 = 0;		
				}else {
					t30 = Double.parseDouble(textField_30.getText());
				}
				
				double juice = t30;
				double pJuice = 50.0;
				double tJuice = juice*pJuice;
				
				String pDrinks = String.format("%.2f", tTea+tCoffee+tColdCoffee+tCoke+tJuice);
				
				costOfDrinks.setText(pDrinks+" tk");
				
				double pSubTotal = (tcBurger+tbBurger+tSandwich+tSubSandwich+tPizza+tPasta+tbPasta+tNachos+tSamosa+tKachori+
                        tPakora+tNaan+tgNaan+tBakarKhani+tGrilledChicken+tKebab+tTandoori+tFriedRice+tWhiteRice+
                        tBriyani+tKhichuri+tBeef+tChickenCurry+tVegetable+tDal+tTea+tCoffee+tColdCoffee+tCoke+tJuice);
				
				double pTax = pSubTotal*(0.15);
				
				double pTotal = pSubTotal+pTax;
				
				tax.setText(String.format("%.2f tk", pTax));
				
				subTotal.setText(String.format("%.2f tk", pSubTotal));
				
				total.setText(String.format("%.2f tk", pTotal));
			}
		});
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setBackground(new Color(0, 255, 255));
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTotal.setBounds(98, 23, 140, 43);
		panel_5.add(btnTotal);
		
		//=========================================== Reset Button ===================================================
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				textField_15.setText(null);
				textField_16.setText(null);
				textField_17.setText(null);
				textField_18.setText(null);
				textField_19.setText(null);
				textField_20.setText(null);
				textField_21.setText(null);
				textField_22.setText(null);
				textField_23.setText(null);
				textField_24.setText(null);
				textField_25.setText(null);
				textField_26.setText(null);
				textField_27.setText(null);
				textField_28.setText(null);
				textField_29.setText(null);
				textField_30.setText(null);
				
				costOfDrinks.setText(null);
				costOfMeal.setText("0 Tk");
				
				tax.setText(null);
				subTotal.setText(null);
				total.setText(null);
				
				txtReceipt.setText(null);
				
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBackground(new Color(255, 255, 0));
		btnReset.setBounds(563, 23, 140, 43);
		panel_5.add(btnReset);
		
		//======================================== Exit Button ===============================================
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(1062, 23, 140, 43);
		panel_5.add(btnExit);
		
		//============================================ Receipt Button ===========================================
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_1.getText().isEmpty()) {
					t1 = 0;		
				}else {
					t1 = Double.parseDouble(textField_1.getText());
				}
				
				double cBurger = t1;
				double pBurger = 150.0;
				double tcBurger = cBurger*pBurger;
				
				if(textField_2.getText().isEmpty()) {
					t2 = 0;		
				}else {
					t2 = Double.parseDouble(textField_2.getText());
				}
				
				double bBurger = t2;
				double pbBurger = 130.0;
				double tbBurger = bBurger*pbBurger;
				
				if(textField_3.getText().isEmpty()) {
					t3 = 0;		
				}else {
					t3 = Double.parseDouble(textField_3.getText());
				}
				
				double gSandwich = t3;
				double pSandwich = 140.0;
				double tSandwich = gSandwich*pSandwich;
				
				if(textField_4.getText().isEmpty()) {
					t4 = 0;		
				}else {
					t4 = Double.parseDouble(textField_4.getText());
				}
				
				double subSandwich = t4;
				double pSub = 130.0;
				double tSubSandwich = subSandwich*pSub;
				
				if(textField_5.getText().isEmpty()) {
					t5 = 0;		
				}else {
					t5 = Double.parseDouble(textField_5.getText());
				}
				
				
				double pizza = t5;
				double pPizza = 500;
				double tPizza = pizza*pPizza;
				
				if(textField_6.getText().isEmpty()) {
					t6 = 0;		
				}else {
					t6 = Double.parseDouble(textField_6.getText());
				}
				
				double pasta = t6;
				double pPasta = 180.0;
				double tPasta = pasta*pPasta;
				
				if(textField_7.getText().isEmpty()) {
					t7 = 0;		
				}else {
					t7 = Double.parseDouble(textField_7.getText());
				}
				
				double bPasta = t7;
				double pbPasta = 280.0;
				double tbPasta = bPasta*pbPasta;
				
				if(textField_8.getText().isEmpty()) {
					t8 = 0;		
				}else {
					t8 = Double.parseDouble(textField_8.getText());
				}
				
				double nachos = t8;
				double pNachos = 150.0;
				double tNachos = nachos*pNachos;
				
				if(textField_9.getText().isEmpty()) {
					t9 = 0;		
				}else {
					t9 = Double.parseDouble(textField_9.getText());
				}
				
				double samosa = t9;
				double pSamosa = 10.0;
				double tSamosa = samosa*pSamosa;
				
				if(textField_10.getText().isEmpty()) {
					t10 = 0;		
				}else {
					t10 = Double.parseDouble(textField_10.getText());
				}
				
				double kachori = t10;
				double pKachori = 10.0;
				double tKachori = kachori*pKachori;
				
				if(textField_11.getText().isEmpty()) {
					t11 = 0;		
				}else {
					t11 = Double.parseDouble(textField_11.getText());
				}
				
				double pakora = t11;
				double pPakora = 5.0;
				double tPakora = pakora*pPakora;
				
				if(textField_12.getText().isEmpty()) {
					t12 = 0;		
				}else {
					t12 = Double.parseDouble(textField_12.getText());
				}
				
				double naan = t12;
				double pNaan = 30.0;
				double tNaan = naan*pNaan;
				
				if(textField_13.getText().isEmpty()) {
					t13 = 0;		
				}else {
					t13 = Double.parseDouble(textField_13.getText());
				}
				
				double gNaan = t13;
				double pgNaan = 25.0;
				double tgNaan = gNaan*pgNaan;
				
				if(textField_14.getText().isEmpty()) {
					t14 = 0;		
				}else {
					t14 = Double.parseDouble(textField_14.getText());
				}
				
				double bakarKhani = t14;
				double pKhani = 15.0;
				double tBakarKhani = bakarKhani*pKhani;
				
				if(textField_15.getText().isEmpty()) {
					t15 = 0;		
				}else {
					t15 = Double.parseDouble(textField_15.getText());
				}
				
				double grilledChicken = t15;
				double pGrilledChicken = 90.0;
				double tGrilledChicken = grilledChicken*pGrilledChicken;
				
				if(textField_16.getText().isEmpty()) {
					t16 = 0;		
				}else {
					t16 = Double.parseDouble(textField_16.getText());
				}
				
				double kebab = t16;
				double pKebab = 110.0;
				double tKebab = kebab*pKebab;
				
				if(textField_17.getText().isEmpty()) {
					t17 = 0;		
				}else {
					t17 = Double.parseDouble(textField_17.getText());
				}
				
				double tandoori = t17;
				double pTandoori = 140.0;
				double tTandoori = tandoori*pTandoori;
				
				if(textField_18.getText().isEmpty()) {
					t18 = 0;		
				}else {
					t18 = Double.parseDouble(textField_18.getText());
				}
				
				double friedRice = t18;
				double pFriedRice = 65.0;
				double tFriedRice = friedRice*pFriedRice;
				
				if(textField_19.getText().isEmpty()) {
					t19 = 0;		
				}else {
					t19 = Double.parseDouble(textField_19.getText());
				}
				
				double whiteRice = t19;
				double pWhiteRice = 35.0;
				double tWhiteRice = whiteRice*pWhiteRice;
				
				if(textField_20.getText().isEmpty()) {
					t20 = 0;		
				}else {
					t20 = Double.parseDouble(textField_20.getText());
				}
				
				double briyani = t20;
				double pBriyani = 150.0;
				double tBriyani = briyani*pBriyani;
				
				if(textField_21.getText().isEmpty()) {
					t21 = 0;		
				}else {
					t21 = Double.parseDouble(textField_21.getText());
				}
				
				double khichuri = t21;
				double pKhichuri = 60.0;
				double tKhichuri = khichuri*pKhichuri;
				
				if(textField_22.getText().isEmpty()) {
					t22 = 0;		
				}else {
					t22 = Double.parseDouble(textField_22.getText());
				}
				
				double beef = t22;
				double pBeef = 80.0;
				double tBeef = beef*pBeef;
				
				if(textField_23.getText().isEmpty()) {
					t23 = 0;		
				}else {
					t23 = Double.parseDouble(textField_23.getText());
				}
				
				double chickenCurry = t23;
				double pChickenCurry = 85.0;
				double tChickenCurry = chickenCurry*pChickenCurry;
				
				if(textField_24.getText().isEmpty()) {
					t24 = 0;		
				}else {
					t24 = Double.parseDouble(textField_24.getText());
				}
				
				double vegetable = t24;
				double pVegetable = 50.0;
				double tVegetable = vegetable*pVegetable;
				
				if(textField_25.getText().isEmpty()) {
					t25 = 0;		
				}else {
					t25 = Double.parseDouble(textField_25.getText());
				}
				
				double dal = t25;
				double pDal = 50.0;
				double tDal = dal*pDal;
				
				String pMeal = String.format("%.2f", tcBurger+tbBurger+tSandwich+tSubSandwich+tPizza+tPasta+tbPasta+tNachos+tSamosa+tKachori+
						                             tPakora+tNaan+tgNaan+tBakarKhani+tGrilledChicken+tKebab+tTandoori+tFriedRice+tWhiteRice+
						                             tBriyani+tKhichuri+tBeef+tChickenCurry+tVegetable+tDal);
				
				
				if(textField_26.getText().isEmpty()) {
					t26 = 0;		
				}else {
					t26 = Double.parseDouble(textField_26.getText());
				}
				
				
				double tea = t26;
				double pTea = 10.0;
				double tTea = tea*pTea;
				
				if(textField_27.getText().isEmpty()) {
					t27 = 0;		
				}else {
					t27 = Double.parseDouble(textField_27.getText());
				}
				
				double coffee = t27;
				double pCoffee = 20.0;
				double tCoffee = coffee*pCoffee;
				
				if(textField_28.getText().isEmpty()) {
					t28 = 0;		
				}else {
					t28 = Double.parseDouble(textField_28.getText());
				}
				
				double coldCoffee = t28;
				double pColdCoffee = 60.0;
				double tColdCoffee = coldCoffee*pColdCoffee;
				
				if(textField_29.getText().isEmpty()) {
					t29 = 0;		
				}else {
					t29 = Double.parseDouble(textField_29.getText());
				}
				
				double coke = t29;
				double pCoke = 20.0;
				double tCoke = coke*pCoke;
				
				if(textField_30.getText().isEmpty()) {
					t30 = 0;		
				}else {
					t30 = Double.parseDouble(textField_30.getText());
				}
				
				double juice = t30;
				double pJuice = 50.0;
				double tJuice = juice*pJuice;
				
				String pDrinks = String.format("%.2f", tTea+tCoffee+tColdCoffee+tCoke+tJuice);
				
				double pSubTotal = (tcBurger+tbBurger+tSandwich+tSubSandwich+tPizza+tPasta+tbPasta+tNachos+tSamosa+tKachori+
                        tPakora+tNaan+tgNaan+tBakarKhani+tGrilledChicken+tKebab+tTandoori+tFriedRice+tWhiteRice+
                        tBriyani+tKhichuri+tBeef+tChickenCurry+tVegetable+tDal+tTea+tCoffee+tColdCoffee+tCoke+tJuice);
				
				double pTax = pSubTotal*(0.15);
				
				double pTotal = pSubTotal+pTax;
				
				txtReceipt.setText("\tTotal Bill\n\n" + "Meal:\t\t" + pMeal + " tk" + "\nDrinks:\t\t" + 
				                   pDrinks + " tk" + "\n------------------------------------------------------" + 
						           "\n\nSub Total:\t\t" + pSubTotal + " tk" + "\nTax:\t\t" + pTax + 
						           " tk" + "\n================================" + 
						           "\n\nTotal:\t\t" + pTotal + " tk");
				
			}
		});
		btnReceipt.setForeground(Color.BLACK);
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReceipt.setBackground(new Color(124, 252, 0));
		btnReceipt.setBounds(322, 23, 140, 43);
		panel_5.add(btnReceipt);
		
		//============================================== Print Button =========================================
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				FileWriter fileWriter;
				
				try {
					fileWriter = new FileWriter("E:/Cafeteria Management System Billing Document/Total Bill.txt");
					fileWriter.write(txtReceipt.getText());
					fileWriter.close();
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex+"\nPlease Create a Folder in the E: Drive. "+" Name : Cafeteria Management System Billing Document"+"\nThanks!");
				}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBackground(new Color(135, 206, 235));
		btnPrint.setBounds(810, 23, 140, 43);
		panel_5.add(btnPrint);
		
		//================================================= Print Button Work End ========================================
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(Color.BLACK);
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBorder(new LineBorder(new Color(255, 140, 0), 8));
		panel_6.setBounds(22, 11, 1318, 101);
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SADI\\eclipse-workspace\\CafeteriaManagementSystem\\image\\cafelogo.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 8));
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(" Cafeteria Management System ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new LineBorder(Color.LIGHT_GRAY, 8));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel_6.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\SADI\\eclipse-workspace\\CafeteriaManagementSystem\\image\\cafelogo.png"));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.WHITE);
		label.setBorder(new LineBorder(Color.LIGHT_GRAY, 8));
		panel_6.add(label);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.GRAY, 8));
		panel_7.setBounds(732, 123, 252, 158);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblGrilledChicken = new JLabel("Grilled Chicken");
		lblGrilledChicken.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGrilledChicken.setBounds(10, 21, 147, 29);
		panel_7.add(lblGrilledChicken);
		
		JLabel lblKebab = new JLabel("Kebab");
		lblKebab.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKebab.setBounds(10, 61, 147, 29);
		panel_7.add(lblKebab);
		
		JLabel lblTandoori = new JLabel("Tandoori");
		lblTandoori.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTandoori.setBounds(10, 101, 147, 29);
		panel_7.add(lblTandoori);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_15.setColumns(10);
		textField_15.setBounds(153, 21, 89, 29);
		panel_7.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_16.setColumns(10);
		textField_16.setBounds(153, 61, 89, 29);
		panel_7.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_17.setColumns(10);
		textField_17.setBounds(153, 101, 89, 29);
		panel_7.add(textField_17);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(Color.GRAY, 8));
		panel_8.setBounds(469, 296, 252, 219);
		frame.getContentPane().add(panel_8);
		
		JLabel lblFriedRice = new JLabel("Fried Rice");
		lblFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFriedRice.setBounds(10, 28, 147, 29);
		panel_8.add(lblFriedRice);
		
		JLabel lblWhiteRice = new JLabel("White Rice");
		lblWhiteRice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWhiteRice.setBounds(10, 68, 147, 29);
		panel_8.add(lblWhiteRice);
		
		JLabel lblKacchiBriyani = new JLabel("Kacchi Briyani");
		lblKacchiBriyani.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKacchiBriyani.setBounds(10, 108, 147, 29);
		panel_8.add(lblKacchiBriyani);
		
		JLabel lblKhichuri = new JLabel("Khichuri");
		lblKhichuri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKhichuri.setBounds(10, 148, 147, 29);
		panel_8.add(lblKhichuri);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_18.setColumns(10);
		textField_18.setBounds(153, 28, 89, 29);
		panel_8.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_19.setColumns(10);
		textField_19.setBounds(153, 68, 89, 29);
		panel_8.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(153, 108, 89, 29);
		panel_8.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(153, 148, 89, 29);
		panel_8.add(textField_21);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(Color.GRAY, 8));
		panel_9.setBounds(732, 296, 252, 219);
		frame.getContentPane().add(panel_9);
		
		JLabel lblBeef = new JLabel("Beef");
		lblBeef.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBeef.setBounds(10, 28, 147, 29);
		panel_9.add(lblBeef);
		
		JLabel lblChicken = new JLabel("Chicken Curry");
		lblChicken.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChicken.setBounds(10, 68, 147, 29);
		panel_9.add(lblChicken);
		
		JLabel lblVegetable = new JLabel("Vegetable");
		lblVegetable.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVegetable.setBounds(10, 108, 147, 29);
		panel_9.add(lblVegetable);
		
		JLabel lblDalFry = new JLabel("Dal Fry");
		lblDalFry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDalFry.setBounds(10, 148, 147, 29);
		panel_9.add(lblDalFry);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(153, 28, 89, 29);
		panel_9.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(153, 68, 89, 29);
		panel_9.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_24.setColumns(10);
		textField_24.setBounds(153, 108, 89, 29);
		panel_9.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_25.setColumns(10);
		textField_25.setBounds(153, 148, 89, 29);
		panel_9.add(textField_25);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(Color.GRAY, 8));
		panel_11.setBounds(731, 526, 252, 215);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTea.setBounds(10, 11, 117, 29);
		panel_11.add(lblTea);
		
		JLabel lblCofee = new JLabel("Coffee");
		lblCofee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCofee.setBounds(10, 51, 117, 29);
		panel_11.add(lblCofee);
		
		JLabel lblColdCoffee = new JLabel("Cold Coffee");
		lblColdCoffee.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblColdCoffee.setBounds(10, 91, 117, 29);
		panel_11.add(lblColdCoffee);
		
		JLabel lblCoke = new JLabel("Coke");
		lblCoke.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCoke.setBounds(10, 131, 117, 29);
		panel_11.add(lblCoke);
		
		JLabel lblJuice = new JLabel("Juice");
		lblJuice.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJuice.setBounds(10, 175, 117, 29);
		panel_11.add(lblJuice);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_26.setColumns(10);
		textField_26.setBounds(153, 11, 89, 29);
		panel_11.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_27.setColumns(10);
		textField_27.setBounds(153, 51, 89, 29);
		panel_11.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_28.setColumns(10);
		textField_28.setBounds(153, 91, 89, 29);
		panel_11.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_29.setColumns(10);
		textField_29.setBounds(153, 131, 89, 29);
		panel_11.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_30.setColumns(10);
		textField_30.setBounds(153, 175, 89, 29);
		panel_11.add(textField_30);
	}
}
