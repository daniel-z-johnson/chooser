package com.exercise.self.model;

import java.util.List;

/**
 * Created by prime23 for self exercise
 */
public class Choices {

    private int flips;
    private List<String> items;

    public Choices() {
    }

    public int getFlips() {
        return flips;
    }

    public void setFlips(int flips) {
        this.flips = flips;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Choices{" +
                "flips=" + flips +
                ", items=" + items +
                '}';
    }
}
