import forest.Forest;

import java.awt.*;

public class Main {
    static int CANVAS_SIZE = 1000;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 4;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < TREES_TO_DRAW / TREE_TYPES; i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Oak", Color.GREEN, "Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Birch", Color.ORANGE.darker(), "Autumn Oak texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Spruce", Color.GREEN.darker(), "Maple tree texture stub");

            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Maple", Color.RED.darker(), "Maple tree texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES);
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}