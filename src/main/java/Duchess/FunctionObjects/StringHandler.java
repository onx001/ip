package Duchess.FunctionObjects;

import Duchess.TextObjects.Constants;
import Duchess.TaskObjects.Event;
import Duchess.TaskObjects.Deadline;
import Duchess.TaskObjects.ToDo;


/**
 * Class to handle string processing for tasks.
 */
public class StringHandler {

    /**
     * Empty constructor.
     */
    public StringHandler() {
    }

    /**
     * Processes the string to initialise an Event task.
     * @param eventString
     * @return Event object
     */
    public Event processEventString(String eventString){
        String[] processedString = new String[3];
        
        String eventName = eventString.substring(6, eventString.indexOf(Constants.eventStartTime) - 1);
        String eventStartTime = eventString.substring(eventString.indexOf(Constants.eventStartTime) + 
                Constants.eventStartTime.length() + 1, eventString.indexOf(Constants.eventEndTime) - 1);
        String eventEndTime = eventString.substring(eventString.indexOf(Constants.eventEndTime) + Constants.eventEndTime.length() + 1);

        processedString[0] = eventName;
        processedString[1] = eventStartTime;
        processedString[2] = eventEndTime;

        Event newEvent = new Event(eventName, eventStartTime, eventEndTime);
        return newEvent;
    }

    /**
     * Processes the string to initialise a Deadline task.
     * @param deadlineString
     * @return Deadline object
     */
    public Deadline processDeadlineString(String deadlineString){
        String[] processedString = new String[2];
        
        String deadlineName = deadlineString.substring(9, deadlineString.indexOf(Constants.deadlineTime) - 1);
        String deadlineTime = deadlineString.substring(deadlineString.indexOf(Constants.deadlineTime) + Constants.deadlineTime.length() + 1);

        processedString[0] = deadlineName;
        processedString[1] = deadlineTime;

        Deadline newDeadline = new Deadline(deadlineName, deadlineTime);
        return newDeadline;
    }

    /**
     * Processes the string to initialise a ToDo task.
     * @param toDoString
     * @return ToDo object
     */
    public ToDo processToDoString(String toDoString){
        
        String toDoName = toDoString.substring(5);

        ToDo newToDo = new ToDo(toDoName);
        return newToDo;
    }
    
}
