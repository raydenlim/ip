package duke.task;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task.Task;

public class TaskTest {
    @Test
    public void testIsCompleted() {
        Task taskTest = new Task("test");
        taskTest.isCompleted();
        assertTrue(taskTest.checkIsDone());
    }

    @Test
    public void testIsNotCompleted() {
        Task taskTest = new Task("test");
        taskTest.isNotCompleted();
        assertFalse(taskTest.checkIsDone());
    }
}
