/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


      HashTable<String, Integer> stringIntegerHashTable = new HashTable<>();
      stringIntegerHashTable.add("John", 300);
      stringIntegerHashTable.add("sanaa", 400);
      stringIntegerHashTable.add("Tom", 200);
      stringIntegerHashTable.add("Jade", 100);
      stringIntegerHashTable.add("Doa", 600);
      stringIntegerHashTable.add("Farah", 700);
      stringIntegerHashTable.add("Jason", 90000);
      stringIntegerHashTable.add("Morgan", 800);
      stringIntegerHashTable.add("Naim", 1000);
      stringIntegerHashTable.add("Qusai", 1500);
      stringIntegerHashTable.add("Deyaa", 10000);

//
//      System.out.println(" index is  " + stringIntegerHashTable.hash("Naim"));
//
//      System.out.println("Integer is  " + stringIntegerHashTable.get("Qusai"));
//
//      System.out.println("Is contain ?  " + stringIntegerHashTable.contains("abrar"));
//
//      System.out.println("Is contain ?  " + stringIntegerHashTable.contains("Jason"));

      System.out.println(HashTable.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York"));




    }


}
