import java.util.Objects;

public class BigBuilding extends Building implements Describable, Nameable {

    private String name;
    private LocationPart locationPartFirst;
    private LocationPart locationPartSecond;
    private SubjectType subjectType;

    public BigBuilding(String name, LocationPart locationPartFirst, LocationPart locationPartSecond, SubjectType subjectType) {
        super(name);
        this.name = name;
        this.locationPartFirst = locationPartFirst;
        this.locationPartSecond = locationPartSecond;
        this.subjectType = subjectType;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public LocationPart getLocationPartFirst() {
        return locationPartFirst;
    }

    public LocationPart getLocationPartSecond() {
        return locationPartSecond;
    }

    @Override
    public String describe() {
        return ("Это доступное для нас строение, имеющие фасад и терассы, фасадом обращено на запад, терассами спускается ко льду.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigBuilding that = (BigBuilding) o;
        return Objects.equals(name, that.name) &&
                locationPartFirst == that.locationPartFirst &&
                locationPartSecond == that.locationPartSecond &&
                subjectType == that.subjectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, locationPartFirst, locationPartSecond, subjectType);
    }

    @Override
    public String toString() {
        return "BigBuilding{" +
                "name='" + name + '\'' +
                ", locationPartFirst=" + locationPartFirst +
                ", locationPartSecond=" + locationPartSecond +
                ", subjectType=" + subjectType +
                '}';
    }

}
