import java.util.Objects;

public class WallOpening extends Building implements Describable, Nameable {
    private String name;
    private int width;
    private int length;
    private SubjectType subjectType;

    public WallOpening(String name) {
        super(name);
        this.name = name;
    }

    public WallOpening(String name, SubjectType subjectType, int width, int length) {
        super(name);
        this.name = name;
        this.subjectType = subjectType;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        if (subjectType != null)
            return (name + " " + subjectType.getTranslate() + " шириной " + width + " футов, длиной " + length + " футов.");
        else
            return ("Это дырка в стене неопределённых размеров");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallOpening that = (WallOpening) o;
        return width == that.width &&
                length == that.length &&
                Objects.equals(name, that.name) &&
                subjectType == that.subjectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length, subjectType);
    }

    @Override
    public String toString() {
        if (subjectType != null) {
            return "WallOpening{" +
                    "name='" + name + '\'' +
                    ", width=" + width +
                    ", length=" + length +
                    ", subjectType=" + subjectType +
                    '}';
        } else {
            return "WallOpening{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

}
