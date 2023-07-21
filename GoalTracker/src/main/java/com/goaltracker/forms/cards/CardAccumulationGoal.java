/*
 * CardAccumulationGoal.java
 * - displays an accumulation goal card
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.cards;

import com.goaltracker.goals.Goal;
import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import com.goaltracker.config.Constants;
import static com.goaltracker.PriorityLevel.*;
import com.goaltracker.goals.AccumulationGoal;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CardAccumulationGoal extends javax.swing.JPanel {
    private Goal theGoal;
    private Boolean doCompleted;
    private Boolean doPriority;
    private Boolean doCurrent;
    private Boolean notesBoxOpen = false;
    private Boolean activityBoxOpen = false;

    public CardAccumulationGoal(Goal aGoal, Boolean aDoCurrent, Boolean aDoCompleted, Boolean aDoPriority, Boolean aDoAbandoned) {
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
        AccumulationGoal g = (AccumulationGoal)theGoal;
        double startVal = g.getStartValue();
        double targetVal = g.getTargetValue();
        double curVal = g.getCurrentValue();
        updateStats();
        
        String unit = g.getUnit();
        String startString;
        String targetString;
        if (g.getIsInteger()) {
            startString = String.format("%d", (int)startVal);
            targetString = String.format("%d", (int)targetVal);
        } else {
            startString = String.format("%,.2f", startVal);
            targetString = String.format("%,.2f", targetVal);
        }
        startValue.setText(startString);
        targetValue.setText(targetString);

        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        updateProgress();

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
    }

    private void updateStats() {
        AccumulationGoal g = (AccumulationGoal)theGoal;
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

    private void updateProgress() {
        AccumulationGoal g = (AccumulationGoal)theGoal;
        int pct = 0;
        double startVal = g.getStartValue();
        double targetVal = g.getTargetValue();
        double curVal = g.getCurrentValue();
        if (startVal < targetVal) {
            pct = (int)(100 * (curVal - startVal) / (targetVal - startVal) );
        } else if (startVal > targetVal) {
            pct = (int)(100 * (startVal - curVal) / (startVal - targetVal) );
        } else {
            // avoid division by zero
        }
        String curString;
        if (g.getIsInteger()) {
            curString = String.format("%d", (int)curVal);
        } else {
            curString = String.format("%,.2f", curVal);
        }
        currentValue.setText(curString);
        String unit = g.getUnit();
        currentValue.setText(curString);
        currentValueLabel.setText("Current " + unit + " ");
        progressBar.setValue(pct);
        progressValue.setText(String.format("%d%%",pct));
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
        numericProgressBox = new javax.swing.JPanel();
        numericProgress = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        progressLabel = new javax.swing.JLabel();
        progressValue = new javax.swing.JLabel();
        startValue = new javax.swing.JLabel();
        targetValue = new javax.swing.JLabel();
        currentValuePane = new javax.swing.JPanel();
        currentValueLabel = new javax.swing.JLabel();
        currentValue = new javax.swing.JLabel();
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
        addButton = new javax.swing.JButton();
        newValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
                .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveDescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        descriptionBoxLayout.setVerticalGroup(
            descriptionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriptionBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriptionBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveDescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        containerPanel.add(descriptionBox);

        numericProgressBox.setBackground(new java.awt.Color(51, 255, 102));
        numericProgressBox.setOpaque(false);

        numericProgress.setOpaque(false);

        progressBar.setBackground(new java.awt.Color(204, 204, 204));
        progressBar.setForeground(new java.awt.Color(0, 255, 102));
        progressBar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), null));
        progressBar.setOpaque(true);

        progressLabel.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
        progressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        progressLabel.setText("Accumulation Progress:");

        progressValue.setToolTipText("");

        startValue.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        startValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        startValue.setText("0");

        targetValue.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        targetValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        targetValue.setText("100");

        currentValueLabel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        currentValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentValueLabel.setText("Current Amount:");

        currentValue.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        currentValue.setForeground(new java.awt.Color(51, 102, 255));
        currentValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentValue.setText("100");

        javax.swing.GroupLayout currentValuePaneLayout = new javax.swing.GroupLayout(currentValuePane);
        currentValuePane.setLayout(currentValuePaneLayout);
        currentValuePaneLayout.setHorizontalGroup(
            currentValuePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentValuePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        currentValuePaneLayout.setVerticalGroup(
            currentValuePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentValuePaneLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(currentValuePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentValueLabel)
                    .addComponent(currentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout numericProgressLayout = new javax.swing.GroupLayout(numericProgress);
        numericProgress.setLayout(numericProgressLayout);
        numericProgressLayout.setHorizontalGroup(
            numericProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numericProgressLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(numericProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(numericProgressLayout.createSequentialGroup()
                        .addComponent(startValue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(targetValue, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(currentValuePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(numericProgressLayout.createSequentialGroup()
                        .addComponent(progressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        numericProgressLayout.setVerticalGroup(
            numericProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numericProgressLayout.createSequentialGroup()
                .addComponent(currentValuePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(numericProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(numericProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startValue)
                    .addComponent(targetValue))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout numericProgressBoxLayout = new javax.swing.GroupLayout(numericProgressBox);
        numericProgressBox.setLayout(numericProgressBoxLayout);
        numericProgressBoxLayout.setHorizontalGroup(
            numericProgressBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numericProgressBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numericProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        numericProgressBoxLayout.setVerticalGroup(
            numericProgressBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numericProgressBoxLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(numericProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.add(numericProgressBox);

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notesTextAreaKeyPressed(evt);
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
                .addComponent(notesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
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
                .addGap(14, 14, 14))
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

        addButton.setFont(new java.awt.Font("Avenir Next", 0, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addButtonMouseReleased(evt);
            }
        });

        newValue.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        newValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        newValue.setMaximumSize(new java.awt.Dimension(64, 24));
        newValue.setSize(new java.awt.Dimension(64, 24));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 13)); // NOI18N
        jLabel1.setText("Add Additional:");

        javax.swing.GroupLayout actionsLayout = new javax.swing.GroupLayout(actions);
        actions.setLayout(actionsLayout);
        actionsLayout.setHorizontalGroup(
            actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(actionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newValue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(actionsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(abandonButton))
        );
        actionsLayout.setVerticalGroup(
            actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsLayout.createSequentialGroup()
                .addGroup(actionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(newValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(abandonButton)
                .addContainerGap())
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
                        .addComponent(activityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
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
                        .addGap(1, 1, 1)
                        .addComponent(daysOpenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 728, Short.MAX_VALUE)
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
        notesTextArea.setSize(notesTextArea.getPreferredSize());
        notesTextArea.repaint();
        notesTextArea.validate();
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

    private void saveDescriptionButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveDescriptionButtonMouseReleased
        theGoal.setDescription(descriptionTextField.getText());
        descriptionTextField.setEditable(false);
        descriptionTextField.setOpaque(false);
        descriptionTextField.getCaret().setVisible(false);
        saveDescriptionButton.setVisible(false);
        GoalTracker.save();
    }//GEN-LAST:event_saveDescriptionButtonMouseReleased

    private void notesTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notesTextAreaKeyPressed
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
    }//GEN-LAST:event_notesTextAreaKeyPressed

    private void addButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseReleased
        try {
            AccumulationGoal g = (AccumulationGoal)theGoal;
            double addVal = Double.parseDouble(newValue.getText());
            newValue.setText("");
            double curVal = g.addAmount(addVal);
            if ((((g.getTargetValue() - g.getStartValue()) > 0) && g.getCurrentValue() >= g.getTargetValue()) || 
                    (((g.getTargetValue() - g.getStartValue()) < 0) && g.getCurrentValue() <= g.getTargetValue())) {
                g.setIsCompleted(true);
                GoalTracker.save();
                GoalTracker.refreshView();
            } else {
                GoalTracker.save();
                updateProgress();
                updateStats();
            }
        } catch(NumberFormatException e) {
        
        }
    }//GEN-LAST:event_addButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abandonButton;
    private javax.swing.JPanel actions;
    private javax.swing.JPanel activityBox;
    private javax.swing.JButton activityButton;
    private javax.swing.JPanel activityPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel box;
    private javax.swing.JPanel container;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel currentValue;
    private javax.swing.JLabel currentValueLabel;
    private javax.swing.JPanel currentValuePane;
    private javax.swing.JLabel daysOpen;
    private javax.swing.JLabel daysOpenLabel;
    private javax.swing.JPanel descriptionBox;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JPanel goalBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastActivity;
    private javax.swing.JLabel lastActivityLabel;
    private javax.swing.JTextField newValue;
    private javax.swing.JPanel notesBox;
    private javax.swing.JButton notesButton;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JPanel numericProgress;
    private javax.swing.JPanel numericProgressBox;
    private javax.swing.JPanel priorityBar;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JLabel progressValue;
    private javax.swing.JButton saveDescriptionButton;
    private javax.swing.JButton saveNotesButton;
    private javax.swing.JPanel spacer;
    private javax.swing.JLabel startValue;
    private javax.swing.JPanel statsBox;
    private javax.swing.JLabel targetDate;
    private javax.swing.JLabel targetDateLabel;
    private javax.swing.JLabel targetValue;
    // End of variables declaration//GEN-END:variables
}
