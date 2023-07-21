/*
 * PageNewGoal.java
 * - display new goal page
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.pages;

import com.goaltracker.goals.FocusGoal;
import com.goaltracker.goals.BinaryGoal;
import com.goaltracker.goals.AccumulationGoal;
import com.goaltracker.goals.HabitGoal;
import com.goaltracker.goals.SkillGoal;
import com.goaltracker.goals.NumericGoal;
import com.goaltracker.goals.TaskListGoal;
import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import com.goaltracker.config.Constants;
import com.goaltracker.forms.input.InputAccumulationGoal;
import com.goaltracker.forms.input.InputBinaryGoal;
import com.goaltracker.forms.input.InputTaskListGoal;
import com.goaltracker.forms.input.InputNumericGoal;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JPanel;

public class PageNewGoal extends JPanel implements Page {
    private InputBinaryGoal binaryGoalForm;
    private InputAccumulationGoal accumulationGoalForm;
    private InputNumericGoal  numericGoalForm;
    private InputTaskListGoal taskListGoalForm;

    public PageNewGoal() {
        initComponents();
        binaryGoalForm = new InputBinaryGoal();
        accumulationGoalForm = new InputAccumulationGoal();
        numericGoalForm = new InputNumericGoal();
        taskListGoalForm = new InputTaskListGoal();

        createGoalButton.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        newGoalLabel = new javax.swing.JLabel();
        goalNameLabel = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        priorityLabel = new javax.swing.JLabel();
        priorityComboBox = new javax.swing.JComboBox<>();
        goalTypeLabel = new javax.swing.JLabel();
        goalTypeComboBox = new javax.swing.JComboBox<>();
        typeHelp = new javax.swing.JTextField();
        typeHelpPriority = new javax.swing.JTextField();
        middle = new javax.swing.JPanel();
        submit = new javax.swing.JPanel();
        createGoalButton = new javax.swing.JButton();
        footer = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        jLabel1.setText("Middle Layer");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1434, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(229, 244, 252));
        setAlignmentX(Constants.ALIGNMENT_X);
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        title.setBackground(new java.awt.Color(158, 255, 244));
        title.setAlignmentX(Constants.ALIGNMENT_X);
        title.setOpaque(false);

        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("Create a New Goal");
        newGoalLabel.setAlignmentY(0.0F);
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        newGoalLabel.setMaximumSize(new java.awt.Dimension(32767, 32767));
        newGoalLabel.setMinimumSize(new java.awt.Dimension(0, 34));

        goalNameLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        goalNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        goalNameLabel.setText("Description:");

        descriptionTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        descriptionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTextFieldActionPerformed(evt);
            }
        });

        priorityLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        priorityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priorityLabel.setText("Priority:");
        priorityLabel.setAlignmentX(0.5F);

        priorityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low" }));
        priorityComboBox.setSelectedIndex(-1);

        goalTypeLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        goalTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        goalTypeLabel.setText("Goal Type:");
        goalTypeLabel.setAlignmentX(0.5F);

        goalTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accumulation", "Binary", "Numeric", "Task List" }));
        goalTypeComboBox.setSelectedIndex(-1);
        goalTypeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                goalTypeComboBoxItemStateChanged(evt);
            }
        });
        goalTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalTypeComboBoxActionPerformed(evt);
            }
        });

        typeHelp.setEditable(false);
        typeHelp.setBackground(Constants.MAIN_VIEW_BGCOLOR);
        typeHelp.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        typeHelp.setForeground(new java.awt.Color(102, 102, 102));
        typeHelp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        typeHelp.setBorder(null);
        typeHelp.setMaximumSize(new java.awt.Dimension(32767, 32767));

        typeHelpPriority.setEditable(false);
        typeHelpPriority.setBackground(Constants.MAIN_VIEW_BGCOLOR);
        typeHelpPriority.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        typeHelpPriority.setForeground(new java.awt.Color(102, 102, 102));
        typeHelpPriority.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        typeHelpPriority.setBorder(null);
        typeHelpPriority.setMaximumSize(new java.awt.Dimension(32767, 32767));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(titleLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(titleLayout.createSequentialGroup()
                                .addComponent(goalTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(goalTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(typeHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(titleLayout.createSequentialGroup()
                                .addComponent(goalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(titleLayout.createSequentialGroup()
                                .addComponent(priorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(typeHelpPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalNameLabel)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priorityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeHelpPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalTypeLabel)
                    .addComponent(goalTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(title);

        middle.setAlignmentX(Constants.ALIGNMENT_X);
        middle.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        middle.setMaximumSize(new java.awt.Dimension(32768, 32768));
        middle.setMinimumSize(new java.awt.Dimension(0, 0));
        middle.setOpaque(false);
        middle.setRequestFocusEnabled(false);
        middle.setLayout(new javax.swing.BoxLayout(middle, javax.swing.BoxLayout.Y_AXIS));
        add(middle);

        submit.setBackground(new java.awt.Color(153, 0, 255));
        submit.setAlignmentX(Constants.ALIGNMENT_X);
        submit.setOpaque(false);

        createGoalButton.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        createGoalButton.setText("Create Goal");
        createGoalButton.setAlignmentX(0.5F);
        createGoalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createGoalButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout submitLayout = new javax.swing.GroupLayout(submit);
        submit.setLayout(submitLayout);
        submitLayout.setHorizontalGroup(
            submitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(createGoalButton)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        submitLayout.setVerticalGroup(
            submitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(createGoalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );

        add(submit);

        footer.setBackground(new java.awt.Color(0, 153, 255));
        footer.setAlignmentX(Constants.ALIGNMENT_X);
        footer.setOpaque(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );

        add(footer);
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTextFieldActionPerformed

    }//GEN-LAST:event_descriptionTextFieldActionPerformed

    private void goalTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalTypeComboBoxActionPerformed

    }//GEN-LAST:event_goalTypeComboBoxActionPerformed

    private void goalTypeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_goalTypeComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selected = (String)evt.getItem();
            if (selected.equals("Binary")) {
                middle.removeAll();
                middle.add(BinaryGoal.getInputPanel());
                typeHelp.setText("a goal that is done/not-done");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Accumulation")) {
                middle.removeAll();
                middle.add(AccumulationGoal.getInputPanel());
                typeHelp.setText("accrue amounts towards a goal total");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Numeric")) {
                middle.removeAll();
                middle.add(NumericGoal.getInputPanel());
                typeHelp.setText("add counts towards a goal total");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Task List")) {
                middle.removeAll();
                middle.add(TaskListGoal.getInputPanel());
                typeHelp.setText("multiple done/not-done tasks");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Habit")) {
                middle.removeAll();
                middle.add(HabitGoal.getInputPanel());
                typeHelp.setText("track streak in making/breaking a habit");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Skill")) {
                middle.removeAll();
                middle.add(SkillGoal.getInputPanel());
                typeHelp.setText("progress towards learning a skill");
                createGoalButton.setVisible(true);
            } else if (selected.equals("Focus")) {
                middle.removeAll();
                middle.add(FocusGoal.getInputPanel());
                typeHelp.setText("time spent consistently on something");
                createGoalButton.setVisible(true);
            }
            GoalTracker.redrawView();
        }
    }//GEN-LAST:event_goalTypeComboBoxItemStateChanged

    private void createGoalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createGoalButtonMouseClicked
        String description = descriptionTextField.getText();
        if (description.equals("")) {
            description = "Some Unspecified Goal";
        }
        Object sel = priorityComboBox.getSelectedItem();
        String priority;
        if (sel != null) {
            priority = priorityComboBox.getSelectedItem().toString();
        } else {
            priority = "Medium";
        }
        PriorityLevel priorityLevel;
        if (priority.equals("High")) {
            priorityLevel = PriorityLevel.HIGH;
        } else if (priority.equals("Medium")) {
            priorityLevel = PriorityLevel.MEDIUM;
        } else if (priority.equals("Low")) {
            priorityLevel = PriorityLevel.LOW;
        } else {
            priorityLevel = PriorityLevel.LOW;
        }
        sel = goalTypeComboBox.getSelectedItem();
        String goalType;
        if (sel != null) {
            goalType = sel.toString();
        } else {
            goalType = "Binary";
        }
        if (goalType.equals("Binary")) {
            InputBinaryGoal ag = (InputBinaryGoal)(middle.getComponent(0));
            String targetDate = ag.getTargetDate();
            Instant tDate = null;
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            try {
                Date theDate = fmt.parse(targetDate);
                tDate = theDate.toInstant();
            } catch(ParseException e) {}
            Boolean bCountdown = ag.getCountdown();
            String notes = ag.getNotes();
            BinaryGoal newRec = new BinaryGoal(description, priorityLevel, tDate, bCountdown, notes);
            GoalTracker.addGoal(newRec);
            GoalTracker.showDashboard();
        } else if (goalType.equals("Accumulation")) {
            InputAccumulationGoal acf = (InputAccumulationGoal)(middle.getComponent(0));
            String targetDate = acf.getTargetDate();
            Instant tDate = null;
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            try {
                Date theDate = fmt.parse(targetDate);
                tDate = theDate.toInstant();
            } catch(ParseException e) {}
            String currentAmount = acf.getCurrentValue();
            String targetAmount = acf.getTargetValue();
            String theUnit = acf.getUnit();
            Boolean isInteger = acf.getIsInteger();
            Boolean countdown = acf.getCountdown();

            double tCurrent = 0.0;
            double tTarget = 100.0;
            try {
                tCurrent = Double.parseDouble(currentAmount);
            } catch(NumberFormatException e) {}
            try {
                tTarget = Double.parseDouble(targetAmount);
            } catch(NumberFormatException e) {}
            String notes = acf.getNotes();
            // (String aDescription, PriorityLevel aPriority, Boolean aIsInteger, String aUnit, Boolean aCountdown, Date aTargetDeadline, Double aStartValue, Double aTargetValue, String aNotes) {
            AccumulationGoal newRec = new AccumulationGoal(description, priorityLevel,isInteger, theUnit, countdown, tDate, tCurrent, tTarget, notes);
            GoalTracker.addGoal(newRec);
            GoalTracker.showDashboard();
        } else if (goalType.equals("Numeric")) {
            InputNumericGoal acf = (InputNumericGoal)(middle.getComponent(0));
            String targetDate = acf.getTargetDate();
            String unit = acf.getUnit();
            Boolean isInteger = acf.getIsInteger();
            Boolean countdown = acf.getCountdown();
            Instant tDate = null;
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            try {
                Date theDate = fmt.parse(targetDate);
                tDate = theDate.toInstant();
            } catch(ParseException e) {}
            String currentCount = acf.getCurrentValue();
            String targetCount = acf.getTargetValue();

            Double tCurrent = 0.0;
            Double tTarget = 100.0;
            try {
                tCurrent = Double.valueOf(currentCount);
            } catch(NumberFormatException e) {}
            try {
                tTarget = Double.valueOf(targetCount);
            } catch(NumberFormatException e) {}
            String notes = acf.getNotes();
            // (String aDescription, PriorityLevel aPriority, Boolean aIsInteger, String aUnit, Boolean aCountdown, Date aTargetDeadline, Double aStartValue, Double aTargetValue, String aNotes) {
            NumericGoal newRec = new NumericGoal(description, priorityLevel, isInteger, unit, countdown, tDate, tCurrent, tTarget, notes);
            GoalTracker.addGoal(newRec);
            GoalTracker.showDashboard();
        } else if (goalType.equals("Task List")) {
            InputTaskListGoal acf = (InputTaskListGoal)(middle.getComponent(0));
            String targetDate = acf.getTargetDate();
            Instant tDate = null;
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            try {
                Date theDate = fmt.parse(targetDate);
                tDate = theDate.toInstant();
            } catch(ParseException e) {}
            String notes = acf.getNotes();
            String tasks = acf.getTasks();
            String taskDescriptor = acf.getTaskDescriptor();
            Boolean bCountdown = acf.getCountdown();
            TaskListGoal newRec = new TaskListGoal(description, priorityLevel, tDate, bCountdown, taskDescriptor, tasks, notes);

            GoalTracker.addGoal(newRec);
            GoalTracker.showDashboard();
        } else if (goalType.equals("Focus")) {

        } else if (goalType.equals("Habit")) {

        } else if (goalType.equals("Skill")) {

        }
    }//GEN-LAST:event_createGoalButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createGoalButton;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel goalNameLabel;
    private javax.swing.JComboBox<String> goalTypeComboBox;
    private javax.swing.JLabel goalTypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel middle;
    private javax.swing.JLabel newGoalLabel;
    private javax.swing.JComboBox<String> priorityComboBox;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JPanel submit;
    private javax.swing.JPanel title;
    private javax.swing.JTextField typeHelp;
    private javax.swing.JTextField typeHelpPriority;
    // End of variables declaration//GEN-END:variables
}
