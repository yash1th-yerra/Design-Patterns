package com.designpatters.structural;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 1, "Oak", "Green", "Rough");
        forest.plantTree(2, 2, "Pine", "Green", "Smooth");
        forest.plantTree(3, 3, "Oak", "Green", "Rough"); // This will reuse the existing "Oak" tree type

        forest.displayTrees();
    }
}
