package org.geekhub.hw3.orcostat.model;

import java.util.Arrays;

import static java.util.Objects.isNull;

public class SimpleCollection implements Collection {
    private Object[] data;

    public SimpleCollection() {
        this.data = new Object[0];
    }

    public SimpleCollection(Object ... values) {
        this();

        for (Object value : values) {
            this.add(value);
        }
    }

    public void add(Object value) {
        if (isNull(value)) {
            return;
        }

        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = value;
    }

    public int size() {
        return data.length;
    }

    public Object[] getElements() {
        return Arrays.copyOf(data, data.length);
    }
}
