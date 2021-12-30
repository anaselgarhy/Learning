package firstPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap_1_search {
    public static void main(String[] args){
        ArrayList<String> LestHer = new ArrayList<String>();
        LestHer.add("Here is Anas");
        LestHer.add("Here we go");
        LestHer.add("Android here");

        ArrayList<String> LestJava = new ArrayList<>();
        LestJava.add("Java and oop");
        LestJava.add("Java work for android");
        LestJava.add("Java is very fast");

        ArrayList<String> LestIOS = new ArrayList<>();
        LestIOS.add("Iphone run on IOS");
        LestIOS.add("New version of ios available");
        LestIOS.add("All today news about ios");

        // Create hash map
        HashMap<String, ArrayList<String>> search = new HashMap<String, ArrayList<String>>();
        // Add keys and objects
        search.put("her", LestHer);
        search.put("java", LestJava);
        search.put("ios", LestIOS);

        System.out.println(search.get("java"));

    }
}
