/*
 * InputBinaryGoal.java
 * - input form with specifics for a binar goal
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.input;

public class InputBinaryGoal extends javax.swing.JPanel {

    public InputBinaryGoal() {
        initComponents();
    }

    public String getTargetDate() {
        return targetDateTextField.getText();
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

    public String getNotes() {
        return notesTextArea.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goalNameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        targetDateLabel = new javax.swing.JLabel();
        targetDateTextField = new javax.swing.JTextField();
        countdownLabel = new javax.swing.JLabel();
        countdownComboBox = new javax.swing.JComboBox<>();
        notesLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        goalNameLabel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        goalNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        goalNameLabel.setText("Description:");

        setBackground(new java.awt.Color(51, 255, 51));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);

        jPanel1.setOpaque(false);

        targetDateLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        targetDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        targetDateLabel.setText("Deadline:");
        targetDateLabel.setAlignmentX(0.5F);
        targetDateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        targetDateTextField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N

        countdownLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        countdownLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countdownLabel.setText("Countdown?");

        countdownComboBox.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        countdownComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        countdownComboBox.setSelectedIndex(-1);

        notesLabel.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        notesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notesLabel.setText("Notes:");

        jLabel4.setFont(new java.awt.Font("Avenir Next", 2, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("(optional)");

        notesTextArea.setColumns(20);
        notesTextArea.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        notesTextArea.setRows(5);
        jScrollPane2.setViewportView(notesTextArea);

        jLabel5.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("count down days until deadline? (optional) ");

        jLabel1.setFont(new java.awt.Font("Futura", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Details of Your Binary Goal");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(optional) mm/dd/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(notesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(countdownLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(targetDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(targetDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countdownComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(targetDateLabel)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetDateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(countdownLabel)
                    .addComponent(countdownComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(notesLabel)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> countdownComboBox;
    private javax.swing.JLabel countdownLabel;
    private javax.swing.JLabel goalNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JLabel targetDateLabel;
    private javax.swing.JTextField targetDateTextField;
    // End of variables declaration//GEN-END:variables
}
