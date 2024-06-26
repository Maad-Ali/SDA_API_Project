package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserGroupServicePojo {


    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonProperty("group_type_id")
    private Integer groupTypeId;
    @JsonProperty("organization_id")

    private String organizationId;
    private List<Object> roles;
    private String name;
    @JsonProperty("short_name")

    private String shortName;
    private String id;

    public void setGroupTypeId(Integer groupTypeId) {
        this.groupTypeId = groupTypeId;
    }

    public Integer getGroupTypeId() {
        return groupTypeId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setRoles(List<Object> roles) {
        this.roles = roles;
    }

    public List<Object> getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "UserGroupServicePojo{" +
                        "group_type_id = '" + groupTypeId + '\'' +
                        ",organization_id = '" + organizationId + '\'' +
                        ",roles = '" + roles + '\'' +
                        ",name = '" + name + '\'' +
                        ",short_name = '" + shortName + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}