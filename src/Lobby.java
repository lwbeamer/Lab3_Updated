import java.util.Objects;

public class Lobby extends Building implements Describable, Nameable {

    private String name;
    private LocationPart locationPartFirst;
    private LocationPart locationPartSecond;

    public LocationPart getLocationPartFirst() {
        return locationPartFirst;
    }

    public LocationPart getLocationPartSecond() {
        return locationPartSecond;
    }

    public Lobby(String name, LocationPart locationPartFirst, LocationPart locationPartSecond) {
        super(name);
        this.name = name;
        this.locationPartFirst = locationPartFirst;
        this.locationPartSecond = locationPartSecond;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        return ("Это вестибюль с барельефными портретами и полом, выложенным сланцами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lobby lobby = (Lobby) o;
        return Objects.equals(name, lobby.name) &&
                locationPartFirst == lobby.locationPartFirst &&
                locationPartSecond == lobby.locationPartSecond;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, locationPartFirst, locationPartSecond);
    }

    @Override
    public String toString() {
        return "Lobby{" +
                "name='" + name + '\'' +
                ", locationPartFirst=" + locationPartFirst +
                ", locationPartSecond=" + locationPartSecond +
                '}';
    }

}
