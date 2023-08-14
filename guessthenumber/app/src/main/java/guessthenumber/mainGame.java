
package guessthenumber;
import java.util.Random;
import javax.swing.JOptionPane;

public class mainGame extends javax.swing.JFrame {
    private int key;
    public mainGame() {
        initComponents();
        Random rand = new Random();
        key = rand.nextInt(100);
        if(key%2 == 0){
            hintLabel.setText("The selected number is even.");
        }
        else{
            hintLabel.setText("The selected number is odd.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guessInput = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        triesLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hintLabel = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Game");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        jLabel2.setText("Enter your guess below");

        jLabel3.setText("Guess:");

        guessInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessInputActionPerformed(evt);
            }
        });

        checkButton.setText("Check Guess");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("No. of Tries left: ");

        triesLabel.setText("10");

        jLabel6.setText("Hint:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton))
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(triesLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(triesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hintLabel))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessInputActionPerformed
        this.checkButtonActionPerformed(evt);
    }//GEN-LAST:event_guessInputActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        String guess = guessInput.getText();
        if("".equals(guess)){
            
            JOptionPane.showMessageDialog(this, "Enter a valid Number",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int guessInt = Integer.parseInt(guess);
                if(guessInt == this.key){
                    JOptionPane.showMessageDialog(this, "You win!",
                                   "You win!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                else{
                    // wrong guess 
                    String realKey = Integer.toString(this.key);
                    String toAdd;
                    if(key> guessInt){
                        if(key - guessInt <= 20){
                            toAdd = "Your guess is little low.";
                        }
                        else{
                            toAdd = "Your guess is quite low.";
                        }
                    }
                    else{
                        if(guessInt - key <= 20){
                            toAdd = "Your guess is little high.";
                        }
                        else{
                            toAdd = "Your guess is quite high.";
                        }
                    }
                    String triesLeft = triesLabel.getText();
                    int left = Integer.parseInt(triesLeft);
                    left--;
                    if(left != 0){
                    JOptionPane.showMessageDialog(this, "Wrong Guess! Hint: "+toAdd,
                                   "Wrong Guess", JOptionPane.INFORMATION_MESSAGE);
                    String updatedTries = Integer.toString(left);
                    triesLabel.setText(updatedTries);
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(this, "You Loose! The number was: "+ realKey,
                                   "You Loose!", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
            }
            }
            catch(final NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Enter a valid Number",
                                   "Invalid Input", JOptionPane.ERROR_MESSAGE);
                guessInput.setText("");
            }
    }//GEN-LAST:event_checkButtonActionPerformed
    }

    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField guessInput;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel triesLabel;
    // End of variables declaration//GEN-END:variables
}
