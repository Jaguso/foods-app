/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/17/19 5:24 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Meals {

    @SerializedName("meals")
    @Expose
    private List<Meal> meals = null;
    public  List<Meal> getMeals() {
        return  meals;
    }
    public  void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public class Meal {
        /*
         * TODO 9 Paste the generated results
         *
         * Paste the generated results Level 2 (Meal Item) from -
         * http://www.jsonschema2pojo.org/
         */
    }
}
