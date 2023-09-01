public class MarkCommand extends Command {
    private int taskIndex;

    public MarkCommand(int taskIndex) {
        this.taskIndex = taskIndex;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        if (taskIndex < 0 || taskIndex >= taskList.getTaskCount()) {
            throw new DukeException("Invalid task index.");
        }

        try {
            Task taskToMark = taskList.getTasks().get(taskIndex);

            if (!taskToMark.isDone) {
                taskToMark.isCompleted();
                ui.showTaskMarked(taskToMark);
                storage.saveTask(taskList.getTasks());
            } else {
                throw new DukeException("This task is already marked as done.");
            }
        } catch (IndexOutOfBoundsException e) {
            throw new DukeException("Task index is out of range!");
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }
}