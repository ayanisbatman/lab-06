package com.bariwala.listycity;

/**
 * This is a class that defines a City.
 * Each City has a name and a province associated with it.
 * <p>
 * This class implements the Comparable interface to allow
 * sorting of City objects by their city name.
 */
public class City implements Comparable<City> {

    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province the city belongs to.
     */
    private String province;

    /**
     * Constructs a City object with the specified city and province names.
     *
     * @param city     the name of the city
     * @param province the name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province the city belongs to.
     *
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city with another city based on the city name.
     *
     * @param city the city to compare with
     * @return a negative integer, zero, or a positive integer as this city name
     *         is lexicographically less than, equal to, or greater than the specified city name
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Checks if two City objects are equal based on their city and province names.
     *
     * @param o the object to compare
     * @return true if both cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.getCityName()) && province.equals(city1.getProvinceName());
    }

    /**
     * Returns a hash code value for the City based on city and province names.
     *
     * @return hash code of the City object
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

    /**
     * Returns a string representation of the city, including its province.
     *
     * @return a formatted string in the form "City, Province"
     */
    @Override
    public String toString() {
        return city + ", " + province;
    }
}
