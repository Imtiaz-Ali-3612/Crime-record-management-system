
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OWNER
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
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

        User_Name = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        User_Name_Field = new javax.swing.JTextField();
        Signin_Button = new javax.swing.JButton();
        Reset_Button = new javax.swing.JButton();
        Password_Field = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        User_Name.setText("User_Name");

        Password.setText("Password");

        User_Name_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_Name_FieldActionPerformed(evt);
            }
        });

        Signin_Button.setText("SignIn");
        Signin_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signin_ButtonActionPerformed(evt);
            }
        });

        Reset_Button.setText("Reset");
        Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_ButtonActionPerformed(evt);
            }
        });

        Password_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_FieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRIME RECORD MANAGEMENT SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Signin_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(User_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(User_Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User_Name)
                    .addComponent(User_Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset_Button)
                    .addComponent(Signin_Button))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       String url="jdbc:sqlserver://localhost:1433;databaseName=CrimeRecordManagementSystem;user=MurtazaDatabase;password=murtaza123";
       String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
       
    private void User_Name_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_Name_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_Name_FieldActionPerformed

    private void Signin_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signin_ButtonActionPerformed
        
        try {
            
            if(User_Name_Field.getText().trim().isEmpty() || 
               Password_Field.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fields Should Not Be Null");
            }
            else
            {
                Class.forName(driver);
                Connection connection= DriverManager.getConnection(url);

                String SQL="Select * from Login_Credential where Username=? and Password=?";

                PreparedStatement pst = connection.prepareStatement(SQL);
                pst.setString(1,User_Name_Field.getText() );
                pst.setString(2, Password_Field.getText());

                ResultSet rs = pst.executeQuery();

                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Logged In Successfully");
                    Main_Page main_page= new Main_Page();

                    main_page.setVisible(true);
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Incorrect Username Or Password");
                }
                 connection.close();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
           
        }
        
//        
        
        
        
    }//GEN-LAST:event_Signin_ButtonActionPerformed

    private void Password_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_FieldActionPerformed

    private void Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_ButtonActionPerformed
        User_Name_Field.setText("");
        Password_Field.setText("");
    }//GEN-LAST:event_Reset_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JButton Reset_Button;
    private javax.swing.JButton Signin_Button;
    private javax.swing.JLabel User_Name;
    private javax.swing.JTextField User_Name_Field;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
