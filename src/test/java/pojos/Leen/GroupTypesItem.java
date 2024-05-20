package pojos.Leen;

public class GroupTypesItem{
	private Integer number_of_users;
	private String name;
	private Integer number_of_groups;
	private Integer id;

	public GroupTypesItem() {
	}

	public GroupTypesItem(Integer number_of_users, String name, Integer number_of_groups, Integer id) {
		this.number_of_users = number_of_users;
		this.name = name;
		this.number_of_groups = number_of_groups;
		this.id = id;
	}

	public Integer getNumber_of_users() {
		return number_of_users;
	}

	public void setNumber_of_users(Integer number_of_users) {
		this.number_of_users = number_of_users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber_of_groups() {
		return number_of_groups;
	}

	public void setNumber_of_groups(Integer number_of_groups) {
		this.number_of_groups = number_of_groups;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GroupTypesItem{" +
				"number_of_users=" + number_of_users +
				", name='" + name + '\'' +
				", number_of_groups=" + number_of_groups +
				", id=" + id +
				'}';
	}
}
