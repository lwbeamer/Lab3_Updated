import java.util.Objects;

public class Action implements Describable {
    private String subject;
    private String action;
    private String description;
    private String object;

    public Action(String subject, String action, String description, String object) {
        this.subject = subject;
        this.action = action;
        this.description = description;
        this.object = object;
    }

    public Action(String subject, String action, String description) {
        this.subject = subject;
        this.action = action;
        this.description = description;
    }


    @Override
    public String describe() {
        if (object != null)
            return (description + " " + subject + " " + action + " " + object);
        else if (description != "")
            return (subject + " " + action + " " + description);
        else
            return (subject + " " + action);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action1 = (Action) o;
        return Objects.equals(subject, action1.subject) &&
                Objects.equals(action, action1.action) &&
                Objects.equals(description, action1.description) &&
                Objects.equals(object, action1.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, action, description, object);
    }

    @Override
    public String toString() {
        if (object != null) {
            return "Action{" +
                    "subject='" + subject + '\'' +
                    ", action='" + action + '\'' +
                    ", description='" + description + '\'' +
                    ", object='" + object + '\'' +
                    '}';
        } else {
            return "Action{" +
                    "subject='" + subject + '\'' +
                    ", action='" + action + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public String getSubject() {
        return subject;
    }

    public String getAction() {
        return action;
    }

    public String getDescription() {
        return description;
    }

    public String getObject() {
        return object;
    }
}
