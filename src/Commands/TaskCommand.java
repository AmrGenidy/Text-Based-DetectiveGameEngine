package Commands;

import Core.GameContext;
import Core.TaskList;

public class TaskCommand implements Command {
    @Override
    public void execute(String[] args, GameContext context) {
        TaskList taskList = context.getTaskList(); // Assume GameContext has a getter for TaskList
        taskList.printTasks();
    }
}