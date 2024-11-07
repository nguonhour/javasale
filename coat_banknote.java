
package sale_element;

import java.awt.TextField;
import java.text.DecimalFormat;

public class coat_banknote extends javax.swing.JFrame {
    private double amount=0.00;
    private double total1;
    private double total2;
    String operation;
    String answer;
    
    
    public coat_banknote() {
        initComponents();
    }
    
    public coat_banknote(double amont) {
        initComponents();
        this.amount = amont;
        total_dollar.setText(String.valueOf(amont));
        total_riel.setText(String.valueOf(amont*4100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        b9 = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        deposit_riel = new javax.swing.JTextField();
        bclear = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        cost_riel = new javax.swing.JTextField();
        total_dollar = new javax.swing.JTextField();
        total_riel = new javax.swing.JTextField();
        deposit_dollar = new javax.swing.JTextField();
        cost_dollar = new javax.swing.JTextField();
        calculater = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bpoint = new javax.swing.JButton();
        criel = new javax.swing.JCheckBox();
        cdollar = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        home = new Swing.MyButton();
        b00 = new javax.swing.JButton();
        bsubtract = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bmultiply = new javax.swing.JButton();
        bdividetion = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bpercent = new javax.swing.JButton();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel31 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(995, 820));
        setMinimumSize(new java.awt.Dimension(995, 820));
        getContentPane().setLayout(null);

        b9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b9.setText("9");
        b9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(390, 630, 60, 50);

        bplus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bplus.setText("+");
        bplus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });
        getContentPane().add(bplus);
        bplus.setBounds(470, 630, 60, 50);

        b4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b4.setText("4");
        b4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(210, 560, 60, 50);

        b2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b2.setText("2");
        b2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(300, 490, 60, 50);

        b3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b3.setText("3");
        b3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(390, 490, 60, 50);

        b7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b7.setText("7");
        b7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(210, 630, 60, 50);

        b1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b1.setText("1");
        b1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(210, 490, 60, 50);

        b6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b6.setText("6");
        b6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(390, 560, 60, 50);

        b5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b5.setText("5");
        b5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(300, 560, 60, 50);

        b8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b8.setText("8");
        b8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(300, 630, 60, 50);

        deposit_riel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(deposit_riel);
        deposit_riel.setBounds(620, 230, 270, 50);

        bclear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bclear.setText("C");
        bclear.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        getContentPane().add(bclear);
        bclear.setBounds(210, 420, 60, 50);

