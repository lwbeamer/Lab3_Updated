import java.util.Objects;

public class MainChars implements Nameable {

    private String name;

    public MainChars(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainChars mainChars = (MainChars) o;
        return Objects.equals(name, mainChars.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MainChars{" +
                "name='" + name + '\'' +
                '}';
    }

}
