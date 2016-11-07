package com.epom.enums;

/**
 * @author Vasyl Zarva.
 */
public enum Month {
    JANUARY(1, 31) {
        @Override
        public void getMyName() {
            System.out.println("My name is JANUARY");
        }
    },
    FEBRUARY(2, 28) {
        @Override
        public void getMyName() {
            System.out.println("My name is FEBRUARY");
        }
    },
    MARCH(3, 31) {
        @Override
        public void getMyName() {
            System.out.println("My name is MARCH");
        }
    },
    APRIL(4, 30) {
        @Override
        public void getMyName() {
            System.out.println("My name is APRIL");
        }
    };

    private final int id;
    private final int dayNumber;

    Month(final int id, final int dayNumber) {
        this.id = id;
        this.dayNumber = dayNumber;
    }

    public int getId() {
        return id;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public abstract void getMyName();
}