        bequal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bequal.setText("=");
        bequal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });
        getContentPane().add(bequal);
        bequal.setBounds(470, 700, 60, 50);

        cost_riel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cost_riel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_rielActionPerformed(evt);
            }
        });
        getContentPane().add(cost_riel);
        cost_riel.setBounds(620, 140, 270, 50);

        total_dollar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        total_dollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_dollarActionPerformed(evt);
            }
        });
        getContentPane().add(total_dollar);
        total_dollar.setBounds(180, 50, 270, 50);

        total_riel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(total_riel);
        total_riel.setBounds(620, 50, 270, 50);

        deposit_dollar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deposit_dollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_dollarActionPerformed(evt);
            }
        });
        getContentPane().add(deposit_dollar);
        deposit_dollar.setBounds(180, 230, 270, 50);

        cost_dollar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cost_dollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_dollarActionPerformed(evt);
            }
        });
        getContentPane().add(cost_dollar);
        cost_dollar.setBounds(180, 140, 270, 50);

        calculater.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        calculater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculaterMouseClicked(evt);
            }
        });
        calculater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaterActionPerformed(evt);
            }
        });
        getContentPane().add(calculater);
        calculater.setBounds(210, 350, 320, 50);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Cost's Customer");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(700, 330, 180, 50);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Calculater");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(210, 290, 190, 50);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Total Dollar : ");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 50, 146, 50);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Cost Dollar : ");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(20, 140, 138, 50);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Cost Riel : ");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(480, 140, 138, 50);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Deposit Dollar : ");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(10, 230, 170, 50);

        bpoint.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bpoint.setText(".");
        bpoint.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpointActionPerformed(evt);
            }
        });
        getContentPane().add(bpoint);
        bpoint.setBounds(390, 700, 60, 50);

        buttonGroup1.add(criel);
        criel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        criel.setText("cost riel");
        getContentPane().add(criel);
        criel.setBounds(720, 430, 110, 32);

        buttonGroup1.add(cdollar);
        cdollar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cdollar.setText("cost dollar");
        cdollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdollarActionPerformed(evt);
            }
        });
        getContentPane().add(cdollar);
        cdollar.setBounds(720, 390, 110, 32);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Total Riel : ");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(480, 50, 122, 50);

        jProgressBar2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(690, 330, 190, 140);

        home.setBorder(null);
        home.setForeground(new java.awt.Color(0, 0, 0));
        home.setText("HOME");
        home.setBorderColor(new java.awt.Color(0, 0, 0));
        home.setColorClick(new java.awt.Color(255, 255, 255));
        home.setColorOver(new java.awt.Color(153, 255, 204));
        home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        home.setRadius(80);
        home.setRequestFocusEnabled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(640, 510, 290, 200);

        b00.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b00.setText("00");
        b00.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        getContentPane().add(b00);
        b00.setBounds(210, 700, 60, 50);

        bsubtract.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bsubtract.setText("-");
        bsubtract.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bsubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubtractActionPerformed(evt);
            }
        });
        getContentPane().add(bsubtract);
        bsubtract.setBounds(470, 560, 60, 50);

        b0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b0.setText("0");
        b0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0);
        b0.setBounds(300, 700, 60, 50);

        bmultiply.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bmultiply.setText("×");
        bmultiply.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(bmultiply);
        bmultiply.setBounds(470, 490, 60, 50);

        bdividetion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bdividetion.setText("÷");
        bdividetion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bdividetion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdividetionActionPerformed(evt);
            }
        });
        getContentPane().add(bdividetion);
        bdividetion.setBounds(470, 420, 60, 50);

        bdelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bdelete.setText("⌫");
        bdelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bdelete);
        bdelete.setBounds(390, 420, 60, 50);

        bpercent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bpercent.setText("%");
        bpercent.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        bpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpercentActionPerformed(evt);
            }
        });
        getContentPane().add(bpercent);
        bpercent.setBounds(300, 420, 60, 50);
        getContentPane().add(jProgressBar3);
        jProgressBar3.setBounds(160, 300, 210, 30);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Deposit Riel : ");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(470, 230, 150, 50);
        getContentPane().add(jProgressBar4);
        jProgressBar4.setBounds(160, 300, 180, 30);
        getContentPane().add(jProgressBar5);
        jProgressBar5.setBounds(160, 300, 810, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pexels-tirachard-kumtanom-112571-601169.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -120, 990, 910);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\pexels-tirachard-kumtanom-112571-601169.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 990, 910);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cdollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdollarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cdollarActionPerformed

    private void total_dollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_dollarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_dollarActionPerformed

    private void calculaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculaterMouseClicked
//        // TODO add your handling code here:
//        if(cdollar.isSelected()==true){
//            cost_dollar.setText(answer);
//            answer = String.format("%.2f", amount*4100);
//            cost_riel.setText(answer);
//        }else{
//            cost_riel.setText(answer);
//            answer = String.format("%.2f", amount/4100);
//            cost_dollar.setText(answer);
//        }
    }//GEN-LAST:event_calculaterMouseClicked

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        //SetNumber
        String tnumber = calculater.getText()+b1.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Thnak_customer th = new Thnak_customer();
        th.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void cost_dollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_dollarActionPerformed
        // TODO add your handling code here:
       
//        if(cdollar.isSelected()==true){
           // cost_dollar.setText(answer);
//            answer = String.format("%.2f", amount*4100);
//            cost_riel.setText(answer);
//        }
// Get the value from the calculater text field
//    String calculatorValue = calculater.getText();
//    
//    // Optionally, validate or convert the value
//    double value = 0.0;
//    if (calculatorValue != null && !calculatorValue.isEmpty()) {
//        try {
//            value = Double.parseDouble(calculatorValue); // Convert to double if needed
//        } catch (NumberFormatException e) {
//            cost_riel.setText("Error"); // Handle invalid input
//            return;
//        }
//    }
//    
//    // Set the validated or converted value into the cost_riel text field
//    cost_riel.setText(String.valueOf(value));
    }//GEN-LAST:event_cost_dollarActionPerformed

    private void calculaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaterActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+b1.getText();
//        calculater.setText(tnumber);
    }//GEN-LAST:event_calculaterActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        // TODO add your handling code here:
       calculater.setText("");
    }//GEN-LAST:event_bclearActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b00.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b00ActionPerformed

    private void bsubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubtractActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bsubtract.getText();
//        calculater.setText(tnumber);
        total1 = Double.parseDouble(calculater.getText());
        calculater.setText("");
        operation = "-";
    }//GEN-LAST:event_bsubtractActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b0.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b0ActionPerformed

    private void bmultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiplyActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bmultiply.getText();
//        calculater.setText(tnumber);
        total1 = Double.parseDouble(calculater.getText());
        calculater.setText("");
        operation = "×";
    }//GEN-LAST:event_bmultiplyActionPerformed

    private void bdividetionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdividetionActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bdividetion.getText();
