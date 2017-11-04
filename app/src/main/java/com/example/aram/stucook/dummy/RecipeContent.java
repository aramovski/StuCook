package com.example.aram.stucook.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RecipeContent {

    /**
     * An array of recipe items.
     */
    public static final List<RecipeItem> ITEMS = new ArrayList<RecipeItem>();

    /**
     * A map of recipe items, by ID.
     */
    public static final Map<String, RecipeItem> ITEM_MAP = new HashMap<String, RecipeItem>();

    static {
        // Add some recipes.
        addItem(createRecipeItem(1, "Linsen Dish", "Original Indian Food"));
        addItem(createRecipeItem(2, "Aubergine Auflauf", "Bella Italia"));
        addItem(createRecipeItem(3, "Pasta con Funghi", "By the famous Gennaro Contaldo!"));
    }



    private static void addItem(RecipeItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }



    private static RecipeItem createRecipeItem(int position, String title, String description) {

        return new RecipeItem(String.valueOf(position), title, description);
    }

    /**
     * A recipe item representing a piece of content.
     */
    public static class RecipeItem {

        public final String id;
        public final String title;
        public final String description;

        public RecipeItem(String id, String title, String description) {
            this.id = id;
            this.title = title;
            this.description = description;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
