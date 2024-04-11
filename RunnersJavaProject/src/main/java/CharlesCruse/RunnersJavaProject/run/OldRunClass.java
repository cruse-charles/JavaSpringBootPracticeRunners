package CharlesCruse.RunnersJavaProject.run;

import java.util.Objects;

public class OldRunClass {
    private String name;
    private String location;
    private String date;
    private String time;
    private String distance;
    private String description;

    public OldRunClass(String name, String location, String date, String time, String distance, String description) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.distance = distance;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDistance() {
        return distance;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldRunClass run = (OldRunClass) o;
        return Objects.equals(name, run.name) && Objects.equals(location, run.location) && Objects.equals(date, run.date) && Objects.equals(time, run.time) && Objects.equals(distance, run.distance) && Objects.equals(description, run.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, date, time, distance, description);
    }

    @Override
    public String toString() {
        return "Run{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", distance='" + distance + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
