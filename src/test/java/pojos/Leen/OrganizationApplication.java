package pojos.Leen;

public class OrganizationApplication {
	private Integer founder_id;
	private String name;
	private String short_name;
	private Long id;


	public OrganizationApplication() {
	}

	public OrganizationApplication(Integer founder_id, String name, String short_name, Long id) {
		this.founder_id = founder_id;
		this.name = name;
		this.short_name = short_name;
		this.id = id;
	}

	public Integer getFounder_id() {
		return founder_id;
	}

	public void setFounder_id(Integer founder_id) {
		this.founder_id = founder_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Response{" +
				"founder_id=" + founder_id +
				", name='" + name + '\'' +
				", short_name='" + short_name + '\'' +
				", id=" + id +
				'}';
	}
}
