/*
 * InputFocusGoal.java
 * - input form with specifics for a focus goal
 * - not yet impleented
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.input;

public class InputFocusGoal extends javax.swing.JPanel {

    public InputFocusGoal() {
        initComponents();
    }

    public String getTargetDate() {
        return targetDateTextField.getText();
    }

    public String getCurrentAmount() {
        return currentAmountTextField.getText();
    }

    public String getTargetAmount() {
        return targetAmountTextField.getText();
    }

    public String getNotes() {
        return notesTextArea.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        targetDateLabel = new javax.swing.JLabel();
        targetDateTextField = new javax.swing.JTextField();
        countdownLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        targetAmountTextField = new javax.swing.JTextField();
        currentAmountLabel = new javax.swing.JLabel();
        currentAmountTextField = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);

        targetDateLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        targetDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        targetDateLabel.setText("Target Deadline:");

        countdownLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        countdownLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countdownLabel.setText("Target Amount:");

        notesLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notesLabel.setText("Notes:");

        notesTextArea.setColumns(20);
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

        currentAmountLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        currentAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentAmountLabel.setText("Current Amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(targetDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currentAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(targetAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetDateLabel)
                    .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentAmountLabel)
                    .addComponent(currentAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countdownLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 5, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countdownLabel;
    private javax.swing.JLabel currentAmountLabel;
    private javax.swing.JTextField currentAmountTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JTextField targetAmountTextField;
    private javax.swing.JLabel targetDateLabel;
    private javax.swing.JTextField targetDateTextField;
    // End of variables declaration//GEN-END:variables
}
