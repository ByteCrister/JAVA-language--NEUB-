import java.util.*;
public class HashMap_1 {
    public static void main(String[] args) {
        //key-type   value-type
        HashMap<String, Integer>map=new HashMap<>();

        //insert
        map.put("Mobile",100);
        map.put("Laptop",200);
        map.put("PC",300);
        map.put("Car",400);
        
        System.out.println(map);
        //re insert
        map.put("Car",800);
        System.out.println(map);

        //search-key
        if(map.containsKey("Laptop")){
            System.out.println("Key exits");
        }else{
            System.out.println("Key does not exits");
        }

        //search-value
        System.out.println(map.get("Car"));
        System.out.println(map.get("Ac"));

        //Another-type of loop iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e+" ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove
        System.out.println(map);
        map.remove("PC");
        System.out.println(map);
    }
}
