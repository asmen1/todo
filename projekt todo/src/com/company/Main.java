package com.company;

import  java.util.Scanner;

public class Main {

    static String [] tasks = new String[100];
    static String [] projects = new String[100];
//    static String [] changeLog = new String[100];

    static int tasksCount = 0;
    static int projectsCount = 0;
    //static int changeLogCount = 0;

    public static void displayMenu() {
        System.out.println("1 - Create new task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create new project");
        System.out.println("4 - Remove project");
        System.out.println("5 - Display all tasks");
        System.out.println("6 - Display all projects");
        //      System.out.println("7 - Display change log");
        System.out.println("0 - Exit app");
    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = tasksCount < tasks.length;
        if (hasCapacityForNewTask) {
            tasks[tasksCount] = task;
            tasksCount++;
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < tasksCount;
        if (isTaskExist) {
            for(int i=indexTask; i<tasksCount-1;i++) {
                tasks[i] = tasks[i+1];
            }
            tasksCount--;
        }
    }
    public static void addprojects(String project) {
        boolean hasCapacityForNewprojects = projectsCount < projects.length;
        if (hasCapacityForNewprojects) {
            projects[projectsCount] = project;
            projectsCount++;
        }
    }

    public static void removeprojects(int indexprojects) {
        boolean isprojectsExist = indexprojects < projectsCount;
        if (isprojectsExist) {
            for(int i=indexprojects; i<projectsCount-1;i++) {
                projects[i] = projects[i+1];
            }
            projectsCount--;
        }
    }

    public static void displayprojects() {
        System.out.println("List of projects: ");
        for (int i=0; i<projectsCount;i++) {
            System.out.println(projects[i]);
        }
    }


    public static void displayTasks() {
        System.out.println("List of tasks: ");
        for (int i=0; i<tasksCount;i++) {
            System.out.println(tasks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radix;
        boolean isApplicationRun = true;
        while(isApplicationRun) {
            displayMenu();
            System.out.print("Type number to choose option: ");
            radix = scanner.nextInt();

            switch(radix) {
                case 1:
                    System.out.println("Podaj nazwę zadania do dodania: ");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Podaj index zadania do usunięcia: ");
                    int index = scanner.nextInt();
                    removeTask(index);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 6:
                    displayprojects();
                case 3:
                    System.out.println("Podaj nazwę projektu do projektu: ");
                    String projects = scanner.next();
                    addprojects(projects);
                case 4:
                    System.out.println("Podaj nazwę projektu do do usuniecia: ");
                    int indexprojects = scanner.nextInt();
                    removeprojects(indexprojects);
                case 0:
                    isApplicationRun=false;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    break;
            }
        }

    }
}