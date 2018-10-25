public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
    data = new String[0];
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return size == 0;
  }

  public boolean add(String element){
    data[this.size()] = element;
    size++;
    return true;
  }

  public String toString(){
    String output = "";
    if (this.size() > 0){
      output += this.get(0);
    }
    for (int x = 1; x < this.size(); x++){
      output += "," + this.get(x);
    }
    return "[" + output + "]";
  }

  public String toStringDebug(){
    String output = "[" + this.get(0);
    for (int x = 1; x < data.length ; x++){
      output += "," + this.get(x);
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
    String replaced = this.get(index);
    if (index < 0 || index >= size()){
      return null;
    }else{
    data[index] = value;
    }
    return replaced;
  }

  private void resize(){
    String[] newData = new String[(size + 1) * 2];
    for (int x = 0; x < this.size(); x++){
      newData[x] = data[x];
    }
    data = newData;
  }

  public boolean contains(String target){
    for (int x = 0; x < this.size(); x++){
      if (this.get(x) == target){
        return true;
      }
    }
    return false;
  }

  public int indexof(String target){
    return 0;
  }

  public int lastIndexOf(String target){
    return 0;
  }
  public void add (int index, String target){
    if (index < 0 || index > size()){
      System.out.println("error");
    }
    size++;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      return "";
    }
    return "";
  }

  public boolean remove (String target){
    return true;
  }


}
