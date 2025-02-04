import java.util.ArrayList;

public class CatRunner2 {
    public static void main(String[] args) {
        ArrayList<Cat2> cats = new ArrayList<Cat2>();
        Cat2 cat1 = new Cat2("Joey");
        Cat2 cat2 = new Cat2("Max");
        Cat2 cat3 = new Cat2("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        // ADD CODE HERE
        Cat2 cat4 = new Cat2("Toby");
        Cat2 replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);
        

        for (int i=0; i<cats.size(); i++) {
            String caps = (cats.get(i)).getName().toUpperCase();
            cats.get(i).setName(caps);
        }

        cats.add(new Cat2("SAM"));
        System.out.println(cats);
    }
}
