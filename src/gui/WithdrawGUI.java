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
public class WithdrawGUI extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6638111334227586703L;
	/**
     * Creates new form WithdrawGUI
     */
    public WithdrawGUI() {
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

        witd_jPanel1 = new javax.swing.JPanel();
        witd_jLabel = new javax.swing.JLabel();
        m100_witd_jButton = new javax.swing.JButton();
        m300_witd_jButton = new javax.swing.JButton();
        m500_witd_jButton = new javax.swing.JButton();
        m1000_witd_jButton = new javax.swing.JButton();
        m2000_witd_jButton = new javax.swing.JButton();
        cancel_witd_jButton = new javax.swing.JButton();
        witd_jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        witd_jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        witd_jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        witd_jLabel.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        witd_jLabel.setText("ATM 取 款");

        m100_witd_jButton.setText("100");
        m100_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m100_witd_jButtonActionPerformed(evt);
            }
        });

        m300_witd_jButton.setText("300");
        m300_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m300_witd_jButtonActionPerformed(evt);
            }
        });

        m500_witd_jButton.setText("500");
        m500_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m500_witd_jButtonActionPerformed(evt);
            }
        });

        m1000_witd_jButton.setText("1000");
        m1000_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1000_witd_jButtonActionPerformed(evt);
            }
        });

        m2000_witd_jButton.setText("2000");
        m2000_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2000_witd_jButtonActionPerformed(evt);
            }
        });

        cancel_witd_jButton.setText("取消");
        cancel_witd_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_witd_jButtonActionPerformed(evt);
            }
        });

        witd_jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        witd_jLabel4.setText("请选择取款金额(RMB):");

        javax.swing.GroupLayout witd_jPanel1Layout = new javax.swing.GroupLayout(witd_jPanel1);
        witd_jPanel1.setLayout(witd_jPanel1Layout);
        witd_jPanel1Layout.setHorizontalGroup(
            witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witd_jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witd_jPanel1Layout.createSequentialGroup()
                        .addComponent(witd_jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witd_jPanel1Layout.createSequentialGroup()
                        .addComponent(witd_jLabel)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, witd_jPanel1Layout.createSequentialGroup()
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(m500_witd_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m100_witd_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m2000_witd_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(m300_witd_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m1000_witd_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(cancel_witd_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        witd_jPanel1Layout.setVerticalGroup(
            witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(witd_jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(witd_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(witd_jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m100_witd_jButton)
                    .addComponent(m300_witd_jButton))
                .addGap(18, 18, 18)
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m500_witd_jButton)
                    .addComponent(m1000_witd_jButton))
                .addGap(18, 18, 18)
                .addGroup(witd_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_witd_jButton)
                    .addComponent(m2000_witd_jButton))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(witd_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(witd_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void cancel_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    	new FuncFrame().setVisible(true);
    	this.setVisible(false);
    }                                                   

    private void m300_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	withdraw_money = 300;
    	int n=JOptionPane.showConfirmDialog(null, "取款300RMB，确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    	if(n==0) {
    		this.withdraw_action();
    	}
    } 
    
    private void m1000_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	withdraw_money = 1000;
    	int n=JOptionPane.showConfirmDialog(null, "取款1000RMB，确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    	if(n==0) {
    		this.withdraw_action();
    	}
    }
    
    private void m2000_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	withdraw_money = 2000;
    	int n=JOptionPane.showConfirmDialog(null, "取款2000RMB，确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    	if(n==0) {
    		this.withdraw_action();
    	}
    }

    private void m100_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	withdraw_money = 100;
    	int n=JOptionPane.showConfirmDialog(null, "取款100RMB，确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    	if(n==0) {
    		this.withdraw_action();
    	}
    }                                                 

    private void m500_witd_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	withdraw_money = 500;
    	int n=JOptionPane.showConfirmDialog(null, "取款500RMB，确认请选择\"是\"","",JOptionPane.YES_NO_OPTION);
    	if(n==0) {
    		this.withdraw_action();
    	}
    	
    }      
    
    private void withdraw_action() {
    	// TODO add your handling code here:
    	Message with_msg = new Message(System.currentTimeMillis(),User.accNo,User.psw,Message.WITHDRAW_NO,this.withdraw_money,"*");
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	User.client.sendMSG(with_msg);
		User.log.writeLog(with_msg);
		Message ack = User.client.ReciveMSG();
		System.out.println("*************************");
		System.out.println(ack.toString());
		if(ack.getOperation() == Message.WITHDRAW_NO) {
			//User.client.sendMSG(new Message(System.currentTimeMillis(),User.accNo,User.psw,Message.COMMITED_NO,this.withdraw_money,"*"));
			User.log.writeLog(LogDir.COMMITTED);
			User.opq.push(with_msg);
			User.balance = ack.getDeal();
			JOptionPane.showMessageDialog(this.getContentPane(), "已吐钞"+this.withdraw_money+"元！取款成功！");
			new FuncFrame().setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(this.getContentPane(), "取款失败！");
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
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancel_witd_jButton;
    private javax.swing.JButton m1000_witd_jButton;
    private javax.swing.JButton m100_witd_jButton;
    private javax.swing.JButton m2000_witd_jButton;
    private javax.swing.JButton m300_witd_jButton;
    private javax.swing.JButton m500_witd_jButton;
    private javax.swing.JLabel witd_jLabel;
    private javax.swing.JLabel witd_jLabel4;
    private javax.swing.JPanel witd_jPanel1;
    private int withdraw_money = 0;
    // End of variables declaration                   
}

