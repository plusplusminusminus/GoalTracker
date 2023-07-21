/*
 * HabitGoal.java
 * - class that represents a habit goal
 * - not implemented
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

import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import com.goaltracker.forms.input.InputHabitGoal;
import java.io.Serializable;
import java.time.Instant;
import javax.swing.JPanel;

public class HabitGoal extends Goal implements Serializable {
    private Boolean countdown;
    private Double startAmount;
    private Double currentAmount;
    private Double targetAmount;

    public HabitGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Double aCurrentAmount, Double aTargetAmount, String aNotes) {
        super(aDescription, aTargetDate, aPriority, aNotes);
        currentAmount = aCurrentAmount;
        startAmount = currentAmount;
        targetAmount = aTargetAmount;
    }

    public Double addToAmount(double v) {
        currentAmount += v;
        if (currentAmount >= targetAmount) {
            this.setIsCompleted(true);
        }
        GoalTracker.save();
        return currentAmount;
    }
    public Double getStartAmount() {
        return startAmount;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean countdown) {
        this.countdown = countdown;
    }

    public static JPanel getInputPanel() {
        return new InputHabitGoal();
    }
}
