/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mta.oo8;

import yahoofinance.Stock;

/**
 *
 * @author MB-teacher
 */
public class ExchangeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExchangeJFrame
     */
    public ExchangeJFrame() {
        initComponents();
        Util.exchangeList(exchangeTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curCombo1 = new javax.swing.JComboBox<>();
        moneyField1 = new javax.swing.JTextField();
        curCombo2 = new javax.swing.JComboBox<>();
        moneyField2 = new javax.swing.JTextField();
        exchangeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exchangeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        curCombo1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        curCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TWD", "USD", "JPY", "CNY", "EUR" }));
        curCombo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                curCombo1ItemStateChanged(evt);
            }
        });

        moneyField1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        moneyField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        moneyField1.setText("1000");

        curCombo2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        curCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "JPY", "CNY", "EUR", "TWD" }));
        curCombo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                curCombo2ItemStateChanged(evt);
            }
        });

        moneyField2.setEditable(false);
        moneyField2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        moneyField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        moneyField2.setText("0");

        exchangeButton.setFont(new java.awt.Font("微軟正黑體", 0, 18)); // NOI18N
        exchangeButton.setText("兌換");
        exchangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        jLabel1.setText("交易時間 : ");

        timeLabel.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeLabel.setText("1970-01-01 00:00:00");

        exchangeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "幣別", "昨日匯率", "今日匯率", "買進匯率", "賣出匯率", "漲跌", "漲跌幅", "時間"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(exchangeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(curCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moneyField2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE))
                            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(curCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(moneyField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exchangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exchangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(curCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneyField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(curCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneyField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(timeLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exchangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangeButtonActionPerformed
        Util.exchange(curCombo1, curCombo2, moneyField1, moneyField2, timeLabel);
    }//GEN-LAST:event_exchangeButtonActionPerformed

    private void curCombo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_curCombo1ItemStateChanged
        Util.exchange(curCombo1, curCombo2, moneyField1, moneyField2, timeLabel);
    }//GEN-LAST:event_curCombo1ItemStateChanged

    private void curCombo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_curCombo2ItemStateChanged
        Util.exchange(curCombo1, curCombo2, moneyField1, moneyField2, timeLabel);
    }//GEN-LAST:event_curCombo2ItemStateChanged

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
            java.util.logging.Logger.getLogger(ExchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExchangeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExchangeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> curCombo1;
    private javax.swing.JComboBox<String> curCombo2;
    private javax.swing.JButton exchangeButton;
    private javax.swing.JTable exchangeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField moneyField1;
    private javax.swing.JTextField moneyField2;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
