class Cookie{
  int number;
  int bakeTemp;
  int bakeTime;
  boolean isReady;

  Cookie(){
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int aNumber, int aBakeTemp, int aBakeTime){
    number = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  boolean getCookie(){
    return isReady;
  }

  void setNumber(int bNumber){
    number = bNumber;
  }

  void bakeCookies(int cBakeTemp, int cBakeTime){
    isReady = true;

    System.out.println(number + " cookies were baked at " + cBakeTemp + " degrees F for " + cBakeTime + " minutes.");
  }
}