import java.util.Objects;

public class SurvivingBuilding extends Building implements Describable, Nameable {

    private String name;
    private SubjectType subjectType;

    public SurvivingBuilding(String name, SubjectType subjectType) {
        super(name);
        this.name = name;
        this.subjectType = subjectType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        return("Это уцелевшее здание баснословно древней эпохи");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurvivingBuilding that = (SurvivingBuilding) o;
        return Objects.equals(name, that.name) &&
                subjectType == that.subjectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectType);
    }

    @Override
    public String toString() {
        return "SurvivingBuilding{" +
                "name='" + name + '\'' +
                ", subjectType=" + subjectType +
                '}';
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

}
