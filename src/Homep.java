import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Homepage2 extends JFrame implements ActionListener, ChangeListener {


        JButton manageButton = new JButton("Manage user");
        JButton logoutButton = new JButton("Logout");

        ImageIcon breadIcon1 = new ImageIcon("bread/1.png");
        ImageIcon breadIcon2 = new ImageIcon("bread/2.png");
        ImageIcon breadIcon3 = new ImageIcon("bread/3.png");
        ImageIcon breadIcon4 = new ImageIcon("bread/4.png");
        ImageIcon breadIcon5 = new ImageIcon("bread/5.png");
        ImageIcon breadIcon6 = new ImageIcon("bread/6.png");
        ImageIcon breadIcon7 = new ImageIcon("bread/7.png");
        ImageIcon breadIcon8 = new ImageIcon("bread/8.png");
        ImageIcon breadIcon9 = new ImageIcon("bread/9.png");


        JButton imageButton1 = new JButton(breadIcon1);
        JButton imageButton2 = new JButton(breadIcon2);
        JButton imageButton3 = new JButton(breadIcon3);
        JButton imageButton4 = new JButton(breadIcon4);
        JButton imageButton5 = new JButton(breadIcon5);
        JButton imageButton6 = new JButton(breadIcon6);
        JButton imageButton7 = new JButton(breadIcon7);
        JButton imageButton8 = new JButton(breadIcon8);
        JButton imageButton9 = new JButton(breadIcon9);


        JTextField nameTextField = new JTextField();
        JTextField priceTextField = new JTextField();
        JTextField quantityTextField = new JTextField();
        JTextField totalPriceTextField = new JTextField();


        JComboBox comboBox ;


        JButton addToCartButton = new JButton("Add to cart");

        Color color = new Color(0x032C61);

    //payment component
    JLabel totalPriceLabel = new JLabel("Total Price: ");
    JLabel totalPriceText = new JLabel("$0.00");
    JLabel amount_pay = new JLabel("Amount pay: ");
    JTextField amountPayTextField = new JTextField();
    JLabel changeLabel = new JLabel("Change: ");
    JLabel changeText = new JLabel("$0.00");
    JButton payButton= new JButton("Pay");


    Object [][] objects= {};

    Homepage2(){

        //panel 1
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,600,800);
        panel1.setLayout(null);
        panel1.setBackground(color);
        add(panel1);


            //banner
            ImageIcon banner= new ImageIcon("images/banner.jpg");
            JLabel bannerLabel = new JLabel(banner);
            bannerLabel.setBounds(10,10,580,180);
            panel1.add(bannerLabel);

            //manage button
            manageButton.setBounds(35,210,230,40);
            manageButton.setFocusable(false);
            manageButton.setFont(new Font("Tahoma", Font.BOLD,20));
//            manageButton.setBackground(Color.white);
            panel1.add(manageButton);


            //login button
            logoutButton.setBounds(290,210,230,40);
            logoutButton.setFocusable(false);
            logoutButton.addActionListener(this);
            logoutButton.setFont(new Font("Tahoma", Font.BOLD,20));
    //            logoutButton.setBackground(Color.white);
            panel1.add(logoutButton);

            //bread text
            JLabel breadText = new JLabel("Bread");
            breadText.setBounds(170,255,230,75);
            breadText.setForeground(Color.white);
            breadText.setFont(new Font("Rampart one", Font.BOLD, 60));
            panel1.add(breadText);


            //bread panel
            JPanel breadPanel = new JPanel();
            breadPanel.setBounds(10,360,570,400);
            breadPanel.setBackground(color);
            breadPanel.setLayout(new GridLayout(3,3,2,2));
            panel1.add(breadPanel);


            //bread images
                breadPanel.add(imageButton1);
            imageButton1.setBackground(Color.white);
            breadPanel.add(imageButton2);
        imageButton2.setBackground(Color.white);
                breadPanel.add(imageButton3);
        imageButton3.setBackground(Color.white);
                breadPanel.add(imageButton4);
        imageButton4.setBackground(Color.white);
                breadPanel.add(imageButton5);
        imageButton5.setBackground(Color.white);
                breadPanel.add(imageButton6);
        imageButton6.setBackground(Color.white);
                breadPanel.add(imageButton7);
        imageButton7.setBackground(Color.white);
                breadPanel.add(imageButton8);
        imageButton8.setBackground(Color.white);
                breadPanel.add(imageButton9);
        imageButton9.setBackground(Color.white);

        imageButton1.setFocusable(false);
        imageButton2.setFocusable(false);
        imageButton3.setFocusable(false);
        imageButton4.setFocusable(false);
        imageButton5.setFocusable(false);
        imageButton6.setFocusable(false);
        imageButton7.setFocusable(false);
        imageButton8.setFocusable(false);
        imageButton9.setFocusable(false);


        imageButton1.addActionListener(this);
        imageButton2.addActionListener(this);
        imageButton3.addActionListener(this);
        imageButton4.addActionListener(this);
        imageButton5.addActionListener(this);
        imageButton6.addActionListener(this);
        imageButton7.addActionListener(this);
        imageButton8.addActionListener(this);
        imageButton9.addActionListener(this);


        //panel 2
        JPanel panel2 = new JPanel();
        panel2.setBounds(600,0,700,800);
        panel2.setLayout(null);
        add(panel2);

        //panel 2 walpaper
        JLabel wal = new JLabel(new ImageIcon("images/p2w.jpg"));
        wal.setBounds(0,0,700,800);


        JPanel productDetail = new JPanel();
        productDetail.setBounds(20,20,650,300);
        productDetail.setLayout(null);
        productDetail.setForeground(Color.white);
        productDetail.setBackground(new Color(0xFFFFFF));

        Border innerBorder = BorderFactory.createTitledBorder("Product Details");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        productDetail.setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
        panel2.add(productDetail);

        JLabel productName =new JLabel("Product name: ");
        JLabel price =new JLabel("Price: ");
        JLabel quantity =new JLabel("Quantity: ");
        JLabel totalPrice =new JLabel("Total Price: ");

        //productName text
        productName.setBounds(20,38,200,25);
        productDetail.add(productName);
        productName.setFont(new Font("Tahoma",Font.PLAIN,20));
        productName.setForeground(color);

        // name textField
        productDetail.add(nameTextField);
        nameTextField.setBounds(180,30,220,40);
        nameTextField.setFont(new Font("Tahoma",Font.BOLD,25));


        //price text
        price.setBounds(20,100,150,25);
        productDetail.add(price);
        price.setFont(new Font("Tahoma",Font.PLAIN,20));
        price.setForeground(color);

        // price textField
        productDetail.add(priceTextField);
        priceTextField.setBounds(180,92,220,40);
        priceTextField.setFont(new Font("Tahoma",Font.BOLD,25));

        //quantity text
        quantity.setBounds(20,164,150,25);
        productDetail.add(quantity);
        quantity.setFont(new Font("Tahoma",Font.PLAIN,20));
        quantity.setForeground(color);


        // quantity textField
        productDetail.add(quantityTextField);
        quantityTextField.setBounds(180,154,220,40);
        quantityTextField.setFont(new Font("Tahoma",Font.BOLD,25));


        //total price text
        totalPrice.setBounds(20,228,150,25);
        productDetail.add(totalPrice);
        totalPrice.setFont(new Font("Tahoma",Font.PLAIN,20));
        totalPrice.setForeground(color);


        // total price textField
        productDetail.add(totalPriceTextField);
        totalPriceTextField.setBounds(180,216,220,40);
        totalPriceTextField.setFont(new Font("Tahoma",Font.BOLD,25));

        //add to cart button
        productDetail.add(addToCartButton);
        addToCartButton.addActionListener(this);
        addToCartButton.setBounds(430,210,200,60);
        addToCartButton.setBackground(color);
        addToCartButton.setFont(new Font("Tahoma",Font.BOLD,20));
        addToCartButton.setForeground(Color.white);
        addToCartButton.setFocusable(false);

        //payment panel
       JPanel paymentPanel = new JPanel();
       paymentPanel.setBounds(20,350,650,400);
        paymentPanel.setLayout(null);
        paymentPanel.setForeground(Color.white);
        paymentPanel.setBackground(new Color(0xFFFFFF));
        Border paymentBorder = BorderFactory.createTitledBorder("Payment");
        paymentPanel.setBorder(BorderFactory.createCompoundBorder(outerBorder,paymentBorder));
        panel2.add (paymentPanel);





        //total price
        totalPriceLabel.setBounds(20,38,200,25);
        paymentPanel.add(totalPriceLabel);
        totalPriceLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        totalPriceLabel.setForeground(color);

        //total price  text
        paymentPanel.add(totalPriceText);
        totalPriceText.setBounds(150,30,130,40);
        totalPriceText.setFont(new Font("Tahoma",Font.BOLD,25));

        //amount pay text
        amount_pay.setBounds(20,100,150,25);
        paymentPanel.add( amount_pay);
        amount_pay.setFont(new Font("Tahoma",Font.PLAIN,20));
        amount_pay.setForeground(color);

        //amount pay textField
        paymentPanel.add(amountPayTextField);
        amountPayTextField.setBounds(150,92,200,40);
        amountPayTextField.setFont(new Font("Tahoma",Font.BOLD,25));

        //change
        paymentPanel.add(changeLabel);
        changeLabel.setBounds(360,30,100,40);
        changeLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        changeLabel.setForeground(color);

        //change text
        paymentPanel.add(changeText);
        changeText.setBounds(450,40,150,25);
        changeText.setFont(new Font("Tahoma",Font.BOLD,25));

        //payment method label
        JLabel paymentMethodLabel = new JLabel("Method:");
        paymentMethodLabel.setBounds(360,92,100,40);
        paymentMethodLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        paymentMethodLabel.setForeground(color);
        paymentPanel.add(paymentMethodLabel);

        //payment method
        String[] payMethod = {"Cash","Card"};
        comboBox = new JComboBox(payMethod);
        comboBox.setBounds(465,100,140,30);
       paymentPanel.add(comboBox);

       //pay Button
        payButton.setBounds(20,140,600,40);
        payButton.setFocusable(false);
        payButton.setBackground(color);
        payButton.setFont(new Font("Tahoma",Font.BOLD,20));
        payButton.setForeground(Color.white);
        payButton.addActionListener(this);
        paymentPanel.add(payButton);

        // Table
        String [] columnNames = {"Product Id","Bread name", "Price"};



        JTable table = new JTable(objects,columnNames);
        table.setPreferredSize(new Dimension(610,300));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15,200,610,180);
        paymentPanel.add(scrollPane);


        //frame
        panel2.add(wal);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      setResizable(false);
      setLocationRelativeTo(null);
      setSize(1300,800);
      setVisible(true);

    }
    int i = 1;
    int money = 0;
    int j = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()== logoutButton){
                dispose();
                new Login( new IDAndPassword().getInfo());
                            }

            if(
                    e.getSource()== imageButton1 |
                    e.getSource()==imageButton2  |
                    e.getSource()==imageButton3  |
                    e.getSource()==imageButton4  |
                    e.getSource()==imageButton5  |
                    e.getSource()==imageButton6  |
                    e.getSource()==imageButton7  |
                    e.getSource()==imageButton8  |
                    e.getSource()==imageButton9
            ){
                nameTextField.setText("Bread name");
                int price = money+=100;
                priceTextField.setText("$"+"100");
                quantityTextField.setText(String.valueOf(i++));
                totalPriceTextField.setText("$"+(j+price));

            }
            if (e.getSource()==addToCartButton){

                totalPriceText.setText(totalPriceTextField.getText());


                nameTextField.setText("");
                priceTextField.setText("");
                quantityTextField.setText("");
                totalPriceTextField.setText("");

                i =1;
                money =0;
                j=0;
            }if(e.getSource()==payButton){
            int pMethod = comboBox.getSelectedIndex();
            if (pMethod==1){
                    new CardPayment();
//                System.out.println("pay");
            }

        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
