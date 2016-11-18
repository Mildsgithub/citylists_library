package com.xm.pc.city_library;

/**
 * Created by PC on 2016/11/18.
 */
public class CityBean {
    private String name;
    private String firstAlpha;

    public String getCityName() {
        return name;
    }

    public void setCityName(String cityName) {
        name = cityName;
    }

    public String getNameSort() {
        return firstAlpha;
    }

    public void setNameSort(String nameSort) {
        firstAlpha = nameSort;
    }
}
