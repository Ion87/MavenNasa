package provider;

/**
 * Created by Lidia on 15.03.2020.
 */
public class Asteroid {
    private String nameId;
    private Float diameter;
    private Float distanceKm;
    private boolean danger ;

    public Asteroid(String nameId, Float diameter, Float distanceKm, boolean danger) {
        super();
        this.nameId = nameId;
        this.diameter = diameter;
        this.distanceKm = distanceKm;
        this.danger = danger;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public Float getDiameter() {
        return diameter;
    }

    public void setDiameter(Float diameter) {
        this.diameter = diameter;
    }

    public Float getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(Float distanceKm) {
        this.distanceKm = distanceKm;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "nameId='" + nameId + '\'' +
                ", diameter=" + diameter +
                ", distanceKm=" + distanceKm +
                ", danger=" + danger +
                "}";
    }
}
