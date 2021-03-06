package gui;

import javax.swing.JOptionPane;

import log.LogDir;
import log.Message;
import log.OptionQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LYNN
 */
public class TransferGUI extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6428034293495271468L;
	/**
     * Creates new form TransferGUI
     */
    public TransferGUI() {
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

        tranfer_jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        money_transfer_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accNo_transfer_jTextField = new javax.swing.JTextField();
        ok_transfer_jButton = new javax.swing.JButton();
        cancel_transfer_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tranfer_jPanel.setBackground(new java.awt.Color(204, 204, 255));
        tranfer_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("ATM 转 账");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("转账金额(RMB)：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("对方账户账号：");

        ok_transfer_jButton.setText("确定");
        ok_transfer_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_transfer_jButtonActionPerformed(evt);
            }
        });

        cancel_transfer_jButton.setText("取消");
        cancel_transfer_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_transfer_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tranfer_jPanelLayout = new javax.swing.GroupLayout(tranfer_jPanel);
        tranfer_jPanel.setLayout(tranfer_jPanelLayout);
        tranfer_jPanelLayout.setHorizontalGroup(
            tranfer_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranfer_jPanelLayout.createSequentialGroup()
                .addGroup(tranfer_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tranfer_jPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1))
                    .addGroup(tranfer_jPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(tranfer_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(money_transfer_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(accNo_transfer_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tranfer_jPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(ok_transfer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(cancel_transfer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        tranfer_jPanelLayout.setVerticalGroup(
            tranfer_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranfer_jPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(money_transfer_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accNo_transfer_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(tranfer_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_transfer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_transfer_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tranfer_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tranfer_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ok_transfer_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    	if(accNo_transfer_jTextField.getText().trim().equals("") || money_transfer_jTextField.getText().trim().equals("")) {
    		JOptionPane.showMessageDialog(this.getContentPane(), "请补全信息！");
    	}
    	else {
    		other_account_no = accNo_transfer_jTextField.getText();
    		transfer_money = Double.parseDouble(money_transfer_jTextField.getText());
    		System.out.println(transfer_money);
    		System.out.println(other_account_no);
    		int n=JOptionPane.showConfirmDialog(null, "转账 "+transfer_money+" RMB到银行卡号"+other_account_no+" ？ 确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    		if(n == 0) {
    			this.transfer_action();
    		}
    	}
    }                                                   

    private void cancel_transfer_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    	new FuncFrame().setVisible(true);
    	this.setVisible(false);
    }      
    
    private void transfer_action() {
    	
    	Message tran_msg = new Message(System.currentTimeMillis(),User.accNo,User.psw,Message.TRANSFER_NO,this.transfer_money,this.other_account_no);
    	User.client.sendMSG(tran_msg);
    	User.log.writeLog(tran_msg);
		Message ack = User.client.ReciveMSG();
		if(ack.getOperation() == Message.TRANSFER_NO) {
			User.log.writeLog(LogDir.COMMITTED);
			User.opq.push(tran_msg);
			User.balance = ack.getDeal();
			JOptionPane.showMessageDialog(this.getContentPane(), "转账成功！");
			new FuncFrame().setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(this.getContentPane(), "转账失败！");
		}
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
            java.util.logging.Logger.getLogger(TransferGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField accNo_transfer_jTextField;
    private javax.swing.JButton cancel_transfer_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField money_transfer_jTextField;
    private javax.swing.JButton ok_transfer_jButton;
    private javax.swing.JPanel tranfer_jPanel;
    private double transfer_money = 0;
    private String other_account_no;
    // End of variables declaration                   
}

