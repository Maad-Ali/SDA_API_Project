package pojos.Leen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationByAPP{
	private Integer number_of_users;
	private Integer founder_id;
	private String updated_at;
	private Integer number_of_applications;
	private List<GroupTypesItem> group_types;
	private String name;
	private Integer number_of_files;
	private String created_at;
	private Integer number_of_groups;
	private Long id;

	public OrganizationByAPP() {
	}

	public OrganizationByAPP(Integer number_of_users, Integer founder_id, String updated_at, Integer number_of_applications, List<GroupTypesItem> group_types, String name, Integer number_of_files, String created_at, Integer number_of_groups, Long id) {
		this.number_of_users = number_of_users;
		this.founder_id = founder_id;
		this.updated_at = updated_at;
		this.number_of_applications = number_of_applications;
		this.group_types = group_types;
		this.name = name;
		this.number_of_files = number_of_files;
		this.created_at = created_at;
		this.number_of_groups = number_of_groups;
		this.id = id;
	}

	public Integer getNumber_of_users() {
		return number_of_users;
	}

	public void setNumber_of_users(Integer number_of_users) {
		this.number_of_users = number_of_users;
	}

	public Integer getFounder_id() {
		return founder_id;
	}

	public void setFounder_id(Integer founder_id) {
		this.founder_id = founder_id;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getNumber_of_applications() {
		return number_of_applications;
	}

	public void setNumber_of_applications(Integer number_of_applications) {
		this.number_of_applications = number_of_applications;
	}

	public List<GroupTypesItem> getGroup_types() {
		return group_types;
	}

	public void setGroup_types(List<GroupTypesItem> group_types) {
		this.group_types = group_types;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber_of_files() {
		return number_of_files;
	}

	public void setNumber_of_files(Integer number_of_files) {
		this.number_of_files = number_of_files;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Integer getNumber_of_groups() {
		return number_of_groups;
	}

	public void setNumber_of_groups(Integer number_of_groups) {
		this.number_of_groups = number_of_groups;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "OrganizationByAPP{" +
				"number_of_users=" + number_of_users +
				", founder_id=" + founder_id +
				", updated_at='" + updated_at + '\'' +
				", number_of_applications=" + number_of_applications +
				", group_types=" + group_types +
				", name='" + name + '\'' +
				", number_of_files=" + number_of_files +
				", created_at='" + created_at + '\'' +
				", number_of_groups=" + number_of_groups +
				", id=" + id +
				'}';
	}
}