/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makanan;

import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame
{
   String username1;
   String Password1;
   String Email1;
   
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Passwordregis = new javax.swing.JPasswordField();
        Registombol = new javax.swing.JButton();
        existregis = new javax.swing.JCheckBox();
        Agreeservice = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Usertext = new javax.swing.JTextField();
        Emailtext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 45, 65));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/makanan/Chicken-Katsu-Rice-Burger-N1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 470, 630));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 130, 60));

        jLabel3.setBackground(new java.awt.Color(36, 45, 65));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMAIL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 50, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 340, 20));

        jLabel4.setBackground(new java.awt.Color(36, 45, 65));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 340, 20));

        jLabel5.setBackground(new java.awt.Color(36, 45, 65));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 340, 20));

        Passwordregis.setText("jPasswordField1");
        Passwordregis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordregisFocusGained(evt);
            }
        });
        jPanel1.add(Passwordregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 340, 30));

        Registombol.setBackground(new java.awt.Color(204, 102, 0));
        Registombol.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        Registombol.setForeground(new java.awt.Color(255, 255, 255));
        Registombol.setText("Get Started");
        Registombol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Registombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistombolActionPerformed(evt);
            }
        });
        jPanel1.add(Registombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 150, 30));

        existregis.setBackground(new java.awt.Color(36, 45, 65));
        existregis.setForeground(new java.awt.Color(255, 255, 255));
        existregis.setText("Already Exist?");
        existregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existregisActionPerformed(evt);
            }
        });
        jPanel1.add(existregis, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 160, 30));

        Agreeservice.setBackground(new java.awt.Color(36, 45, 65));
        Agreeservice.setForeground(new java.awt.Color(255, 255, 255));
        Agreeservice.setText("i agree all term of service");
        Agreeservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeserviceActionPerformed(evt);
            }
        });
        jPanel1.add(Agreeservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 240, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("This is Unoffical Facultas Kopi Web");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 220, 20));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Facebook : FAKULTAS KOPI JAKARTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 230, 20));

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Instagram: FAKULTAS KOPI");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 170, -1));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Whatssapp: 0897667755443");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 180, 20));

        Usertext.setBackground(new java.awt.Color(36, 45, 65));
        Usertext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Usertext.setForeground(new java.awt.Color(255, 255, 255));
        Usertext.setText("Enter Username");
        Usertext.setBorder(null);
        Usertext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsertextMouseClicked(evt);
            }
        });
        Usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsertextActionPerformed(evt);
            }
        });
        jPanel1.add(Usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 340, 40));

        Emailtext.setBackground(new java.awt.Color(36, 45, 65));
        Emailtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Emailtext.setForeground(new java.awt.Color(255, 255, 255));
        Emailtext.setText("Enter Mail");
        Emailtext.setBorder(null);
        Emailtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailtextFocusGained(evt);
            }
        });
        Emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtextActionPerformed(evt);
            }
        });
        jPanel1.add(Emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 340, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
       
    }//GEN-LAST:event_jPanel1FocusGained

    private void PasswordregisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordregisFocusGained
       Passwordregis.setText("");
    }//GEN-LAST:event_PasswordregisFocusGained

    private void RegistombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistombolActionPerformed
    username1 = Usertext.getText();
    Password1 = Passwordregis.getText();
    Email1 = Emailtext.getText();
    if( Agreeservice.isSelected()==true)
        {
            Register B = new Register();
            B.method(username1, Password1,Email1);
            this.dispose();
            B.setVisible(true);
        }
        else
    {
        JOptionPane.showMessageDialog(null,"Checklist Agreement First","Warning",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_RegistombolActionPerformed

    private void UsertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsertextActionPerformed
        Usertext.setText("");
    }//GEN-LAST:event_UsertextActionPerformed

    private void EmailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtextActionPerformed
        Emailtext.setText("");
    }//GEN-LAST:event_EmailtextActionPerformed

    private void UsertextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsertextMouseClicked
        Usertext.setText("");
    }//GEN-LAST:event_UsertextMouseClicked

    private void EmailtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailtextFocusGained
        Emailtext.setText("");
    }//GEN-LAST:event_EmailtextFocusGained

    private void AgreeserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeserviceActionPerformed
       
    }//GEN-LAST:event_AgreeserviceActionPerformed

    private void existregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existregisActionPerformed
       if(existregis.isSelected()==true)
       {
            Register z = new Register();
            this.dispose();
            z.setVisible(true);
       }
    }//GEN-LAST:event_existregisActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Agreeservice;
    private javax.swing.JTextField Emailtext;
    private javax.swing.JPasswordField Passwordregis;
    private javax.swing.JButton Registombol;
    private javax.swing.JTextField Usertext;
    private javax.swing.JCheckBox existregis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

}
