public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public boolean add(String element){
    data[size] = element;
  }

  public String toString(){
    String output = "[" + data[0];
    for (int x = 1; x < this.size(); x++){
      output += "," + data[x];
    }
    return output + "]";
  }

  public toStringDebug(){
    String output = "[" + data[0];
    for (int x = 1; x < data.length ; x++){
      output += "," + data[x];
    }
    return output + "]";
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      return null;
    }
    return data[index];
  }

  public String set(int index, String value){
    if (index < 0 || index >= size()){
      return null;
    }else{
    data[index] = value;
    }
  }

  
}
