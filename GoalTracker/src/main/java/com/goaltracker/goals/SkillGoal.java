/*
 * SkillGoal.java
 * - class that represents a skill goal
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
import com.goaltracker.forms.input.InputSkillGoal;
import java.io.Serializable;
import java.time.Instant;
import javax.swing.JPanel;

public class SkillGoal extends Goal implements Serializable {
    private Boolean countdown;
    private Double startSkillLevel;
    private Double currentSkillLevel;
    private Double targetSkillLevel;

    public SkillGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Double aCurrentAmount, Double aTargetAmount, String aNotes) {
        super(aDescription, aTargetDate, aPriority, aNotes);
        currentSkillLevel = aCurrentAmount;
        startSkillLevel = currentSkillLevel;
        targetSkillLevel = aTargetAmount;
    }

    public Double addToAmount(double v) {
        currentSkillLevel += v;
        if (currentSkillLevel >= targetSkillLevel) {
            this.setIsCompleted(true);
        }
        GoalTracker.save();
        return currentSkillLevel.doubleValue();
    }
    public Double getStartSkillLevel() {
        return startSkillLevel;
    }

    public Double getCurrentSkillLevel() {
        return currentSkillLevel;
    }

    public void setCurrentSkillLevel(Double currentSkillLevel) {
        this.currentSkillLevel = currentSkillLevel;
    }

    public Double getTargetSkillLevel() {
        return targetSkillLevel;
    }

    public void setTargetSkillLevel(Double targetSkillLevel) {
        this.targetSkillLevel = targetSkillLevel;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean countdown) {
        this.countdown = countdown;
    }

    public static JPanel getInputPanel() {
        return new InputSkillGoal();
    }
}
