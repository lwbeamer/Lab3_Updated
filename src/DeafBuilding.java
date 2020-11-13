import java.util.Objects;

public class DeafBuilding extends Building implements Describable, Nameable {

    private String name;
    private SubjectType subjectTypeFirst;
    private SubjectType subjectTypeSecond;
    private LocationPart locationPart;
    private int margin;

    public DeafBuilding(String name, SubjectType subjectTypeFirst, SubjectType subjectTypeSecond, LocationPart locationPart, int margin) {
        super(name);
        this.name = name;
        this.subjectTypeFirst = subjectTypeFirst;
        this.subjectTypeSecond = subjectTypeSecond;
        this.locationPart = locationPart;
        this.margin = margin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        return ("Расстояние от этой постройки до единственного отверстия: " + margin + " футов.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeafBuilding that = (DeafBuilding) o;
        return margin == that.margin &&
                Objects.equals(name, that.name) &&
                subjectTypeFirst == that.subjectTypeFirst &&
                subjectTypeSecond == that.subjectTypeSecond &&
                locationPart == that.locationPart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subjectTypeFirst, subjectTypeSecond, locationPart, margin);
    }

    @Override
    public String toString() {
        return "DeafBuilding{" +
                "name='" + name + '\'' +
                ", subjectTypeFirst=" + subjectTypeFirst +
                ", subjectTypeSecond=" + subjectTypeSecond +
                ", locationPart=" + locationPart +
                ", margin=" + margin +
                '}';
    }

    public SubjectType getSubjectTypeFirst() {
        return subjectTypeFirst;
    }

    public SubjectType getSubjectTypeSecond() {
        return subjectTypeSecond;
    }

    public LocationPart getLocationPart() {
        return locationPart;
    }

    public int getMargin() {
        return margin;
    }
}
