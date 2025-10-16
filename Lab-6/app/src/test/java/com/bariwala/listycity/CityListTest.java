package com.bariwala.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a test class for CityList.
 * It tests the add, delete, hasCity, and countCities methods.
 */
class CityListTest {

    /**
     * Creates a mock CityList containing one default City.
     *
     * @return a mock CityList object
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    /**
     * Creates a mock City object for testing.
     *
     * @return a mock City object
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * Tests adding cities to the list.
     */
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    /**
     * Tests that adding a duplicate city throws an exception.
     */
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta");
        assertThrows(IllegalArgumentException.class, () -> cityList.add(city));
    }

    /**
     * Tests whether the hasCity method correctly detects cities.
     */
    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = new City("Calgary", "Alberta");
        assertFalse(cityList.hasCity(city));
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
    }

    /**
     * Tests the delete method by adding and removing a city.
     */
    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = new City("Vancouver", "British Columbia");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    /**
     * Tests whether delete throws an exception when deleting a city that doesn't exist.
     */
    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();
        City city = new City("Toronto", "Ontario");
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(city));
    }

    /**
     * Tests the countCities method to verify correct count.
     */
    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        cityList.add(new City("Regina", "Saskatchewan"));
        assertEquals(2, cityList.countCities());
    }
}
