class Oven {
  private final int maxTemp;
  private int currentTemp;
  
  public Oven (int maxTemperature, int startTemperature) {
    if (maxTemperature <= 0)
      maxTemp = 500;
    else
      maxTemp = Math.min(maxTemperature, 500);
    setCurrentTemp(startTemperature);
  }
  
  public int getCurrentTemp () {return currentTemp;}
  
  public void setCurrentTemp (int currentTemp) {this.currentTemp = Math.max(Math.min(currentTemp, maxTemp), 0);}
  
  public int getMaxTemp () {return maxTemp;}
  
  public void turnOff () {setCurrentTemp(0);}
  
  public boolean isOn () {return getCurrentTemp() > 0;}
  
  public void preheat (int temp) {
    if (temp > 0)
      setCurrentTemp(Math.min(temp, maxTemp));
  }
}