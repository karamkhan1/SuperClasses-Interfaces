public class ResidentialCarGarage extends Building{

    /** Number of cars accommodated */
    private int cars;

    /** Default constructor */
    public ResidentialCarGarage() {
        super("garage");
    }

    /**
     * Describe car space
     */
    public void parking() {
        String noun = (this.cars > 1) ? "cars" : "car";
        System.out.printf("\nThis %s can accommodate %d %s.",
                this.buildingDescription, this.cars, noun);
    }

    /**
     * Method returns the number length comparison of the cars
     * contained in the garage.
     * @param garage - garage of comparison
     * @return compareGauge - Positive means occupancy is larger,
     *                        equals means occupancy is same length,
     *                        negative means occupancy is lesser.
     */
    public int compareTo(ResidentialCarGarage garage) {
        int compareGauge = 0;
        if (this.cars > garage.cars) {
            compareGauge = 1;
        }
        else if (this.cars < garage.cars) {
            compareGauge = -1;
        }
        return compareGauge;
    } // method compareTo
}