//        calculater.setText(tnumber);
        total1 = Double.parseDouble(calculater.getText());
        calculater.setText("");
        operation = "÷";
    }//GEN-LAST:event_bdividetionActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        String currenttext = calculater.getText();
        if (!currenttext.isEmpty()) {
            currenttext = currenttext.substring(0,currenttext.length()-1);
            calculater.setText(currenttext);
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpercentActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bpercent.getText();
//        calculater.setText(tnumber);
        total1 = Double.parseDouble(calculater.getText());
        calculater.setText("");
        operation = "%";
    }//GEN-LAST:event_bpercentActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b2.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b3.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b4.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b5.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b6.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b7.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b8.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+b9.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_b9ActionPerformed

    private void bpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpointActionPerformed
        // TODO add your handling code here:
        String tnumber = calculater.getText()+bpoint.getText();
        calculater.setText(tnumber);
    }//GEN-LAST:event_bpointActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bequal.getText();
//        calculater.setText(tnumber);
//        total2 = Double.parseDouble(calculater.getText());
//        if(operation=="+"){
//            amount = total1+total2;
//            answer = String.format("%.2f", amount);
//            calculater.setText(answer);
//        }else if(operation=="-"){
//            amount = total1-total2;
//            answer = String.format("%.2f", amount);
//            calculater.setText(answer);
//        }else if(operation=="×"){
//            amount = total1*total2;
//            answer = String.format("%.2f", amount);
//            calculater.setText(answer);
//        }else if(operation=="÷"){
//            amount = total1/total2;
//            answer = String.format("%.2f", amount);
//            calculater.setText(answer);
//        }else if(operation=="%"){
//            amount = total1%total2;
//            answer = String.format("%.2f", amount);
//            calculater.setText(answer);
//        }else if(operation == "="){
//            if (cdollar.isSelected()==true) {
////                String calculatorValue = calculater.getText();
//                cost_dollar.setText(answer);
//                cost_riel.setText(String.valueOf(amount*4100));
//            } else {
//                cost_riel.setText(answer);
//                cost_dollar.setText(String.valueOf(amount/4100));
//            }
//        }
// Get the second number
        total2 = Double.parseDouble(calculater.getText());

        switch (operation) {
            case "+":
                amount = total1 + total2;
                break;
            case "-":
                amount = total1 - total2;
                break;
            case "×":
                amount = total1 * total2;
                break;
            case "÷":
                if (total2 != 0) {
                    amount = total1 / total2;
                } else {
                    calculater.setText("Error");
                    return;
                }
                break;
            case "%":
                amount = total1 % total2;
                break;

            default:
                calculater.setText("Error");
                return;
        }
        
        answer = String.format("%.2f", amount);
        calculater.setText(answer);
        if (cdollar.isSelected()) {
            cost_dollar.setText(String.format("%.2f", total2));
            cost_riel.setText(String.format("%.2f", total2*4100));
            deposit_dollar.setText(answer);
            deposit_riel.setText(String.format("%.2f",amount * 4100));
        } else {
            cost_dollar.setText(String.format("%.2f", total2/4100));
            cost_riel.setText(String.format("%.2f", total2));
            deposit_riel.setText(answer);
            deposit_dollar.setText(String.format("%.2f",amount / 4100));
        }
    }//GEN-LAST:event_bequalActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
        // TODO add your handling code here:
//        String tnumber = calculater.getText()+bplus.getText();
//        calculater.setText(tnumber);
        total1 = Double.parseDouble(calculater.getText());
        calculater.setText("");
        operation = "+";
    }//GEN-LAST:event_bplusActionPerformed

    private void cost_rielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_rielActionPerformed
        // TODO add your handling code here:
//        if(criel.isSelected()==true){
//            String calculatorValue = calculater.getText();
//    
//            cost_riel.setText(String.valueOf(calculatorValue));
//            answer = String.format("%.2f", amount/4100);
//            cost_dollar.setText(answer);
//        }
    }//GEN-LAST:event_cost_rielActionPerformed

    private void deposit_dollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_dollarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deposit_dollarActionPerformed

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
            java.util.logging.Logger.getLogger(coat_banknote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(coat_banknote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(coat_banknote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(coat_banknote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new coat_banknote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b00;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bdividetion;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bmultiply;
    private javax.swing.JButton bpercent;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bpoint;
    private javax.swing.JButton bsubtract;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField calculater;
    private javax.swing.JCheckBox cdollar;
    private javax.swing.JTextField cost_dollar;
    private javax.swing.JTextField cost_riel;
    private javax.swing.JCheckBox criel;
    private javax.swing.JTextField deposit_dollar;
    private javax.swing.JTextField deposit_riel;
    private Swing.MyButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField total_dollar;
    private javax.swing.JTextField total_riel;
    // End of variables declaration//GEN-END:variables

}
