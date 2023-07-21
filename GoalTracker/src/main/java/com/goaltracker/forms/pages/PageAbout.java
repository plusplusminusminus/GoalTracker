/*
 * PageAbout.java
 * - display the about page
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.pages;

import com.goaltracker.config.Constants;
import javax.swing.JPanel;

public class PageAbout extends JPanel implements Page {

    public PageAbout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newGoalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(229, 244, 252));
        setToolTipText("");
        setAlignmentX(Constants.ALIGNMENT_X);
        setOpaque(false);

        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("About Goal Tracker");
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jScrollPane2.setBackground(new java.awt.Color(253, 253, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setAlignmentX(Constants.ALIGNMENT_X);
        jScrollPane2.setOpaque(false);

        jTextPane1.setBackground(new java.awt.Color(253, 253, 255));
        jTextPane1.setBorder(null);
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jTextPane1.setText("<html>\n  <head>\n  </head>\n  <body><center>\n    <div style=\"text-align: center\">\n      <div style=\"font-size: 1.1em;font-weight: bold;x\">Goal Tracker</div>\n      <div style=\"font-size: 0.9em;margin-bottom: 20px;\">Version 1.0.2 - 20230509</div>\n      <div>SJSU CS 151, Sec.6 - Spring 2023</div>\n      <div style=\"margin-bottom: 20px;\">Group 11</div>\n      <div>This project was created in its entirety from scratch by Tyler Moquin.</div>\n    </div>\n  </body>\n</html>\n");
        jTextPane1.setOpaque(false);
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel newGoalLabel;
    // End of variables declaration//GEN-END:variables
}
