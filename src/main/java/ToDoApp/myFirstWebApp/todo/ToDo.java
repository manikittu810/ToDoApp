package ToDoApp.myFirstWebApp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ToDo {
    private int id;
    private String userName;
    @Size(min = 5,message = "Enter atleast 5 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public ToDo(int id, String userName, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        description = description;
    }

    public LocalDate gettargetDate() {
        return targetDate;
    }

    public void settargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
