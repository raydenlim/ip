package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import ui.Ui;


public class ParserTest {
    @Test
    public void testByeCommandExecution() throws DukeException {
        Ui ui = new Ui();

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the showBye method
        ui.showBye();
        String printedOutput = outputStream.toString().trim();
        assertEquals("Bye. Hope to see you again soon!", printedOutput);

        // Reset System.out to its original state
        System.setOut(System.out);
    }

    @Test
    public void testEchoCommand() throws DukeException {
        Ui ui = new Ui();

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the showEcho method
        ui.showEcho("Hello, world!");
        String printedOutput = outputStream.toString().trim();
        assertEquals("Echo: Hello, world!", printedOutput);

        // Reset System.out to its original state
        System.setOut(System.out);
    }
}
