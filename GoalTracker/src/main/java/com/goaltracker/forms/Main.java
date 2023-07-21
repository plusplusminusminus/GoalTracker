/*
 * Main.java
 * - the main app view
 *
 * Tyler Moquin
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms;

import com.goaltracker.forms.pages.PageAbandonedGoals;
import com.goaltracker.forms.pages.PageNextWeekGoals;
import com.goaltracker.forms.pages.PageNewGoal;
import com.goaltracker.forms.pages.PageCompletedGoals;
import com.goaltracker.forms.pages.PageHelp;
import com.goaltracker.forms.pages.PageAbout;
import com.goaltracker.forms.pages.PageCurrentGoals;
import com.goaltracker.forms.pages.PageDashboard;
import com.goaltracker.forms.pages.PageTodayGoals;
import com.goaltracker.forms.pages.PagePastDueGoals;
import com.goaltracker.forms.pages.PageThisWeekGoals;
import com.goaltracker.forms.pages.PageThisMonthGoals;
import com.goaltracker.config.Constants;
import com.goaltracker.forms.pages.Page;
import com.goaltracker.forms.pages.PagePriorityGoals;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JViewport;

public class Main extends JFrame {
    Page currentView;

    public Main() {
        currentView = new PageDashboard();
        initComponents();
        setView(currentView);
    }

    public void setView(Page view) {
        currentView = view;
        JViewport mainView = mainPanel.getViewport();
        mainView.setBackground(Constants.MAIN_VIEW_BGCOLOR);
        mainView.add((JComponent)currentView);
        mainView.repaint();
        mainView.validate();
    }

    public Page getCurrentView() {
        return currentView;
    }

    public void refreshView() {
        if (currentView instanceof PageAbandonedGoals) {
            showAbandonedGoals();
        } else if (currentView instanceof PageCompletedGoals) {
            showCompletedGoals();
        } else if (currentView instanceof PageCurrentGoals) {
            showCurrentGoals();
        } else if (currentView instanceof PageDashboard) {
            showDashboard();
        } else if (currentView instanceof PageHelp) {
            showHelp();
        } else if (currentView instanceof PageAbout) {
            showAbout();
        } else if (currentView instanceof PageNewGoal) {
            showNewGoal();
        } else if (currentView instanceof PageNextWeekGoals) {
            showNextWeekGoals();
        } else if (currentView instanceof PagePastDueGoals) {
            showPastDueGoals();
        } else if (currentView instanceof PagePriorityGoals) {
            showPriorityGoals();
        } else if (currentView instanceof PageThisMonthGoals) {
            showThisMonthGoals();
        } else if (currentView instanceof PageThisWeekGoals) {
            showThisWeekGoals();
        } else if (currentView instanceof PageTodayGoals) {
            showTodayGoals();
        }
    }

    public void redrawView() {
        repaint();
        validate();
    }

    public void showDashboard() {
        currentView = new PageDashboard();
        setView(currentView);
    }

    public void updateDashboard() {
        ((PageDashboard)currentView).updateSummaries();
    }

    public void showAbandonedGoals() {
        currentView = new PageAbandonedGoals();
        setView(currentView);
    }

    public void showCompletedGoals() {
        currentView = new PageCompletedGoals();
        setView(currentView);
    }

    public void showCurrentGoals() {
        currentView = new PageCurrentGoals();
        setView(currentView);
    }

    public void showHelp() {
        currentView = new PageHelp();
        setView(currentView);
    }

    public void showAbout() {
        currentView = new PageAbout();
        setView(currentView);
    }

    public void showNewGoal() {
        currentView = new PageNewGoal();
        setView(currentView);
    }

    public void showNextWeekGoals() {
        currentView = new PageNextWeekGoals();
        setView(currentView);
    }

    public void showPastDueGoals() {
        currentView = new PagePastDueGoals();
        setView(currentView);
    }

    public void showPriorityGoals() {
        currentView = new PagePriorityGoals();
        setView(currentView);
    }

    public void showThisMonthGoals() {
        currentView = new PageThisMonthGoals();
        setView(currentView);
    }

    public void showThisWeekGoals() {
        currentView = new PageThisWeekGoals();
        setView(currentView);
    }

    public void showTodayGoals() {
        currentView = new PageTodayGoals();
        setView(currentView);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JScrollPane();
        menuPanel = new javax.swing.JPanel();
        menuTitle = new javax.swing.JPanel();
        GoalTracker = new javax.swing.JLabel();
        dashboardMenuItem = new javax.swing.JButton();
        myGoalsMenuPanel = new javax.swing.JPanel();
        myGoalsLabel = new javax.swing.JLabel();
        todayMenuItem = new javax.swing.JButton();
        pastDueMenuItem = new javax.swing.JButton();
        thisWeekMenuItem = new javax.swing.JButton();
        nextWeekMenuItem = new javax.swing.JButton();
        thisMonthMenuItem = new javax.swing.JButton();
        priorityMenuItem = new javax.swing.JButton();
        currentMenuItem = new javax.swing.JButton();
        newGoalMenuItem = new javax.swing.JButton();
        archivesMenuPanel = new javax.swing.JPanel();
        archivedGoalsLabel = new javax.swing.JLabel();
        completedMenuItem = new javax.swing.JButton();
        abandonedMenuItem = new javax.swing.JButton();
        helpMenuItem = new javax.swing.JButton();
        aboutMenuItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Goal Tracker - Tyler Moquin");
        setBackground(Constants.APP_BGCOLOR);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(32768, 32768));
        setMinimumSize(new java.awt.Dimension(1050, 690));
        setPreferredSize(new java.awt.Dimension(1050, 690));

        appPanel.setBackground(Constants.APP_BGCOLOR);

        topPanel.setBackground(new java.awt.Color(204, 204, 255));

        mainPanel.setBackground(new java.awt.Color(51, 255, 102));
        mainPanel.setBorder(null);
        mainPanel.setOpaque(false);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        menuPanel.setBackground(Constants.MENU_BGCOLOR);
        menuPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, Constants.MENU_BORDER), null));
        menuPanel.setMinimumSize(new java.awt.Dimension(200, 0));

        menuTitle.setOpaque(false);

        GoalTracker.setBackground(new java.awt.Color(50, 204, 255));
        GoalTracker.setFont(new java.awt.Font("Robofan Free", 0, 22)); // NOI18N
        GoalTracker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoalTracker.setText("Goal Tracker");

        javax.swing.GroupLayout menuTitleLayout = new javax.swing.GroupLayout(menuTitle);
        menuTitle.setLayout(menuTitleLayout);
        menuTitleLayout.setHorizontalGroup(
            menuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GoalTracker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuTitleLayout.setVerticalGroup(
            menuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GoalTracker, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dashboardMenuItem.setBackground(Constants.MENUITEM_SPECIAL_BGCOLOR);
        dashboardMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        dashboardMenuItem.setText("Dashboard");
        dashboardMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_SPECIAL_BORDER));
        dashboardMenuItem.setOpaque(true);
        dashboardMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dashboardMenuItemMouseReleased(evt);
            }
        });

        myGoalsMenuPanel.setBackground(Constants.MENU_MYGOALS_BGCOLOR);

        myGoalsLabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        myGoalsLabel.setForeground(Constants.MENU_MYGOALS_FGCOLOR);
        myGoalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myGoalsLabel.setText("My Goals");
        myGoalsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        myGoalsLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        todayMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        todayMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        todayMenuItem.setText("Today");
        todayMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        todayMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        todayMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        todayMenuItem.setOpaque(true);
        todayMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        todayMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                todayMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                todayMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                todayMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                todayMenuItemMouseReleased(evt);
            }
        });

        pastDueMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        pastDueMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        pastDueMenuItem.setText("Past Due");
        pastDueMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        pastDueMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        pastDueMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        pastDueMenuItem.setOpaque(true);
        pastDueMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        pastDueMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastDueMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pastDueMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pastDueMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pastDueMenuItemMouseReleased(evt);
            }
        });

        thisWeekMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        thisWeekMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        thisWeekMenuItem.setText("This Week");
        thisWeekMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        thisWeekMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        thisWeekMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        thisWeekMenuItem.setOpaque(true);
        thisWeekMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        thisWeekMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thisWeekMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thisWeekMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thisWeekMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                thisWeekMenuItemMouseReleased(evt);
            }
        });

        nextWeekMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        nextWeekMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        nextWeekMenuItem.setText("Next Week");
        nextWeekMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        nextWeekMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        nextWeekMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        nextWeekMenuItem.setOpaque(true);
        nextWeekMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        nextWeekMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextWeekMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextWeekMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextWeekMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextWeekMenuItemMouseReleased(evt);
            }
        });

        thisMonthMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        thisMonthMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        thisMonthMenuItem.setText("This Month");
        thisMonthMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        thisMonthMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        thisMonthMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        thisMonthMenuItem.setOpaque(true);
        thisMonthMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        thisMonthMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thisMonthMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thisMonthMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                thisMonthMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                thisMonthMenuItemMouseReleased(evt);
            }
        });

        priorityMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        priorityMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        priorityMenuItem.setText("Priority");
        priorityMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        priorityMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        priorityMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        priorityMenuItem.setOpaque(true);
        priorityMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        priorityMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priorityMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                priorityMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                priorityMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                priorityMenuItemMouseReleased(evt);
            }
        });

        currentMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        currentMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        currentMenuItem.setText("Current");
        currentMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        currentMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        currentMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        currentMenuItem.setOpaque(true);
        currentMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        currentMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                currentMenuItemMouseReleased(evt);
            }
        });

        newGoalMenuItem.setBackground(Constants.MENUITEM_SPECIAL_BGCOLOR);
        newGoalMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        newGoalMenuItem.setText("New Goal");
        newGoalMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_SPECIAL_BORDER));
        newGoalMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        newGoalMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        newGoalMenuItem.setOpaque(true);
        newGoalMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        newGoalMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGoalMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newGoalMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newGoalMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGoalMenuItemMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout myGoalsMenuPanelLayout = new javax.swing.GroupLayout(myGoalsMenuPanel);
        myGoalsMenuPanel.setLayout(myGoalsMenuPanelLayout);
        myGoalsMenuPanelLayout.setHorizontalGroup(
            myGoalsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myGoalsMenuPanelLayout.createSequentialGroup()
                .addGroup(myGoalsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myGoalsMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(myGoalsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myGoalsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(todayMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pastDueMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thisMonthMenuItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(priorityMenuItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(currentMenuItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(newGoalMenuItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(thisWeekMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(myGoalsMenuPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(nextWeekMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        myGoalsMenuPanelLayout.setVerticalGroup(
            myGoalsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myGoalsMenuPanelLayout.createSequentialGroup()
                .addComponent(myGoalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todayMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pastDueMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thisWeekMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextWeekMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(thisMonthMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newGoalMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        archivesMenuPanel.setBackground(Constants.MENU_ARCHIVED_BGCOLOR);

        archivedGoalsLabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        archivedGoalsLabel.setForeground(Constants.MENU_ARCHIVED_FGCOLOR);
        archivedGoalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        archivedGoalsLabel.setText("Archived Goals");
        archivedGoalsLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        completedMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        completedMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        completedMenuItem.setText("Completed");
        completedMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        completedMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        completedMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        completedMenuItem.setOpaque(true);
        completedMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        completedMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completedMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                completedMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                completedMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                completedMenuItemMouseReleased(evt);
            }
        });

        abandonedMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        abandonedMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        abandonedMenuItem.setText("Abandoned");
        abandonedMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        abandonedMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        abandonedMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        abandonedMenuItem.setOpaque(true);
        abandonedMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        abandonedMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abandonedMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                abandonedMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                abandonedMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                abandonedMenuItemMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout archivesMenuPanelLayout = new javax.swing.GroupLayout(archivesMenuPanel);
        archivesMenuPanel.setLayout(archivesMenuPanelLayout);
        archivesMenuPanelLayout.setHorizontalGroup(
            archivesMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archivesMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(archivesMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completedMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(archivedGoalsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abandonedMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        archivesMenuPanelLayout.setVerticalGroup(
            archivesMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(archivesMenuPanelLayout.createSequentialGroup()
                .addComponent(archivedGoalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completedMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abandonedMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        helpMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        helpMenuItem.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        helpMenuItem.setText("Help");
        helpMenuItem.setBorder(javax.swing.BorderFactory.createLineBorder(Constants.MENUITEM_BORDER));
        helpMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        helpMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        helpMenuItem.setOpaque(true);
        helpMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        helpMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                helpMenuItemMouseReleased(evt);
            }
        });

        aboutMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
        aboutMenuItem.setFont(new java.awt.Font("Avenir Next", 2, 14)); // NOI18N
        aboutMenuItem.setText("About Goal Tracker");
        aboutMenuItem.setBorder(null);
        aboutMenuItem.setMaximumSize(new java.awt.Dimension(64, 29));
        aboutMenuItem.setMinimumSize(new java.awt.Dimension(64, 29));
        aboutMenuItem.setPreferredSize(new java.awt.Dimension(64, 29));
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutMenuItemMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardMenuItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(archivesMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(myGoalsMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(aboutMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpMenuItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dashboardMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(myGoalsMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(archivesMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(helpMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutMenuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout appPanelLayout = new javax.swing.GroupLayout(appPanel);
        appPanel.setLayout(appPanelLayout);
        appPanelLayout.setHorizontalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appPanelLayout.setVerticalGroup(
            appPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMenuItemMouseClicked
        showDashboard();
    }//GEN-LAST:event_dashboardMenuItemMouseClicked

    private void dashboardMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMenuItemMouseEntered
        dashboardMenuItem.setBackground(Constants.MENUITEM_SPECIAL_HILITE_BGCOLOR);
    }//GEN-LAST:event_dashboardMenuItemMouseEntered

    private void dashboardMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMenuItemMouseExited
        dashboardMenuItem.setBackground(Constants.MENUITEM_SPECIAL_BGCOLOR);
    }//GEN-LAST:event_dashboardMenuItemMouseExited

    private void todayMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayMenuItemMouseClicked
        showTodayGoals();
    }//GEN-LAST:event_todayMenuItemMouseClicked

    private void todayMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayMenuItemMouseEntered
        todayMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_todayMenuItemMouseEntered

    private void todayMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayMenuItemMouseExited
        todayMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_todayMenuItemMouseExited

    private void pastDueMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastDueMenuItemMouseClicked
        showPastDueGoals();
    }//GEN-LAST:event_pastDueMenuItemMouseClicked

    private void pastDueMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastDueMenuItemMouseEntered
         pastDueMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_pastDueMenuItemMouseEntered

    private void pastDueMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastDueMenuItemMouseExited
         pastDueMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_pastDueMenuItemMouseExited

    private void nextWeekMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekMenuItemMouseClicked
        showNextWeekGoals();
    }//GEN-LAST:event_nextWeekMenuItemMouseClicked

    private void nextWeekMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekMenuItemMouseEntered
        nextWeekMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_nextWeekMenuItemMouseEntered

    private void nextWeekMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekMenuItemMouseExited
        nextWeekMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_nextWeekMenuItemMouseExited

    private void thisMonthMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisMonthMenuItemMouseClicked
        showThisMonthGoals();
    }//GEN-LAST:event_thisMonthMenuItemMouseClicked

    private void thisMonthMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisMonthMenuItemMouseEntered
        thisMonthMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_thisMonthMenuItemMouseEntered

    private void thisMonthMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisMonthMenuItemMouseExited
        thisMonthMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_thisMonthMenuItemMouseExited

    private void priorityMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMenuItemMouseClicked
        showPriorityGoals();
    }//GEN-LAST:event_priorityMenuItemMouseClicked

    private void priorityMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMenuItemMouseEntered
        priorityMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_priorityMenuItemMouseEntered

    private void priorityMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMenuItemMouseExited
         priorityMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_priorityMenuItemMouseExited

    private void currentMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMenuItemMouseClicked
        showCurrentGoals();
    }//GEN-LAST:event_currentMenuItemMouseClicked

    private void currentMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMenuItemMouseEntered
        currentMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_currentMenuItemMouseEntered

    private void currentMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMenuItemMouseExited
        currentMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_currentMenuItemMouseExited

    private void newGoalMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalMenuItemMouseClicked
        showNewGoal();
    }//GEN-LAST:event_newGoalMenuItemMouseClicked

    private void newGoalMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalMenuItemMouseEntered
       newGoalMenuItem.setBackground(Constants.MENUITEM_SPECIAL_HILITE_BGCOLOR);
    }//GEN-LAST:event_newGoalMenuItemMouseEntered

    private void newGoalMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalMenuItemMouseExited
        newGoalMenuItem.setBackground(Constants.MENUITEM_SPECIAL_BGCOLOR);
    }//GEN-LAST:event_newGoalMenuItemMouseExited

    private void thisWeekMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisWeekMenuItemMouseClicked
        showThisWeekGoals();
    }//GEN-LAST:event_thisWeekMenuItemMouseClicked

    private void thisWeekMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisWeekMenuItemMouseEntered
        thisWeekMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_thisWeekMenuItemMouseEntered

    private void thisWeekMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisWeekMenuItemMouseExited
        thisWeekMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_thisWeekMenuItemMouseExited

    private void completedMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMenuItemMouseClicked
        showCompletedGoals();
    }//GEN-LAST:event_completedMenuItemMouseClicked

    private void completedMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMenuItemMouseEntered
        completedMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_completedMenuItemMouseEntered

    private void completedMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMenuItemMouseExited
        completedMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_completedMenuItemMouseExited

    private void abandonedMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonedMenuItemMouseClicked
        showAbandonedGoals();
    }//GEN-LAST:event_abandonedMenuItemMouseClicked

    private void abandonedMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonedMenuItemMouseEntered
        abandonedMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_abandonedMenuItemMouseEntered

    private void abandonedMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonedMenuItemMouseExited
        abandonedMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_abandonedMenuItemMouseExited

    private void aboutMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseClicked
        showAbout();
    }//GEN-LAST:event_aboutMenuItemMouseClicked

    private void aboutMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseEntered
       // aboutMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_aboutMenuItemMouseEntered

    private void aboutMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseExited
        // aboutMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_aboutMenuItemMouseExited

    private void helpMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuItemMouseClicked
        showHelp();
    }//GEN-LAST:event_helpMenuItemMouseClicked

    private void helpMenuItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuItemMouseEntered
        helpMenuItem.setBackground(Constants.MENUITEM_HILITE_BGCOLOR);
    }//GEN-LAST:event_helpMenuItemMouseEntered

    private void helpMenuItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuItemMouseExited
        helpMenuItem.setBackground(Constants.MENUITEM_BGCOLOR);
    }//GEN-LAST:event_helpMenuItemMouseExited

    private void dashboardMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMenuItemMouseReleased
        showDashboard();
    }//GEN-LAST:event_dashboardMenuItemMouseReleased

    private void todayMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_todayMenuItemMouseReleased
        showTodayGoals();
    }//GEN-LAST:event_todayMenuItemMouseReleased

    private void pastDueMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastDueMenuItemMouseReleased
        showPastDueGoals();
    }//GEN-LAST:event_pastDueMenuItemMouseReleased

    private void thisWeekMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisWeekMenuItemMouseReleased
        showPastDueGoals();
    }//GEN-LAST:event_thisWeekMenuItemMouseReleased

    private void nextWeekMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekMenuItemMouseReleased
        showNextWeekGoals();
    }//GEN-LAST:event_nextWeekMenuItemMouseReleased

    private void thisMonthMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thisMonthMenuItemMouseReleased
        showThisMonthGoals();
    }//GEN-LAST:event_thisMonthMenuItemMouseReleased

    private void priorityMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityMenuItemMouseReleased
        showPriorityGoals();
    }//GEN-LAST:event_priorityMenuItemMouseReleased

    private void currentMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentMenuItemMouseReleased
        showCurrentGoals();
    }//GEN-LAST:event_currentMenuItemMouseReleased

    private void newGoalMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGoalMenuItemMouseReleased
        showNewGoal();
    }//GEN-LAST:event_newGoalMenuItemMouseReleased

    private void completedMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedMenuItemMouseReleased
        showCompletedGoals();
    }//GEN-LAST:event_completedMenuItemMouseReleased

    private void abandonedMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonedMenuItemMouseReleased
        showAbandonedGoals();
    }//GEN-LAST:event_abandonedMenuItemMouseReleased

    private void helpMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuItemMouseReleased
        showHelp();
    }//GEN-LAST:event_helpMenuItemMouseReleased

    private void aboutMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMouseReleased
        showAbout();
    }//GEN-LAST:event_aboutMenuItemMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoalTracker;
    private javax.swing.JButton abandonedMenuItem;
    private javax.swing.JButton aboutMenuItem;
    private javax.swing.JPanel appPanel;
    private javax.swing.JLabel archivedGoalsLabel;
    private javax.swing.JPanel archivesMenuPanel;
    private javax.swing.JButton completedMenuItem;
    private javax.swing.JButton currentMenuItem;
    private javax.swing.JButton dashboardMenuItem;
    private javax.swing.JButton helpMenuItem;
    private javax.swing.JScrollPane mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menuTitle;
    private javax.swing.JLabel myGoalsLabel;
    private javax.swing.JPanel myGoalsMenuPanel;
    private javax.swing.JButton newGoalMenuItem;
    private javax.swing.JButton nextWeekMenuItem;
    private javax.swing.JButton pastDueMenuItem;
    private javax.swing.JButton priorityMenuItem;
    private javax.swing.JButton thisMonthMenuItem;
    private javax.swing.JButton thisWeekMenuItem;
    private javax.swing.JButton todayMenuItem;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
