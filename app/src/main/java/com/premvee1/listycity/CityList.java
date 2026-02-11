package com.premvee1.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages a list of City objects.
 */
public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it is not already present.
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns true if the given city is in the list.
     *
     * @param city the city to check
     * @return true if present, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     *
     * @param city the city to delete
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns how many cities are currently in the list.
     *
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted copy of the city list (sorted by city name).
     *
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> copy = new ArrayList<>(cities);
        Collections.sort(copy);
        return copy;
    }
}

