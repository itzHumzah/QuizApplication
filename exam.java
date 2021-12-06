/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizapp;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import quizapp.project.connectionprovider;

/**
 *
 * @author Humzah
 */
public class exam extends javax.swing.JFrame {
public String questionid ="1";
public String answer;
public int min = 0;
public int sec = 0;
public int marks = 0;
        
    /**
     * Creates new form exam
     */
public void answercheck(){
    String studentAnswer="";
    if(jRadioButton1.isSelected()){
        studentAnswer=jRadioButton1.getText();
    }
    else if(jRadioButton2.isSelected()){
        studentAnswer=jRadioButton2.getText();
    }
    else if(jRadioButton3.isSelected()){
        studentAnswer=jRadioButton3.getText();
    }
    else {
        studentAnswer=jRadioButton4.getText();
    }
    if(studentAnswer.equals(answer)){
        marks++;
        String marks1 = String.valueOf(marks);
        jLabel18.setText(marks1);
   
    }
      jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
          jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
      
    
    
    int questionid1 = Integer.parseInt(questionid);
    questionid1++;
    questionid = String.valueOf(questionid1);
if(questionid.equals("15")){
        jButton1.setVisible(false);
     
    }

}
public void question(){
    try{Connection con = connectionprovider.getCon();
         Statement st = con.createStatement();           
           ResultSet rs1 = st.executeQuery("select * from question where id='"+questionid+"'");
           while(rs1.next()){
               jLabel16.setText(rs1.getString(1));
               jLabel19.setText(rs1.getString(2));
               jRadioButton1.setText(rs1.getString(3));
               jRadioButton2.setText(rs1.getString(4));
               jRadioButton3.setText(rs1.getString(5));
               jRadioButton4.setText(rs1.getString(6));
               answer = rs1.getString(7);                         
           }
    }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);}
}
public void submit(){
    String rollNo = jLabel11.getText();
    answercheck();
    try{
        Connection con = connectionprovider.getCon();
    
         Statement st = con.createStatement();
            st.executeUpdate("Update student set marks='"+marks+"' where rollNo ='"+rollNo+"'");
            String marks1 = String.valueOf(marks);
            setVisible(false);
            new submited().setVisible(true);
                    }
           catch(Exception e){
                   JOptionPane.showMessageDialog(null,e);
                   }               
}
    public exam() {
        initComponents();
    }
    Timer time ;
    public exam(String rollNo) {
        initComponents();
        jLabel11.setText(rollNo);
        SimpleDateFormat dformat = new SimpleDateFormat("dd-mm-yyyy");
        Date date = new Date();
        jLabel4.setText(dformat.format(date));
        
        try{Connection con = connectionprovider.getCon();
         Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollNo+"'");
           while(rs.next()){
               jLabel13.setText(rs.getString(2));
           }
           ResultSet rs1 = st.executeQuery("select * from question where id='"+questionid+"'");
           while(rs1.next()){
               jLabel16.setText(rs1.getString(1));
               jLabel19.setText(rs1.getString(2));
               jRadioButton1.setText(rs1.getString(3));
               jRadioButton2.setText(rs1.getString(4));
               jRadioButton3.setText(rs1.getString(5));
               jRadioButton4.setText(rs1.getString(6));
               answer = rs1.getString(7);
               
               
           }
    }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e);}
        
        setLocationRelativeTo(this);
        time = new Timer(1000,new ActionListener(){
           

            @Override
            public void actionPerformed(ActionEvent e) {
           jLabel8.setText(String.valueOf(sec));
           jLabel7.setText(String.valueOf(min));
           if (sec==60){
               sec = 0;
               min++;
               if(min == 15){
                   time.stop();
                   answercheck();
                   submit();
                   }
           }
           sec++;
            };
         
    });
        time.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-student-64.png"))); // NOI18N
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel3.setText("Total time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("20 min");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 60, 30));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel6.setText("Time taken:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText(" 00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Roll No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 204, 204));
        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel11.setText("007");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total question:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 204, 204));
        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setText("Humzah");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 204, 204));
        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel14.setText("15");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 30, 30));

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Question No. : ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 204, 204));
        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel16.setText("00");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 201, 30, -1));

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Your Marks:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel18.setText("00");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, 260, 700));

        jLabel19.setBackground(new java.awt.Color(0, 204, 204));
        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel19.setText("Question demo ?");
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setMinimumSize(new java.awt.Dimension(100, 0));
        jRadioButton1.setOpaque(true);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.setMinimumSize(new java.awt.Dimension(100, 0));
        jRadioButton2.setOpaque(true);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.setMinimumSize(new java.awt.Dimension(100, 0));
        jRadioButton3.setOpaque(true);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(0, 204, 204));
        jRadioButton4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.setMinimumSize(new java.awt.Dimension(100, 0));
        jRadioButton4.setOpaque(true);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-next-48.png"))); // NOI18N
        jButton1.setText("Next");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/icons8-submit-progress-48.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/f.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jLabel20.setMinimumSize(new java.awt.Dimension(100, 0));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int a =JOptionPane.showConfirmDialog(null,"Do you want to submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){answercheck();
        submit();
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
answercheck();
question();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if (jRadioButton1.isSelected()){
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
}
    // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
if (jRadioButton2.isSelected()){
    jRadioButton1.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton4.setSelected(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
if (jRadioButton3.isSelected()){
    jRadioButton2.setSelected(false);
    jRadioButton1.setSelected(false);
    jRadioButton4.setSelected(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
if (jRadioButton4.isSelected()){
    jRadioButton2.setSelected(false);
    jRadioButton3.setSelected(false);
    jRadioButton1.setSelected(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
