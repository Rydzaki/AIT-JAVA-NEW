package practice.map;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {
    public static void main(String[] args) {


        System.out.println("Group list with gender(sex)");

        Map<String, String> groupMapGender = new HashMap<>();

//        groupMapGender.put("Leonid", "male");
//        groupMapGender.put("Irina", "female");
//        groupMapGender.put("Andrey1", "male");
//        groupMapGender.put("Viktor", "male");
//        groupMapGender.put("Anton", "male");
//        groupMapGender.put("Sergey", "male");
//        groupMapGender.put("Lubov", "female");
//        groupMapGender.put("Evgenii", "female");
//        groupMapGender.put("Leonid", "male");
//        groupMapGender.put("Kirill", "male");
//        groupMapGender.put("Olesia", "female");
//        groupMapGender.put("Galina", "female");
//        groupMapGender.put("Andreas", "male");
//        groupMapGender.put("Sergei", "male");
//        groupMapGender.put("Elena", "female");
//        groupMapGender.put("Tatyana", "female");
//        groupMapGender.put("Vladislava", "female");
//        groupMapGender.put("Iryna", "female");
//        groupMapGender.put("Sasha", "male");
        groupMapGender.put("Leonid", "Male");
        groupMapGender.put("Leonid", "Male");
        groupMapGender.put("Kirill", "Male");
        groupMapGender.put("Olesia", "Female");
        groupMapGender.put("Galina", "Female");
        groupMapGender.put("Andreas", "Male");
        groupMapGender.put("Sergei", "Male");
        groupMapGender.put("Elena", "Female");
        groupMapGender.put("Victor", "Male");
        groupMapGender.put("Tatyana", "Female");
        groupMapGender.put("Vladislava", "Female");
        groupMapGender.put("Iryna", "Female");
        groupMapGender.put("Olga", "Female");
        groupMapGender.put("Sasha", "Male");

        int women = 0;
        for(String name : groupMapGender.keySet()) {
            if (groupMapGender.get(name).equals("Female")) {
                women++;
            }
        }
            int men = 0;
        for(String name : groupMapGender.values()){
            if(name.equals("Male")){
                men++;
            }
        }
        System.out.println("Women = "+ women);
        System.out.println("Men = " + men);

    }
}
