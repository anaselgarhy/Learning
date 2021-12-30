package examples.operatingSystem;

public class OperatingSystem {
    private String name; // Operating system name
    private String version; // Operating system version

    public OperatingSystem(){
        name = "None";
        version = "None";
    }
    public OperatingSystem(String name, String version){
        this.name = name;
        this.version = version;
    }
    public void printInfo(){
        System.out.println("Operating system name: " + name + ", Operating system version: " + version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
