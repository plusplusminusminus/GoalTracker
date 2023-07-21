/*
 * CardBinaryGoal.java
 * - displays a binary goal card
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.cards;

import com.goaltracker.goals.BinaryGoal;
import com.goaltracker.goals.Goal;
import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import com.goaltracker.config.Constants;
import static com.goaltracker.PriorityLevel.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CardBinaryGoal extends javax.swing.JPanel {
    private Goal theGoal;
    private Boolean doCompleted;
    private Boolean doPriority;
    private Boolean doCurrent;
    private Boolean notesBoxOpen = false;
    private Boolean activityBoxOpen = false;

    public CardBinaryGoal(Goal aGoal, Boolean aDoCurrent, Boolean aDoCompleted, Boolean aDoPriority, Boolean aDoAbandoned) {
        initComponents();
        theGoal = aGoal;
        doCurrent = aDoCurrent;
        doCompleted = aDoCompleted;
        doPriority = aDoPriority;
        Boolean isAbandoned = theGoal.getIsAbandoned();
        if (isAbandoned) {
            abandonButton.setText("Reinstate Goal");
        } else {
            abandonButton.setText("Abandon Goal");
        }
        PriorityLevel priority = theGoal.getPriority();
        if (priority != null) {
            switch (priority) {
                case HIGH:
                    priorityBar.setBackground(Constants.GOAL_PRIO_HIGH_BARCOLOR);
                    statsBox.setBackground(Constants.GOAL_PRIO_HIGH_STATS_BGCOLOR);
                    break;
                case MEDIUM:
                    priorityBar.setBackground(Constants.GOAL_PRIO_MEDIUM_BARCOLOR);
                    statsBox.setBackground(Constants.GOAL_PRIO_MEDIUM_STATS_BGCOLOR);
                    break;
                case LOW:
                    priorityBar.setBackground(Constants.GOAL_PRIO_LOW_BARCOLOR);
                    statsBox.setBackground(Constants.GOAL_PRIO_LOW_STATS_BGCOLOR);
                    break;
                default:
                    break;
            }
        }
        BinaryGoal g = (BinaryGoal)theGoal;
        descriptionTextField.setText(g.getDescription());
        descriptionTextField.setOpaque(false);
        notesTextArea.setText(g.getNotes());
        notesTextArea.setCaretPosition(0);
        notesTextArea.setOpaque(false);
        notesTextArea.repaint();
        notesTextArea.validate();
        notesScrollPane.getViewport().setOpaque(false);
        saveNotesButton.setVisible(false);
        saveDescriptionButton.setVisible(false);
        activityPanel.setVisible(false);
        notesPanel.setVisible(false);
        notesPanel.setSize(notesPanel.getPreferredSize());
        activityPanel.setSize(activityPanel.getPreferredSize());
        goalBox.setSize(goalBox.getPreferredSize());
        if (theGoal.getIsCompleted()) {
            markCompletedButton.setText("Mark Not Completed");
        } else {
            markCompletedButton.setText("Mark Completed");
        }
        updateStats();
        if (g.getIsCompleted()) {
            daysOpenLabel.setText("Closed");
            daysOpen.setText(String.format("%d",ChronoUnit.DAYS.between(theGoal.getDateCreated(),theGoal.getDateCompleted())));
            lastActivityLabel.setText("Closed On");
            Date closedDate = Date.from(g.getDateCompleted());
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            lastActivity.setText(fmt.format(closedDate));
        } else {
            daysOpen.setText(String.format("%d",ChronoUnit.DAYS.between(theGoal.getDateCreated(),GoalTracker.getCurrentDate())));
            lastActivityLabel.setText("Last Activity");
            Date closedDate = Date.from(g.getDateLastUpdated());
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            lastActivity.setText(fmt.format(closedDate));
        }

    }

    private void updateStats() {
        BinaryGoal g = (BinaryGoal)theGoal;
        if (g.getIsCompleted()) {
            daysOpenLabel.setText("Closed");
            daysOpen.setText(String.format("%d",ChronoUnit.DAYS.between(theGoal.getDateCreated(),theGoal.getDateCompleted())));
            lastActivityLabel.setText("Closed On");
            Date closedDate = Date.from(g.getDateCompleted());
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            lastActivity.setText(fmt.format(closedDate));
            try {
                Date targetDateV = Date.from(g.getTargetDate());
                targetDate.setText(fmt.format(targetDateV));
            } catch (Exception e) {
                targetDate.setText("");
            }
        } else {
            daysOpen.setText(String.format("%d",ChronoUnit.DAYS.between(theGoal.getDateCreated(),GoalTracker.getCurrentDate())));
            lastActivityLabel.setText("Last Activity");
            Date closedDate = Date.from(g.getDateLastUpdated());
            SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
            lastActivity.setText(fmt.format(closedDate));
            try {
                Date targetDateV = Date.from(g.getTargetDate());
                targetDate.setText(fmt.format(targetDateV));
            } catch (Exception e) {
                targetDate.setText("");
            }
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        priorityBar = new javax.swing.JPanel();
        box = new javax.swing.JPanel();
        goalBox = new javax.swing.JPanel();
        containerPanel = new javax.swing.JPanel();
        descriptionBox = new javax.swing.JPanel();
        descriptionTextField = new javax.swing.JTextField();
        saveDescriptionButton = new javax.swing.JButton();
        notesBox = new javax.swing.JPanel();
        notesButton = new javax.swing.JButton();
        notesPanel = new javax.swing.JPanel();
        notesScrollPane = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        saveNotesButton = new javax.swing.JButton();
        activityBox = new javax.swing.JPanel();
        activityButton = new javax.swing.JButton();
        activityPanel = new javax.swing.JPanel();
        actions = new javax.swing.JPanel();
        abandonButton = new javax.swing.JButton();
        markCompletedButton = new javax.swing.JButton();
        statsBox = new javax.swing.JPanel();
        daysOpenLabel = new javax.swing.JLabel();
        daysOpen = new javax.swing.JLabel();
        lastActivityLabel = new javax.swing.JLabel();
        lastActivity = new javax.swing.JLabel();
        targetDateLabel = new javax.swing.JLabel();
        targetDate = new javax.swing.JLabel();
        spacer = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        container.setOpaque(false);

        priorityBar.setBackground(new java.awt.Color(255, 51, 0));
        priorityBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, Constants.GOAL_BORDER));
        priorityBar.setMinimumSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout priorityBarLayout = new javax.swing.GroupLayout(priorityBar);
        priorityBar.setLayout(priorityBarLayout);
        priorityBarLayout.setHorizontalGroup(
            priorityBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        priorityBarLayout.setVerticalGroup(
            priorityBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        box.setBackground(Constants.GOAL_BGCOLOR);
        box.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, Constants.GOAL_BORDER));
        box.setMinimumSize(new java.awt.Dimension(0, 0));
        box.setLayout(new javax.swing.BoxLayout(box, javax.swing.BoxLayout.X_AXIS));

        goalBox.setBackground(new java.awt.Color(204, 255, 255));
        goalBox.setMaximumSize(new java.awt.Dimension(32768, 32768));
        goalBox.setMinimumSize(new java.awt.Dimension(0, 0));
        goalBox.setOpaque(false);
        goalBox.setLayout(new javax.swing.BoxLayout(goalBox, javax.swing.BoxLayout.X_AXIS));

        containerPanel.setBackground(new java.awt.Color(0, 153, 153));
        containerPanel.setAlignmentY(0.0F);
        containerPanel.setOpaque(false);
        containerPanel.setLayout(new javax.swing.BoxLayout(containerPanel, javax.swing.BoxLayout.Y_AXIS));

        descriptionBox.setOpaque(false);

        descriptionTextField.setEditable(false);
        descriptionTextField.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        descriptionTextField.setBorder(null);
        descriptionTextField.setMaximumSize(new java.awt.Dimension(32768, 32768));
        descriptionTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descriptionTextFieldMousePressed(evt);
            }
        });
        descriptionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionTextFieldKeyReleased(evt);
            }
        });

        saveDescriptionButton.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        saveDescriptionButton.setText("✔");
        saveDescriptionButton.setMaximumSize(new java.awt.Dimension(32767, 32767));
        saveDescriptionButton.setMinimumSize(new java.awt.Dimension(0, 0));
        saveDescriptionButton.setPreferredSize(new java.awt.Dimension(52, 20));
        saveDescriptionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveDescriptionButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout descriptionBoxLayout = new javax.swing.GroupLayout(descriptionBox);
        descriptionBox.setLayout(descriptionBoxLayout);
        descriptionBoxLayout.setHorizontalGroup(
            descriptionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveDescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descriptionBoxLayout.setVerticalGroup(
            descriptionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriptionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveDescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        containerPanel.add(descriptionBox);

        notesBox.setAlignmentY(0.0F);
        notesBox.setOpaque(false);

        notesButton.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        notesButton.setText(Constants.NOTES_LABEL_CLOSED);
        notesButton.setBorder(null);
        notesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        notesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                notesButtonMouseReleased(evt);
            }
        });

        notesPanel.setOpaque(false);

        notesScrollPane.setBorder(null);
        notesScrollPane.setOpaque(false);

        notesTextArea.setEditable(false);
        notesTextArea.setBackground(new java.awt.Color(255, 255, 255));
        notesTextArea.setColumns(1);
        notesTextArea.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        notesTextArea.setRows(1);
        notesTextArea.setMaximumSize(new java.awt.Dimension(32767, 32767));
        notesTextArea.setMinimumSize(new java.awt.Dimension(0, 0));
        notesTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notesTextAreaMousePressed(evt);
            }
        });
        notesTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notesTextAreaKeyReleased(evt);
            }
        });
        notesScrollPane.setViewportView(notesTextArea);

        saveNotesButton.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        saveNotesButton.setText("✔");
        saveNotesButton.setMaximumSize(new java.awt.Dimension(32767, 32767));
        saveNotesButton.setMinimumSize(new java.awt.Dimension(0, 0));
        saveNotesButton.setPreferredSize(new java.awt.Dimension(52, 20));
        saveNotesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveNotesButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveNotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(notesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveNotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout notesBoxLayout = new javax.swing.GroupLayout(notesBox);
        notesBox.setLayout(notesBoxLayout);
        notesBoxLayout.setHorizontalGroup(
            notesBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesBoxLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(notesBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(notesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        notesBoxLayout.setVerticalGroup(
            notesBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(notesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(notesBox);

        activityBox.setAlignmentY(0.0F);
        activityBox.setOpaque(false);
        activityBox.setRequestFocusEnabled(false);

        activityButton.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        activityButton.setText(Constants.ACTIVITY_LABEL_CLOSED);
        activityButton.setBorder(null);
        activityButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        activityButton.setMaximumSize(new java.awt.Dimension(32767, 32767));
        activityButton.setMinimumSize(new java.awt.Dimension(0, 0));
        activityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                activityButtonMouseReleased(evt);
            }
        });

        activityPanel.setBackground(new java.awt.Color(255, 0, 204));
        activityPanel.setMaximumSize(new java.awt.Dimension(32768, 32768));
        activityPanel.setOpaque(false);
        activityPanel.setLayout(new javax.swing.BoxLayout(activityPanel, javax.swing.BoxLayout.Y_AXIS));

        actions.setMinimumSize(new java.awt.Dimension(0, 0));
        actions.setOpaque(false);

        abandonButton.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        abandonButton.setLabel("Abandon Goal");
        abandonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abandonButtonMouseReleased(evt);
            }
        });

        markCompletedButton.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        markCompletedButton.setText("Mark Goal Completed");
        markCompletedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                markCompletedButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout actionsLayout = new javax.swing.GroupLayout(actions);
        actions.setLayout(actionsLayout);
        actionsLayout.setHorizontalGroup(
            actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionsLayout.createSequentialGroup()
                .addComponent(markCompletedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(abandonButton))
        );
        actionsLayout.setVerticalGroup(
            actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsLayout.createSequentialGroup()
                .addGroup(actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abandonButton)
                    .addComponent(markCompletedButton))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        activityPanel.add(actions);

        javax.swing.GroupLayout activityBoxLayout = new javax.swing.GroupLayout(activityBox);
        activityBox.setLayout(activityBoxLayout);
        activityBoxLayout.setHorizontalGroup(
            activityBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activityBoxLayout.createSequentialGroup()
                .addGroup(activityBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, activityBoxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(activityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, activityBoxLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(activityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        activityBoxLayout.setVerticalGroup(
            activityBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.add(activityBox);

        goalBox.add(containerPanel);

        statsBox.setBackground(new java.awt.Color(0, 255, 204));
        statsBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        statsBox.setAlignmentY(0.0F);
        statsBox.setMaximumSize(new java.awt.Dimension(130, 120));
        statsBox.setMinimumSize(new java.awt.Dimension(130, 120));
        statsBox.setPreferredSize(new java.awt.Dimension(130, 120));

        daysOpenLabel.setFont(new java.awt.Font("Avenir Next", 1, 12)); // NOI18N
        daysOpenLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        daysOpenLabel.setText("  Days Open:");

        daysOpen.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
        daysOpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daysOpen.setText("0");

        lastActivityLabel.setBackground(new java.awt.Color(102, 102, 102));
        lastActivityLabel.setFont(new java.awt.Font("Avenir Next", 1, 12)); // NOI18N
        lastActivityLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastActivityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastActivityLabel.setText("Last Activity");
        lastActivityLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lastActivityLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        lastActivityLabel.setOpaque(true);

        lastActivity.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        lastActivity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastActivity.setText("5/4/2023");

        targetDateLabel.setBackground(new java.awt.Color(102, 102, 102));
        targetDateLabel.setFont(new java.awt.Font("Avenir Next", 1, 12)); // NOI18N
        targetDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        targetDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        targetDateLabel.setText("Target Date");
        targetDateLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        targetDateLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        targetDateLabel.setOpaque(true);

        targetDate.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        targetDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        targetDate.setText("5/4/2023");

        javax.swing.GroupLayout statsBoxLayout = new javax.swing.GroupLayout(statsBox);
        statsBox.setLayout(statsBoxLayout);
        statsBoxLayout.setHorizontalGroup(
            statsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastActivityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(statsBoxLayout.createSequentialGroup()
                        .addComponent(daysOpenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lastActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        statsBoxLayout.setVerticalGroup(
            statsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysOpenLabel)
                    .addComponent(daysOpen))
                .addGap(5, 5, 5)
                .addComponent(lastActivityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lastActivity)
                .addGap(5, 5, 5)
                .addComponent(targetDateLabel)
                .addGap(3, 3, 3)
                .addComponent(targetDate)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        goalBox.add(statsBox);

        box.add(goalBox);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(priorityBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priorityBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(container);

        spacer.setBackground(new java.awt.Color(0, 204, 204));
        spacer.setMaximumSize(new java.awt.Dimension(32768, 14));
        spacer.setMinimumSize(new java.awt.Dimension(0, 14));
        spacer.setOpaque(false);

        javax.swing.GroupLayout spacerLayout = new javax.swing.GroupLayout(spacer);
        spacer.setLayout(spacerLayout);
        spacerLayout.setHorizontalGroup(
            spacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        spacerLayout.setVerticalGroup(
            spacerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        add(spacer);
    }// </editor-fold>//GEN-END:initComponents

    private void notesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesButtonMouseReleased
        if (!notesBoxOpen) {
            notesPanel.setVisible(true);
            notesButton.setText(Constants.NOTES_LABEL_OPENED);
            notesBoxOpen = true;
        } else {
            notesPanel.setVisible(false);
            notesButton.setText(Constants.NOTES_LABEL_CLOSED);
            notesBoxOpen = false;
        }
        notesButton.setOpaque(false);
        notesButton.setBorder(null);
    }//GEN-LAST:event_notesButtonMouseReleased

    private void activityButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityButtonMouseReleased
        if (!activityBoxOpen) {
            activityPanel.setVisible(true);
            activityButton.setText(Constants.ACTIVITY_LABEL_OPENED);
            activityBoxOpen = true;
        } else {
            activityPanel.setVisible(false);
            activityButton.setText(Constants.ACTIVITY_LABEL_CLOSED);
            activityBoxOpen = false;
        }
        activityButton.setOpaque(false);
        activityButton.setBorder(null);
    }//GEN-LAST:event_activityButtonMouseReleased

    private void saveNotesButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveNotesButtonMouseReleased
        theGoal.setNotes(notesTextArea.getText());
        notesTextArea.setEditable(false);
        notesTextArea.setOpaque(false);
        notesTextArea.setCaretPosition(0);
        notesTextArea.repaint();
        notesTextArea.validate();
        GoalTracker.save();
        saveNotesButton.setVisible(false);
    }//GEN-LAST:event_saveNotesButtonMouseReleased

    private void descriptionTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionTextFieldKeyReleased
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ENTER) {
            theGoal.setDescription(descriptionTextField.getText());
            descriptionTextField.setEditable(false);
            descriptionTextField.getCaret().setVisible(false);
            descriptionTextField.setOpaque(false);
            saveDescriptionButton.setVisible(false);
            GoalTracker.save();
        } else if(keyCode == KeyEvent.VK_ESCAPE) {
            descriptionTextField.setText(theGoal.getDescription());
            descriptionTextField.setEditable(false);
            descriptionTextField.getCaret().setVisible(false);
            descriptionTextField.setOpaque(false);
            saveDescriptionButton.setVisible(false);
        }
    }//GEN-LAST:event_descriptionTextFieldKeyReleased

    private void notesTextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesTextAreaMousePressed
        saveNotesButton.setVisible(true);
        notesTextArea.setEditable(true);
        notesTextArea.setOpaque(true);
        notesTextArea.getCaret().setVisible(true);
        notesTextArea.repaint();
        notesTextArea.validate();
        notesTextArea.setSize(notesTextArea.getPreferredSize());
    }//GEN-LAST:event_notesTextAreaMousePressed

    private void descriptionTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionTextFieldMousePressed
        descriptionTextField.setEditable(true);
        descriptionTextField.setOpaque(true);
        descriptionTextField.getCaret().setVisible(true);
        saveDescriptionButton.setVisible(true);
    }//GEN-LAST:event_descriptionTextFieldMousePressed

    private void abandonButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonButtonMouseReleased
        Boolean isAbandoned = theGoal.getIsAbandoned();
        theGoal.setIsAbandoned(!isAbandoned);
        GoalTracker.save();
        GoalTracker.refreshView();
    }//GEN-LAST:event_abandonButtonMouseReleased

    private void markCompletedButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markCompletedButtonMouseReleased
        if (theGoal.getIsCompleted()) {
            theGoal.setIsCompleted(false);
        } else {
            theGoal.setIsCompleted(true);
        }
        GoalTracker.save();
        GoalTracker.refreshView();
    }//GEN-LAST:event_markCompletedButtonMouseReleased

    private void saveDescriptionButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveDescriptionButtonMouseReleased
        theGoal.setDescription(descriptionTextField.getText());
        descriptionTextField.setEditable(false);
        descriptionTextField.setOpaque(false);
        descriptionTextField.getCaret().setVisible(false);
        descriptionTextField.setCaretPosition(0);
        saveDescriptionButton.setVisible(false);
        GoalTracker.save();
    }//GEN-LAST:event_saveDescriptionButtonMouseReleased

    private void notesTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notesTextAreaKeyReleased
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE) {
            notesTextArea.setText(theGoal.getNotes());
            notesTextArea.setEditable(false);
            notesTextArea.setOpaque(false);
            notesTextArea.setCaretPosition(0);
            notesTextArea.repaint();
            notesTextArea.validate();
            saveNotesButton.setVisible(false);
        }
    }//GEN-LAST:event_notesTextAreaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abandonButton;
    private javax.swing.JPanel actions;
    private javax.swing.JPanel activityBox;
    private javax.swing.JButton activityButton;
    private javax.swing.JPanel activityPanel;
    private javax.swing.JPanel box;
    private javax.swing.JPanel container;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel daysOpen;
    private javax.swing.JLabel daysOpenLabel;
    private javax.swing.JPanel descriptionBox;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JPanel goalBox;
    private javax.swing.JLabel lastActivity;
    private javax.swing.JLabel lastActivityLabel;
    private javax.swing.JButton markCompletedButton;
    private javax.swing.JPanel notesBox;
    private javax.swing.JButton notesButton;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JPanel priorityBar;
    private javax.swing.JButton saveDescriptionButton;
    private javax.swing.JButton saveNotesButton;
    private javax.swing.JPanel spacer;
    private javax.swing.JPanel statsBox;
    private javax.swing.JLabel targetDate;
    private javax.swing.JLabel targetDateLabel;
    // End of variables declaration//GEN-END:variables
}
