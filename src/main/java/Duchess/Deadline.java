package Duchess;

public class Deadline extends Task {

    private String deadline;

    public Deadline() {
        super();
    }

    public Deadline(String name, String deadline) {
        super(name);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.deadline + ")";
    }
}    