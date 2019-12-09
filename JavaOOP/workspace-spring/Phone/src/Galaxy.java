public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return("Galaxy"+this.versionNumber+" says ring ring ring!");
    }
    @Override
    public String unlock() {
    	return("Unlocking via finger print");
   
    }
    @Override
    public void displayInfo() {
        System.out.println("Version Number: "+this.getVersionNumber()+", Battery Percentage: "+this.getBatteryPercentage()+", Carrier: "+this.getCarrier()+", Ring Tone: "+this.getRingTone());                      
    }
}

