class Sugar extends Cookie{
  String shape;
  boolean isDecorated;

  Sugar(){
    shape = "";
    isDecorated = false;
  }

  Sugar(String aShape, boolean aIsDecorated){
    shape = aShape;
    isDecorated = aIsDecorated;
  }

  String getShape(){
    return shape;
  }

  void setShape(String bShape){
    shape = bShape;
  }

  void cutOut(String cShape, int cutNumber){
    super.setNumber(cutNumber);
    System.out.println(cutNumber + " cookies were cut into " + cShape);
  }

  void decorate(){
    if(isReady = true){
      isDecorated = true;
      System.out.println("The cookies were decorated.");
    }
    else{
      System.out.println("Make sure to bake the cookies first.");
    }
  }
  
}