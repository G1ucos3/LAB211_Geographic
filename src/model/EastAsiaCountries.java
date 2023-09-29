package model;

/**
 *
 * @author ASUS
 */
public class EastAsiaCountries extends Country {

    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%s%15s%15.1f%15s", this.getCountryCode(), this.getCountryName(),
                this.getTotalArea(), this.getCountryTerrain());
    }
}
