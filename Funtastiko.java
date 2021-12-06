import java.util.*;

public class Funtastiko {

    public static void main(String[] args) {

        Employees[] employees = {
            new Employees("Kiro Kirov", "cashier", 12345, 1, 1200),
            new Employees("Genadi Genadiev", "manager", 67899, 5, 2200),
            new Employees("Mincho Minechev", "worker", 121215, 0, 950)
        };

        for (Employees employee : employees) {
            System.out.println("Getting info from an Array of Objects: " + employee);
        }       System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12345, "Kiro Kirov");
        hashMap.put(67899, "Genadi Genadiev");
        hashMap.put(121215, "Mincho Minchev");

        System.out.println("Getting info from an Array of a Hash Map: " + hashMap);
        System.out.println(hashMap.containsValue("Kiro Kirov"));

        System.out.println();

        ArrayList<Merchandize> arrayMerchandizes = new ArrayList<Merchandize>();
        // better for storing + accessing data, HOWEVER it's slow for manipulation
        // automatically resizes itself

        LinkedList<Merchandize> linkedMerchandizes = new LinkedList<Merchandize>();
        // every element is a separate object with a data part and address part
        // due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays

        HashSet<Merchandize> hashSet = new HashSet<Merchandize>();
        //NO order + NO duplicates / uniqueness of data
        //Generate hashCode + equals() will override the default .equals method

        LinkedHashSet<Merchandize> linkedHashSet = new LinkedHashSet<Merchandize>();
        //Ordered + NO duplicates / uniqueness of data
        //Generate hashCode + equals() will override the default .equals method

        arrayMerchandizes.add(new Merchandize("Tomato", 2.59, false));
        arrayMerchandizes.add(new Merchandize("Yogurth", 1.19, true));

        linkedMerchandizes.add(new Merchandize("Sushi", 15.59, false));
        linkedMerchandizes.add(new Merchandize("Beer", 2.19, true));

        hashSet.add(new Merchandize("Potatoes", 1.99, false));
        hashSet.add(new Merchandize("Wasabi", 4.99, true));

        linkedHashSet.add(new Merchandize("Bread", 1.29, false));
        linkedHashSet.add(new Merchandize("Waffle", 2.99, true));

        for (Merchandize arrMerchandise : arrayMerchandizes) {
            System.out.println("Merchandise from an ArrayList: " + arrMerchandise);
        }        System.out.println();


        for (Merchandize linkMerchendize : linkedMerchandizes) {
            System.out.println("Merchandise from a LinkedList: " + linkMerchendize);
        }        System.out.println();

        for (Merchandize hashSet1 : hashSet) {
            System.out.println("Merchandise from an HashSet: " + hashSet1);
        }        System.out.println();

        for (Merchandize linkedHashSet1 : linkedHashSet) {
            System.out.println("Merchandise from a LinkedHashSet: " + linkedHashSet1);
        }       System.out.println();



    }

}
