package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LYNN
 */
public class FuncFrame extends javax.swing.JFrame {

    /**
     * Creates new form FuncFrame
     */
    public FuncFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Func_jPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        account_func_jTextPane1 = new javax.swing.JTextPane();
        desposit_func_jButton = new javax.swing.JButton();
        withdrawal_func_jButton = new javax.swing.JButton();
        tranfer_func_jButton = new javax.swing.JButton();
        painting_func_jButton = new javax.swing.JButton();
        cancel_func_jButton = new javax.swing.JButton();
        accounct_Func_jLabel1 = new javax.swing.JLabel();
        Funcmenu_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Func_jPanel.setBackground(new java.awt.Color(204, 204, 255));
        Func_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(account_func_jTextPane1);

        desposit_func_jButton.setText("存款");
        desposit_func_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desposit_func_jButtonActionPerformed(evt);
            }
        });

        withdrawal_func_jButton.setText("取款");
        withdrawal_func_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawal_func_jButtonActionPerformed(evt);
            }
        });

        tranfer_func_jButton.setText("转账");
        tranfer_func_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranfer_func_jButtonActionPerformed(evt);
            }
        });

        painting_func_jButton.setText("打印凭证");
        painting_func_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painting_func_jButtonActionPerformed(evt);
            }
        });

        cancel_func_jButton.setText("取消");
        cancel_func_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_func_jButtonActionPerformed(evt);
            }
        });

        accounct_Func_jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        accounct_Func_jLabel1.setText("您目前的余额为(RMB)：");

        Funcmenu_jLabel.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        Funcmenu_jLabel.setText("功 能 菜 单");

        javax.swing.GroupLayout Func_jPanelLayout = new javax.swing.GroupLayout(Func_jPanel);
        Func_jPanel.setLayout(Func_jPanelLayout);
        Func_jPanelLayout.setHorizontalGroup(
            Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Func_jPanelLayout.createSequentialGroup()
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tranfer_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(desposit_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painting_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(withdrawal_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Func_jPanelLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Func_jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Func_jPanelLayout.createSequentialGroup()
                        .addComponent(accounct_Func_jLabel1)
                        .addGap(98, 98, 98))))
            .addGroup(Func_jPanelLayout.createSequentialGroup()
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Func_jPanelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(cancel_func_jButton))
                    .addGroup(Func_jPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Funcmenu_jLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Func_jPanelLayout.setVerticalGroup(
            Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Func_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Funcmenu_jLabel)
                .addGap(39, 39, 39)
                .addComponent(accounct_Func_jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawal_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(desposit_func_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Func_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tranfer_func_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painting_func_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel_func_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Func_jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Func_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void desposit_func_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    	new DespositGUI().setVisible(true);
    	this.setVisible(false);
    	
    }                                                     

    private void withdrawal_func_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    	new WithdrawGUI().setVisible(true);
    	this.setVisible(false);
    }                                                       

    private void tranfer_func_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    	new TransferGUI().setVisible(true);
    	this.setVisible(false);
    }                                                    

    private void painting_func_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    	new PaintingGUI().setVisible(true);
    	this.setVisible(false);
    }                                                     

    private void cancel_func_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    	System.exit(0);
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
            java.util.logging.Logger.getLogger(FuncFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Func_jPanel;
    private javax.swing.JLabel Funcmenu_jLabel;
    private javax.swing.JLabel accounct_Func_jLabel1;
    private javax.swing.JTextPane account_func_jTextPane1;
    private javax.swing.JButton cancel_func_jButton;
    private javax.swing.JButton desposit_func_jButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton painting_func_jButton;
    private javax.swing.JButton tranfer_func_jButton;
    private javax.swing.JButton withdrawal_func_jButton;
    // End of variables declaration                   
}
