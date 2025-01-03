package shop;
import java.util.*;

public class Category {
    private String name;
    private Map<String, List<String>> categories;

    public Category() {
        categories = new HashMap<>();

        // Добавляем категории и продукты
        categories.put("Фрукты", Arrays.asList("Бананы", "Апельсины", "Яблоки"));
        categories.put("Овощи", Arrays.asList("Картошка", "Огурцы", "Помидоры"));
        categories.put("Мясо", Arrays.asList("Курица", "Свинина", "Индейка", "Говядина"));
    }
    public List<String> getProductsByCategory(String category) {
        return categories.getOrDefault(category, Collections.emptyList());
    }

    public void addCategory(String category) {
        categories.putIfAbsent(category, new ArrayList<>());
    }

    public void addProductToCategory(String category, String product) {
        categories.computeIfAbsent(category, k -> new ArrayList<>()).add(product);
    }

    public String toString() {
        String result = "";
        for (Map.Entry<String, List<String>> entry : categories.entrySet()) {
            result += entry.getKey() + ": " + String.join(", ", entry.getValue()) + "\n";
        }
        return result;
    }

    public String getCategoryForProduct(String product) {
        for (Map.Entry<String, List<String>> entry : categories.entrySet()) {
            if (entry.getValue().contains(product)) {
                return entry.getKey();
            }
        }
        return "Неизвестная категория";
    }

    public static void main(String[] args) {
        Category category = new Category();
//        category.displayCategories();

        category.addCategory("Канцелярия");
        category.addProductToCategory("Канцелярия", "Бумага А4");
        category.addProductToCategory("Канцелярия", "Ручка шариковая");

        System.out.println(category.toString());
    }
}
