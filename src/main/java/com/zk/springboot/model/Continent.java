package com.zk.springboot.model;

/**
 * @author zpf
 * @date 2019/1/11 16:51
 */
public enum Continent {

    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_America("North America"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");
    private String value;
    Continent(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}
