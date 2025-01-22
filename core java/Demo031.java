import java.util.HashSet;

class HashSetDemo1 {
    void HSetMethod() {
        // Using HashSet<Object> to hold any object type
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(444);
        hashSet.add("RAGHUPATHI");
        hashSet.add(9999.99);
        
        System.out.println(hashSet); // Prints the entire set

        for (Object x : hashSet) { // Iterating over each object in the set
            System.out.println(x); // Prints each element
        }
    }
}

public class Demo031 {
    public static void main(String[] args) {
        HashSetDemo1 obj = new HashSetDemo1();
        obj.HSetMethod();
    }
}
