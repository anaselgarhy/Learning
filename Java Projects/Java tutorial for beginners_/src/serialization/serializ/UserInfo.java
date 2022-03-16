package serialization.serializ;

import java.io.Serial;
import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private byte age;
    private String id;

    @Serial
    private static final long serialVersionUID = 1L;

    public UserInfo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge(){
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ("User name: " + getName() + "\n" + "User age: " + getAge() + "\n" + "User ID: " + getId());
    }
}
