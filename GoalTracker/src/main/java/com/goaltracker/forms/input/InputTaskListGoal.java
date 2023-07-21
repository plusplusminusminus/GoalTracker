/*
 * InputTaskListGoal.java
 * - input form with specifics for a task list goal
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.input;

public class InputTaskListGoal extends javax.swing.JPanel {

    public InputTaskListGoal() {
        initComponents();
    }

    public String getTargetDate() {
        return targetDateTextField.getText();
    }

    public String getNotes() {
        return notesTextArea.getText();
    }

    public String getTasks() {
        return tasksTextArea.getText();
    }

    public String getTaskDescriptor() {
        return unitTextField.getText();
    }

    public Boolean getCountdown() {
        Object sel = (String)countdownComboBox.getSelectedItem();
        String s;
        if (sel == null) {
            s = "No";
        } else {
            s = sel.toString();
        }
        if (s.equals("Yes")) {
            return true;
        }
        return false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        targetDateLabel = new javax.swing.JLabel();
        targetDateTextField = new javax.swing.JTextField();
        taskDescriptorLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        tasksLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasksTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        unitTextField = new javax.swing.JTextField();
        hint = new javax.swing.JLabel();
        countdownLabel = new javax.swing.JLabel();
        countdownComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);

        targetDateLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        targetDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        targetDateLabel.setText("Target Deadline:");

        targetDateTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        taskDescriptorLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        taskDescriptorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taskDescriptorLabel.setText("Task Descriptor:");

        notesLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notesLabel.setText("Notes:");

        tasksLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        tasksLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tasksLabel.setText("Task List:");

        tasksTextArea.setColumns(20);
        tasksTextArea.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tasksTextArea.setRows(5);
        jScrollPane1.setViewportView(tasksTextArea);

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

        unitTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        hint.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        hint.setForeground(new java.awt.Color(255, 0, 0));
        hint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hint.setText("(one per line)");

        countdownLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        countdownLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countdownLabel.setText("Countdown?");

        countdownComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        countdownComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        countdownComboBox.setSelectedIndex(-1);

        jLabel1.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("e.g., \"Chapter\" or \"HW Problem\"");

        jLabel2.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Details of Your Task List Goal");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(optional) mm-dd-yyyy");
        jLabel6.setAlignmentX(0.5F);

        jLabel5.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("count down days until deadline? (optional) ");
        jLabel5.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tasksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(taskDescriptorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(unitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(countdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(countdownComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(targetDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(targetDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetDateTextField)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(countdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countdownComboBox)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(taskDescriptorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(unitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tasksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> countdownComboBox;
    private javax.swing.JLabel countdownLabel;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JLabel targetDateLabel;
    private javax.swing.JTextField targetDateTextField;
    private javax.swing.JLabel taskDescriptorLabel;
    private javax.swing.JLabel tasksLabel;
    private javax.swing.JTextArea tasksTextArea;
    private javax.swing.JTextField unitTextField;
    // End of variables declaration//GEN-END:variables
}
