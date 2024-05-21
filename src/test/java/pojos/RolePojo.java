package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class RolePojo {
    private int id;
    private String name;
    private int app_id;


    public RolePojo() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getApp_id() {
        return app_id;
    }
    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    @Override
    public String toString() {
        return "RolePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", app_id=" + app_id +
                '}';
    }
}
