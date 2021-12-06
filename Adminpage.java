package quizapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Adminpage extends javax.swing.JFrame {
public static int open=0;

    public Adminpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jMenu10.setText("File");
        jMenuBar2.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar2.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ola.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, -1, -1));
        jLabel5.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuBar1.setOpaque(true);

        jMenu1.setBackground(new java.awt.Color(255, 204, 255));
        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-add-50.png"))); // NOI18N
        jMenu1.setText("Add New Question     ");
        jMenu1.setBorderPainted(true);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu1.setIconTextGap(1);
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.setOpaque(true);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu14.setBackground(new java.awt.Color(255, 204, 255));
        jMenu14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu14.setForeground(new java.awt.Color(0, 0, 0));
        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-delete-64.png"))); // NOI18N
        jMenu14.setText("Delete Question      ");
        jMenu14.setBorderPainted(true);
        jMenu14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu14.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu14.setIconTextGap(1);
        jMenu14.setOpaque(true);
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu14);

        jMenu2.setBackground(new java.awt.Color(255, 204, 255));
        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-update-64.png"))); // NOI18N
        jMenu2.setText("Update Question      ");
        jMenu2.setBorderPainted(true);
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu2.setOpaque(true);
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu15.setBackground(new java.awt.Color(255, 204, 255));
        jMenu15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu15.setForeground(new java.awt.Color(0, 0, 0));
        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-grades-50.png"))); // NOI18N
        jMenu15.setText("All Student Result     ");
        jMenu15.setToolTipText("");
        jMenu15.setAlignmentX(1.0F);
        jMenu15.setBorderPainted(true);
        jMenu15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu15.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu15.setIconTextGap(2);
        jMenu15.setOpaque(true);
        jMenu15.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu15MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu15);

        jMenu13.setBackground(new java.awt.Color(255, 204, 255));
        jMenu13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu13.setForeground(new java.awt.Color(0, 0, 0));
        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-view-all-50.png"))); // NOI18N
        jMenu13.setText(" All Question      ");
        jMenu13.setBorderPainted(true);
        jMenu13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu13.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu13.setIconTextGap(1);
        jMenu13.setOpaque(true);
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu13);

        jMenu16.setBackground(new java.awt.Color(255, 204, 255));
        jMenu16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu16.setForeground(new java.awt.Color(0, 0, 0));
        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-logout-58.png"))); // NOI18N
        jMenu16.setText("Log Out     ");
        jMenu16.setAlignmentX(1.0F);
        jMenu16.setBorderPainted(true);
        jMenu16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu16.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu16.setIconTextGap(1);
        jMenu16.setOpaque(true);
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu16);

        jMenu17.setBackground(new java.awt.Color(255, 204, 255));
        jMenu17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu17.setForeground(new java.awt.Color(0, 0, 0));
        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-cross-mark-button-48.png"))); // NOI18N
        jMenu17.setText("Exit     ");
        jMenu17.setBorderPainted(true);
        jMenu17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu17.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jMenu17.setIconTextGap(2);
        jMenu17.setInheritsPopupMenu(true);
        jMenu17.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu17.setOpaque(true);
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu17ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu17);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a =JOptionPane.showConfirmDialog(null,"Do you want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
          System.exit(0);
    }
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
       JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a =JOptionPane.showConfirmDialog(null,"Do you want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           setVisible(false);
           new Loginpage().setVisible(true);
    }
    }//GEN-LAST:event_jMenu16MouseClicked
/*
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed
*/
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
            if(open==0){
                new addqust().setVisible(true);
                open=1;
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"One Form is already open");
            }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       if(open==0){
                new updatepage().setVisible(true);
                open=1; 
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"One Form is already open");
            }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        if(open==0){
                new allgrades().setVisible(true);
                open=1; 
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"One Form is already open");
            }
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
      if(open==0){
                new deletequest().setVisible(true);
                open=1; 
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"One Form is already open");
            }
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
            if(open==0){
                new allq().setVisible(true);
                open=1; 
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"One Form is already open");
            }         
    }//GEN-LAST:event_jMenu13MouseClicked
/*
    private void jMenu15MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu15MenuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu15MenuKeyPressed
*/
    private void jMenu17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu17ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables

   
}
