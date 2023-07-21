/*
 * AccumulationGoal.java
 * - class that represents an accumulation goal
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
import com.goaltracker.forms.input.InputAccumulationGoal;
import java.io.Serializable;
import java.time.Instant;
import javax.swing.JPanel;

public class AccumulationGoal extends Goal implements Serializable {
    private Boolean countdown;
    private Boolean isInteger;
    private Double startValue;
    private Double currentValue;
    private Double targetValue;
    private String unit;

    public AccumulationGoal(String aDescription, PriorityLevel aPriority, Boolean aIsInteger, String aUnit, Boolean aCountdown, Instant aTargetDate, Double aStartValue, Double aTargetValue, String aNotes) {
        super(aDescription, aTargetDate, aPriority, aNotes);
        startValue = aStartValue;
        currentValue = startValue;
        targetValue = aTargetValue;
        countdown = aCountdown;
        isInteger = aIsInteger;
        unit = aUnit;
        if (unit.equals("")) {
            unit = "Value";
        }
        startValue = currentValue;
    }

    public Boolean getIsInteger() {
        return isInteger;
    }

    public void setIsInteger(Boolean isInteger) {
        this.isInteger = isInteger;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double addAmount(double v) {
        currentValue += v;
        if (currentValue >= targetValue) {
            this.setIsCompleted(true);
        }
        registerActivity();
        GoalTracker.save();
        return currentValue;
    }

    public Double getStartValue() {
        return startValue;
    }
    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double aCurrentCount) {
        currentValue = aCurrentCount;
    }

    public Double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Double aTargetCount) {
        this.targetValue = aTargetCount;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean aCountdown) {
        countdown = aCountdown;
    }

    public static JPanel getInputPanel() {
        return new InputAccumulationGoal();
    }
}
