package hashmap_and_hashfunction.implement_hashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Value for 'Three': " + map.get("Three"));
        System.out.println("Value for 'Five' (not present): " + map.get("Five"));

        map.remove("Two");
        System.out.println("After removing 'Two': ");
        map.display();
    }
}
