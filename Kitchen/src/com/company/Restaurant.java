package com.company;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Cook> cookList =  new ArrayList<>();
    private List<Helper> helperList =  new ArrayList<>();
    private Chef chef;

    public Restaurant() {

    }

    public List<Cook> getCookList() {
        return cookList;
    }

    public void setCookList(List<Cook> cookList) {
        this.cookList = cookList;
    }

    public List<Helper> getHelperList() {
        return helperList;
    }

    public void setHelperList(List<Helper> helperList) {
        this.helperList = helperList;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void addHelper(Helper helper){
        helperList.add(helper);
    }

    public void addCook(Cook cook){
        cookList.add(cook);
    }

}
