/*
 * Goal.java
 * - base class for goals
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.goals;

import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;

public abstract class Goal implements Serializable {
    private String description;
    private String notes;
    private PriorityLevel priority;
    private ArrayList<Goal> subGoals;
    private Boolean isCompleted = false;
    private Boolean isAbandoned = false;
    private Boolean isSubGoal;
    private Instant dateCreated;
    private Instant dateLastUpdated;
    private Instant targetDate;
    private Instant dateCompleted;

    public Goal(String aDescription, Instant aTargetDate, PriorityLevel aPriority, String aNotes) {
        description = aDescription;
        priority = aPriority;
        targetDate = aTargetDate;
        notes = aNotes;
        isSubGoal = false;
        dateCreated = GoalTracker.getCurrentDate();
        dateLastUpdated = dateCreated;
    }

    public Goal(String aDescription, Instant aTargetDate, PriorityLevel aPriority, String aNotes, Boolean aIsSubGoal) {
        description = aDescription;
        targetDate = aTargetDate;
        priority = aPriority;
        notes = aNotes;
        isSubGoal = aIsSubGoal;
        dateCreated = GoalTracker.getCurrentDate();
        dateLastUpdated = dateCreated;
    }

    public Instant getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Instant targetDate) {
        this.targetDate = targetDate;
    }

    public Instant getDateLastUpdated() {
        return dateLastUpdated;
    }
    
    public void setDateLastUpdated(Instant aDateLastUpdated) {
        dateLastUpdated = aDateLastUpdated;
    }
    
    public void registerActivity() {
        dateLastUpdated = GoalTracker.getCurrentDate();
    }
    
    public Boolean getIsSubGoal() {
        return isSubGoal;
    }

    public void setIsSubGoal(Boolean isSubGoal) {
        this.isSubGoal = isSubGoal;
    }


    public Boolean getIsAbandoned() {
        return isAbandoned;
    }

    public void setIsAbandoned(Boolean isAbandoned) {
        this.isAbandoned = isAbandoned;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Goal> getSubGoals() {
        return subGoals;
    }

    public void setSubGoals(ArrayList<Goal> subGoals) {
        this.subGoals = subGoals;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean aIsCompleted) {
        if (aIsCompleted) {
            dateCompleted = GoalTracker.getCurrentDate();
        }
        isCompleted = aIsCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    public void setPriority(PriorityLevel aPriority) {
        priority = aPriority;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant aDateCreated) {
        dateCreated = aDateCreated;
    }

    public Instant getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Instant aDateAccomplished) {
        dateCompleted = aDateAccomplished;
    }
}
