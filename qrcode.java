
package sale_element;

public class qrcode extends javax.swing.JFrame {
    private double amonts;
    public qrcode() {
        initComponents();
    }
    public qrcode(double amont) {
        initComponents();
        this.amonts = amont;
        tdollarget.setText(String.valueOf(amont));
        trielget.setText(String.valueOf(amont*4100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trielget = new javax.swing.JTextField();
        tdollarget = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bfinish = new Swing.MyButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1060, 660));
        setMinimumSize(new java.awt.Dimension(1060, 660));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\dollar.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 310, 400);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\riel.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 20, 310, 410);

        jLabel5.setFont(new java.awt.Font("French Script MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Thank you to come to our Restaurant");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 490, 440, 80);

        trielget.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        trielget.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        trielget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trielgetActionPerformed(evt);
            }
        });
        getContentPane().add(trielget);
        trielget.setBounds(690, 460, 310, 40);

        tdollarget.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tdollarget.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tdollarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdollargetActionPerformed(evt);
            }
        });
        getContentPane().add(tdollarget);
        tdollarget.setBounds(60, 460, 310, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive\\Desktop\\tommoney2.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 270, 230, 230);

        bfinish.setBorder(null);
        bfinish.setForeground(new java.awt.Color(0, 0, 0));
        bfinish.setText("Finish");
        bfinish.setColorClick(new java.awt.Color(0, 204, 204));
        bfinish.setColorOver(new java.awt.Color(0, 204, 204));
        bfinish.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bfinish.setRadius(40);
        bfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfinishActionPerformed(evt);
            }
        });
        getContentPane().add(bfinish);
        bfinish.setBounds(310, 560, 450, 40);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("R");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(1000, 460, 30, 40);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("$");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(370, 460, 30, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfinishActionPerformed
        // TODO add your handling code here:
         Thnak_customer d = new Thnak_customer();
         d.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_bfinishActionPerformed

    private void tdollargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdollargetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdollargetActionPerformed

    private void trielgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trielgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trielgetActionPerformed

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
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qrcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qrcode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.MyButton bfinish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tdollarget;
    private javax.swing.JTextField trielget;
    // End of variables declaration//GEN-END:variables
}
