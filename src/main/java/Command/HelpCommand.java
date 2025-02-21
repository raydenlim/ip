package command;
import storage.Storage;
import tasklist.TaskList;
import ui.Ui;

/**
 * The `HelpCommand` class represents a command to display a list of available commands and provide
 * help to the user in the Duke application.
 * It extends the `Command` class and is responsible for displaying a list of commands and their usage to the user.
 * This class encapsulates the behavior of showing available commands through the user interface.
 * It does not affect the task list or storage.
 *
 * @author raydenlim
 * @version 0.0.0
 */
public class HelpCommand extends Command {
    /**
     * Executes the "Help" command by displaying a list of available commands and their
     * usage to the user through the user interface.
     *
     * @param taskList The task list (not used in this command).
     * @param ui       The user interface for displaying the list of available commands.
     * @param storage  The storage component (not used in this command).
     * @return A message displaying a list of available commands.
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) {
        return ui.showCommands();
    }
}
