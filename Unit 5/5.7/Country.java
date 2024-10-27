public class Country {
    public static int totalPop;
    public static int numCountries;

    private int population;

    public Country(int population) {
        this.population = population;
        totalPop += population;
        numCountries++;
    }

    public static double getAveragePopulation() {
        return totalPop / (0.0 + numCountries);
    }
}
