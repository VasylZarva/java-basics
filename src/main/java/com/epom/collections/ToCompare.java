package com.epom.collections;

import java.io.Serializable;

/**
 * @author Vasyl Zarva.
 */
public class ToCompare implements Comparable<ToCompare>, Serializable {


    private int id;
    private String name;
    private int age;

    public ToCompare(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(final ToCompare that) {
        if (that.age > this.age)
            return -1;
        if (that.age <  this.age)
            return 1;

        return that.name.compareTo(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("[id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(']');
        return sb.toString();
    }
}
