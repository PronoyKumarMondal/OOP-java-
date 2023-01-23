
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tfbd
 */
public class tic_tac_toe extends javax.swing.JFrame {
    private String startGame="x";
    private int xCount=0;
    private int oCount=0;

    /**
     * Creates new form tic_tac_toe
     */
    public tic_tac_toe() {
        initComponents();
    }
    private void gamescore()
    {
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame="o";
        }
        else{
            startGame="x";
        }
        
    }
    
    private void WinningGame()
    {
        String b1= txtbtn1.getText();
        String b2= txtbtn2.getText();
        String b3= txtbtn3.getText();
        String b4= txtbtn4.getText();
        String b5= txtbtn5.getText();
        String b6= txtbtn6.getText();
        String b7= txtbtn7.getText();
        String b8= txtbtn8.getText();
        String b9= txtbtn9.getText();
        
        if (b1 == ("x") && b2 == ("x") && b3 == ("x")) {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);

        }

        if (b4 == ("x") && b5 == ("x") && b6 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);

        }
        if (b7 == ("x") && b8 == ("x") && b9 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b1 == ("x") && b4 == ("x") && b7 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);

        }
        if (b2 == ("x") && b5 == ("x") && b8 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);

        }
        if (b3 == ("x") && b6 == ("x") && b9 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b1 == ("x") && b5 == ("x") && b9 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b3 == ("x") && b5 == ("x") && b7 == "x") {
            JOptionPane.showMessageDialog(this, "Player x win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);

        }
        
        
        
        
         if (b1 == ("o") && b2 == ("o") && b3 == ("o")) {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);

        }

        if (b4 == ("o") && b5 == ("o") && b6 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);

        }
        if (b7 == ("o") && b8 == ("o") && b9 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b1 == ("o") && b4 == ("o") && b7 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);

        }
        if (b2 == ("o") && b5 == ("o") && b8 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);

        }
        if (b3 == ("o") && b6 == ("o") && b9 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b1 == ("o") && b5 == ("o") && b9 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gamescore();
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);

        }
        if (b3 == ("o") && b5 == ("o") && b7 == "o") {
            JOptionPane.showMessageDialog(this, "Player o win", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gamescore();
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(153, 255, 102));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 51, 51));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setText("Player 0 :");
        playero.setFocusTraversalPolicyProvider(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setFocusTraversalPolicyProvider(true);

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setText("Player X :");
        playerx.setFocusTraversalPolicyProvider(true);

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(51, 0, 255));
        playerooo.setText("xxxxxxxxxxxx");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(51, 0, 255));
        playerxxx.setText("xxxxxxxxxxx");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(playerxxx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playero)
                        .addGap(18, 18, 18)
                        .addComponent(playerooo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerx)
                            .addComponent(playerxxx))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playero)
                            .addComponent(playerooo))
                        .addGap(80, 80, 80))))
        );

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn2.setForeground(Color.red);
        }
        else{
            txtbtn2.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
         txtbtn3.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn3.setForeground(Color.red);
        }
        else{
            txtbtn3.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn1.setForeground(Color.red);
        }
        else{
           txtbtn1.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setText(null);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setText(null);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setText(null);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setText(null);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setText(null);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setText(null);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setText(null);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setText(null);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
       
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn4.setForeground(Color.red);
        }
        else{
            txtbtn4.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn5.setForeground(Color.red);
        }
        else{
            txtbtn5.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn6.setForeground(Color.red);
        }
        else{
            txtbtn6.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn9.setForeground(Color.red);
        }
        else{
            txtbtn9.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
           txtbtn8.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn8.setForeground(Color.red);
        }
        else{
            txtbtn8.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
         txtbtn7.setText(startGame);
         if(startGame.equalsIgnoreCase("x"))
        {
            txtbtn7.setForeground(Color.red);
        }
        else{
            txtbtn7.setForeground(Color.magenta);
        }
        
        choose_a_Player();
        WinningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

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
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
