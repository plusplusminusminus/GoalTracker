/*
 * PageThisMonthGoals.java
 * - display this momth's goals page
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.pages;

import com.goaltracker.goals.Goal;
import com.goaltracker.goals.BinaryGoal;
import com.goaltracker.goals.AccumulationGoal;
import com.goaltracker.goals.NumericGoal;
import com.goaltracker.goals.TaskListGoal;
import com.goaltracker.GoalTracker;
import com.goaltracker.config.Constants;
import com.goaltracker.forms.cards.CardAccumulationGoal;
import com.goaltracker.forms.cards.CardBinaryGoal;
import com.goaltracker.forms.cards.CardNumericGoal;
import com.goaltracker.forms.cards.CardTaskListGoal;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PageThisMonthGoals extends JPanel implements Page {

    public PageThisMonthGoals() {
        initComponents();
        ArrayList<Goal> goals = GoalTracker.getGoals();
        int numDisplayed = 0;
        if (goals != null) {
            int count = goals.size();
            if (count > 0) {
                for (int i = count - 1; i >= 0; i--) {
                    Goal g = goals.get(i);
                    long days = ChronoUnit.DAYS.between(g.getDateCreated(),g.getTargetDate());
                    if (g.getIsSubGoal() == false && !(g.getIsAbandoned()) && !(g.getIsCompleted()) && (days >= 0 && days <= 31)) {
                        if (g instanceof AccumulationGoal) {
                            summaryPanel.add(new CardAccumulationGoal(g, true, false, false, false));
                        } else if (g instanceof NumericGoal) { 
                            summaryPanel.add(new CardNumericGoal(g, true, false, false, false));                            
                        } else if (g instanceof BinaryGoal) {
                            summaryPanel.add(new CardBinaryGoal(g, true, false, false, false));
                        } else if (g instanceof TaskListGoal) {
                            summaryPanel.add(new CardTaskListGoal(g, true, false, false, false));
                        }
                        numDisplayed++;
                    }
                }
                summaryPanel.setSize(summaryPanel.getPreferredSize());
                summaryPanel.repaint();
                summaryPanel.validate();
            }
        } else {
        }
        if (numDisplayed == 0) {
            noGoalsMessagePanel.setVisible(true);
        } else {
            noGoalsMessagePanel.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        newGoalLabel = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        noGoalsMessagePanel = new javax.swing.JPanel();
        noGoalsMessageLabel = new javax.swing.JLabel();
        summaryPanel = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 244, 252));
        setAlignmentX(Constants.ALIGNMENT_X);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        title.setBackground(new java.awt.Color(204, 255, 204));
        title.setAlignmentX(Constants.ALIGNMENT_X);
        title.setMaximumSize(new java.awt.Dimension(32768, 16));
        title.setOpaque(false);

        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("Due This Month");
        newGoalLabel.setAlignmentX(0.5F);
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        newGoalLabel.setMaximumSize(new java.awt.Dimension(32768, 32768));
        newGoalLabel.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(title);

        header.setBackground(new java.awt.Color(255, 204, 153));
        header.setAlignmentX(Constants.ALIGNMENT_X);
        header.setMaximumSize(new java.awt.Dimension(32767, 16));
        header.setMinimumSize(new java.awt.Dimension(0, 16));
        header.setOpaque(false);

        noGoalsMessagePanel.setOpaque(false);

        noGoalsMessageLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        noGoalsMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noGoalsMessageLabel.setText("No Goals to Display");
        noGoalsMessageLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout noGoalsMessagePanelLayout = new javax.swing.GroupLayout(noGoalsMessagePanel);
        noGoalsMessagePanel.setLayout(noGoalsMessagePanelLayout);
        noGoalsMessagePanelLayout.setHorizontalGroup(
            noGoalsMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noGoalsMessagePanelLayout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(noGoalsMessageLabel)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        noGoalsMessagePanelLayout.setVerticalGroup(
            noGoalsMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noGoalsMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noGoalsMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noGoalsMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noGoalsMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(header);

        summaryPanel.setBackground(new java.awt.Color(0, 204, 204));
        summaryPanel.setAlignmentX(Constants.ALIGNMENT_X);
        summaryPanel.setMaximumSize(new java.awt.Dimension(32768, 32768));
        summaryPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        summaryPanel.setOpaque(false);
        summaryPanel.setLayout(new javax.swing.BoxLayout(summaryPanel, javax.swing.BoxLayout.Y_AXIS));
        add(summaryPanel);

        footer.setBackground(new java.awt.Color(0, 255, 204));
        footer.setAlignmentX(Constants.ALIGNMENT_X);
        footer.setOpaque(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        add(footer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel newGoalLabel;
    private javax.swing.JLabel noGoalsMessageLabel;
    private javax.swing.JPanel noGoalsMessagePanel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
