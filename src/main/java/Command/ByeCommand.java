package command;
import duke.DukeException;
import storage.Storage;
import tasklist.TaskList;
import ui.Ui;

/**
 * The `ByeCommand` class represents a command to exit the Duke application gracefully.
 * It extends the `Command` class and is responsible for displaying a goodbye message
 * to the user and saving the task list to storage.
 * This class encapsulates the behavior of exiting the application.
 * When this command is executed, it signals the application to terminate.
 *
 * @author raydenlim
 * @version 0.0.0
 */
public class ByeCommand extends Command {
    /**
     * Executes the "Bye" command by displaying a goodbye message to the user and saving the task list to storage.
     *
     * @param taskList The task list (not used in this command).
     * @param ui       The user interface for displaying the goodbye message.
     * @param storage  The storage component for saving the task list (optional).
     * @return A goodbye message.
     * @throws DukeException An exception may be thrown if there is an error executing
     *      the command (e.g., storage error).
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        if (storage != null) {
            storage.saveTask(taskList.getTasks());
        }
        return ui.showBye();
    }
}
