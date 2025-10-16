package com.bariwala.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of City objects.
 * It allows adding, deleting, and retrieving cities in sorted order.
 */
public class CityList {

    /**
     * The list that holds City objects.
     */
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if it does not already exist.
     *
     * @param city This is a candidate city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list");
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities according to their names.
     *
     * @return the sorted list of City objects
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }

    /**
     * This checks whether a city exists in the list.
     *
     * @param city The city to check
     * @return true if the city exists in the list, otherwise false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This removes a city from the list if it exists.
     *
     * @param city The city to remove
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list");
        }
        cities.remove(city);
    }

    /**
     * This returns the number of cities currently in the list.
     *
     * @return the number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
