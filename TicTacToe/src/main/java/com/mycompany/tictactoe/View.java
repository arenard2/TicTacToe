package com.mycompany.tictactoe;
import javax.swing.JButton;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author student
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public View() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClick(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2onClick(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3onClick(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4onClick(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5onClick(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6onClick(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7onClick(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8onClick(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9onClick(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(416, 416, 416))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean whoseTurn = false;
    boolean winner = 
    private void onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      
      if (!winner.equals("")) {
          jLabel1.setText(winner+" Wins the game!");
      }
      this.whoseTurn = !this.whoseTurn;
    }
    
    }//GEN-LAST:event_onClick

    private void jButton2onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      
      if (!winner.equals("")) {
          jLabel1.setText(winner+" Wins the game!");
      }
      this.whoseTurn = !this.whoseTurn;
    }
    
    }//GEN-LAST:event_jButton2onClick

    private void jButton3onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton3onClick

    private void jButton4onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton4onClick

    private void jButton5onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton5onClick

    private void jButton6onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton6onClick

    private void jButton7onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton7onClick

    private void jButton8onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton8onClick

    private void jButton9onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9onClick
    JButton button = (JButton)evt.getSource();
    if (button.getText().equals("")) {
      String player = (this.whoseTurn) ? "X" : "O";
      button.setText(player);
      this.whoseTurn = !this.whoseTurn;
    }

    }//GEN-LAST:event_jButton9onClick

private String isWinner() {
  // Get the text contents of each button.  
  // Be sure you're accessing the
  // buttons in the order you want.  
  // The Netbeans UI sometimes mixes up
  // the numbers on the button names so they're not in the 
  // order you expect
  String[][] status = new String[3][3];
  status[0][0] = jButton1.getText();
  status[0][1] = jButton2.getText();
  status[0][2] = jButton3.getText();
  status[1][0] = jButton4.getText();
  status[1][1] = jButton5.getText();
  status[1][2] = jButton6.getText();
  status[2][0] = jButton7.getText();
  status[2][1] = jButton8.getText();
  status[2][2] = jButton9.getText();

  // Check the rows and columns for a tic tac toe
  for (int i=0; i<3; i++) {
    if (status[i][0].equals(status[i][1]) && status[i][0].equals(status[i][2]))
      return status[i][0];
    if (status[0][i].equals(status[1][i]) && status[0][i].equals(status[2][i]))
      return status[0][i];
  }

  // Check the diagonals
  if (status[0][0].equals(status[1][1]) && status[0][0].equals(status[2][2]))
    return status[0][0];
  if (status[0][2].equals(status[1][1]) && status[0][2].equals(status[2][0]))
    return status[0][2];

  // If we haven't found it, then return a blank string
  return "";
}


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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
