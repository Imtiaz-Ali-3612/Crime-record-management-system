
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class Crime_Area_Details extends javax.swing.JFrame {

    /**
     * Creates new form Crime_Area_Details
     */
    public Crime_Area_Details() {
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

        CrimeArea_Crime_Type = new javax.swing.JLabel();
        CrimeArea_City = new javax.swing.JLabel();
        CrimeArea_State = new javax.swing.JLabel();
        CrimeArea_Street_No = new javax.swing.JLabel();
        CrimeArea_Details = new javax.swing.JLabel();
        CrimeArea_FIR_ID = new javax.swing.JLabel();
        CrimeArea_Crime_Type_Field = new javax.swing.JTextField();
        CrimeArea_City_Field = new javax.swing.JTextField();
        CrimeArea_State_Field = new javax.swing.JTextField();
        CrimeArea_Street_No_Field = new javax.swing.JTextField();
        CrimeArea_Details_Field = new javax.swing.JTextField();
        CrimeArea_FIR_ID_Field = new javax.swing.JTextField();
        CrimeArea_Insert_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Crime_Area_Return_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrimeArea_Crime_Type.setText("Crime_Type");

        CrimeArea_City.setText("City");

        CrimeArea_State.setText("State");

        CrimeArea_Street_No.setText("Street_No");

        CrimeArea_Details.setText("Details");

        CrimeArea_FIR_ID.setText("FIR_ID");

        CrimeArea_State_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrimeArea_State_FieldActionPerformed(evt);
            }
        });

        CrimeArea_Street_No_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrimeArea_Street_No_FieldActionPerformed(evt);
            }
        });

        CrimeArea_Insert_Button.setText("Insert");
        CrimeArea_Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrimeArea_Insert_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CRIME AREA REGISTRATION FORM");

        Crime_Area_Return_Button.setText("Return");
        Crime_Area_Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crime_Area_Return_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CrimeArea_Crime_Type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrimeArea_City, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrimeArea_State, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrimeArea_Street_No, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrimeArea_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrimeArea_FIR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CrimeArea_Crime_Type_Field)
                            .addComponent(CrimeArea_City_Field)
                            .addComponent(CrimeArea_State_Field)
                            .addComponent(CrimeArea_Street_No_Field)
                            .addComponent(CrimeArea_Details_Field)
                            .addComponent(CrimeArea_FIR_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CrimeArea_Insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Crime_Area_Return_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_Crime_Type)
                    .addComponent(CrimeArea_Crime_Type_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_City)
                    .addComponent(CrimeArea_City_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_State)
                    .addComponent(CrimeArea_State_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_Street_No)
                    .addComponent(CrimeArea_Street_No_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_Details)
                    .addComponent(CrimeArea_Details_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_FIR_ID)
                    .addComponent(CrimeArea_FIR_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeArea_Insert_Button)
                    .addComponent(Crime_Area_Return_Button))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrimeArea_Street_No_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrimeArea_Street_No_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeArea_Street_No_FieldActionPerformed

    private void CrimeArea_State_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrimeArea_State_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeArea_State_FieldActionPerformed

    String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=CrimeRecordManagementSystem;user=MurtazaDatabase;password=murtaza123";
    
    private void CrimeArea_Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrimeArea_Insert_ButtonActionPerformed
        
        try {
            
            if(CrimeArea_City_Field.getText().trim().isEmpty() || 
               CrimeArea_Crime_Type_Field.getText().trim().isEmpty() ||  
               CrimeArea_Details_Field.getText().trim().isEmpty() || 
               CrimeArea_FIR_ID_Field.getText().trim().isEmpty() ||
               CrimeArea_State_Field.getText().trim().isEmpty()  ||
               CrimeArea_Street_No_Field.getText().trim().isEmpty()     )
            {
                JOptionPane.showMessageDialog(this, "Fields Should Not Be Null");
            }

            else
            {
            
                Class.forName(driver);
                Connection connection = DriverManager(url);

                String SQL ="insert into Crime_Area"
                            + "(CrimeType, City, State, StreetNo, Details, Fir_id)"
                            +"values(?, ?, ?, ?, ?, ?)";

                PreparedStatement pst =connection.prepareStatement(SQL);

                pst.setString(1, CrimeArea_Crime_Type_Field.getText());
                pst.setString(2, CrimeArea_City_Field.getText());
                pst.setString(3, CrimeArea_State_Field.getText());
                pst.setString(4, CrimeArea_Street_No_Field.getText());
                pst.setString(5, CrimeArea_Details_Field.getText());
                pst.setString(6, CrimeArea_FIR_ID_Field.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Crime Area Details Insert Successfully");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Crime_Area_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Crime_Area_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
    }//GEN-LAST:event_CrimeArea_Insert_ButtonActionPerformed

    private void Crime_Area_Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crime_Area_Return_ButtonActionPerformed
        Main_Page main_Page = new Main_Page();
        main_Page.setVisible(true);
        
        setVisible(false);
                
    }//GEN-LAST:event_Crime_Area_Return_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Crime_Area_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crime_Area_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crime_Area_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crime_Area_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crime_Area_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrimeArea_City;
    private javax.swing.JTextField CrimeArea_City_Field;
    private javax.swing.JLabel CrimeArea_Crime_Type;
    private javax.swing.JTextField CrimeArea_Crime_Type_Field;
    private javax.swing.JLabel CrimeArea_Details;
    private javax.swing.JTextField CrimeArea_Details_Field;
    private javax.swing.JLabel CrimeArea_FIR_ID;
    private javax.swing.JTextField CrimeArea_FIR_ID_Field;
    private javax.swing.JButton CrimeArea_Insert_Button;
    private javax.swing.JLabel CrimeArea_State;
    private javax.swing.JTextField CrimeArea_State_Field;
    private javax.swing.JLabel CrimeArea_Street_No;
    private javax.swing.JTextField CrimeArea_Street_No_Field;
    private javax.swing.JButton Crime_Area_Return_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private Connection DriverManager(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
