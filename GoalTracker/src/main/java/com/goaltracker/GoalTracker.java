/*
 * GoalTracker.java
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker;

import com.goaltracker.config.Constants;
import com.goaltracker.goals.Goal;
import com.goaltracker.forms.Main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Instant;
import java.util.ArrayList;

public class GoalTracker {
    private static final boolean DEBUG = Constants.DEBUG;
    private static final boolean CLEAR_ALL_GOALS = Constants.CLEAR_ALL_GOALS;
    private static final String GOAL_FILE = "goals.db";
    private static GoalTracker app;
    private static ArrayList<Goal> goals;
    private static Main main;

    private GoalTracker() {
        load();
    }

    public static GoalTracker getInstance() {
        if (app == null) {
            app = new GoalTracker();
        }
        return app;
    }

    public static ArrayList<Goal> getGoals() {
        return goals;
    }

    public static void addGoal(Goal aGoal) {
        goals.add(aGoal);
        save();
    }

    public static void refreshView() {
        main.refreshView();
    }

    public static void redrawView() {
        main.redrawView();
    }

    public static void showCurrentGoals() {
        main.showCurrentGoals();
    }

    public static void showCompletedGoals() {
        main.showCompletedGoals();
    }

    public static void showPriorityGoals() {
        main.showPriorityGoals();
    }

    public static void showDashboard() {
        main.showDashboard();
    }

    public static void updateDashboard() {
        if (main != null) {
            main.updateDashboard();
        }
    }

    public static int getOpenGoalsCount() {
        int count = 0;
        for (Goal g: goals) {
            if (!g.getIsCompleted() && !g.getIsSubGoal() && !g.getIsAbandoned()) {
                count++;
            }
        }
        return count;
    }

    public static int getCompletedGoalsCount() {
        int count = 0;
        for (Goal g: goals) {
            if (g.getIsCompleted() && !(g.getIsSubGoal()==true) && !g.getIsAbandoned()) {
                count++;
            }
        }
        return count;
    }

    public static int getPriorityGoalsCount() {
        int count = 0;
        for (Goal g: goals) {
            if (!g.getIsCompleted() && !(g.getIsSubGoal()==true) && !g.getIsAbandoned() && (g.getPriority() == PriorityLevel.HIGH)) {
                count++;
            }
        }
        return count;
    }

    public static void load() {
        try {
            FileInputStream fileInStream = new FileInputStream(GOAL_FILE);
            ObjectInputStream in = new ObjectInputStream(fileInStream);
            goals = (ArrayList<Goal>) in.readObject();
            in.close();
            fileInStream.close();
        } catch (FileNotFoundException f) {
            goals = new ArrayList<>();
        } catch (IOException i) {
            goals = new ArrayList<>();
            if (DEBUG) {
                System.out.println("Expected failure trying to read goals database file");
                i.printStackTrace();    // normally prints the first time app is run, since .db file doesn't exist
            }
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }
    }

    public static void save() {
        try {
            FileOutputStream fileOutStream = new FileOutputStream(GOAL_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOutStream);
            out.writeObject(goals);
            out.close();
            fileOutStream.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    private static void clearAllGoals() {
        goals.clear();
        save();
    }

    public static void main(String[] args) {
        app = getInstance();
        if (DEBUG && CLEAR_ALL_GOALS) {
            clearAllGoals();
        }
        main = new Main();
        java.awt.EventQueue.invokeLater(() -> {
            main.setVisible(true);
        });
    }

    public static Instant getCurrentDate() {
        if(DEBUG) {
            return Constants.CURRENT_DATE;
        } else {
            return Instant.now();
        }
    }
}
