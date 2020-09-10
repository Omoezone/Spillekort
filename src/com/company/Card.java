package com.company;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private final Type value;
    private final Trumf trumf;

    Card(Type value, Trumf trumf){
        this.value = value;
        this.trumf = trumf;
    }

    @Override
    public int compareTo(Card o) {
        if (this.value != o.value) {
            return this.value.compareTo(o.value);
        } else {
            return this.trumf.compareTo(o.trumf);
        }
    }

    @Override
    public String toString() {
        return  value +
                " " + trumf;
    }
}
