interface Device {
    void deviceName();
}

interface Processor {
    void processorName();
}

interface DisplayDimension {
    void dimensions();
}

/********* interface extends interface */
interface Configurations extends DisplayDimension, Processor, Device {
    void model();
}

class DeviceInformation implements Configurations {
    private String name, processor, model;
    private int dimension;

    DeviceInformation(int dimension, String name, String processor, String model){
        this.dimension = dimension;
        this.name = name;
        this.processor = processor;
        this.model = model;
    }

    public void model(){
        System.out.println("Model : "+this.model);
    }

    public void dimensions(){
        System.out.println("Display Dimension : "+this.dimension);
    }

    public void processorName(){
        System.out.println("Processor : "+this.processor);
    }

    public void deviceName(){
        System.out.println("Device : "+this.name);
    }
}

public class InterfaceExamples {
    public static void main(String[] args) {

        DeviceInformation ob = new DeviceInformation(100, "vivo", "snapdragon", "24-MMKH");
        ob.deviceName();
        ob.dimensions();
        ob.processorName();
        ob.model();

    }
}
