package com.fablesalive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RandomBag {
    private int capacity;
    private ArrayList<Integer> NumberPack;

    public List<Integer> getNumberPack() {
        return this.NumberPack;
    }

    public RandomBag() {
        throw new NotImplementedException();
    }

    public RandomBag(int _capacity) {
        this.capacity = _capacity;
        this.NumberPack = new ArrayList(Collections.nCopies(_capacity, Integer.valueOf(-1)));

        for(int i = 0; i < _capacity; ++i) {
            this.NumberPack.set(i, Integer.valueOf(this.NextUnique()));
        }

    }

    public int NextUnique() {
        int r;
        do {
            r = (int)(Math.random() * (double)this.capacity);
        } while(!this.isUnique(r));

        return r;
    }

    public boolean isUnique(int r) {
        boolean ret = true;

        for(int i = 0; i < this.NumberPack.size(); ++i) {
            if(((Integer)this.NumberPack.get(i)).intValue() == r) {
                ret = false;
                break;
            }
        }

        return ret;
    }
}
