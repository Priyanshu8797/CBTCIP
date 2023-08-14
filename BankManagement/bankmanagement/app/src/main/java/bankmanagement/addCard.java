
package bankmanagement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class addCard extends javax.swing.JFrame {


    public addCard() {
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        unumber = new javax.swing.JLabel();
        upin = new javax.swing.JLabel();
        unameField = new javax.swing.JTextField();
        unumberField = new javax.swing.JTextField();
        upinField = new javax.swing.JPasswordField();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainTitle.setBackground(new java.awt.Color(0, 153, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Add Card");

        javax.swing.GroupLayout mainTitleLayout = new javax.swing.GroupLayout(mainTitle);
        mainTitle.setLayout(mainTitleLayout);
        mainTitleLayout.setHorizontalGroup(
            mainTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitleLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(title)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        mainTitleLayout.setVerticalGroup(
            mainTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(title)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        uname.setText("Name on card");

        unumber.setText("Card number");

        upin.setText("Pin");

        unameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameFieldActionPerformed(evt);
            }
        });

        upinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upinFieldActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 153, 255));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add Card");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(unumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(upin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(unameField)
                            .addComponent(unumberField)
                            .addComponent(upinField, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uname)
                    .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unumber)
                    .addComponent(unumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upin)
                    .addComponent(upinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameFieldActionPerformed

    private void upinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upinFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String url
            = "jdbc:mysql://localhost:3306/bankmanagement"; // table details
        String username = "root"; // MySQL credentials
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String uname = unameField.getText();
            int ucard = Integer.parseInt(unumberField.getText());
            int upin = Integer.parseInt(upinField.getText());
            String sql = "insert into users values(" + ucard + "," + upin + ",'"+uname+"')";
            String sql2 = "insert into account values(" + ucard + "," + 0 +")";
            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            int n = st.executeUpdate(sql2);
            if(m != 1 || n!= 1){
                JOptionPane.showMessageDialog(null, "failed to add data in database");
            }
            else{
                con.close();
                JOptionPane.showMessageDialog(null, "User added! log in now");
                dispose();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect database");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "please make sure entered credential are correct");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel mainTitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel uname;
    private javax.swing.JTextField unameField;
    private javax.swing.JLabel unumber;
    private javax.swing.JTextField unumberField;
    private javax.swing.JLabel upin;
    private javax.swing.JPasswordField upinField;
    // End of variables declaration//GEN-END:variables
}
