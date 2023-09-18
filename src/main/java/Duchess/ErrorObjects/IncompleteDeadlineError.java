package Duchess.ErrorObjects;

import Duchess.TaskObjects.Deadline;

public class IncompleteDeadlineError extends IncompleteTaskError{
    public IncompleteDeadlineError(String message, Deadline task){
        super(message, task);
    }

    public void HandleError(){
        System.out.println("Error: " + this.getMessage());
    }
    
}
