package com.app.tester;

import static com.app.utils.TaskUtils.addTask;
import static com.app.utils.TaskUtils.deleteTask;
import static com.app.utils.TaskUtils.displayPendingTasks;
import static com.app.utils.TaskUtils.displayTasks;
import static com.app.utils.TaskUtils.displayTodaysPendingTasks;
import static com.app.utils.TaskUtils.populateList;
import static com.app.utils.TaskUtils.sortedTasks;

import java.util.List;
import java.util.Scanner;

import com.app.task.Task;

public class TaskManagerApp {

	public static void main(String[] args) {
		int choice;
		try (Scanner sc = new Scanner(System.in)) {
			List<Task> taskList = populateList();
			do {
				System.out.println("Menu List:");
				System.out.println("1. Add a new task.");
				System.out.println("2. Delete a task.");
				System.out.println("3. Update task status.");
				System.out.println("4. Display all pending tasks.");
				System.out.println("5. Display all pending tasks for today.");
				System.out.println("6. Display all tasks sorted by task date");
				System.out.println("7. Display all tasks");
				System.out.println("0. Exit.");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					addTask(taskList);
					break;

				case 2:
					deleteTask(taskList);
					break;

//				case 3:
//					updateTask(taskList);

				case 4:
					displayPendingTasks(taskList);
					break;

				case 5:
					displayTodaysPendingTasks(taskList);
					break;

				case 6:
					sortedTasks(taskList);
					break;

				case 7:
					displayTasks(taskList);
					break;

				case 0:
					System.out.println("See you again! Bye!");
					break;

				}
			} while (choice != 0);
		}

	}

}
