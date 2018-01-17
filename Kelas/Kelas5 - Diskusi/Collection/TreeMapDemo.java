    import java.util.Map;  
    import java.util.TreeMap;  
    public class TreeMapDemo {  
        public static void main(String[] args) {  
            //Creating Map of Fruit and price of it  
            Map<String, Integer> tMap = new TreeMap<String, Integer>();  
            tMap.put("Orange", 12);  
            tMap.put("Apple", 25);  
            tMap.put("Mango", 45);  
            tMap.put("Chicku", 10);  
            tMap.put("Banana", 4);  
            tMap.put("Strawberry", 90);  
            System.out.println("Sorted Fruit by Name: "+tMap);  
            tMap.put("Pinapple", 87);  
            tMap.remove("Chicku");  
            System.out.println("Updated Sorted Fruit by Name: "+tMap);  
        }  
    }  