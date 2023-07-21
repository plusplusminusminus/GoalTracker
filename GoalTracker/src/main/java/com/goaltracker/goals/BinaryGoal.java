/*
 * BinaryGoal.java
 * - class that represents a binary goal
 *
 * Tyler Moquin
 * SJSU Spring 2023
 * CS 151, Sec 6
 * Instructor Gaikwad
 *
 * Final Project, "Group 11"
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */
package com.goaltracker.goals;

import com.goaltracker.PriorityLevel;
import com.goaltracker.forms.input.InputBinaryGoal;
import java.io.Serializable;
import java.time.Instant;
import javax.swing.JPanel;

public class BinaryGoal extends Goal implements Serializable {
    private Boolean countdown;

    public BinaryGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Boolean aCountdown, String aNotes) {
        super(aDescription, aTargetDate,aPriority, aNotes, false);
        countdown = aCountdown;
    }

    public BinaryGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Boolean aCountdown, String aNotes, Boolean aIsSubGoal) {
        super(aDescription, aTargetDate, aPriority, aNotes, aIsSubGoal);
        countdown = aCountdown;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean countdown) {
        this.countdown = countdown;
    }

    public static JPanel getInputPanel() {
        return new InputBinaryGoal();
    }
}
