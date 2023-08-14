
package bankmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class withdrawPage extends javax.swing.JFrame {


    private int ucardno;
    private mainPage obj;
    public void setCardnumber(int val){
        ucardno = val;
    }
    public void setParentFrameval(mainPage parent){
        obj = parent;
    }
    public withdrawPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        withdrawBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Withdraw");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Enter Amount");

        amountField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        withdrawBtn.setBackground(new java.awt.Color(0, 153, 255));
        withdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        withdrawBtn.setText("Withdraw");
        withdrawBtn.setBorder(null);
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkPin(String pin){
        String url
            = "jdbc:mysql://localhost:3306/bankmanagement"; // table details
        String username = "root"; // MySQL credentials
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            String sql = "select upin from users where ucardno = "+ucardno+";";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                int realPin = rs.getInt("upin");
                if(realPin == Integer.parseInt(pin)){
                    con.close();
                    return true;
                }
                else{
                    con.close();
                    return false;
                }
            }
            else{
                con.close();
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "Cannot connect database");
            return false;
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Invalid pin");
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(withdrawPage.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        String pin = JOptionPane.showInputDialog("Enter your pin to continue");
        boolean check = checkPin(pin);
        if(check){
            String url
            = "jdbc:mysql://localhost:3306/bankmanagement"; // table details
        String username = "root"; // MySQL credentials
        String password = "root";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement();
                String sql = "select balance from account where ucardnum = "+ucardno+";";
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    int balance = rs.getInt("balance");
                    if(balance>= Integer.parseInt(amountField.getText())){
                        int conf = JOptionPane.showConfirmDialog(this, "Confirm withdraw");
                        if(conf == JOptionPane.YES_OPTION){
                            int amount = Integer.parseInt(amountField.getText());
                            if(amount>0){
                                sql = "update account set balance ="+(balance-Integer.parseInt(amountField.getText()))+" where ucardnum ="+ucardno+";";
                            st.executeUpdate(sql);
                            // here we will add data in history table
                            String historyAmt = "- " +amount;
                            String datetimeinfo = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
                            String sql2 = "insert into history (ucardno, amount, date) values(" + ucardno + ",'" +historyAmt + "','" + datetimeinfo +"')";
                            st.executeUpdate(sql2);
                            obj.updateBalance(Integer.toString(balance-Integer.parseInt(amountField.getText())));
                            con.close(); // added newly
                            dispose();
                            }
                            else{
                                con.close();
                                JOptionPane.showMessageDialog(null, "Enter valid amount");
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Withdraw failed");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Failed to fetch data");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "database connection failed");
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Enter valid number");
                amountField.setText("");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "database connection failed");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Withdraw cancelled");
        }
    }//GEN-LAST:event_withdrawBtnActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
