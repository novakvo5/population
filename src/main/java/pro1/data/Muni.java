package pro1.data;

public class Muni
{
    public Muni(String name, String code, String districtName, String districtCode, int population, int menPopulation, int womenPopulation, double age, double menAge, double womenAge) {
        this.name = name;
        this.code = code;
        this.districtName = districtName;
        this.districtCode = districtCode;
        this.population = population;
        this.menPopulation = menPopulation;
        this.womenPopulation = womenPopulation;
        this.age = age;
        this.menAge = menAge;
        this.womenAge = womenAge;
    }

    private String name;
    private String code;
    private String districtName;
    private String districtCode;
    private int population;
    private int menPopulation;
    private int womenPopulation;
    private double age;
    private double menAge;
    private double womenAge;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public int getPopulation() {
        return population;
    }

    public int getMenPopulation() {
        return menPopulation;
    }

    public int getWomenPopulation() {
        return womenPopulation;
    }

    public double getAge() {
        return age;
    }

    public double getMenAge() {
        return menAge;
    }

    public double getWomenAge() {
        return womenAge;
    }
}
