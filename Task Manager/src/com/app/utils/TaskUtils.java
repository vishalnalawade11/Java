package com.app.utils;

import static com.app.status.Status.COMPLETED;
import static com.app.status.Status.INPROGRESS;
import static com.app.status.Status.PENDING;
import static com.app.validations.TaskValidations.validateInputs;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.app.status.Status;
import com.app.task.Task;

public class TaskUtils {
	// Method to create the sample data.
	static Scanner sc = new Scanner(System.in);

	public static List<Task> populateList() {
		List<Task> tList = new ArrayList<>();
		tList.add(new Task("Study", "Revise the Java code and do handson", parse("2024-04-04"), PENDING, true));
		tList.add(new Task("Play Cricket", "Play Cricket with friends for one hour", parse("2024-01-01"), COMPLETED,
				true));
		tList.add(
				new Task("Wash Clothes", "Keep the clothes in Washing machine", parse("2024-04-25"), INPROGRESS, true));
		return tList;
	}

	public static void addTask(List<Task> tList) {
		System.out.println("Enter Task Name, Description, Task Date, Status, boolean active");
		Task task = validateInputs(sc.nextLine(), sc.nextLine(), sc.next(), sc.next(), sc.nextBoolean());
		tList.add(task);
		System.out.println("Task added successfully!");
		System.out.println(task);
	}

	public static void deleteTask(List<Task> tList) {
		Status c = COMPLETED;
		List<Task> remList = tList.stream().filter(t -> (t.getStatus().equals(c)) && t.isActive() == false)
				.collect(Collectors.toList());
		tList.removeAll(remList);
		System.out.println(remList.size() + " completed tasks are removed.");
	}

	public static void displayTasks(List<Task> tList) {
		tList.forEach(t -> System.out.println(t));
	}

//	public static void updateTask(List<Task> tList) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the ID of task to update");
//		int id = sc.nextInt();
//		Task toUpdate = tList.stream().filter(t -> Integer.parseInt(t.getTaskId()) == id).findFirst().orElse(null);
//	}

	public static void displayPendingTasks(List<Task> tList) {
		List<Task> pendingTasks = tList.stream().filter(t -> t.getStatus().equals(PENDING))
				.collect(Collectors.toList());
		pendingTasks.forEach(t -> System.out.println(t));
	}

	public static void displayTodaysPendingTasks(List<Task> tList) {
		List<Task> pendingTasks = tList.stream().filter(t -> t.getStatus().equals(PENDING))
				.filter(t -> t.getTaskDate().equals(LocalDate.now())).collect(Collectors.toList());
		pendingTasks.forEach(t -> System.out.println(t));
	}

	public static void sortedTasks(List<Task> tList) {
		tList.stream().sorted((t1, t2) -> t1.getTaskDate().compareTo(t2.getTaskDate())).forEach(System.out::println);
	}
}
