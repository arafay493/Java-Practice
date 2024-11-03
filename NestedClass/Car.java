package NestedClass;

public class Car {

    private int noOfDoors;

    public void repaire() {
        Tyre tyre = new Tyre();
    }

    private static class Tyre {

        private double width;
        private double height;
        private double pressure;
        private String material;

        public void inflate(double pressure) {
            // noOfDoors = 6; //todo: Non static cannot be accessed in static class
            this.pressure = pressure;
        }

    }
}
