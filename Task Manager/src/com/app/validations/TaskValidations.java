package com.app.validations;

import static java.time.LocalDate.parse;
import com.app.status.Status;
import com.app.task.Task;

public class TaskValidations {
	public static Task validateInputs(String taskName, String description, String taskDate, String status,
			boolean active) {
		Status type = validateStatus(status);
		return new Task(taskName, description, parse(taskDate), type, active);
	}

	public static Status validateStatus(String status) {
		return Status.valueOf(status.toUpperCase());
	}
}
