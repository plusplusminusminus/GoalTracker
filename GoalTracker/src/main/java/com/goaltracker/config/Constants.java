/*
 * Constants.java
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.config;

import java.awt.Color;
import java.time.Instant;

public class Constants {
    public static final Boolean DEBUG = false;
    public static final Boolean CLEAR_ALL_GOALS = false;
    
    public static final Instant CURRENT_DATE = Instant.parse("2023-05-23T08:07:06.00Z");
    
    public static final float ALIGNMENT_X = (float)0.5;
    
    public static final String NOTES_LABEL_CLOSED    = "▶  Notes";
    public static final String NOTES_LABEL_OPENED    = "▼  Notes";
    public static final String ACTIVITY_LABEL_CLOSED = "▶  Activity";
    public static final String ACTIVITY_LABEL_OPENED = "▼  Activity";
    public static final String TASKS_LABEL_CLOSED    = "▶  Tasks";
    public static final String TASKS_LABEL_OPENED    = "▼  Tasks";
    public static final String SUBTASK_NOTES_LABEL_CLOSED = "Notes ◀";
    public static final String SUBTASK_NOTES_LABEL_OPENED = "Notes ▼";

    public static final Color APP_BGCOLOR = new Color(253,253,255);
    public static final Color MAIN_VIEW_BGCOLOR = new Color(253,253,255);

    public static final Color MENU_BORDER = new Color(100,100,100);
    public static final Color MENU_BGCOLOR = new Color(225, 225, 225);

    public static final Color MENUITEM_BORDER = new Color(64, 64, 164);
    public static final Color MENUITEM_BGCOLOR = new Color(174,238,208);
    public static final Color MENUITEM_HILITE_BGCOLOR = new Color(221,248,235);

    public static final Color MENUITEM_SPECIAL_BORDER = new Color(64, 64, 164);
    public static final Color MENUITEM_SPECIAL_BGCOLOR = new Color(184,218,248);
    public static final Color MENUITEM_SPECIAL_HILITE_BGCOLOR = new Color(231,245,255);

    public static final Color MENU_MYGOALS_FGCOLOR = new Color(255, 255, 255);
    public static final Color MENU_MYGOALS_BGCOLOR = new Color(118,152,179);

    public static final Color MENU_ARCHIVED_FGCOLOR = new Color(255, 255, 255);
    public static final Color MENU_ARCHIVED_BGCOLOR = new Color(118,152,179);

    public static final Color PROGRESS_BAR = new Color(255,0,0);
    public static final Color GOAL_BGCOLOR = new Color(244,244,249); //new Color(192,219,217); //new Color(240,240,240);
    public static final Color GOAL_BORDER = new Color(128,128,128);
    public static final Color GOAL_STATS_BGCOLOR = new Color(221,248,235);

    public static final Color GOAL_PRIO_HIGH_BGCOLOR = new Color(87,239,102);
    public static final Color GOAL_PRIO_HIGH_BARCOLOR = new Color(239, 37, 59);
    public static final Color GOAL_PRIO_HIGH_STATS_BGCOLOR = new Color(242, 190, 198);

    public static final Color GOAL_PRIO_MEDIUM_BGCOLOR = new Color(22, 165, 63);
    public static final Color GOAL_PRIO_MEDIUM_BARCOLOR = new Color(22, 165, 63);
    public static final Color GOAL_PRIO_MEDIUM_STATS_BGCOLOR = new Color(177, 247, 206);

    public static final Color GOAL_PRIO_LOW_BGCOLOR = new Color(243,243,243);
    public static final Color GOAL_PRIO_LOW_BARCOLOR = new Color(164, 164, 164);
    public static final Color GOAL_PRIO_LOW_STATS_BGCOLOR = new Color(215,215,215);
    
    public static final Color STATS_OPEN_BGCOLOR = new Color(179, 238, 255);
    public static final Color STATS_PRIORITY_BGCOLOR = new Color(249, 199, 200);
    public static final Color STATS_COMPLETED_BGCOLOR = new Color(222, 248, 233);
    
    public static final Color TASK_DONE = new Color(221,248,235);

}
