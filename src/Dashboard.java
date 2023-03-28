import java.awt.Image;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        init();
        Payment.setVisible(false);
    }

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;
    private double pays = 0.0;
    private double change = 0.0;

    public void init() {
        setImage();
        setTime();
    }

    public void setImage() {

        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/late.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/boget.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/earl.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/copi.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/pina.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/americano.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/spag.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/black.jpg"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/fudg.jpg"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("/images/cran.jpg"));
        ImageIcon icon11 = new ImageIcon(getClass().getResource("/images/capucino.jpg"));
        ImageIcon icon12 = new ImageIcon(getClass().getResource("/images/fries.jpg"));
        ImageIcon icon13 = new ImageIcon(getClass().getResource("/images/greentea.jpg"));
        ImageIcon icon14 = new ImageIcon(getClass().getResource("/images/mango.jpg"));
        ImageIcon icon15 = new ImageIcon(getClass().getResource("/images/orange.jpg"));

        Image image1 = icon1.getImage().getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
        Image image2 = icon2.getImage().getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH);
        Image image3 = icon3.getImage().getScaledInstance(img3.getWidth(), img3.getHeight(), Image.SCALE_SMOOTH);
        Image image4 = icon4.getImage().getScaledInstance(img4.getWidth(), img4.getHeight(), Image.SCALE_SMOOTH);
        Image image5 = icon5.getImage().getScaledInstance(img5.getWidth(), img5.getHeight(), Image.SCALE_SMOOTH);
        Image image6 = icon6.getImage().getScaledInstance(img6.getWidth(), img6.getHeight(), Image.SCALE_SMOOTH);
        Image image7 = icon7.getImage().getScaledInstance(img7.getWidth(), img7.getHeight(), Image.SCALE_SMOOTH);
        Image image8 = icon8.getImage().getScaledInstance(img8.getWidth(), img8.getHeight(), Image.SCALE_SMOOTH);
        Image image9 = icon9.getImage().getScaledInstance(img9.getWidth(), img9.getHeight(), Image.SCALE_SMOOTH);
        Image image10 = icon10.getImage().getScaledInstance(img10.getWidth(), img10.getHeight(), Image.SCALE_SMOOTH);
        Image image11 = icon11.getImage().getScaledInstance(img11.getWidth(), img11.getHeight(), Image.SCALE_SMOOTH);
        Image image12 = icon12.getImage().getScaledInstance(img12.getWidth(), img12.getHeight(), Image.SCALE_SMOOTH);
        Image image13 = icon13.getImage().getScaledInstance(img13.getWidth(), img13.getHeight(), Image.SCALE_SMOOTH);
        Image image14 = icon14.getImage().getScaledInstance(img14.getWidth(), img14.getHeight(), Image.SCALE_SMOOTH);
        Image image15 = icon15.getImage().getScaledInstance(img15.getWidth(), img15.getHeight(), Image.SCALE_SMOOTH);

        img1.setIcon(new ImageIcon(image1));
        img2.setIcon(new ImageIcon(image2));
        img3.setIcon(new ImageIcon(image3));
        img4.setIcon(new ImageIcon(image4));
        img5.setIcon(new ImageIcon(image5));
        img6.setIcon(new ImageIcon(image6));
        img7.setIcon(new ImageIcon(image7));
        img8.setIcon(new ImageIcon(image8));
        img9.setIcon(new ImageIcon(image9));
        img10.setIcon(new ImageIcon(image10));
        img11.setIcon(new ImageIcon(image11));
        img12.setIcon(new ImageIcon(image12));
        img13.setIcon(new ImageIcon(image13));
        img14.setIcon(new ImageIcon(image14));
        img15.setIcon(new ImageIcon(image15));

    }

    public boolean qtyIsZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please add a quantity.");
            return false;
        }
        return true;
    }

    public void reset() {

        total = 0.0;
        x = 0;
        tax = 0.0;
        pays = 0.0;
        change = 0.0;

        btnTotal.setEnabled(true);
        jSpin1.setValue(0);
        jSpin2.setValue(0);
        jSpin3.setValue(0);
        jSpin4.setValue(0);
        jSpin5.setValue(0);
        jSpin6.setValue(0);
        jSpin7.setValue(0);
        jSpin8.setValue(0);
        jSpin9.setValue(0);
        jSpin10.setValue(0);
        jSpin11.setValue(0);
        jSpin12.setValue(0);
        jSpin13.setValue(0);
        jSpin14.setValue(0);
        jSpin15.setValue(0);

        jTextTax.setText("0.0");
        jTextSub.setText("0.0");
        jTextTotal.setText("0.0");
        jTextPay.setText("0.0");
        jTextChange.setText("0.0");
        getNum.setText("");

        textArea.setText("");

        jCheck1.setSelected(false);
        jCheck2.setSelected(false);
        jCheck3.setSelected(false);
        jCheck4.setSelected(false);
        jCheck5.setSelected(false);
        jCheck6.setSelected(false);
        jCheck7.setSelected(false);
        jCheck8.setSelected(false);
        jCheck9.setSelected(false);
        jCheck10.setSelected(false);
        jCheck11.setSelected(false);
        jCheck12.setSelected(false);
        jCheck13.setSelected(false);
        jCheck14.setSelected(false);
        jCheck15.setSelected(false);
    }

    public void numbers() {
        jTextSub.setText(String.valueOf(String.format("%.1f", total)));
        jTextTax.setText(String.valueOf(String.format("%.1f", tax)));
        jTextPay.setText(String.valueOf(String.format("%.1f", pays)));
        jTextChange.setText(String.valueOf(String.format("%.1f", change)));
        jTextChange.setText(String.valueOf(String.format("%.1f", change)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Payment = new javax.swing.JPanel();
        getNum = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        tuldok = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        img11 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jSpin11 = new javax.swing.JSpinner();
        jCheck11 = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jSpin1 = new javax.swing.JSpinner();
        jCheck1 = new javax.swing.JCheckBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jSpin2 = new javax.swing.JSpinner();
        jCheck2 = new javax.swing.JCheckBox();
        jPanel16 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jSpin3 = new javax.swing.JSpinner();
        jCheck3 = new javax.swing.JCheckBox();
        jPanel18 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jSpin6 = new javax.swing.JSpinner();
        jCheck6 = new javax.swing.JCheckBox();
        jPanel19 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jSpin5 = new javax.swing.JSpinner();
        jCheck5 = new javax.swing.JCheckBox();
        jPanel20 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jSpin4 = new javax.swing.JSpinner();
        jCheck4 = new javax.swing.JCheckBox();
        jPanel21 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jSpin7 = new javax.swing.JSpinner();
        jCheck7 = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jSpin8 = new javax.swing.JSpinner();
        jCheck8 = new javax.swing.JCheckBox();
        jPanel23 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jSpin9 = new javax.swing.JSpinner();
        jCheck9 = new javax.swing.JCheckBox();
        jPanel24 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSpin10 = new javax.swing.JSpinner();
        jCheck10 = new javax.swing.JCheckBox();
        jPanel26 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jSpin12 = new javax.swing.JSpinner();
        jCheck12 = new javax.swing.JCheckBox();
        jPanel27 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jSpin13 = new javax.swing.JSpinner();
        jCheck13 = new javax.swing.JCheckBox();
        jPanel28 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        img14 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jSpin14 = new javax.swing.JSpinner();
        jCheck14 = new javax.swing.JCheckBox();
        jPanel29 = new javax.swing.JPanel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        img15 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jSpin15 = new javax.swing.JSpinner();
        jCheck15 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnPayment = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        backtoLogin = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextTax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextSub = new javax.swing.JTextField();
        jTextTotal = new javax.swing.JTextField();
        jTextPay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextChange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextTotal2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier Point of Sale GUI");
        setMinimumSize(new java.awt.Dimension(1400, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 3, true));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee logo (3).png"))); // NOI18N
        jLabel2.setText("Steam & Sip Cafe");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 70));

        labelDate.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(labelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 240, 40));

        labelTime.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 80));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Payment.setBackground(new java.awt.Color(51, 51, 51));
        Payment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 235, 235), 2, true));
        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getNum.setEditable(false);
        getNum.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        getNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNumActionPerformed(evt);
            }
        });
        Payment.add(getNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 70));

        num1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        Payment.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 60, 80));

        num2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        Payment.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 60, 80));

        num3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        Payment.add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 60, 80));

        num4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        Payment.add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 80));

        num7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        Payment.add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 80));

        num5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        Payment.add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 60, 80));

        num6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        Payment.add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 60, 80));

        num8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        Payment.add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, 80));

        num9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        Payment.add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 60, 80));

        num0.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        Payment.add(num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 60, 80));

        tuldok.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tuldok.setText(".");
        tuldok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuldokActionPerformed(evt);
            }
        });
        Payment.add(tuldok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 60, 80));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        Payment.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 60, 80));

        btnPay.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayMouseClicked(evt);
            }
        });
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        Payment.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 240, 60));

        jPanel3.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 300, 560));

        jPanel13.setBackground(new java.awt.Color(250, 250, 250));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel13.setPreferredSize(new java.awt.Dimension(159, 176));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel72.setText("Price: ");
        jPanel13.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 95, -1, -1));

        jLabel101.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel101.setText("Add:");
        jPanel13.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, -1, -1));

        jLabel102.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel102.setText("Quantity:");
        jPanel13.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 121, -1, -1));
        jPanel13.add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 65));

        jLabel104.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel104.setText("Cafe Cappuccino");
        jPanel13.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 73, 100, -1));

        jLabel105.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel105.setText("₱50");
        jPanel13.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 96, -1, -1));

        jSpin11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel13.add(jSpin11, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 119, 105, -1));

        jCheck11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck11ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheck11, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 148, -1, -1));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 194, 170));

        jPanel14.setBackground(new java.awt.Color(250, 250, 250));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(196, 176));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel74.setText("Price: ");
        jPanel14.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel106.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel106.setText("Add:");
        jPanel14.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 40));

        jLabel107.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel107.setText("Quantity:");
        jPanel14.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 118, 60, 30));
        jPanel14.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel109.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel109.setText("Cafe Latte");
        jPanel14.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 80, 62, -1));

        jLabel110.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel110.setText("₱55");
        jPanel14.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.add(jSpin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck1ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 20, 60));

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 28, -1, 170));

        jPanel15.setBackground(new java.awt.Color(250, 250, 250));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel76.setText("Price: ");
        jPanel15.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel111.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel111.setText("Add:");
        jPanel15.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 40));

        jLabel112.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel112.setText("Quantity:");
        jPanel15.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel15.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel114.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel114.setText("Baguettes");
        jPanel15.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 80, 62, -1));

        jLabel115.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel115.setText("₱120");
        jPanel15.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel15.add(jSpin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 106, -1));

        jCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck2ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheck2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, 170));

        jPanel16.setBackground(new java.awt.Color(250, 250, 250));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel78.setText("Price: ");
        jPanel16.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel116.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel116.setText("Add:");
        jPanel16.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel117.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel117.setText("Quantity:");
        jPanel16.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel16.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel119.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel119.setText("Earl Gray Tea");
        jPanel16.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 80, 77, -1));

        jLabel120.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel120.setText("₱85");
        jPanel16.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel16.add(jSpin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck3ActionPerformed(evt);
            }
        });
        jPanel16.add(jCheck3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, 170));

        jPanel18.setBackground(new java.awt.Color(250, 250, 250));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel80.setText("Price: ");
        jPanel18.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel121.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel121.setText("Add:");
        jPanel18.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel122.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel122.setText("Quantity:");
        jPanel18.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel18.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel124.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel124.setText("Cafe Americano");
        jPanel18.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 80, 93, -1));

        jLabel125.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel125.setText("₱60");
        jPanel18.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel18.add(jSpin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck6ActionPerformed(evt);
            }
        });
        jPanel18.add(jCheck6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 20, 20));

        jPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 208, 196, 170));

        jPanel19.setBackground(new java.awt.Color(250, 250, 250));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel82.setText("Price: ");
        jPanel19.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel126.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel126.setText("Add:");
        jPanel19.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel127.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel127.setText("Quantity:");
        jPanel19.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel19.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 175, 72));

        jLabel129.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel129.setText("Pinacolada Juice");
        jPanel19.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, 101, -1));

        jLabel130.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel130.setText("₱70");
        jPanel19.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel19.add(jSpin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 88, -1));

        jCheck5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck5ActionPerformed(evt);
            }
        });
        jPanel19.add(jCheck5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 30, 180, 170));

        jPanel20.setBackground(new java.awt.Color(250, 250, 250));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel84.setText("Price: ");
        jPanel20.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel131.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel131.setText("Add:");
        jPanel20.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel132.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel132.setText("Quantity:");
        jPanel20.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel20.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel134.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel134.setText("Coffee Cake");
        jPanel20.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 80, 73, -1));

        jLabel135.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel135.setText("₱150");
        jPanel20.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel20.add(jSpin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck4ActionPerformed(evt);
            }
        });
        jPanel20.add(jCheck4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, 170));

        jPanel21.setBackground(new java.awt.Color(250, 250, 250));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel86.setText("Price: ");
        jPanel21.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel136.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel136.setText("Add:");
        jPanel21.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel137.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel137.setText("Quantity:");
        jPanel21.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel21.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel139.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel139.setText("Spaghetti");
        jPanel21.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 67, -1));

        jLabel140.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel140.setText("₱100");
        jPanel21.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel21.add(jSpin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck7ActionPerformed(evt);
            }
        });
        jPanel21.add(jCheck7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 208, -1, -1));

        jPanel22.setBackground(new java.awt.Color(250, 250, 250));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel88.setText("Price: ");
        jPanel22.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel141.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel141.setText("Add:");
        jPanel22.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel142.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel142.setText("Quantity:");
        jPanel22.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel22.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel144.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel144.setText("Black Tea");
        jPanel22.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 80, 60, -1));

        jLabel145.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel145.setText("₱65");
        jPanel22.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel22.add(jSpin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck8ActionPerformed(evt);
            }
        });
        jPanel22.add(jCheck8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jPanel23.setBackground(new java.awt.Color(250, 250, 250));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel90.setText("Price: ");
        jPanel23.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel146.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel146.setText("Add:");
        jPanel23.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel147.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel147.setText("Quantity:");
        jPanel23.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));
        jPanel23.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 72));

        jLabel149.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel149.setText("Fudgy Chocolate Cake");
        jPanel23.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, 127, -1));

        jLabel150.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel150.setText("₱100");
        jPanel23.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel23.add(jSpin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 105, -1));

        jCheck9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck9ActionPerformed(evt);
            }
        });
        jPanel23.add(jCheck9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jPanel24.setBackground(new java.awt.Color(250, 250, 250));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel24.setPreferredSize(new java.awt.Dimension(177, 164));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel92.setText("Price: ");
        jPanel24.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 102, -1, -1));

        jLabel151.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel151.setText("Add:");
        jPanel24.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel152.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel152.setText("Quantity:");
        jPanel24.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel24.add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 175, 72));

        jLabel154.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel154.setText("Cranberry juice");
        jPanel24.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 80, 89, -1));

        jLabel155.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel155.setText("₱60");
        jPanel24.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 103, -1, -1));

        jSpin10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel24.add(jSpin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 88, -1));

        jCheck10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck10ActionPerformed(evt);
            }
        });
        jPanel24.add(jCheck10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 179, 170));

        jPanel26.setBackground(new java.awt.Color(250, 250, 250));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel163.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel163.setText("Price: ");
        jPanel26.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 95, -1, -1));

        jLabel164.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel164.setText("Add:");
        jPanel26.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel165.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel165.setText("Quantity:");
        jPanel26.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 121, -1, -1));
        jPanel26.add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 65));

        jLabel167.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel167.setText("French Fries");
        jPanel26.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 73, 79, -1));

        jLabel168.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel168.setText("₱75");
        jPanel26.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 96, -1, -1));

        jSpin12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel26.add(jSpin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 119, 105, -1));

        jCheck12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck12ActionPerformed(evt);
            }
        });
        jPanel26.add(jCheck12, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 148, -1, -1));

        jPanel3.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, 170));

        jPanel27.setBackground(new java.awt.Color(250, 250, 250));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel170.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel170.setText("Price: ");
        jPanel27.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 95, -1, -1));

        jLabel171.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel171.setText("Add:");
        jPanel27.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, -1, -1));

        jLabel172.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel172.setText("Quantity:");
        jPanel27.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 121, -1, -1));
        jPanel27.add(img13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 190, 65));

        jLabel174.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel174.setText("Green Tea");
        jPanel27.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 73, 68, -1));

        jLabel175.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel175.setText("₱55");
        jPanel27.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 96, -1, -1));

        jSpin13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel27.add(jSpin13, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 119, 103, -1));

        jCheck13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck13ActionPerformed(evt);
            }
        });
        jPanel27.add(jCheck13, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 148, -1, -1));

        jPanel3.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, 170));

        jPanel28.setBackground(new java.awt.Color(250, 250, 250));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel177.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel177.setText("Price: ");
        jPanel28.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 95, -1, -1));

        jLabel178.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel178.setText("Add:");
        jPanel28.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, -1, -1));

        jLabel179.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel179.setText("Quantity:");
        jPanel28.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 121, -1, -1));
        jPanel28.add(img14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 192, 65));

        jLabel181.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel181.setText("Mango Metingue Cake");
        jPanel28.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 73, 128, -1));

        jLabel182.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel182.setText("₱75");
        jPanel28.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 96, -1, -1));

        jSpin14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel28.add(jSpin14, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 119, 105, -1));

        jCheck14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck14ActionPerformed(evt);
            }
        });
        jPanel28.add(jCheck14, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 148, -1, -1));

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, 170));

        jPanel29.setBackground(new java.awt.Color(250, 250, 250));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel184.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel184.setText("Price: ");
        jPanel29.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 95, -1, -1));

        jLabel185.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel185.setText("Add:");
        jPanel29.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 149, -1, -1));

        jLabel186.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel186.setText("Quantity:");
        jPanel29.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 121, -1, -1));
        jPanel29.add(img15, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 175, 65));

        jLabel188.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel188.setText("Orange Juice");
        jPanel29.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 73, 77, -1));

        jLabel189.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel189.setText("₱50");
        jPanel29.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 96, -1, -1));

        jSpin15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSpin15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpin15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel29.add(jSpin15, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 119, 88, -1));

        jCheck15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck15ActionPerformed(evt);
            }
        });
        jPanel29.add(jCheck15, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 148, -1, -1));

        jPanel3.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 179, 170));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu List");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 550, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1000, 570));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPayment.setBackground(new java.awt.Color(255, 255, 51));
        btnPayment.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel4.add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 141, 30));

        btnReceipt.setBackground(new java.awt.Color(153, 255, 255));
        btnReceipt.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnReceipt.setText("Receipt");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });
        jPanel4.add(btnReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 5, 141, 30));

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 5, 141, 30));

        backtoLogin.setBackground(new java.awt.Color(255, 0, 0));
        backtoLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        backtoLogin.setText("Back");
        backtoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoLoginActionPerformed(evt);
            }
        });
        jPanel4.add(backtoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 5, 140, 30));

        btnTotal.setBackground(new java.awt.Color(0, 204, 51));
        btnTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        jPanel4.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 5, 141, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 1000, 40));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(textArea);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 330, 488));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Tax:");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setIconTextGap(0);
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 50, 20));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sub Total:");
        jLabel4.setIconTextGap(0);
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 80, 20));

        jTextTax.setEditable(false);
        jTextTax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTax.setText("0.0");
        jTextTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTaxActionPerformed(evt);
            }
        });
        jPanel5.add(jTextTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 80, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payment:");
        jLabel5.setIconTextGap(0);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 70, -1));

        jTextSub.setEditable(false);
        jTextSub.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextSub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSub.setText("0.0");
        jTextSub.setMaximumSize(null);
        jTextSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSubActionPerformed(evt);
            }
        });
        jPanel5.add(jTextSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 80, -1));

        jTextTotal.setEditable(false);
        jTextTotal.setBackground(new java.awt.Color(0, 255, 51));
        jTextTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTotal.setText("0.0");
        jTextTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalActionPerformed(evt);
            }
        });
        jPanel5.add(jTextTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 90, -1));

        jTextPay.setEditable(false);
        jTextPay.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextPay.setText("0.0");
        jTextPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPayActionPerformed(evt);
            }
        });
        jPanel5.add(jTextPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 90, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Change:");
        jLabel6.setIconTextGap(0);
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 60, -1));

        jTextChange.setEditable(false);
        jTextChange.setBackground(new java.awt.Color(255, 255, 51));
        jTextChange.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextChange.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextChange.setText("0.0");
        jTextChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChangeActionPerformed(evt);
            }
        });
        jPanel5.add(jTextChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 90, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 51));
        jLabel7.setText("Total: ");
        jLabel7.setIconTextGap(0);
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 50, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 350, 610));

        jTextTotal2.setEditable(false);
        jTextTotal2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTotal2.setText("0.0");
        jTextTotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotal2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 90, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void jCheck11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck11ActionPerformed
      int qty = Integer.parseInt(jSpin11.getValue().toString());
      if (qtyIsZero(qty) && jCheck11.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 50.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel104.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck11.setSelected(false);
      }
  }//GEN-LAST:event_jCheck11ActionPerformed

    public void steamCafe() {
        int purchaseId = 9 + (int) (Math.random() * 25);
        textArea.setText("******************Steam & Sip Cafe*******************\n"
                + "Time: " + labelTime.getText() + "                            Date: " + labelDate.getText() + "\n"
                + "Customer Number: " + purchaseId + "\n"
                + "***************************************************\n"
                + "Item Name:\t\t\t" + "Price(₱)\n");
    }

  private void jCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck1ActionPerformed
      int qty = Integer.parseInt(jSpin1.getValue().toString());
      if (qtyIsZero(qty) && jCheck1.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 55.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel109.getText() + "\t\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck1.setSelected(false);
      }
  }//GEN-LAST:event_jCheck1ActionPerformed

    public void getTax(double t) {
        if (t >= 50.0 && t <= 150.0) {
            tax = 1.5;
        } else if (t > 150.0 && t <= 250.0) {
            tax = 2.5;
        } else if (t > 250.0 && t <= 350.0) {
            tax = 3.5;
        } else if (t > 350.0 && t <= 450.0) {
            tax = 4.5;
        } else if (t > 450.0 && t <= 550.0) {
            tax = 5.5;
        } else if (t > 550.0 && t <= 650.0) {
            tax = 10.5;
        } else if (t > 650.0 && t <= 750.0) {
            tax = 15.5;
        } else if (t > 750.0) {
            tax = 20.5;
        }
    }

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    labelTime.setText(time.split(" ")[0] + time.split(" ")[1]);
                    labelDate.setText(df.format(date));
                }
            }

        }).start();
    }

  private void jCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck2ActionPerformed
      int qty = Integer.parseInt(jSpin2.getValue().toString());
      if (qtyIsZero(qty) && jCheck2.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 120.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel114.getText() + "\t\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck2.setSelected(false);
      }
  }//GEN-LAST:event_jCheck2ActionPerformed

  private void jCheck3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck3ActionPerformed
      int qty = Integer.parseInt(jSpin3.getValue().toString());
      if (qtyIsZero(qty) && jCheck3.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 85.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel119.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck3.setSelected(false);
      }
  }//GEN-LAST:event_jCheck3ActionPerformed

  private void jCheck6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck6ActionPerformed
      int qty = Integer.parseInt(jSpin6.getValue().toString());
      if (qtyIsZero(qty) && jCheck6.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 60.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel124.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck6.setSelected(false);
      }
  }//GEN-LAST:event_jCheck6ActionPerformed

  private void jCheck5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck5ActionPerformed
      int qty = Integer.parseInt(jSpin5.getValue().toString());
      if (qtyIsZero(qty) && jCheck5.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 70.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel129.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck5.setSelected(false);
      }
  }//GEN-LAST:event_jCheck5ActionPerformed

  private void jCheck4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck4ActionPerformed
      int qty = Integer.parseInt(jSpin4.getValue().toString());
      if (qtyIsZero(qty) && jCheck4.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 150.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel134.getText() + "\t\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck4.setSelected(false);
      }
  }//GEN-LAST:event_jCheck4ActionPerformed

  private void jCheck7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck7ActionPerformed
      int qty = Integer.parseInt(jSpin7.getValue().toString());
      if (qtyIsZero(qty) && jCheck7.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 100.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel139.getText() + "\t\t\t" + String.format("%.2f", price) + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck7.setSelected(false);
      }
  }//GEN-LAST:event_jCheck7ActionPerformed

  private void jCheck12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck12ActionPerformed
      int qty = Integer.parseInt(jSpin12.getValue().toString());
      if (qtyIsZero(qty) && jCheck12.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 75.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel167.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck12.setSelected(false);
      }
  }//GEN-LAST:event_jCheck12ActionPerformed

  private void jCheck13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck13ActionPerformed
      int qty = Integer.parseInt(jSpin13.getValue().toString());
      if (qtyIsZero(qty) && jCheck13.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 55.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel174.getText() + "\t\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck13.setSelected(false);
      }
  }//GEN-LAST:event_jCheck13ActionPerformed

  private void jCheck14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck14ActionPerformed
      int qty = Integer.parseInt(jSpin14.getValue().toString());
      if (qtyIsZero(qty) && jCheck14.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 75.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel181.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck14.setSelected(false);
      }
  }//GEN-LAST:event_jCheck14ActionPerformed

  private void jCheck15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck15ActionPerformed
      int qty = Integer.parseInt(jSpin15.getValue().toString());
      if (qtyIsZero(qty) && jCheck15.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 50.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel188.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck15.setSelected(false);
      }
  }//GEN-LAST:event_jCheck15ActionPerformed

  private void jCheck10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck10ActionPerformed
      int qty = Integer.parseInt(jSpin10.getValue().toString());
      if (qtyIsZero(qty) && jCheck10.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 60.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel154.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck10.setSelected(false);
      }
  }//GEN-LAST:event_jCheck10ActionPerformed

  private void jCheck9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck9ActionPerformed
      int qty = Integer.parseInt(jSpin9.getValue().toString());
      if (qtyIsZero(qty) && jCheck9.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 100.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel149.getText() + "\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck9.setSelected(false);
      }
  }//GEN-LAST:event_jCheck9ActionPerformed

  private void jCheck8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck8ActionPerformed
      int qty = Integer.parseInt(jSpin8.getValue().toString());
      if (qtyIsZero(qty) && jCheck8.isSelected()) {
          x++;
          if (x == 1) {
              steamCafe();
          }
          double price = qty * 65.0;
          total += price;
          getTax(total);
          textArea.setText(textArea.getText() + x + ". " + jLabel144.getText() + "\t\t\t" + price + "\n");
          numbers();
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + pays1 + total)));
      } else {
          jCheck8.setSelected(false);
      }
  }//GEN-LAST:event_jCheck8ActionPerformed

  private void backtoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoLoginActionPerformed
      int confirmed = JOptionPane.showConfirmDialog(null,
              "Are you sure about that?", "Back to Login",
              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

      if (confirmed == JOptionPane.YES_OPTION) {
          Login login = new Login();
          login.setVisible(true);
          this.dispose();
      }
  }//GEN-LAST:event_backtoLoginActionPerformed

  private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

      int confirmed = JOptionPane.showConfirmDialog(null,
              "Are you sure about that?", "Reset",
              JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      if (confirmed == JOptionPane.YES_OPTION) {
          reset();
      }
  }//GEN-LAST:event_btnResetActionPerformed

  private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
      if (total == 0.0) {
          JOptionPane.showMessageDialog(null, "You haven't added any product yet.", "Total", JOptionPane.ERROR_MESSAGE);
      } else {
          String pays2 = jTextPay.getText();
          Double pays1 = Double.parseDouble(pays2);
          jTextTotal.setText(String.valueOf(String.format("%.1f", tax + total)));
          if (pays1 == 0.0) {
              JOptionPane.showMessageDialog(null, "You haven't added costumer payment yet.", "Total(₱)", JOptionPane.ERROR_MESSAGE);
          } else {
              jTextChange.setText(String.valueOf(String.format("%.1f", pays1 - total - tax)));
              textArea.setText(textArea.getText()
                      + "\n***************************************************\n"
                      + "Sub Total: \t\t\t" + total + "\n"
                      + "Tax: \t\t\t" + tax + "\n"
                      + "Payment: \t\t\t" + pays1 + "\n"
                      + "Total: \t\t\t" + (total + tax) + "\n"
                      + "Change: \t\t\t" + (pays1 - total - tax) + "\n\n"
                      + "\n********************Thank You!*********************\n");
              btnTotal.setEnabled(false);
          }
      }
  }//GEN-LAST:event_btnTotalActionPerformed

    int xx, xy;
  private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x - xx, y - xy);
  }//GEN-LAST:event_jPanel2MouseDragged

  private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
      xx = evt.getX();
      xy = evt.getY();
  }//GEN-LAST:event_jPanel2MousePressed

  private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
      if (total != 0.0) {
          if (!btnTotal.isEnabled()) {
              try {
                  textArea.print();
              } catch (PrinterException ex) {
                  Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
              }
          } else {
              JOptionPane.showMessageDialog(null, "Calculate the total price.", "Receipt", JOptionPane.ERROR_MESSAGE);
          }
      } else {
          JOptionPane.showMessageDialog(null, "You haven't added any product yet.", "Receipt", JOptionPane.ERROR_MESSAGE);
      }
  }//GEN-LAST:event_btnReceiptActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      // TODO add your handling code here:
  }//GEN-LAST:event_formWindowActivated

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

  }//GEN-LAST:event_formWindowOpened

  private void jTextTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextTotalActionPerformed

  private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
      if (total == 0.0) {
          JOptionPane.showMessageDialog(null, "You haven't added any product yet.", "Payment", JOptionPane.ERROR_MESSAGE);
      } else {
          Payment.setVisible(true);
      }
  }//GEN-LAST:event_btnPaymentActionPerformed

  private void jTextSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSubActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextSubActionPerformed


  private void jTextPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPayActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextPayActionPerformed

  private void jTextTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTaxActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextTaxActionPerformed

  private void tuldokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuldokActionPerformed
      if (!getNum.getText().contains(".")) {
          getNum.setText(getNum.getText() + tuldok.getText());
      }
  }//GEN-LAST:event_tuldokActionPerformed

  private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
      jTextPay.setText(getNum.getText());
      Payment.setVisible(false);
      String pays2 = jTextPay.getText();
      Double pays1 = Double.valueOf(pays2);
      jTextTotal.setText(String.valueOf(String.format("%.1f", tax + total)));

  }//GEN-LAST:event_btnPayActionPerformed

  private void btnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseClicked

  }//GEN-LAST:event_btnPayMouseClicked

  private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed

      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num0.getText());
      } else {
          num = getNum.getText() + num0.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num0ActionPerformed

  private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num1.getText());
      } else {
          num = getNum.getText() + num1.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num1ActionPerformed

  private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num8.getText());
      } else {
          num = getNum.getText() + num8.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num8ActionPerformed

  private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num7.getText());
      } else {
          num = getNum.getText() + num7.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num7ActionPerformed

  private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num6.getText());
      } else {
          num = getNum.getText() + num6.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num6ActionPerformed

  private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num5.getText());
      } else {
          num = getNum.getText() + num5.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num5ActionPerformed

  private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num4.getText());
      } else {
          num = getNum.getText() + num4.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num4ActionPerformed

  private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
      getNum.setText("");
  }//GEN-LAST:event_clearActionPerformed

  private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num2.getText());
      } else {
          num = getNum.getText() + num2.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num2ActionPerformed

  private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num9.getText());
      } else {
          num = getNum.getText() + num9.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num9ActionPerformed

  private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
      String num = getNum.getText();
      if (num == "") {
          getNum.setText(num8.getText());
      } else {
          num = getNum.getText() + num8.getText();
          getNum.setText(num);
      }
  }//GEN-LAST:event_num3ActionPerformed

  private void getNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNumActionPerformed

  }//GEN-LAST:event_getNumActionPerformed

  private void jTextChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextChangeActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextChangeActionPerformed

  private void jTextTotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotal2ActionPerformed
      // TODO add your handling code here:
  }//GEN-LAST:event_jTextTotal2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Payment;
    private javax.swing.JButton backtoLogin;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton clear;
    public static javax.swing.JTextField getNum;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img14;
    private javax.swing.JLabel img15;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JCheckBox jCheck1;
    private javax.swing.JCheckBox jCheck10;
    private javax.swing.JCheckBox jCheck11;
    private javax.swing.JCheckBox jCheck12;
    private javax.swing.JCheckBox jCheck13;
    private javax.swing.JCheckBox jCheck14;
    private javax.swing.JCheckBox jCheck15;
    private javax.swing.JCheckBox jCheck2;
    private javax.swing.JCheckBox jCheck3;
    private javax.swing.JCheckBox jCheck4;
    private javax.swing.JCheckBox jCheck5;
    private javax.swing.JCheckBox jCheck6;
    private javax.swing.JCheckBox jCheck7;
    private javax.swing.JCheckBox jCheck8;
    private javax.swing.JCheckBox jCheck9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpin1;
    private javax.swing.JSpinner jSpin10;
    private javax.swing.JSpinner jSpin11;
    private javax.swing.JSpinner jSpin12;
    private javax.swing.JSpinner jSpin13;
    private javax.swing.JSpinner jSpin14;
    private javax.swing.JSpinner jSpin15;
    private javax.swing.JSpinner jSpin2;
    private javax.swing.JSpinner jSpin3;
    private javax.swing.JSpinner jSpin4;
    private javax.swing.JSpinner jSpin5;
    private javax.swing.JSpinner jSpin6;
    private javax.swing.JSpinner jSpin7;
    private javax.swing.JSpinner jSpin8;
    private javax.swing.JSpinner jSpin9;
    private javax.swing.JTextField jTextChange;
    public static javax.swing.JTextField jTextPay;
    private javax.swing.JTextField jTextSub;
    private javax.swing.JTextField jTextTax;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JTextField jTextTotal2;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton tuldok;
    // End of variables declaration//GEN-END:variables
}
