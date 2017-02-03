package com.jamesdube.laravelnewsapp.models;

import io.realm.RealmObject;

/**
 * Created by jdube on 2/3/17.
 */

public class Category extends RealmObject {

    private String name;

    public Category(String name){
        this.name = name;
    }

    public Category(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
