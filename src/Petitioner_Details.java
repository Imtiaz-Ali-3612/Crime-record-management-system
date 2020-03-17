
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Petitioner_Details extends javax.swing.JFrame {

    /**
     * Creates new form Criminal
     */
    public Petitioner_Details() {
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

        Petitioner_ID = new javax.swing.JLabel();
        Petitioner_Name = new javax.swing.JLabel();
        Petitioner_CNIC = new javax.swing.JLabel();
        Petitioner_City = new javax.swing.JLabel();
        Petitioner_State = new javax.swing.JLabel();
        Petitioner_ID_Field = new javax.swing.JTextField();
        Petitioner_Name_Field = new javax.swing.JTextField();
        Petitioner_CNIC_Field = new javax.swing.JTextField();
        Petitioner_City_Field = new javax.swing.JTextField();
        Petitioner_State_Field = new javax.swing.JTextField();
        Accused_Insert_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Petitioner_Contact_no = new javax.swing.JLabel();
        Petitioner_Contact_No_Field = new javax.swing.JTextField();
        Petitioner_FIR_ID = new javax.swing.JLabel();
        Petitioner_FIR_ID_Field = new javax.swing.JTextField();
        Petitioner_Gender = new javax.swing.JLabel();
        Petitioner_Gender_Field = new javax.swing.JTextField();
        Petitioner_Gender_ComboBox = new javax.swing.JComboBox<>();
        Petitioner_House_No = new javax.swing.JLabel();
        Petitioner_House_No_Field = new javax.swing.JTextField();
        Petitioner_Return_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Petitioner_ID.setText("Petitioner_ID");

        Petitioner_Name.setText("Name");

        Petitioner_CNIC.setText("CNIC");

        Petitioner_City.setText("City");

        Petitioner_State.setText("State");

        Petitioner_ID_Field.setToolTipText("yyyy-mm-dd");
        Petitioner_ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_ID_FieldActionPerformed(evt);
            }
        });

        Petitioner_CNIC_Field.setToolTipText("int");
        Petitioner_CNIC_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_CNIC_FieldActionPerformed(evt);
            }
        });

        Petitioner_State_Field.setToolTipText("yyyy-mm-dd");
        Petitioner_State_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_State_FieldActionPerformed(evt);
            }
        });

        Accused_Insert_Button.setText("Insert");
        Accused_Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accused_Insert_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PETITIONER FORM");

        Petitioner_Contact_no.setText("Contact_No");

        Petitioner_Contact_No_Field.setToolTipText("yyyy-mm-dd");
        Petitioner_Contact_No_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_Contact_No_FieldActionPerformed(evt);
            }
        });

        Petitioner_FIR_ID.setText("FIR_ID");

        Petitioner_FIR_ID_Field.setToolTipText("yyyy-mm-dd");
        Petitioner_FIR_ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_FIR_ID_FieldActionPerformed(evt);
            }
        });

        Petitioner_Gender.setText("Gender");

        Petitioner_Gender_Field.setEditable(false);
        Petitioner_Gender_Field.setText("Male");
        Petitioner_Gender_Field.setToolTipText("");
        Petitioner_Gender_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_Gender_FieldActionPerformed(evt);
            }
        });

        Petitioner_Gender_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Petitioner_Gender_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_Gender_ComboBoxActionPerformed(evt);
            }
        });

        Petitioner_House_No.setText("House_No");

        Petitioner_House_No_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_House_No_FieldActionPerformed(evt);
            }
        });

        Petitioner_Return_Button.setText("Return");
        Petitioner_Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Petitioner_Return_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Petitioner_House_No, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_State, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_FIR_ID)
                    .addComponent(Petitioner_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(Petitioner_CNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_City, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Petitioner_Contact_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Accused_Insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Petitioner_Return_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Petitioner_City_Field)
                    .addComponent(Petitioner_Contact_No_Field)
                    .addComponent(Petitioner_Gender_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(Petitioner_Name_Field)
                    .addComponent(Petitioner_CNIC_Field)
                    .addComponent(Petitioner_State_Field)
                    .addComponent(Petitioner_FIR_ID_Field)
                    .addComponent(Petitioner_ID_Field, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Petitioner_House_No_Field))
                .addGap(18, 18, 18)
                .addComponent(Petitioner_Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Petitioner_ID)
                    .addComponent(Petitioner_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Petitioner_Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_Name, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_Gender_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_Gender_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_Contact_No_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_Contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_CNIC)
                    .addComponent(Petitioner_CNIC_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_City)
                    .addComponent(Petitioner_City_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_State, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_State_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_House_No)
                    .addComponent(Petitioner_House_No_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Petitioner_FIR_ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Petitioner_FIR_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accused_Insert_Button)
                    .addComponent(Petitioner_Return_Button))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String url="jdbc:sqlserver://localhost:1433;databaseName=CrimeRecordManagementSystem;user=MurtazaDatabase;password=murtaza123";
    String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
       
    private void Accused_Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accused_Insert_ButtonActionPerformed
        
        try
        {
             
            if(Petitioner_CNIC_Field.getText().trim().isEmpty() || 
               Petitioner_City_Field.getText().trim().isEmpty() ||  
               Petitioner_Contact_No_Field.getText().trim().isEmpty() || 
               Petitioner_FIR_ID_Field.getText().trim().isEmpty() ||
               Petitioner_Gender_Field.getText().trim().isEmpty()  ||
               Petitioner_House_No_Field.getText().trim().isEmpty() || 
               Petitioner_ID_Field.getText().trim().isEmpty() ||  
               Petitioner_Name_Field.getText().trim().isEmpty() || 
               Petitioner_State_Field.getText().trim().isEmpty()  )
            {
                JOptionPane.showMessageDialog(this, "Fields Should Not Be Null");
            }

            else
            {
            
                Class.forName(driver);
                Connection connection= DriverManager.getConnection(url);

                String SQL="insert into Petitioner"
                        + "(Petitioner_id, Name, Gnder, ContactNo, CNIC, City, state, HouseNo, Fir_id)"
                        +"values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pst = connection.prepareStatement(SQL);

                pst.setString(1, Petitioner_ID_Field.getText());
                pst.setString(2, Petitioner_Name_Field.getText());
                pst.setString(3, Petitioner_Gender_Field.getText());
                pst.setString(4, Petitioner_Contact_No_Field.getText());
                pst.setString(5, Petitioner_CNIC_Field.getText());
                pst.setString(6, Petitioner_City_Field.getText());
                pst.setString(7, Petitioner_State_Field.getText());
                pst.setString(8, Petitioner_House_No_Field.getText());
                pst.setString(9, Petitioner_FIR_ID_Field.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Petitioner Details Insert Successfully");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
           
        }
        
        
        
        
    }//GEN-LAST:event_Accused_Insert_ButtonActionPerformed

    private void Petitioner_ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_ID_FieldActionPerformed

    private void Petitioner_State_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_State_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_State_FieldActionPerformed

    private void Petitioner_CNIC_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_CNIC_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_CNIC_FieldActionPerformed

    private void Petitioner_Contact_No_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_Contact_No_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_Contact_No_FieldActionPerformed

    private void Petitioner_FIR_ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_FIR_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_FIR_ID_FieldActionPerformed

    private void Petitioner_Gender_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_Gender_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_Gender_FieldActionPerformed

    private void Petitioner_Gender_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_Gender_ComboBoxActionPerformed
        Petitioner_Gender_Field.setText(Petitioner_Gender_ComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_Petitioner_Gender_ComboBoxActionPerformed

    private void Petitioner_House_No_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_House_No_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Petitioner_House_No_FieldActionPerformed

    private void Petitioner_Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Petitioner_Return_ButtonActionPerformed
        Main_Page main_Page = new Main_Page();
        main_Page.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_Petitioner_Return_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Criminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petitioner_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accused_Insert_Button;
    private javax.swing.JLabel Petitioner_CNIC;
    private javax.swing.JTextField Petitioner_CNIC_Field;
    private javax.swing.JLabel Petitioner_City;
    private javax.swing.JTextField Petitioner_City_Field;
    private javax.swing.JTextField Petitioner_Contact_No_Field;
    private javax.swing.JLabel Petitioner_Contact_no;
    private javax.swing.JLabel Petitioner_FIR_ID;
    private javax.swing.JTextField Petitioner_FIR_ID_Field;
    private javax.swing.JLabel Petitioner_Gender;
    private javax.swing.JComboBox<String> Petitioner_Gender_ComboBox;
    private javax.swing.JTextField Petitioner_Gender_Field;
    private javax.swing.JLabel Petitioner_House_No;
    private javax.swing.JTextField Petitioner_House_No_Field;
    private javax.swing.JLabel Petitioner_ID;
    private javax.swing.JTextField Petitioner_ID_Field;
    private javax.swing.JLabel Petitioner_Name;
    private javax.swing.JTextField Petitioner_Name_Field;
    private javax.swing.JButton Petitioner_Return_Button;
    private javax.swing.JLabel Petitioner_State;
    private javax.swing.JTextField Petitioner_State_Field;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
