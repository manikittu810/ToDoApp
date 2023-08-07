package ToDoApp.myFirstWebApp.todo;

import java.time.LocalDate;

public class ToDo {
    private int id;
    private String userName;
    private String Description;
    private LocalDate targetDAte;
    private boolean done;

    public ToDo(int id, String userName, String description, LocalDate targetDAte, boolean done) {
        super();
        this.id = id;
        this.userName = userName;
        Description = description;
        this.targetDAte = targetDAte;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getTargetDAte() {
        return targetDAte;
    }

    public void setTargetDAte(LocalDate targetDAte) {
        this.targetDAte = targetDAte;
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
                ", Description='" + Description + '\'' +
                ", targetDAte=" + targetDAte +
                ", done=" + done +
                '}';
    }
}
