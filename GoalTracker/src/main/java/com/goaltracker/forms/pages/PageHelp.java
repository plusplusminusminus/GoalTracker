/*
 * PageHelp.java
 * - display help page
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

public class PageHelp extends JPanel implements Page {

    public PageHelp() {
        initComponents();
        helpScroller.getViewport().setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newGoalLabel = new javax.swing.JLabel();
        helpScroller = new javax.swing.JScrollPane();
        helpTextArea = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(229, 244, 252));
        setAlignmentX(Constants.ALIGNMENT_X);
        setOpaque(false);
        setPreferredSize(null);

        newGoalLabel.setBackground(new java.awt.Color(153, 255, 204));
        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("Help");
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        helpScroller.setBorder(null);
        helpScroller.setAlignmentX(Constants.ALIGNMENT_X);
        helpScroller.setOpaque(false);

        helpTextArea.setEditable(false);
        helpTextArea.setBackground(new java.awt.Color(246, 251, 253));
        helpTextArea.setBorder(null);
        helpTextArea.setContentType("text/html"); // NOI18N
        helpTextArea.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        helpTextArea.setText("<html>\n  <head>\n<style>\n  </head>\n  <body style=\"font-family:'Verdana', Helvetica;fint-size:16pt;\">\n    <div style=\"text-align: center\">\n    </div>\n      <div style=\"font-weight:bold;\"><span style=\"border-bottom:1px solid black\"><u>About Goal Types</u></span></div>\n    <div style=\"padding-bottom: 20px\"><strong>Accumulation Goals</strong> are goals where you are aiming to accrue a certain amount. For example, if your goal was to set aside $500.00 over the next year to pay for a new synthesizer, that would be an Accumulation goal. Goal Tracker lets you add amounts towards your target at any time, and will automatically mark the goal as accomplished when the target is reached.\n    </div>\n      <div style=\"padding-bottom: 20px\"><strong>Binary Goals</strong> are goals that are either done or not done. For example, if you want to visit the Pacific Ocean some day, that would be a Binary goal, since you've either done it or you haven't.</div>\n    <div style=\"padding-bottom: 20px\"><strong>Numeric Goals</strong> are goals that can be measured by a single numeric value. For example, if you want to work out three times in the next week, or you want to reach a weight of 150 lbs, that would be a Numeric goal. Goal Tracker lets you specify the updated value at any time,\n and will automatically mark the goal as accomplished when the target is reached.\n    </div>\n    <div style=\"padding-bottom: 20px\"><strong>Task List Goals</strong> are goals that consist of many done/not-done tasks. For example, if you needed to complete 25 homework problems for your Physics class, you could create a Task List goal, entering the problem numbers on separate lines, and Goal Tracker will treat these tasks as a group of sub-goals. Once you have completed all of the tasks within a Multi-Atomic goal, the goal will be marked as accomplished.\n    </div>\n  </body>\n</html>");
        helpTextArea.setMargin(new java.awt.Insets(0, 0, 0, 0));
        helpTextArea.setMaximumSize(new java.awt.Dimension(32768, 32768));
        helpTextArea.setMinimumSize(null);
        helpTextArea.setOpaque(false);
        helpTextArea.setPreferredSize(null);
        helpScroller.setViewportView(helpTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(helpScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane helpScroller;
    private javax.swing.JTextPane helpTextArea;
    private javax.swing.JLabel newGoalLabel;
    // End of variables declaration//GEN-END:variables
}
