/*
 * InputAccumulationGoal.java
 * - input form with specifics for an accumulation goal
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.input;

public class InputAccumulationGoal extends javax.swing.JPanel {

    public InputAccumulationGoal() {
        initComponents();
    }

    public String getTargetDate() {
        return targetDateTextField.getText();
    }

    public String getCurrentValue() {
        return currentValueTextField.getText();
    }

    public String getTargetValue() {
        return targetValueTextField.getText();
    }

    public String getNotes() {
        return notesTextArea.getText();
    }

    public Boolean getIsInteger() {
        Object sel = (String)integerComboBox.getSelectedItem();
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
    
    public String getUnit() {
        return unitTextField.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        targetDateLabel = new javax.swing.JLabel();
        targetDateTextField = new javax.swing.JTextField();
        unitLabel = new javax.swing.JLabel();
        unitTextField = new javax.swing.JTextField();
        unitHelpText = new javax.swing.JLabel();
        countdownLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        targetValueTextField = new javax.swing.JTextField();
        currentCountLabel = new javax.swing.JLabel();
        currentValueTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        unitLabel1 = new javax.swing.JLabel();
        countdownLabel1 = new javax.swing.JLabel();
        countdownComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        integerComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        unitHelpText1 = new javax.swing.JLabel();
        unitHelpText2 = new javax.swing.JLabel();
        unitHelpText3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setOpaque(false);

        targetDateLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        targetDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        targetDateLabel.setText("Deadline:");
        targetDateLabel.setAlignmentX(0.5F);

        targetDateTextField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        unitLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        unitLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        unitLabel.setText("Unit of Measure:");
        unitLabel.setAlignmentX(0.5F);

        unitTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        unitHelpText.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        unitHelpText.setForeground(new java.awt.Color(102, 102, 102));
        unitHelpText.setText("what is being accumulated?");
        unitHelpText.setAlignmentX(0.5F);

        countdownLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        countdownLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countdownLabel.setText("Target Amount:");
        countdownLabel.setAlignmentX(0.5F);

        notesLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notesLabel.setText("Notes:");
        notesLabel.setAlignmentX(0.5F);

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

        targetValueTextField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        currentCountLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        currentCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentCountLabel.setText("Current Amount:");
        currentCountLabel.setAlignmentX(0.5F);

        currentValueTextField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Details of Your Accumulation Goal");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        unitLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        unitLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        unitLabel1.setText("Integer Amount?");
        unitLabel1.setAlignmentX(0.5F);

        countdownLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        countdownLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countdownLabel1.setText("Countdown?");
        countdownLabel1.setAlignmentX(0.5F);

        countdownComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        countdownComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        countdownComboBox.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("count down days until deadline? (optional) ");
        jLabel5.setAlignmentX(0.5F);

        integerComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        integerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        integerComboBox.setSelectedIndex(-1);

        jLabel6.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(optional) mm/dd/yyyy");
        jLabel6.setAlignmentX(0.5F);

        unitHelpText1.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        unitHelpText1.setForeground(new java.awt.Color(102, 102, 102));
        unitHelpText1.setText("what is the current amount?");
        unitHelpText1.setAlignmentX(0.5F);

        unitHelpText2.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        unitHelpText2.setForeground(new java.awt.Color(102, 102, 102));
        unitHelpText2.setText("whole numbers or decimals?");
        unitHelpText2.setAlignmentX(0.5F);

        unitHelpText3.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        unitHelpText3.setForeground(new java.awt.Color(102, 102, 102));
        unitHelpText3.setText("what value are you trying to reach?");
        unitHelpText3.setAlignmentX(0.5F);

        jLabel7.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("(optional)");
        jLabel7.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(countdownLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countdownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(targetDateLabel)
                            .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(unitLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(currentCountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(targetValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(unitTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(currentValueTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(integerComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unitHelpText2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitHelpText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitHelpText3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitHelpText1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(countdownComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(targetDateLabel)
                    .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countdownComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countdownLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(unitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitHelpText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(unitLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(integerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitHelpText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(currentCountLabel)
                    .addComponent(unitHelpText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(countdownLabel)
                    .addComponent(targetValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitHelpText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notesLabel)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> countdownComboBox;
    private javax.swing.JLabel countdownLabel;
    private javax.swing.JLabel countdownLabel1;
    private javax.swing.JLabel currentCountLabel;
    private javax.swing.JTextField currentValueTextField;
    private javax.swing.JComboBox<String> integerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JLabel targetDateLabel;
    private javax.swing.JTextField targetDateTextField;
    private javax.swing.JTextField targetValueTextField;
    private javax.swing.JLabel unitHelpText;
    private javax.swing.JLabel unitHelpText1;
    private javax.swing.JLabel unitHelpText2;
    private javax.swing.JLabel unitHelpText3;
    private javax.swing.JLabel unitLabel;
    private javax.swing.JLabel unitLabel1;
    private javax.swing.JTextField unitTextField;
    // End of variables declaration//GEN-END:variables
}
