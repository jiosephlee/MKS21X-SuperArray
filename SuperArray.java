public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(int startingCapacity){
    data = new String[startingCapacity];
    size = 0;
  }
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
    if (size == data.length){
      resize();
    }
    data[size()] = element;
    size++;
    return true;
  }

  public String toString(){
    String output = "";
    if (size() > 0){
      output += get(0);
    }
    for (int x = 1; x < size(); x++){
      output += ", " + get(x);
    }
    return "[" + output + "]";
  }

  public String toStringDebug(){
    String output = "[";
    if (size() > 0){
      output += get(0);
    }
    for (int x = 1; x < data.length ; x++){
      output += ", " + data[x];
    }
    return output + "]";
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Error: Index out of Bounds");
    } else{
    return data[index];}
  }

  public String set(int index, String value){
    String replaced = get(index);
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Error: Index out of Bounds");
    }else{
    data[index] = value;
    }
    return replaced;
  }

  private void resize(){
    String[] newData = new String[(size() * 2) + 1];
    for (int x = 0; x < size(); x++){
      newData[x] = data[x];
    }
    data = newData;
  }

  public boolean contains(String target){
    for (int x = 0; x < size(); x++){
      if (this.get(x).equals(target)){
        return true;
      }
    }
    return false;
  }

  public int indexOf(String target){
    for (int x = 0; x < size(); x++){
      if (this.get(x).equals(target)){
        return x;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int x = size() - 1 ; x >= 0 ; x= x-1){
      if (this.get(x).equals(target)){
        return x;
      }
    }
    return -1;
  }
  public void add (int index, String target){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Error: Index out of Bounds");
    }
    int x = 0;
    SuperArray newCopy = new SuperArray(0);
    if (index == size()){
      add(target);
    }
    else{
    while (x < size()){
      if (x == index){
        newCopy.add(target);
        newCopy.add(get(x));
      }else{
      newCopy.add(get(x));}
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
      throw new IndexOutOfBoundsException("Error: Index out of Bounds");
    }
    while (x < size){
      if (x == index){
        output =get(index);
      }else{
      newCopy.add(get(x));}
      x++;
    }
    size = size - 1;
    data = newCopy.data;
    return output;
  }

  public boolean remove (String target){
    for(int x = 0; x < size(); x++){
      if (data[x].equals(target)){
        remove(x);
        return true;
      }
    }
    return false;
  }


}
