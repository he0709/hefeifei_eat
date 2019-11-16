package com.hefeifei.vo;


import java.util.List;


public class BuyerProductInfoVO {


    private String name;
    private Integer type;
    private List<FoodVO> foods;

    @Override
    public String toString() {
        return "BuyerProductInfoVO{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", foods=" + foods +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<FoodVO> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodVO> foods) {
        this.foods = foods;
    }
}
