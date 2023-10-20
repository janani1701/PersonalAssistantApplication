# Task Management System

This is a simple Task Management System implemented in Java, designed to allow users to add tasks to a priority queue based on their priority levels, process tasks in order of priority, view tasks, and exit the system. The core data structure used in this system is the `PriorityQueue`, which ensures that tasks are processed in descending order of priority.

## Table of Contents
- [Introduction](#introduction)
- [Usage](#usage)
- [Features](#features)
- [Implementation Details](#implementation-details)

## Introduction

The Task Management System is a console-based application that provides the following functionality:

1. **Add Task to Priority Queue**: Users can add tasks to the system by providing a task description and a priority level on a scale of 1 to 10.

2. **Process Tasks from Priority Queue**: Users can process tasks from the priority queue. The tasks are processed in descending order of priority.

3. **View Tasks**: Users can view the tasks in the priority queue, listing them in descending order of priority.

4. **Exit**: Users can exit the Task Management System.

The core data structure used for managing tasks is a `PriorityQueue`, where tasks are ordered by their priority levels.

## Usage

To use the Task Management System, follow these steps:

1. Clone the repository to your local machine.

2. Compile the Java files using the `javac` command:
```
javac Task.java
javac TaskQueue.java
javac TaskManagementApp.java
```


3. Run the application:
```
java TaskManagementApp
```

4. Follow the on-screen instructions to interact with the Task Management System.

## Features

- **Priority Queue**: The system utilizes a `PriorityQueue` to manage tasks based on their priority levels. Tasks with higher priority values are processed first.

- **Add and Process Tasks**: Users can add tasks with descriptions and priority levels, and they can process tasks in descending order of priority.

- **View Tasks**: Users can view the tasks in the priority queue, providing transparency into the pending tasks.

- **Input Validation**: The system includes input validation to ensure that task descriptions are not empty and priority levels are within the valid range.

## Implementation Details

### Task Management System

The Task Management System consists of three main classes:

- `Task`: Represents a task with a description and a priority level.

- `TaskQueue`: Manages the priority queue of tasks, allowing users to add, process, and view tasks.

- `TaskManagementApp`: The main application class that provides a user-friendly interface for interacting with the system.

### Priority Queue

The priority queue is implemented using a `PriorityQueue` from the Java Standard Library. It is customized to order tasks by their priority levels in descending order, ensuring high-priority tasks are processed first.

