/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbse12;

import javax.swing.JOptionPane;

/**
 *
 * @author SAM
 */
public class waxing extends javax.swing.JFrame {int a,b;double discount;

    /**
     * Creates new form waxing
     */
    public waxing() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ccb2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        tt2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/white.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/uc.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/back.JPG"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 34, 29));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 67, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 62, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 62, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/city.JPG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 21));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/str.JPG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 62, 16));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/flat.JPG"))); // NOI18N
        jLabel5.setText("HOUSE NO .");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 84, 15));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/add.JPG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 38));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/location.JPG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 26));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/threa2.JPG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 160, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/threa.JPG"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cb1.setBackground(new java.awt.Color(255, 255, 255));
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/rwax.JPG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/rwax2.JPG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        ccb2.setBackground(new java.awt.Color(255, 255, 255));
        ccb2.setText("jCheckBox2");
        ccb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccb2ActionPerformed(evt);
            }
        });
        getContentPane().add(ccb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 21, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/time.JPG"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, -1));
        getContentPane().add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/time2.JPG"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 30));

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00AM - 8:00AM", "8:00AM - 9:00AM", "9:00AM - 10:00AM", "10:00AM - 11:00AM", "11:00AM - 12:00AM", "12:00AM - 1:00PM", "1:00PM - 2:00PM", "2:00PM - 3:00PM", "3:00PM - 4:00PM", "4:00PM - 5:00PM", "5:00PM - 6:00PM", "6:00PM - 7:00PM", "7:00PM - 8:00PM", "8:00PM - 9:00PM", "9:00PM - 10:00PM", "10:00PM - 11:00PM", "11:00PM - 12:00AM" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/sum.JPG"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 110, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/it.JPG"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/st.JPG"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/promo.JPG"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        t1.setEnabled(false);
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 70, -1));
        getContentPane().add(tt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 70, -1));

        t4.setEnabled(false);
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 80, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/discount.JPG"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        t3.setEnabled(false);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 70, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/continue.JPG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 110, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/place.JPG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 210, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cbse12/white.jpg"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
    if(cb1.isSelected())
      {
      a=599;
      t1.setText(""+(a+b));
      }
        else
        {
        a=0;
         t1.setText(""+(a+b));
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
saloon ab= new saloon();
            ab.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        double c,f;
        c=Integer.parseInt(t1.getText());
        String d=tt2.getText();

        switch (d) {
            case "tri10":
            discount=10;
            t3.setText("10%");
            break;
            case "tri15":
            discount=15;
            t3.setText("15%");
            break;
            case "tri20":
            discount=20;
            t3.setText("20%");
            break;
            default:
            t3.setText("0");
            break;
        }
        f=c*(discount/100);
        double sb=c-f;
        t4.setText(""+sb);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"YOUR REQUEST HAVE BEEN PLACED");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ccb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccb2ActionPerformed
           if(ccb2.isSelected())
        {
        b=799;
           t1.setText(""+(a+b));
        }
        else
        {
        b=0;
        t1.setText(""+(a+b));
        }
    }//GEN-LAST:event_ccb2ActionPerformed

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
            java.util.logging.Logger.getLogger(waxing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waxing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waxing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waxing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waxing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JCheckBox ccb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField tt2;
    // End of variables declaration//GEN-END:variables
}
