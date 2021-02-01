package com.mta.oo7;

import java.awt.Color;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;

public class TWIIJFrame extends javax.swing.JFrame {

    public TWIIJFrame() {
        initComponents();
        
        Thread t = new Thread() {
            public void run() {
                while (true) {                    
                    try {
                        play();
                        Thread.sleep(3000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        t.start();
        
        
    }
    
    private void play() {
        String symbol = "^TWII";
        try {
            Stock stock = YahooFinance.get(symbol);
            // 目前價格
            double price = stock.getQuote().getPrice().doubleValue();
            // 目前數量
            long vol = stock.getQuote().getVolume().longValue();
            // 目前漲跌
            double change = stock.getQuote().getChange().doubleValue();
            // 目前漲跌幅 %
            double changeInPercent = stock.getQuote().getChangeInPercent().doubleValue();
            
            priceLabel.setText(String.format("%.2f", price));
            volLabel.setText(String.format("%d", vol));
            changeLabel.setText(String.format("%.2f", change));
            changeInPercentLabel.setText(String.format("%.2f", changeInPercent));
            
            // 改變顏色
            if(change == 0) {
                changeLabel.setForeground(Color.black);
                changeInPercentLabel.setForeground(Color.black);
            } else if(change > 0) {
                changeLabel.setForeground(Color.red);
                changeInPercentLabel.setForeground(Color.red);
                changeLabel.setText("^" + changeLabel.getText());
            } else {
                changeLabel.setForeground(new Color(0, 100, 0)); // R, G, B
                changeInPercentLabel.setForeground(new Color(0, 100, 0)); // R, G, B
                changeLabel.setText("v" + changeLabel.getText());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
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

        priceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        volLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        changeInPercentLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("台灣加權股價指數");

        priceLabel.setFont(new java.awt.Font("Consolas", 0, 100)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel.setText("0000.00");

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        jLabel2.setText("成交");

        volLabel.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        volLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volLabel.setText("0000.00");

        jLabel4.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        jLabel4.setText("億");

        changeLabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        changeLabel.setText("000.00");

        changeInPercentLabel.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        changeInPercentLabel.setText("00.00");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(changeInPercentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(volLabel)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeLabel)
                            .addComponent(changeInPercentLabel)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TWIIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TWIIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TWIIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TWIIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TWIIJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changeInPercentLabel;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel volLabel;
    // End of variables declaration//GEN-END:variables
}