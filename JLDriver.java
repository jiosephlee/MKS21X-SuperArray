public class JLDriver {

  public static void main(String[] args) {



    System.out.println("TESTING PHASE 1 and 2... except clear() which will be at the end");

    System.out.println();
    System.out.println();
    SuperArray SA = new SuperArray();

    System.out.println("Testing toString() ... Expected: []");
    System.out.println("Current Status of SA: " + SA);

    System.out.println();

    System.out.println("Testing isEmpty() ... Expected : true");
    System.out.println("isEmpty?: " + SA.isEmpty());

    System.out.println();

    System.out.println("Testing add(String) ... Expected : true");
    System.out.println("Did we add \" A \" to SA? :" + SA.add("A"));
    System.out.println("Testing toString() ... Current Status of SA : " + SA);
    System.out.println("Testing isEmpty() ... Expected : false");
    System.out.println("isEmpty?: " + SA.isEmpty());
    System.out.println("Testing size() ... Expected : 1");
    System.out.println("Size: " + SA.size());

    System.out.println();

    System.out.println("Adding \"B\" to SA?: " + SA.add("B"));
    System.out.println("Testing resize() and toStringDebug ... Expected [\"A\",\"B\", null]");
    System.out.println("Current Status of SA: " + SA);
    System.out.println("Testing get(int) ... Expected : B");
    System.out.println("SA[1] == " + SA.get(1));
    System.out.println("Testing get(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.get(2);
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in get()");
    }
    try{
      SA.get(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println();

    System.out.println("Testing set(int,String) ...  Expected : \"A\"");
    System.out.println("SA.set(0,\"C\") will replace \"A\" at index 0 with \"C\"" + SA.set(0,"C"));
    System.out.println("SA\'s Current Status: " + "[\"C\",\"A\"]");
    System.out.println("Testing set(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.set(2,"C");
    } catch(IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in set(int,String)");
    }
    try{
      SA.set(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println("SA\'s Current Status after Testing Phase 1 and 2: " + "[\"C\",\"A\"]");
    System.out.println();
    System.out.println("******************************************************");
    System.out.println();
    System.out.println("TESTING PHASE 3 ...");

    System.out.println();

    System.out.println("Testing add(int.String) ... Expected : SA should be [\"C\", \"D\", \"A\",\"E\"]");
    SA.add(1,"D");
    SA.add(3, "A");
    System.out.println("SA\'s Current Status: " + SA);
    System.out.println("Testing add(int,String)\'s throw ... Expected : 2 error messages");
    try{
      SA.add(5,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }
    try{
      SA.add(-2,"xd");
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in add(int,String)");
    }

    System.out.println();

    System.out.println("Testing contains(String) ... Expected : true");
    System.out.println("Does SA contain \"C\" ?: " + SA.contains("C"));
    System.out.println("Expected : false");
    System.out.println("Does SA contain \"C\" ?: " + SA.contains("F"));

    System.out.println("Testing indexOf(String) ... Expected : 3");
    System.out.println("Where is \"E\" in SA? :" + SA.indexOf("E"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"E\" in SA? :" + SA.indexOf("Z"));

    System.out.println();

    SA.add("C");
    System.out.println("Added \"C\" to the end of the list using add(String)");
    System.out.println("Status of SA is: " + SA);

    System.out.println();

    System.out.println("Testing lastIndexOf(String) ... Expected : 4");
    System.out.println("Where is \"C\" in SA? :" + SA.indexOf("C"));
    System.out.println("Expected : -1");
    System.out.println("Where is \"Z\" in SA? :" + SA.indexOf("Z"));

    System.out.println();

    System.out.println("Testing remove(int) ...  Expected : Removed element is \"D\"");
    System.out.println("The element that is removed is : " + SA.remove(1));
    System.out.println("Expected: SA is [\"C\", \"A\",\"E\", \"C\"]");
    System.out.println("Current Status of SA: " + SA);
    System.out.println("Testing remove(int)\'s throw ... Expected : 2 error messages");
    try{
      SA.remove(7);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }
    try{
      SA.remove(-2);
    } catch (IndexOutOfBoundsException e){
      System.out.println("Caught an Exception in remove(int)");
    }

    System.out.println();

    System.out.println("Testing remove(String) ...  Expected : true");
    System.out.println("The first element, \"C\" is removed ? : " + SA.remove("C"));
    System.out.println("Expected: SA is [\"A\",\"E\", \"C\"]");
    System.out.println("Current Status of SA: " + SA);
    System.out.println("Expected: false");
    System.out.println(SA.remove("ASD"));

    System.out.println("END OF TESTING");
  }
}
