import java.util.Objects;

public class Bridge extends Building implements Describable, Nameable {
    private String name;
    private SubjectType subjectType;
    private int marginBottom;

    public Bridge(String name, SubjectType subjectType, int marginBottom) {
        super(name);
        this.name = name;
        this.subjectType = subjectType;
        this.marginBottom = marginBottom;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        return subjectType.getTranslate() + " " + name + " располагался бы в " + marginBottom + " футах над " + LocationPart.ICECOVER.getTranslate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bridge bridge = (Bridge) o;
        return marginBottom == bridge.marginBottom &&
                Objects.equals(name, bridge.name) &&
                subjectType == bridge.subjectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectType, marginBottom);
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "name='" + name + '\'' +
                ", subjectType=" + subjectType +
                ", marginBottom=" + marginBottom +
                '}';
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public int getMarginBottom() {
        return marginBottom;
    }
}
