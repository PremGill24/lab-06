package com.premvee1.listycity;

import java.util.Objects;

/**
 * Represents a City with a name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Creates a new City.
     *
     * @param city     the city name
     * @param province the province name
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     *
     * @return city name
     */
    public String getCityName() {
        return city;
    }

    /**
     * Returns the province name.
     *
     * @return province name
     */
    public String getCityProvince() {
        return province;
    }

    /**
     * Compares cities by city name (alphabetical).
     *
     * @param other the other city
     * @return comparison result
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Two City objects are equal if they have the same city name and province.
     *
     * @param o other object
     * @return true if equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city)
                && Objects.equals(province, other.province);
    }

    /**
     * Hash code based on city name and province.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}

