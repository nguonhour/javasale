
package sale_element;

import static java.lang.System.exit;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class drink extends javax.swing.JFrame {
    private double amount;
    private int QTY =0;
    private DefaultTableModel model;
    public drink() {
        initComponents();
        cart_total();
        cart_dollar();
        cart_riel();
        cart_item();
        disccount();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pricechicken = new javax.swing.JLabel();
        chicken = new javax.swing.JLabel();
        buychicken = new javax.swing.JButton();
        spinchicken = new javax.swing.JSpinner();
        myButton1 = new Swing.MyButton();
        jLabel4 = new javax.swing.JLabel();
        pricesa = new javax.swing.JLabel();
        sa = new javax.swing.JLabel();
        buysa = new javax.swing.JButton();
        spinsa = new javax.swing.JSpinner();
        myButton2 = new Swing.MyButton();
        jLabel7 = new javax.swing.JLabel();
        pricewater = new javax.swing.JLabel();
        water = new javax.swing.JLabel();
        buywater = new javax.swing.JButton();
        spinwater = new javax.swing.JSpinner();
        myButton3 = new Swing.MyButton();
        coca = new javax.swing.JLabel();
        spincoca = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        buycoca = new javax.swing.JButton();
        pricecoca = new javax.swing.JLabel();
        myButton4 = new Swing.MyButton();
        spaghatti = new javax.swing.JLabel();
        spinspaghatti = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        buyspaghatti = new javax.swing.JButton();
        pricespaghatti = new javax.swing.JLabel();
        myButton5 = new Swing.MyButton();
        hamberger = new javax.swing.JLabel();
        buyhamberger = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        spinhamberger = new javax.swing.JSpinner();
        pricehamberger = new javax.swing.JLabel();
        myButton6 = new Swing.MyButton();
        jLabel19 = new javax.swing.JLabel();
        myButton7 = new Swing.MyButton();
        jButton7 = new javax.swing.JButton();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        hotdog = new javax.swing.JLabel();
        buyhotdog = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        spinhotdog = new javax.swing.JSpinner();
        pricehotdog = new javax.swing.JLabel();
        myButton8 = new Swing.MyButton();
        jLabel25 = new javax.swing.JLabel();
        myButton9 = new Swing.MyButton();
        jButton9 = new javax.swing.JButton();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pizza = new javax.swing.JLabel();
        buypizza = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        spinpizza = new javax.swing.JSpinner();
        pricepizza = new javax.swing.JLabel();
        myButton10 = new Swing.MyButton();
        jLabel31 = new javax.swing.JLabel();
        myButton11 = new Swing.MyButton();
        jButton11 = new javax.swing.JButton();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        rice = new javax.swing.JLabel();
        buyrice = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        spinrice = new javax.swing.JSpinner();
        pricerice = new javax.swing.JLabel();
        myButton12 = new Swing.MyButton();
        jLabel37 = new javax.swing.JLabel();
        myButton13 = new Swing.MyButton();
        jButton13 = new javax.swing.JButton();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        myButton14 = new Swing.MyButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jSpinner15 = new javax.swing.JSpinner();
        myButton15 = new Swing.MyButton();
        jLabel45 = new javax.swing.JLabel();
        stack = new javax.swing.JLabel();
        buystack = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        spinstack = new javax.swing.JSpinner();
        pricestack = new javax.swing.JLabel();
        myButton16 = new Swing.MyButton();
        jLabel49 = new javax.swing.JLabel();
        myButton17 = new Swing.MyButton();
        jButton17 = new javax.swing.JButton();
        jSpinner17 = new javax.swing.JSpinner();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        myButton18 = new Swing.MyButton();
        myButton19 = new Swing.MyButton();
        jLabel53 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jButton18 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        tuna = new javax.swing.JLabel();
        buytuna = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        spintuna = new javax.swing.JSpinner();
        pricetuna = new javax.swing.JLabel();
        myButton20 = new Swing.MyButton();
        jLabel61 = new javax.swing.JLabel();
        myButton21 = new Swing.MyButton();
        jButton21 = new javax.swing.JButton();
        jSpinner21 = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        myButton22 = new Swing.MyButton();
        myButton23 = new Swing.MyButton();
        jLabel65 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jButton22 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        seafood = new javax.swing.JLabel();
        buyseafood = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        spinseafood = new javax.swing.JSpinner();
        priceseafood = new javax.swing.JLabel();
        myButton24 = new Swing.MyButton();
        jLabel73 = new javax.swing.JLabel();
        myButton25 = new Swing.MyButton();
        jButton25 = new javax.swing.JButton();
        jSpinner25 = new javax.swing.JSpinner();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        myButton26 = new Swing.MyButton();
        myButton27 = new Swing.MyButton();
        jLabel77 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jButton26 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bpay = new Swing.MyButton();
        bclear = new Swing.MyButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        qrcode = new javax.swing.JRadioButton();
        banknote = new javax.swing.JRadioButton();
        tdollar = new javax.swing.JTextField();
        triel = new javax.swing.JTextField();
        titem = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        bexit = new Swing.MyButton();
        bdelete = new Swing.MyButton();
        jLabel28 = new javax.swing.JLabel();
        cbdiscount = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pexels-matthardy-1842861.jpg")); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pexels-matthardy-1842861.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 850));
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\roast chicken.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1110, 20, 150, 120);

        pricechicken.setForeground(new java.awt.Color(0, 0, 0));
        pricechicken.setText("Price: 9.99$");
        getContentPane().add(pricechicken);
        pricechicken.setBounds(1130, 180, 100, 20);

        chicken.setForeground(new java.awt.Color(0, 0, 0));
        chicken.setText("Name: Roast Chicken");
        getContentPane().add(chicken);
        chicken.setBounds(1130, 160, 120, 15);

        buychicken.setText("Buy");
        buychicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buychickenActionPerformed(evt);
            }
        });
        getContentPane().add(buychicken);
        buychicken.setBounds(1200, 220, 53, 22);
        getContentPane().add(spinchicken);
        spinchicken.setBounds(1130, 220, 50, 22);

        myButton1.setBackground(new java.awt.Color(204, 204, 204));
        myButton1.setBorder(null);
        myButton1.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton1.setColor(new java.awt.Color(204, 204, 204));
        myButton1.setColorClick(new java.awt.Color(255, 255, 204));
        myButton1.setColorOver(new java.awt.Color(255, 153, 255));
        myButton1.setRadius(50);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton1);
        myButton1.setBounds(1110, 10, 160, 250);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\sa.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(960, 20, 150, 120);

        pricesa.setForeground(new java.awt.Color(0, 0, 0));
        pricesa.setText("Price: 4.99$");
        getContentPane().add(pricesa);
        pricesa.setBounds(960, 180, 100, 20);

        sa.setForeground(new java.awt.Color(0, 0, 0));
        sa.setText("Name: Sa");
        getContentPane().add(sa);
        sa.setBounds(960, 160, 100, 15);

        buysa.setText("Buy");
        buysa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buysaActionPerformed(evt);
            }
        });
        getContentPane().add(buysa);
        buysa.setBounds(1030, 220, 53, 22);
        getContentPane().add(spinsa);
        spinsa.setBounds(960, 220, 50, 22);

        myButton2.setBackground(new java.awt.Color(204, 204, 204));
        myButton2.setBorder(null);
        myButton2.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton2.setColor(new java.awt.Color(204, 204, 204));
        myButton2.setColorClick(new java.awt.Color(255, 255, 204));
        myButton2.setColorOver(new java.awt.Color(255, 153, 255));
        myButton2.setRadius(50);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton2);
        myButton2.setBounds(940, 10, 160, 250);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\water.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(790, 20, 120, 120);

        pricewater.setForeground(new java.awt.Color(0, 0, 0));
        pricewater.setText("Price: 0.49$");
        getContentPane().add(pricewater);
        pricewater.setBounds(790, 180, 100, 20);

        water.setForeground(new java.awt.Color(0, 0, 0));
        water.setText("Name: Water");
        getContentPane().add(water);
        water.setBounds(790, 160, 100, 15);

        buywater.setText("Buy");
        buywater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buywaterActionPerformed(evt);
            }
        });
        getContentPane().add(buywater);
        buywater.setBounds(860, 220, 53, 22);
        getContentPane().add(spinwater);
        spinwater.setBounds(790, 220, 50, 22);

        myButton3.setBackground(new java.awt.Color(204, 204, 204));
        myButton3.setBorder(null);
        myButton3.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton3.setColor(new java.awt.Color(204, 204, 204));
        myButton3.setColorClick(new java.awt.Color(255, 255, 204));
        myButton3.setColorOver(new java.awt.Color(255, 153, 255));
        myButton3.setRadius(50);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton3);
        myButton3.setBounds(770, 10, 160, 250);

        coca.setForeground(new java.awt.Color(0, 0, 0));
        coca.setText("Name: Cocacola");
        getContentPane().add(coca);
        coca.setBounds(620, 160, 100, 15);
        getContentPane().add(spincoca);
        spincoca.setBounds(620, 220, 50, 22);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(620, 20, 120, 120);

        buycoca.setText("Buy");
        buycoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buycocaActionPerformed(evt);
            }
        });
        getContentPane().add(buycoca);
        buycoca.setBounds(690, 220, 53, 22);

        pricecoca.setForeground(new java.awt.Color(0, 0, 0));
        pricecoca.setText("Price: 0.99$");
        getContentPane().add(pricecoca);
        pricecoca.setBounds(620, 180, 100, 20);

        myButton4.setBackground(new java.awt.Color(204, 204, 204));
        myButton4.setBorder(null);
        myButton4.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton4.setColor(new java.awt.Color(204, 204, 204));
        myButton4.setColorClick(new java.awt.Color(255, 255, 204));
        myButton4.setColorOver(new java.awt.Color(255, 153, 255));
        myButton4.setRadius(50);
        myButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton4);
        myButton4.setBounds(600, 10, 160, 250);

        spaghatti.setForeground(new java.awt.Color(0, 0, 0));
        spaghatti.setText("Name: Spaghatti");
        getContentPane().add(spaghatti);
        spaghatti.setBounds(1130, 680, 100, 15);
        getContentPane().add(spinspaghatti);
        spinspaghatti.setBounds(1130, 740, 50, 22);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\spaghatti.png")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(1110, 540, 150, 120);

        buyspaghatti.setText("Buy");
        buyspaghatti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyspaghattiActionPerformed(evt);
            }
        });
        getContentPane().add(buyspaghatti);
        buyspaghatti.setBounds(1200, 740, 53, 22);

        pricespaghatti.setForeground(new java.awt.Color(0, 0, 0));
        pricespaghatti.setText("Price: 8.99$");
        getContentPane().add(pricespaghatti);
        pricespaghatti.setBounds(1130, 700, 100, 20);

        myButton5.setBackground(new java.awt.Color(204, 204, 204));
        myButton5.setBorder(null);
        myButton5.setForeground(new java.awt.Color(0, 0, 0));
        myButton5.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton5.setColor(new java.awt.Color(204, 204, 204));
        myButton5.setColorClick(new java.awt.Color(255, 255, 204));
        myButton5.setColorOver(new java.awt.Color(255, 153, 255));
        myButton5.setRadius(50);
        myButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton5);
        myButton5.setBounds(1110, 530, 160, 250);

        hamberger.setForeground(new java.awt.Color(0, 0, 0));
        hamberger.setText("Name: Hamberger");
        getContentPane().add(hamberger);
        hamberger.setBounds(1130, 420, 100, 15);

        buyhamberger.setText("Buy");
        buyhamberger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyhambergerActionPerformed(evt);
            }
        });
        getContentPane().add(buyhamberger);
        buyhamberger.setBounds(1200, 480, 53, 22);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\hamberger.png")); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1130, 280, 150, 120);
        getContentPane().add(spinhamberger);
        spinhamberger.setBounds(1130, 480, 50, 22);

        pricehamberger.setForeground(new java.awt.Color(0, 0, 0));
        pricehamberger.setText("Price: 2.99$");
        getContentPane().add(pricehamberger);
        pricehamberger.setBounds(1130, 440, 100, 20);

        myButton6.setBackground(new java.awt.Color(204, 204, 204));
        myButton6.setBorder(null);
        myButton6.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton6.setColor(new java.awt.Color(204, 204, 204));
        myButton6.setColorClick(new java.awt.Color(255, 255, 204));
        myButton6.setColorOver(new java.awt.Color(255, 153, 255));
        myButton6.setRadius(50);
        myButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton6);
        myButton6.setBounds(1110, 270, 160, 250);

        jLabel19.setText("Name: Cocacola");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(1130, 420, 100, 15);

        myButton7.setBackground(new java.awt.Color(51, 51, 55));
        myButton7.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton7.setColorClick(new java.awt.Color(255, 255, 204));
        myButton7.setColorOver(new java.awt.Color(255, 255, 102));
        myButton7.setRadius(50);
        myButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton7);
        myButton7.setBounds(1110, 270, 160, 250);

        jButton7.setText("Buy");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1200, 480, 53, 20);
        getContentPane().add(jSpinner7);
        jSpinner7.setBounds(1130, 480, 50, 20);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(1130, 280, 120, 120);

        jLabel21.setText("Price: 1$");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1130, 440, 100, 20);

        hotdog.setForeground(new java.awt.Color(0, 0, 0));
        hotdog.setText("Name: Hot Dog");
        getContentPane().add(hotdog);
        hotdog.setBounds(960, 420, 100, 15);

        buyhotdog.setText("Buy");
        buyhotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyhotdogActionPerformed(evt);
            }
        });
        getContentPane().add(buyhotdog);
        buyhotdog.setBounds(1030, 480, 53, 22);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\hot dog.png")); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(960, 280, 150, 120);
        getContentPane().add(spinhotdog);
        spinhotdog.setBounds(960, 480, 50, 22);

        pricehotdog.setForeground(new java.awt.Color(0, 0, 0));
        pricehotdog.setText("Price: 2.99$");
        getContentPane().add(pricehotdog);
        pricehotdog.setBounds(960, 440, 100, 20);

        myButton8.setBackground(new java.awt.Color(204, 204, 204));
        myButton8.setBorder(null);
        myButton8.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton8.setColor(new java.awt.Color(204, 204, 204));
        myButton8.setColorClick(new java.awt.Color(255, 255, 204));
        myButton8.setColorOver(new java.awt.Color(255, 153, 255));
        myButton8.setRadius(50);
        myButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton8);
        myButton8.setBounds(940, 270, 160, 250);

        jLabel25.setText("Name: Cocacola");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(960, 420, 100, 15);

        myButton9.setBackground(new java.awt.Color(51, 51, 55));
        myButton9.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton9.setColorClick(new java.awt.Color(255, 255, 204));
        myButton9.setColorOver(new java.awt.Color(255, 255, 102));
        myButton9.setRadius(50);
        myButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton9);
        myButton9.setBounds(940, 270, 160, 250);

        jButton9.setText("Buy");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(1030, 480, 53, 20);
        getContentPane().add(jSpinner9);
        jSpinner9.setBounds(960, 480, 50, 20);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(960, 280, 120, 120);

        jLabel27.setText("Price: 1$");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(960, 440, 100, 20);

        pizza.setForeground(new java.awt.Color(0, 0, 0));
        pizza.setText("Name: Pizza");
        getContentPane().add(pizza);
        pizza.setBounds(790, 420, 100, 15);

        buypizza.setText("Buy");
        buypizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buypizzaActionPerformed(evt);
            }
        });
        getContentPane().add(buypizza);
        buypizza.setBounds(860, 480, 53, 22);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\pizza.png")); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(770, 280, 150, 120);
        getContentPane().add(spinpizza);
        spinpizza.setBounds(790, 480, 50, 22);

        pricepizza.setForeground(new java.awt.Color(0, 0, 0));
        pricepizza.setText("Price: 19.99$");
        getContentPane().add(pricepizza);
        pricepizza.setBounds(790, 440, 100, 20);

        myButton10.setBackground(new java.awt.Color(204, 204, 204));
        myButton10.setBorder(null);
        myButton10.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton10.setColor(new java.awt.Color(204, 204, 204));
        myButton10.setColorClick(new java.awt.Color(255, 255, 204));
        myButton10.setColorOver(new java.awt.Color(255, 153, 255));
        myButton10.setRadius(50);
        myButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton10);
        myButton10.setBounds(770, 270, 160, 250);

        jLabel31.setText("Name: Cocacola");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(790, 420, 100, 15);

        myButton11.setBackground(new java.awt.Color(51, 51, 55));
        myButton11.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton11.setColorClick(new java.awt.Color(255, 255, 204));
        myButton11.setColorOver(new java.awt.Color(255, 255, 102));
        myButton11.setRadius(50);
        myButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton11);
        myButton11.setBounds(770, 270, 160, 250);

        jButton11.setText("Buy");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(860, 480, 53, 20);
        getContentPane().add(jSpinner11);
        jSpinner11.setBounds(790, 480, 50, 20);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(790, 280, 120, 120);

        jLabel33.setText("Price: 1$");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(790, 440, 100, 20);

        rice.setForeground(new java.awt.Color(0, 0, 0));
        rice.setText("Name: Rice");
        getContentPane().add(rice);
        rice.setBounds(620, 420, 100, 15);

        buyrice.setText("Buy");
        buyrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyriceActionPerformed(evt);
            }
        });
        getContentPane().add(buyrice);
        buyrice.setBounds(690, 480, 53, 22);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\rice.png")); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(620, 280, 150, 120);
        getContentPane().add(spinrice);
        spinrice.setBounds(620, 480, 50, 22);

        pricerice.setForeground(new java.awt.Color(0, 0, 0));
        pricerice.setText("Price: 1.49$");
        getContentPane().add(pricerice);
        pricerice.setBounds(620, 440, 100, 20);

        myButton12.setBackground(new java.awt.Color(204, 204, 204));
        myButton12.setBorder(null);
        myButton12.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton12.setColor(new java.awt.Color(204, 204, 204));
        myButton12.setColorClick(new java.awt.Color(255, 255, 204));
        myButton12.setColorOver(new java.awt.Color(255, 153, 255));
        myButton12.setRadius(50);
        myButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton12);
        myButton12.setBounds(600, 270, 160, 250);

        jLabel37.setText("Name: Cocacola");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(620, 420, 100, 15);

        myButton13.setBackground(new java.awt.Color(51, 51, 55));
        myButton13.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton13.setColorClick(new java.awt.Color(255, 255, 204));
        myButton13.setColorOver(new java.awt.Color(255, 255, 102));
        myButton13.setRadius(50);
        myButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton13);
        myButton13.setBounds(600, 270, 160, 250);

        jButton13.setText("Buy");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(690, 480, 53, 20);
        getContentPane().add(jSpinner13);
        jSpinner13.setBounds(620, 480, 50, 20);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(620, 280, 120, 120);

        jLabel39.setText("Price: 1$");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(620, 440, 100, 20);

        jLabel40.setText("Price: 1$");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(620, 440, 100, 20);

        myButton14.setBackground(new java.awt.Color(51, 51, 55));
        myButton14.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton14.setColorClick(new java.awt.Color(255, 255, 204));
        myButton14.setColorOver(new java.awt.Color(255, 255, 102));
        myButton14.setRadius(50);
        myButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton14);
        myButton14.setBounds(600, 270, 160, 250);

        jLabel41.setText("Price: 1$");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(620, 440, 100, 20);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel42);
        jLabel42.setBounds(620, 280, 120, 120);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(620, 280, 120, 120);

        jLabel44.setText("Name: Cocacola");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(620, 420, 100, 15);
        getContentPane().add(jSpinner14);
        jSpinner14.setBounds(620, 480, 50, 20);

        jButton14.setText("Buy");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(690, 480, 53, 20);

        jButton15.setText("Buy");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(690, 480, 53, 20);
        getContentPane().add(jSpinner15);
        jSpinner15.setBounds(620, 480, 50, 20);

        myButton15.setBackground(new java.awt.Color(51, 51, 55));
        myButton15.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton15.setColorClick(new java.awt.Color(255, 255, 204));
        myButton15.setColorOver(new java.awt.Color(255, 255, 102));
        myButton15.setRadius(50);
        myButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton15);
        myButton15.setBounds(600, 270, 160, 250);

        jLabel45.setText("Name: Cocacola");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(620, 420, 100, 15);

        stack.setForeground(new java.awt.Color(0, 0, 0));
        stack.setText("Name: Stack");
        getContentPane().add(stack);
        stack.setBounds(960, 680, 100, 15);

        buystack.setText("Buy");
        buystack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buystackActionPerformed(evt);
            }
        });
        getContentPane().add(buystack);
        buystack.setBounds(1030, 740, 53, 22);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\staek.png")); // NOI18N
        getContentPane().add(jLabel47);
        jLabel47.setBounds(940, 540, 150, 120);
        getContentPane().add(spinstack);
        spinstack.setBounds(960, 740, 50, 22);

        pricestack.setForeground(new java.awt.Color(0, 0, 0));
        pricestack.setText("Price: 9.99$");
        getContentPane().add(pricestack);
        pricestack.setBounds(960, 700, 100, 20);

        myButton16.setBackground(new java.awt.Color(204, 204, 204));
        myButton16.setBorder(null);
        myButton16.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton16.setColor(new java.awt.Color(204, 204, 204));
        myButton16.setColorClick(new java.awt.Color(255, 255, 204));
        myButton16.setColorOver(new java.awt.Color(255, 153, 255));
        myButton16.setRadius(50);
        myButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton16);
        myButton16.setBounds(940, 530, 160, 250);

        jLabel49.setText("Name: Cocacola");
        getContentPane().add(jLabel49);
        jLabel49.setBounds(960, 680, 100, 15);

        myButton17.setBackground(new java.awt.Color(51, 51, 55));
        myButton17.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton17.setColorClick(new java.awt.Color(255, 255, 204));
        myButton17.setColorOver(new java.awt.Color(255, 255, 102));
        myButton17.setRadius(50);
        myButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton17);
        myButton17.setBounds(940, 530, 160, 250);

        jButton17.setText("Buy");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(1030, 740, 53, 20);
        getContentPane().add(jSpinner17);
        jSpinner17.setBounds(960, 740, 50, 20);

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel50);
        jLabel50.setBounds(960, 540, 120, 120);

        jLabel51.setText("Price: 1$");
        getContentPane().add(jLabel51);
        jLabel51.setBounds(960, 700, 100, 20);

        jLabel52.setText("Name: Cocacola");
        getContentPane().add(jLabel52);
        jLabel52.setBounds(960, 680, 100, 15);
        getContentPane().add(jSpinner18);
        jSpinner18.setBounds(960, 740, 50, 20);

        myButton18.setBackground(new java.awt.Color(51, 51, 55));
        myButton18.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton18.setColorClick(new java.awt.Color(255, 255, 204));
        myButton18.setColorOver(new java.awt.Color(255, 255, 102));
        myButton18.setRadius(50);
        myButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton18);
        myButton18.setBounds(940, 530, 160, 250);

        myButton19.setBackground(new java.awt.Color(51, 51, 55));
        myButton19.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton19.setColorClick(new java.awt.Color(255, 255, 204));
        myButton19.setColorOver(new java.awt.Color(255, 255, 102));
        myButton19.setRadius(50);
        myButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton19);
        myButton19.setBounds(940, 530, 160, 250);

        jLabel53.setText("Name: Cocacola");
        getContentPane().add(jLabel53);
        jLabel53.setBounds(960, 680, 100, 15);
        getContentPane().add(jSpinner19);
        jSpinner19.setBounds(960, 740, 50, 20);

        jButton18.setText("Buy");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(1030, 740, 53, 20);

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel54);
        jLabel54.setBounds(960, 540, 120, 120);

        jButton19.setText("Buy");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(1030, 740, 53, 20);

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel55);
        jLabel55.setBounds(960, 540, 120, 120);

        jLabel56.setText("Price: 1$");
        getContentPane().add(jLabel56);
        jLabel56.setBounds(960, 700, 100, 20);

        jLabel57.setText("Price: 1$");
        getContentPane().add(jLabel57);
        jLabel57.setBounds(960, 700, 100, 20);

        tuna.setForeground(new java.awt.Color(0, 0, 0));
        tuna.setText("Name: Tuna");
        getContentPane().add(tuna);
        tuna.setBounds(790, 680, 100, 15);

        buytuna.setText("Buy");
        buytuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buytunaActionPerformed(evt);
            }
        });
        getContentPane().add(buytuna);
        buytuna.setBounds(860, 740, 53, 22);

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\tuna Staek.png")); // NOI18N
        getContentPane().add(jLabel59);
        jLabel59.setBounds(790, 540, 150, 120);
        getContentPane().add(spintuna);
        spintuna.setBounds(790, 740, 50, 22);

        pricetuna.setForeground(new java.awt.Color(0, 0, 0));
        pricetuna.setText("Price: 24.99$");
        getContentPane().add(pricetuna);
        pricetuna.setBounds(790, 700, 100, 20);

        myButton20.setBackground(new java.awt.Color(204, 204, 204));
        myButton20.setBorder(null);
        myButton20.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton20.setColor(new java.awt.Color(204, 204, 204));
        myButton20.setColorClick(new java.awt.Color(255, 255, 204));
        myButton20.setColorOver(new java.awt.Color(255, 153, 255));
        myButton20.setRadius(50);
        myButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton20);
        myButton20.setBounds(770, 530, 160, 250);

        jLabel61.setText("Name: Cocacola");
        getContentPane().add(jLabel61);
        jLabel61.setBounds(790, 680, 100, 15);

        myButton21.setBackground(new java.awt.Color(51, 51, 55));
        myButton21.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton21.setColorClick(new java.awt.Color(255, 255, 204));
        myButton21.setColorOver(new java.awt.Color(255, 255, 102));
        myButton21.setRadius(50);
        myButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton21);
        myButton21.setBounds(770, 530, 160, 250);

        jButton21.setText("Buy");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(860, 740, 53, 20);
        getContentPane().add(jSpinner21);
        jSpinner21.setBounds(790, 740, 50, 20);

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel62);
        jLabel62.setBounds(790, 540, 120, 120);

        jLabel63.setText("Price: 1$");
        getContentPane().add(jLabel63);
        jLabel63.setBounds(790, 700, 100, 20);

        jLabel64.setText("Name: Cocacola");
        getContentPane().add(jLabel64);
        jLabel64.setBounds(790, 680, 100, 15);
        getContentPane().add(jSpinner22);
        jSpinner22.setBounds(790, 740, 50, 20);

        myButton22.setBackground(new java.awt.Color(51, 51, 55));
        myButton22.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton22.setColorClick(new java.awt.Color(255, 255, 204));
        myButton22.setColorOver(new java.awt.Color(255, 255, 102));
        myButton22.setRadius(50);
        myButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton22);
        myButton22.setBounds(770, 530, 160, 250);

        myButton23.setBackground(new java.awt.Color(51, 51, 55));
        myButton23.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton23.setColorClick(new java.awt.Color(255, 255, 204));
        myButton23.setColorOver(new java.awt.Color(255, 255, 102));
        myButton23.setRadius(50);
        myButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton23);
        myButton23.setBounds(770, 530, 160, 250);

        jLabel65.setText("Name: Cocacola");
        getContentPane().add(jLabel65);
        jLabel65.setBounds(790, 680, 100, 15);
        getContentPane().add(jSpinner23);
        jSpinner23.setBounds(790, 740, 50, 20);

        jButton22.setText("Buy");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(860, 740, 53, 20);

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel66);
        jLabel66.setBounds(790, 540, 120, 120);

        jButton23.setText("Buy");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(860, 740, 53, 20);

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel67);
        jLabel67.setBounds(790, 540, 120, 120);

        jLabel68.setText("Price: 1$");
        getContentPane().add(jLabel68);
        jLabel68.setBounds(790, 700, 100, 20);

        jLabel69.setText("Price: 1$");
        getContentPane().add(jLabel69);
        jLabel69.setBounds(790, 700, 100, 20);

        seafood.setForeground(new java.awt.Color(0, 0, 0));
        seafood.setText("Name: Sea Food");
        getContentPane().add(seafood);
        seafood.setBounds(620, 680, 100, 15);

        buyseafood.setText("Buy");
        buyseafood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyseafoodActionPerformed(evt);
            }
        });
        getContentPane().add(buyseafood);
        buyseafood.setBounds(690, 740, 53, 22);

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\seafppd.png")); // NOI18N
        getContentPane().add(jLabel71);
        jLabel71.setBounds(610, 540, 150, 120);
        getContentPane().add(spinseafood);
        spinseafood.setBounds(620, 740, 50, 22);

        priceseafood.setForeground(new java.awt.Color(0, 0, 0));
        priceseafood.setText("Price: 14.99$");
        getContentPane().add(priceseafood);
        priceseafood.setBounds(620, 700, 100, 20);

        myButton24.setBackground(new java.awt.Color(204, 204, 204));
        myButton24.setBorder(null);
        myButton24.setBorderColor(new java.awt.Color(0, 0, 0));
        myButton24.setColor(new java.awt.Color(204, 204, 204));
        myButton24.setColorClick(new java.awt.Color(255, 255, 204));
        myButton24.setColorOver(new java.awt.Color(255, 153, 255));
        myButton24.setRadius(50);
        myButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton24);
        myButton24.setBounds(600, 530, 160, 250);

        jLabel73.setText("Name: Cocacola");
        getContentPane().add(jLabel73);
        jLabel73.setBounds(620, 680, 100, 15);

        myButton25.setBackground(new java.awt.Color(51, 51, 55));
        myButton25.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton25.setColorClick(new java.awt.Color(255, 255, 204));
        myButton25.setColorOver(new java.awt.Color(255, 255, 102));
        myButton25.setRadius(50);
        myButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton25);
        myButton25.setBounds(600, 530, 160, 250);

        jButton25.setText("Buy");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(690, 740, 53, 20);
        getContentPane().add(jSpinner25);
        jSpinner25.setBounds(620, 740, 50, 20);

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel74);
        jLabel74.setBounds(620, 540, 120, 120);

        jLabel75.setText("Price: 1$");
        getContentPane().add(jLabel75);
        jLabel75.setBounds(620, 700, 100, 20);

        jLabel76.setText("Name: Cocacola");
        getContentPane().add(jLabel76);
        jLabel76.setBounds(620, 680, 100, 15);
        getContentPane().add(jSpinner26);
        jSpinner26.setBounds(620, 740, 50, 20);

        myButton26.setBackground(new java.awt.Color(51, 51, 55));
        myButton26.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton26.setColorClick(new java.awt.Color(255, 255, 204));
        myButton26.setColorOver(new java.awt.Color(255, 255, 102));
        myButton26.setRadius(50);
        myButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton26);
        myButton26.setBounds(600, 530, 160, 250);

        myButton27.setBackground(new java.awt.Color(51, 51, 55));
        myButton27.setBorderColor(new java.awt.Color(255, 51, 51));
        myButton27.setColorClick(new java.awt.Color(255, 255, 204));
        myButton27.setColorOver(new java.awt.Color(255, 255, 102));
        myButton27.setRadius(50);
        myButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(myButton27);
        myButton27.setBounds(600, 530, 160, 250);

        jLabel77.setText("Name: Cocacola");
        getContentPane().add(jLabel77);
        jLabel77.setBounds(620, 680, 100, 15);
        getContentPane().add(jSpinner27);
        jSpinner27.setBounds(620, 740, 50, 20);

        jButton26.setText("Buy");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(690, 740, 53, 20);

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel78);
        jLabel78.setBounds(620, 540, 120, 120);

        jButton27.setText("Buy");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(690, 740, 53, 20);

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Dokumen\\code\\cpp.code\\Tp_itccpp\\Tree\\coca.png")); // NOI18N
        getContentPane().add(jLabel79);
        jLabel79.setBounds(620, 540, 120, 120);

        jLabel80.setText("Price: 1$");
        getContentPane().add(jLabel80);
        jLabel80.setBounds(620, 700, 100, 20);

        jLabel81.setText("Price: 1$");
        getContentPane().add(jLabel81);
        jLabel81.setBounds(620, 700, 100, 20);

        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mix Food");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 80, 210, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\images (1).png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, -30, 190, 220);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Payment"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 560, 190);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\images.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 0, 210, 190);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\images.png")); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(-50, 0, 250, 190);

        bpay.setBorder(null);
        bpay.setForeground(new java.awt.Color(0, 0, 0));
        bpay.setText("Pay");
        bpay.setColorClick(new java.awt.Color(204, 0, 0));
        bpay.setColorOver(new java.awt.Color(204, 0, 0));
        bpay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bpay.setRadius(40);
        bpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpayActionPerformed(evt);
            }
        });
        getContentPane().add(bpay);
        bpay.setBounds(0, 730, 140, 40);

        bclear.setBorder(null);
        bclear.setForeground(new java.awt.Color(0, 0, 0));
        bclear.setText("Clear");
        bclear.setColorClick(new java.awt.Color(204, 0, 0));
        bclear.setColorOver(new java.awt.Color(204, 0, 0));
        bclear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bclear.setRadius(40);
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear);
        bclear.setBounds(150, 730, 140, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 510, 80, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Riel : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 570, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Item : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 510, 80, 40);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Dollar : ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 570, 120, 40);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("$");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(270, 570, 30, 40);

        buttonGroup1.add(qrcode);
        qrcode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        qrcode.setText("QR Code");
        getContentPane().add(qrcode);
        qrcode.setBounds(310, 660, 100, 30);

        buttonGroup1.add(banknote);
        banknote.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        banknote.setText("Banknote");
        getContentPane().add(banknote);
        banknote.setBounds(160, 660, 100, 30);

        tdollar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tdollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdollarActionPerformed(evt);
            }
        });
        getContentPane().add(tdollar);
        tdollar.setBounds(110, 570, 160, 40);

        triel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        triel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trielActionPerformed(evt);
            }
        });
        getContentPane().add(triel);
        triel.setBounds(370, 570, 190, 40);

        titem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        titem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titemActionPerformed(evt);
            }
        });
        getContentPane().add(titem);
        titem.setBounds(90, 510, 180, 40);

        ttotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttotalMouseClicked(evt);
            }
        });
        ttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttotalActionPerformed(evt);
            }
        });
        getContentPane().add(ttotal);
        ttotal.setBounds(380, 510, 180, 40);

        bexit.setBorder(null);
        bexit.setForeground(new java.awt.Color(0, 0, 0));
        bexit.setText("Exit");
        bexit.setColorClick(new java.awt.Color(204, 0, 0));
        bexit.setColorOver(new java.awt.Color(204, 0, 0));
        bexit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bexit.setRadius(40);
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(450, 730, 140, 40);

        bdelete.setBorder(null);
        bdelete.setForeground(new java.awt.Color(0, 0, 0));
        bdelete.setText("Delete");
        bdelete.setColorClick(new java.awt.Color(204, 0, 0));
        bdelete.setColorOver(new java.awt.Color(204, 0, 0));
        bdelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bdelete.setRadius(40);
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bdelete);
        bdelete.setBounds(300, 730, 140, 40);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Pay by : ");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(20, 650, 130, 50);

        cbdiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%" }));
        cbdiscount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiscountActionPerformed(evt);
            }
        });
        cbdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbdiscountKeyReleased(evt);
            }
        });
        getContentPane().add(cbdiscount);
        cbdiscount.setBounds(160, 440, 170, 40);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Discount : ");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 430, 130, 50);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("R");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(560, 570, 30, 40);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("$");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(560, 510, 30, 40);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel34);
        jLabel34.setBounds(560, 570, 30, 40);
        getContentPane().add(jProgressBar6);
        jProgressBar6.setBounds(10, 500, 280, 60);
        getContentPane().add(jProgressBar7);
        jProgressBar7.setBounds(10, 560, 280, 60);
        getContentPane().add(jProgressBar8);
        jProgressBar8.setBounds(290, 500, 290, 60);
        getContentPane().add(jProgressBar9);
        jProgressBar9.setBounds(290, 560, 290, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void buychickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buychickenActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinchicken.getValue();
        if(qty > 0){
            String name ="Roast Chicken";
            double price = 9.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinchicken.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buychickenActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1ActionPerformed

    private void buysaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buysaActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinsa.getValue();
        if(qty > 0){
            String name ="Sa";
            double price = 4.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinsa.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buysaActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton2ActionPerformed

    private void buywaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buywaterActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinwater.getValue();
        if(qty > 0){
            String name ="Water";
            double price = 0.49;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinwater.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
             disccount();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buywaterActionPerformed

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton3ActionPerformed

    private void buycocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buycocaActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spincoca.getValue();
        if(qty > 0){
            String name ="Cocacola";
            double price = 0.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spincoca.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total(); 
            cart_dollar();
            cart_riel();
            cart_item();
             disccount();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
       
    }//GEN-LAST:event_buycocaActionPerformed

    private void myButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton4ActionPerformed

    private void buyspaghattiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyspaghattiActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinspaghatti.getValue();
        if(qty > 0){
            String name ="Spaghatti";
            double price = 8.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinspaghatti.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buyspaghattiActionPerformed

    private void myButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton5ActionPerformed

    private void buyhambergerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyhambergerActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinhamberger.getValue();
        if(qty > 0){
            String name ="Hamberger";
            double price = 2.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinhamberger.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buyhambergerActionPerformed

    private void myButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton6ActionPerformed

    private void myButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton7ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void buyhotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyhotdogActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinhotdog.getValue();
        if(qty > 0){
            String name ="Hot dog";
            double price = 2.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinhotdog.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buyhotdogActionPerformed

    private void myButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton8ActionPerformed

    private void myButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton9ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void buypizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buypizzaActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinpizza.getValue();
        if(qty > 0){
            String name ="Pizza";
            double price = 19.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinpizza.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buypizzaActionPerformed

    private void myButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton10ActionPerformed

    private void myButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton11ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void buyriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyriceActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinrice.getValue();
        if(qty > 0){
            String name ="Rice";
            double price = 1.49;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinrice.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buyriceActionPerformed

    private void myButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton12ActionPerformed

    private void myButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton13ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void myButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton14ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void myButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton15ActionPerformed

    private void buystackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buystackActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinstack.getValue();
        if(qty > 0){
            String name ="Stack";
            double price = 9.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinstack.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buystackActionPerformed

    private void myButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton16ActionPerformed

    private void myButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton17ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void myButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton18ActionPerformed

    private void myButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void buytunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buytunaActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spintuna.getValue();
        if(qty > 0){
            String name ="Tuna";
            double price = 24.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spintuna.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buytunaActionPerformed

    private void myButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton20ActionPerformed

    private void myButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton21ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void myButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton22ActionPerformed

    private void myButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void buyseafoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyseafoodActionPerformed
        // TODO add your handling code here:
         DecimalFormat df = new DecimalFormat("0.00");
         DecimalFormat di = new DecimalFormat("0");
        int qty = (int) spinseafood.getValue();
        if(qty > 0){
            String name ="Sea food";
            double price = 14.99;
            double payment = qty*(price+0.01);
            amount +=payment;
            QTY += qty;
            model = (DefaultTableModel) table.getModel();
            Object row[] = {
                name,qty,price,payment
            };
            model.addRow(row);
            spinseafood.setValue(0);
            ttotal.setText(df.format(amount));
            titem.setText(di.format(QTY));
            tdollar.setText(df.format(amount));
            triel.setText(df.format(amount*4100));
            cart_total();
            cart_dollar();
            cart_riel();
            cart_item();
        }else{
            JOptionPane.showConfirmDialog(this, "Please Select Quantity");
        }
    }//GEN-LAST:event_buyseafoodActionPerformed

    private void myButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton24ActionPerformed

    private void myButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton25ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void myButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton26ActionPerformed

    private void myButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
//        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//       // int index = 
//                table.removeAll();//table.getSelectedRow();
//       // model.removeRow(index);
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        dm.setRowCount(0);
        dm.getDataVector().removeAllElements();
        cbdiscount.setSelectedIndex(0);
        titem.setText("");
        ttotal.setText("");
        tdollar.setText("");
        triel.setText("");
        buttonGroup1.clearSelection();
        amount = 0;
        QTY = 0;
        revalidate();
        // Refresh the table
//        table.revalidate();
//        table.repaint();
    }//GEN-LAST:event_bclearActionPerformed

    private void tdollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdollarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdollarActionPerformed

    private void trielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trielActionPerformed

    private void titemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titemActionPerformed
//    
//    public void addtable(String name,double pice,int qty,double pay){
//        DecimalFormat df = new DecimalFormat("00:00");
//        String totalprice = df.format(amount);
//        for (int i = 0; i < table.getRowCount(); i++) {
//            if(name == table.getValueAt(i, 1)){
//                model.removeRow(table.convertRowIndexToModel(i));
//            }
//        }
//        Vector v = new Vector();
//        v.add(name);
//        v.add(pice);
//        v.add(qty);
//        v.add(totalprice);
//        model.addRow(v);
//    }
//    
    private void ttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttotalActionPerformed
        // TODO add your handling code here:
//        int numofrow = table.getRowCount();        
//        for (int i = 0; i < numofrow; i++) {
////            double value = Double.valueOf(table.getValueAt(i, 4).toString());
////            tot +=value;
//            try {
//                double value = Double.valueOf(table.getValueAt(i, 4).toString());
//                amount += value;
//            } catch (NumberFormatException e) {
//                // Handle the case where the value is not a valid number
//                System.err.println("Invalid number format in row " + i + ": " + table.getValueAt(i, 4).toString());
//            }
//        }
//        ttotal.setText(String.valueOf(amount));
    }//GEN-LAST:event_ttotalActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_bexitActionPerformed
    public void cart_total(){
        int num_of_row = table.getRowCount();
        double total = 0;
//        double dddollar = 0;
//        double rrriel = 0;
//        int iiiiitem = 0;
        for (int i = 0; i < num_of_row; i++) {
            double value = Double.valueOf(table.getValueAt(i, 3).toString());
            total +=value;
            
//            dddollar +=value;
//            rrriel += value*4100;
//            int thing = Integer.valueOf(table.getValueAt(i, 2).toString());
//            iiiiitem += thing;
        }
        ttotal.setText(Double.toString(total));
//        tdollar.setText(Double.toString(dddollar));
//        triel.setText(Double.toString(rrriel));
//        ttotal.setText(String.format("%.2f",total));
//        tdollar.setText(String.format("%.2f",dddollar));
//        triel.setText(String.format("%.2f",rrriel));
//        titem.setText(Integer.toString(iiiiitem));
        
    }
    public void cart_dollar(){
        int num_of_row = table.getRowCount();
        double total = 0;
        for (int i = 0; i < num_of_row; i++) {
            double value = Double.valueOf(table.getValueAt(i, 3).toString());
            total +=value;
        }
        tdollar.setText(Double.toString(total));
    }
    public void cart_riel(){
        int num_of_row = table.getRowCount();
        double total = 0;
        for (int i = 0; i < num_of_row; i++) {
            double value = Double.valueOf(table.getValueAt(i, 3).toString());
            total +=(value*4100);
        }
        triel.setText(Double.toString(total));
    }
    public void cart_item(){
        int num_of_row = table.getRowCount();
        int iiiiitem = 0;
        for (int i = 0; i < num_of_row; i++) {
            int thing = Integer.valueOf(table.getValueAt(i, 1).toString());
            iiiiitem += thing;
        }
        titem.setText(Integer.toString(iiiiitem));
    }
    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // delete
//        DefaultTableModel model = (DefaultTableModel) table.getModel();//
//        String find = model.getValueAt(table.getSelectedRow(), 0).toString();
//        int index = table.getSelectedRow();//
//        model.removeRow(index);
//        
//        double val = Double.parseDouble(find);
//        double currenttotal = Double.parseDouble(ttotal.getText());
//        double currentdollar = Double.parseDouble(tdollar.getText());
//        double currentriel = Double.parseDouble(triel.getText());
//        double newtotal = currenttotal - val;
//        double newdollar = currentdollar - val;
//        double newriel = currentriel - val;
//        ttotal.setText(String.valueOf(newtotal));
//        tdollar.setText(String.valueOf(newdollar));
//        triel.setText(String.valueOf(newriel));
//        
//        int iitem = Integer.parseInt(find);
//        int currentitem = Integer.parseInt(titem.getText());
//        int newitem = currentitem - iitem;
//        titem.setText(String.valueOf(newitem));
            try{
                DefaultTableModel dt = (DefaultTableModel) table.getModel();//
                int index = table.getSelectedRow();//
                dt.removeRow(index);
                cart_total();
                cart_dollar();
                cart_riel();
                cart_item();
                
            }catch(Exception e){
            }
//            cart_total();
       

        
    }//GEN-LAST:event_bdeleteActionPerformed
    public void disccount(){
        DecimalFormat df = new DecimalFormat("0.00");
        int num_of_row = table.getRowCount();
        amount = 0;
        QTY = 0;

        for (int i = 0; i < num_of_row; i++) {
            amount += Double.valueOf(table.getValueAt(i, 3).toString());
            QTY += Integer.valueOf(table.getValueAt(i, 1).toString());
        }
        try{
            //amount = Double.parseDouble(ttotal.getText());
            String dis = cbdiscount.getSelectedItem().toString();

            dis = dis.substring(0,dis.length()-1);
            int disc = Integer.parseInt(dis);
            double pipay = amount - (amount *disc)/100;
            amount = pipay;
            ttotal.setText(df.format(pipay));
            tdollar.setText(df.format(pipay));
            double pipayriel = pipay*4100;
            triel.setText(df.format(pipayriel));
        }catch(Exception e){
        }
    }
    private void cbdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiscountActionPerformed
        // TODO add your handling code here:
//        DecimalFormat df = new DecimalFormat("0.00");
//        //amount = Double.parseDouble(ttotal.getText());
//        String dis = cbdiscount.getSelectedItem().toString();
//        dis = dis.substring(0,dis.length()-1);
//        int disc = Integer.parseInt(dis);
//        double pipay = amount - (amount *disc)/100;
//        ttotal.setText(df.format(pipay));
//        tdollar.setText(df.format(pipay));
//        double pipayriel = pipay*4100;
//        triel.setText(df.format(pipayriel));
        disccount();
    }//GEN-LAST:event_cbdiscountActionPerformed

    private void ttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttotalMouseClicked

    }//GEN-LAST:event_ttotalMouseClicked

    private void bpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpayActionPerformed
        // TODO add your handling code here:
        if(banknote.isSelected()== true){
            coat_banknote tc = new coat_banknote(amount);
            tc.setVisible(true);
            this.dispose();
        }else{
            qrcode qr = new qrcode(amount);
            qr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bpayActionPerformed

    private void cbdiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbdiscountKeyReleased
        // TODO add your handling code here:
         disccount();
    }//GEN-LAST:event_cbdiscountKeyReleased

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
            java.util.logging.Logger.getLogger(drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton banknote;
    private Swing.MyButton bclear;
    private Swing.MyButton bdelete;
    private Swing.MyButton bexit;
    private Swing.MyButton bpay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buychicken;
    private javax.swing.JButton buycoca;
    private javax.swing.JButton buyhamberger;
    private javax.swing.JButton buyhotdog;
    private javax.swing.JButton buypizza;
    private javax.swing.JButton buyrice;
    private javax.swing.JButton buysa;
    private javax.swing.JButton buyseafood;
    private javax.swing.JButton buyspaghatti;
    private javax.swing.JButton buystack;
    private javax.swing.JButton buytuna;
    private javax.swing.JButton buywater;
    private javax.swing.JComboBox<String> cbdiscount;
    private javax.swing.JLabel chicken;
    private javax.swing.JLabel coca;
    private javax.swing.JLabel hamberger;
    private javax.swing.JLabel hotdog;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner9;
    private Swing.MyButton myButton1;
    private Swing.MyButton myButton10;
    private Swing.MyButton myButton11;
    private Swing.MyButton myButton12;
    private Swing.MyButton myButton13;
    private Swing.MyButton myButton14;
    private Swing.MyButton myButton15;
    private Swing.MyButton myButton16;
    private Swing.MyButton myButton17;
    private Swing.MyButton myButton18;
    private Swing.MyButton myButton19;
    private Swing.MyButton myButton2;
    private Swing.MyButton myButton20;
    private Swing.MyButton myButton21;
    private Swing.MyButton myButton22;
    private Swing.MyButton myButton23;
    private Swing.MyButton myButton24;
    private Swing.MyButton myButton25;
    private Swing.MyButton myButton26;
    private Swing.MyButton myButton27;
    private Swing.MyButton myButton3;
    private Swing.MyButton myButton4;
    private Swing.MyButton myButton5;
    private Swing.MyButton myButton6;
    private Swing.MyButton myButton7;
    private Swing.MyButton myButton8;
    private Swing.MyButton myButton9;
    private javax.swing.JLabel pizza;
    private javax.swing.JLabel pricechicken;
    private javax.swing.JLabel pricecoca;
    private javax.swing.JLabel pricehamberger;
    private javax.swing.JLabel pricehotdog;
    private javax.swing.JLabel pricepizza;
    private javax.swing.JLabel pricerice;
    private javax.swing.JLabel pricesa;
    private javax.swing.JLabel priceseafood;
    private javax.swing.JLabel pricespaghatti;
    private javax.swing.JLabel pricestack;
    private javax.swing.JLabel pricetuna;
    private javax.swing.JLabel pricewater;
    private javax.swing.JRadioButton qrcode;
    private javax.swing.JLabel rice;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel seafood;
    private javax.swing.JLabel spaghatti;
    private javax.swing.JSpinner spinchicken;
    private javax.swing.JSpinner spincoca;
    private javax.swing.JSpinner spinhamberger;
    private javax.swing.JSpinner spinhotdog;
    private javax.swing.JSpinner spinpizza;
    private javax.swing.JSpinner spinrice;
    private javax.swing.JSpinner spinsa;
    private javax.swing.JSpinner spinseafood;
    private javax.swing.JSpinner spinspaghatti;
    private javax.swing.JSpinner spinstack;
    private javax.swing.JSpinner spintuna;
    private javax.swing.JSpinner spinwater;
    private javax.swing.JLabel stack;
    private javax.swing.JTable table;
    private javax.swing.JTextField tdollar;
    private javax.swing.JTextField titem;
    private javax.swing.JTextField triel;
    private javax.swing.JTextField ttotal;
    private javax.swing.JLabel tuna;
    private javax.swing.JLabel water;
    // End of variables declaration//GEN-END:variables
}
