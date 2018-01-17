class TestCoffeeSize {
      CoffeeSize2 size;
      public static void main(String[] args){  
            for(CoffeeSize2 cs: CoffeeSize2.values()){
                  System.out.println(cs+ " " +cs.getOunces());
            }
      }
}