
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Locked_Up_Details extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Locked_Up_Details() {
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

        Locked_Up_Criminal_ID = new javax.swing.JLabel();
        Locked_Up_Address = new javax.swing.JLabel();
        Locked_Up_Criminal_ID_Field = new javax.swing.JTextField();
        Locked_Up_Insert_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Locked_Up_Address_Field = new javax.swing.JTextField();
        Locked_Up_Return_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Locked_Up_Criminal_ID.setText("Criminal_ID");

        Locked_Up_Address.setText("Locked_Up_Address");

        Locked_Up_Criminal_ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Locked_Up_Criminal_ID_FieldActionPerformed(evt);
            }
        });

        Locked_Up_Insert_Button.setText("Insert");
        Locked_Up_Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Locked_Up_Insert_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOCKED UP FORM");

        Locked_Up_Address_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Locked_Up_Address_FieldActionPerformed(evt);
            }
        });

        Locked_Up_Return_Button.setText("Return");
        Locked_Up_Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Locked_Up_Return_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Locked_Up_Insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Locked_Up_Return_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Locked_Up_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Locked_Up_Criminal_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Locked_Up_Criminal_ID_Field)
                                .addComponent(Locked_Up_Address_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Locked_Up_Criminal_ID)
                    .addComponent(Locked_Up_Criminal_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Locked_Up_Address)
                    .addComponent(Locked_Up_Address_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Locked_Up_Insert_Button)
                    .addComponent(Locked_Up_Return_Button))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       String url="jdbc:sqlserver://localhost:1433;databaseName=CrimeRecordManagementSystem;user=MurtazaDatabase;password=murtaza123";
       String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
       
    private void Locked_Up_Criminal_ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Locked_Up_Criminal_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Locked_Up_Criminal_ID_FieldActionPerformed

    private void Locked_Up_Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Locked_Up_Insert_ButtonActionPerformed
           
        try {
            
             
            if(Locked_Up_Address_Field.getText().trim().isEmpty() || 
               Locked_Up_Criminal_ID_Field.getText().trim().isEmpty()  )
            {
                JOptionPane.showMessageDialog(this, "Fields Should Not Be Null");
            }

            else
            {
               Class.forName(driver);
                Connection connection = DriverManager(url);

                String SQL ="insert into Locked_up"
                            + "(Criminal_Id, Lockup_address)"
                            +"values(?, ?)";

                PreparedStatement pst =connection.prepareStatement(SQL);

                pst.setString(1, Locked_Up_Criminal_ID_Field.getText());
                pst.setString(2, Locked_Up_Address_Field.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Locked Up Details Insert Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Locked_Up_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Locked_Up_Details.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_Locked_Up_Insert_ButtonActionPerformed

    private void Locked_Up_Address_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Locked_Up_Address_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Locked_Up_Address_FieldActionPerformed

    private void Locked_Up_Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Locked_Up_Return_ButtonActionPerformed
        Main_Page main_Page = new Main_Page();
        main_Page.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_Locked_Up_Return_ButtonActionPerformed

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
                new Locked_Up_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Locked_Up_Address;
    private javax.swing.JTextField Locked_Up_Address_Field;
    private javax.swing.JLabel Locked_Up_Criminal_ID;
    private javax.swing.JTextField Locked_Up_Criminal_ID_Field;
    private javax.swing.JButton Locked_Up_Insert_Button;
    private javax.swing.JButton Locked_Up_Return_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private Connection DriverManager(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
