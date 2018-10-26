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
    if (size == data.length){
      resize();
    }
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
      output += ", " + this.get(x);
    }
    return "[" + output + "]";
  }

  public String toStringDebug(){
    String output = "[";
    if (this.size() > 0){
      output += this.get(0);
    }
    for (int x = 1; x < data.length ; x++){
      output += ", " + data[x];
    }
    return output + "]";
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      System.out.println("Error: Out of Bounds");
      return null;
    } else{
    return data[index];}
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
      if (this.get(x).equals(target)){
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target){
    for (int x = 0; x < this.size(); x++){
      if (this.get(x).equals(target)){
        return x;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int x = this.size() - 1 ; x >= 0 ; x= x-1){
      if (this.get(x).equals(target)){
        return x;
      }
    }
    return -1;
  }
  public void add (int index, String target){
    if (index < 0 || index > size()){
      System.out.println("Error : Index out of bounds");
      return;
    }
    int x = 0;
    SuperArray newCopy = new SuperArray();
    if (index == size){
      add(target);
    }
    else{
    while (x < size){
      if (x == index){
        newCopy.add(target);
        newCopy.add(this.get(x));
      }else{
      newCopy.add(this.get(x));}
      x++;

    }
    data = newCopy.data;
    size = newCopy.size();
    }
  }

  public String remove(int index){
    int x = 0;
    String output = "";
    SuperArray newCopy = new SuperArray();
    if (index < 0 || index >= size()){
      System.out.println("Error: Index out of bounds");
      return null;
    }
    while (x < size){
      if (x == index){
        output = this.get(index);
      }else{
      newCopy.add(this.get(x));}
      x++;
    }
    size = size - 1;
    data = newCopy.data;
    return output;
  }

  public boolean remove (String target){
    for(int x = 0; x < this.size(); x++){
      if (data[x].equals(target)){
        remove(x);
        return true;
      }
    }
    return false;
  }


}
