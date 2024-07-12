package com.designpatters.structural;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<TreeContext> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        TreeContext tree = new TreeContext(x, y, treeType);
        trees.add(tree);
    }

    public void displayTrees() {
        for (TreeContext tree : trees) {
            tree.display();
        }
    }
}
