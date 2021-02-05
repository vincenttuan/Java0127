/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mta.oo17_io;

import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author MB-teacher
 */
public class OpenWeatherJFrame extends javax.swing.JFrame {

    /**
     * Creates new form OpenWeatherJFrame
     */
    public OpenWeatherJFrame() {
        initComponents();
        buttonGroup1.add(cn1);
        buttonGroup1.add(cn2);
        buttonGroup1.add(cn3);
        buttonGroup1.add(cn4);
        showWeather("TW", "kaohsiung");
    }
    
    private void showWeather(String country, String cityName) {
        Util util = new Util();
        Weather weather = util.getWeather(country, cityName);
        temp_label.setText(String.format("%.1f", weather.getTemp()));
        feel_label.setText(String.format("%.1f", weather.getFeelsLike()));
        humi_label.setText(String.format("%d", weather.getHumidity()));
        // 取得網路 icon
        String icon_url = "http://openweathermap.org/img/wn/%s@2x.png";
        icon_url = String.format(icon_url, weather.getIcon());
        try {
            InputStream icon_stream = new URL(icon_url).openStream();
            icon_label.setText("");
            icon_label.setIcon(new ImageIcon(ImageIO.read(icon_stream)));
        } catch (Exception e) {
            icon_label.setText(e.getMessage());
        }
        // 時間轉換
        Date date = new Date(weather.getDt() * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dt_label.setText(String.format("%s", sdf.format(date)));
        
        description_label.setText(weather.getDescription());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        cn1 = new javax.swing.JRadioButton();
        cn2 = new javax.swing.JRadioButton();
        cn3 = new javax.swing.JRadioButton();
        cn4 = new javax.swing.JRadioButton();
        temp_label = new javax.swing.JLabel();
        feel_label = new javax.swing.JLabel();
        humi_label = new javax.swing.JLabel();
        icon_label = new javax.swing.JLabel();
        dt_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        description_label = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OpenWeather 現在天氣");

        cn1.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        cn1.setText("台北");

        cn2.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        cn2.setSelected(true);
        cn2.setText("桃園");

        cn3.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        cn3.setText("台中");

        cn4.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        cn4.setText("高雄");

        temp_label.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        temp_label.setForeground(new java.awt.Color(0, 153, 153));
        temp_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temp_label.setText("00.0");

        feel_label.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        feel_label.setForeground(new java.awt.Color(0, 153, 0));
        feel_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        feel_label.setText("00.0");

        humi_label.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        humi_label.setForeground(new java.awt.Color(153, 0, 51));
        humi_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        humi_label.setText("00");

        icon_label.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        icon_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_label.setText("icon");

        dt_label.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        dt_label.setForeground(new java.awt.Color(102, 102, 102));
        dt_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dt_label.setText("2020-01-01 00:00:00");

        jLabel6.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jLabel6.setText("°C");

        jLabel8.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jLabel8.setText("%");

        description_label.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        description_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        description_label.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dt_label, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(icon_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(temp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cn1)
                                .addGap(18, 18, 18)
                                .addComponent(cn2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cn3)
                                .addGap(18, 18, 18)
                                .addComponent(cn4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(humi_label, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))))
                    .addComponent(description_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn1)
                    .addComponent(cn2)
                    .addComponent(cn3)
                    .addComponent(cn4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temp_label)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feel_label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(humi_label)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(icon_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(description_label)
                .addGap(29, 29, 29)
                .addComponent(dt_label)
                .addGap(44, 44, 44))
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
            java.util.logging.Logger.getLogger(OpenWeatherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenWeatherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenWeatherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenWeatherJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenWeatherJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cn1;
    private javax.swing.JRadioButton cn2;
    private javax.swing.JRadioButton cn3;
    private javax.swing.JRadioButton cn4;
    private javax.swing.JLabel description_label;
    private javax.swing.JLabel dt_label;
    private javax.swing.JLabel feel_label;
    private javax.swing.JLabel humi_label;
    private javax.swing.JLabel icon_label;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel temp_label;
    // End of variables declaration//GEN-END:variables
}
