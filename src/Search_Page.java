/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OWNER
 */
public class Search_Page extends javax.swing.JFrame {

    /**
     * Creates new form Search_Page
     */
    public Search_Page() {
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

        Search_Officer_Search_Button2 = new javax.swing.JButton();
        Search_Officer_Search_Button4 = new javax.swing.JButton();
        Search_Area_Button = new javax.swing.JButton();
        Search_FIR_Button = new javax.swing.JButton();
        Search_Officer_Button = new javax.swing.JButton();
        Search_Criminal_Button = new javax.swing.JButton();
        Search_Officer_Combo_Box = new javax.swing.JComboBox<>();
        Search_Area_Combo_Box = new javax.swing.JComboBox<>();
        Search_FIR_Combo_Box = new javax.swing.JComboBox<>();
        Search_Criminal_Combo_Box = new javax.swing.JComboBox<>();
        Search_By_Area_Search_Button = new javax.swing.JButton();
        Search_By_Officer_Search_Button = new javax.swing.JButton();
        Search_By_FIR_Search_Button = new javax.swing.JButton();
        Search_By_Criminal_Search_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Search_Page_Return_Button = new javax.swing.JButton();

        Search_Officer_Search_Button2.setText("Search");
        Search_Officer_Search_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Officer_Search_Button2ActionPerformed(evt);
            }
        });

        Search_Officer_Search_Button4.setText("Search");
        Search_Officer_Search_Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Officer_Search_Button4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Search_Area_Button.setText("Search By Area");
        Search_Area_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Area_ButtonActionPerformed(evt);
            }
        });

        Search_FIR_Button.setText("Search By FIR");
        Search_FIR_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_FIR_ButtonActionPerformed(evt);
            }
        });

        Search_Officer_Button.setText("Search By Officer");
        Search_Officer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Officer_ButtonActionPerformed(evt);
            }
        });

        Search_Criminal_Button.setText("Search By Criminal");
        Search_Criminal_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Criminal_ButtonActionPerformed(evt);
            }
        });

        Search_Officer_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All_Cases", "Specific_Case", "Area_Wise" }));
        Search_Officer_Combo_Box.setEnabled(false);

        Search_Area_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "by_Area_ID", "by_Area_Name" }));
        Search_Area_Combo_Box.setToolTipText("");
        Search_Area_Combo_Box.setEnabled(false);
        Search_Area_Combo_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Area_Combo_BoxActionPerformed(evt);
            }
        });

        Search_FIR_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Specific_FIR", "On_Date" }));
        Search_FIR_Combo_Box.setEnabled(false);
        Search_FIR_Combo_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_FIR_Combo_BoxActionPerformed(evt);
            }
        });

        Search_Criminal_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criminal_ID", "Area_Wise", "Crime_Type", "Court_Decision" }));
        Search_Criminal_Combo_Box.setEnabled(false);

        Search_By_Area_Search_Button.setText("Search");
        Search_By_Area_Search_Button.setEnabled(false);
        Search_By_Area_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_By_Area_Search_ButtonActionPerformed(evt);
            }
        });

        Search_By_Officer_Search_Button.setText("Search");
        Search_By_Officer_Search_Button.setEnabled(false);
        Search_By_Officer_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_By_Officer_Search_ButtonActionPerformed(evt);
            }
        });

        Search_By_FIR_Search_Button.setText("Search");
        Search_By_FIR_Search_Button.setEnabled(false);
        Search_By_FIR_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_By_FIR_Search_ButtonActionPerformed(evt);
            }
        });

        Search_By_Criminal_Search_Button.setText("Search");
        Search_By_Criminal_Search_Button.setEnabled(false);
        Search_By_Criminal_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_By_Criminal_Search_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH PAGE");

        Search_Page_Return_Button.setText("Return");
        Search_Page_Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Page_Return_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Search_Criminal_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(Search_FIR_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search_Area_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search_Officer_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Search_Area_Combo_Box, 0, 122, Short.MAX_VALUE)
                            .addComponent(Search_Officer_Combo_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search_FIR_Combo_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search_Criminal_Combo_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search_By_Area_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_By_Officer_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_By_FIR_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_By_Criminal_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search_Page_Return_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search_Officer_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search_By_Officer_Search_Button))
                    .addComponent(Search_Officer_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_Area_Button)
                    .addComponent(Search_Area_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_By_Area_Search_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_FIR_Button)
                    .addComponent(Search_FIR_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_By_FIR_Search_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_By_Criminal_Search_Button)
                    .addComponent(Search_Criminal_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Criminal_Button))
                .addGap(27, 27, 27)
                .addComponent(Search_Page_Return_Button)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_Area_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Area_ButtonActionPerformed
        
        Search_Officer_Combo_Box.setEnabled(false);
        Search_By_Officer_Search_Button.setEnabled(false);
        
        Search_Area_Combo_Box.setEnabled(true);
        Search_By_Area_Search_Button.setEnabled(true);
        
        Search_FIR_Combo_Box.setEnabled(false);
        Search_By_FIR_Search_Button.setEnabled(false);
        
        Search_Criminal_Combo_Box.setEnabled(false);
        Search_By_Criminal_Search_Button.setEnabled(false);
        
    }//GEN-LAST:event_Search_Area_ButtonActionPerformed

    private void Search_FIR_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_FIR_ButtonActionPerformed
        
        Search_Officer_Combo_Box.setEnabled(false);
        Search_By_Officer_Search_Button.setEnabled(false);
        
        Search_Area_Combo_Box.setEnabled(false);
        Search_By_Area_Search_Button.setEnabled(false);
        
        Search_FIR_Combo_Box.setEnabled(true);
        Search_By_FIR_Search_Button.setEnabled(true);
        
        Search_Criminal_Combo_Box.setEnabled(false);
        Search_By_Criminal_Search_Button.setEnabled(false);
        
    }//GEN-LAST:event_Search_FIR_ButtonActionPerformed

    private void Search_Criminal_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Criminal_ButtonActionPerformed
        
        Search_Officer_Combo_Box.setEnabled(false);
        Search_By_Officer_Search_Button.setEnabled(false);
        
        Search_Area_Combo_Box.setEnabled(false);
        Search_By_Area_Search_Button.setEnabled(false);
        
        Search_FIR_Combo_Box.setEnabled(false);
        Search_By_FIR_Search_Button.setEnabled(false);
        
        Search_Criminal_Combo_Box.setEnabled(true);
        Search_By_Criminal_Search_Button.setEnabled(true);
    }//GEN-LAST:event_Search_Criminal_ButtonActionPerformed

    private void Search_Officer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Officer_ButtonActionPerformed
       
        Search_Officer_Combo_Box.setEnabled(true);
        Search_By_Officer_Search_Button.setEnabled(true);
        
        Search_Area_Combo_Box.setEnabled(false);
        Search_By_Area_Search_Button.setEnabled(false);
        
        Search_FIR_Combo_Box.setEnabled(false);
        Search_By_FIR_Search_Button.setEnabled(false);
        
        Search_Criminal_Combo_Box.setEnabled(false);
        Search_By_Criminal_Search_Button.setEnabled(false);
                
    }//GEN-LAST:event_Search_Officer_ButtonActionPerformed

    private void Search_FIR_Combo_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_FIR_Combo_BoxActionPerformed
        
    }//GEN-LAST:event_Search_FIR_Combo_BoxActionPerformed

    private void Search_Area_Combo_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Area_Combo_BoxActionPerformed
 
    }//GEN-LAST:event_Search_Area_Combo_BoxActionPerformed

    private void Search_By_Area_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_By_Area_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_By_Area_Search_ButtonActionPerformed

    private void Search_By_Officer_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_By_Officer_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_By_Officer_Search_ButtonActionPerformed

    private void Search_Officer_Search_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Officer_Search_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Officer_Search_Button2ActionPerformed

    private void Search_By_FIR_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_By_FIR_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_By_FIR_Search_ButtonActionPerformed

    private void Search_Officer_Search_Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Officer_Search_Button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Officer_Search_Button4ActionPerformed

    private void Search_By_Criminal_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_By_Criminal_Search_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_By_Criminal_Search_ButtonActionPerformed

    private void Search_Page_Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Page_Return_ButtonActionPerformed
        Main_Page main_page = new Main_Page();
        main_page.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_Search_Page_Return_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_Area_Button;
    private javax.swing.JComboBox<String> Search_Area_Combo_Box;
    private javax.swing.JButton Search_By_Area_Search_Button;
    private javax.swing.JButton Search_By_Criminal_Search_Button;
    private javax.swing.JButton Search_By_FIR_Search_Button;
    private javax.swing.JButton Search_By_Officer_Search_Button;
    private javax.swing.JButton Search_Criminal_Button;
    private javax.swing.JComboBox<String> Search_Criminal_Combo_Box;
    private javax.swing.JButton Search_FIR_Button;
    private javax.swing.JComboBox<String> Search_FIR_Combo_Box;
    private javax.swing.JButton Search_Officer_Button;
    private javax.swing.JComboBox<String> Search_Officer_Combo_Box;
    private javax.swing.JButton Search_Officer_Search_Button2;
    private javax.swing.JButton Search_Officer_Search_Button4;
    private javax.swing.JButton Search_Page_Return_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}