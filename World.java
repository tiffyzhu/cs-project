public class World {
  
  private Farm[] farm;
  private int hours;
  
  public World(Farm[] farm, int hours) {
    this.farm = farm;
    this.hours = hours;;
  }
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public void setFarm(Farm[] farm) {
	  this.farm = farm;
	}
	
	public int getHours() {
    return hours;
  }
  
  public void incrementHour() {
    this.hours++;
  }
 
  public String toString() {
    return "Hours:" + getHours() + "\n";
  }
  
}
