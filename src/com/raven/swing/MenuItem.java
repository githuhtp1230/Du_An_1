package com.raven.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import com.raven.model.Model_Menu;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;

    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType() == Model_Menu.MenuType.MENU) {
            lblcon.setIcon(data.toIcon());
            lblName.setText(data.getName());
        } else if (data.getType() == Model_Menu.MenuType.TITLE) {
            lblcon.setText(data.getName());
            lblcon.setFont(new Font("sansserif", 1, 12));
            lblName.setVisible(false);
        } else {
            lblName.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        lblcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblName.setFont(new java.awt.Font("Segoe UI Variable", 3, 10)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Menu Name");
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblcon)
                .addGap(10, 10, 10)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblcon, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblcon;
    // End of variables declaration//GEN-END:variables

}
