
package bankmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class mainPage extends javax.swing.JFrame {
    
    private int ucardno;
    Connection con;

    public mainPage() {
        initComponents();
        
    }
    public void updateBalance(String balance){
        balanceLabel.setText(balance);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        unameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        withdrawBtn = new javax.swing.JButton();
        depositeBtn = new javax.swing.JButton();
        transactionHistoryBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        transferbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        welcomeLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome,");

        unameLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        unameLabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Balance");

        balanceLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        withdrawBtn.setBackground(new java.awt.Color(0, 153, 255));
        withdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        withdrawBtn.setText("Withdraw");
        withdrawBtn.setBorder(null);
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        depositeBtn.setBackground(new java.awt.Color(0, 153, 255));
        depositeBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositeBtn.setText("Deposite");
        depositeBtn.setBorder(null);
        depositeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeBtnActionPerformed(evt);
            }
        });

        transactionHistoryBtn.setBackground(new java.awt.Color(0, 153, 255));
        transactionHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        transactionHistoryBtn.setText("Transaction History");
        transactionHistoryBtn.setBorder(null);
        transactionHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionHistoryBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log out");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        transferbutton.setBackground(new java.awt.Color(0, 153, 255));
        transferbutton.setForeground(new java.awt.Color(255, 255, 255));
        transferbutton.setText("Transfer Money");
        transferbutton.setBorder(null);
        transferbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(depositeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(transferbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(transferbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        withdrawPage wp = new withdrawPage();
        wp.setVisible(true);
        wp.setLocation(100,100);
        wp.setResizable(false);
        wp.setTitle("Withdraw cash");
        wp.setCardnumber(ucardno);
        wp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        wp.setParentFrameval(this);
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void depositeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeBtnActionPerformed
        depositePage dp = new depositePage();
        dp.setVisible(true);
        dp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dp.setLocation(100,100);
        dp.setResizable(false);
        dp.setTitle("Deposite money");
        dp.setUserCard(ucardno);
        dp.setParentFrame(this);
    }//GEN-LAST:event_depositeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void transactionHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionHistoryBtnActionPerformed
        transactionHistoryPage th = new transactionHistoryPage();
        th.setTitle("Transaction history");
        th.setLocation(100,100);
        th.setResizable(false);
        th.setVisible(true);
        th.setUidVal(ucardno);
        th.updateLabels();
        th.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_transactionHistoryBtnActionPerformed

    private void transferbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferbuttonActionPerformed
        transferMoneypage tmp = new transferMoneypage();
        tmp.setLocation(100, 100);
        tmp.setResizable(false);
        tmp.setTitle("Transfer funds");
        tmp.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        tmp.setusercardnum(ucardno);
        tmp.setParentFrameval(this);
        tmp.setVisible(true);
    }//GEN-LAST:event_transferbuttonActionPerformed
    public void setUserName(String name){
        unameLabel.setText(name);
    }
    public void setUserCard(int cardno){
        ucardno = cardno;
        setBalanceLabel();
    }
    public void setBalanceLabel(){
        String url
            = "jdbc:mysql://localhost:3306/bankmanagement"; // table details
        String username = "root"; // MySQL credentials
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            String sql = "select * from account where ucardnum="+ucardno+";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                balanceLabel.setText(Integer.toString(rs.getInt("balance")));
            }
            else{
                JOptionPane.showMessageDialog(null, "There was a problem loadind the data for ucard: "+ucardno);
          
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Cannot connect database");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton depositeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton transactionHistoryBtn;
    private javax.swing.JButton transferbutton;
    private javax.swing.JLabel unameLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
