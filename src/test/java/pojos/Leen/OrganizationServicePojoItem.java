package pojos.Leen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationServicePojoItem{
	private Integer id;
	private String name;
	private String short_name;
	private List<OwnersItem> owners;
	private List<OrganizationsItem> organizations;
	private String created_at;
	private String updated_at;

	public OrganizationServicePojoItem() {
	}

	public OrganizationServicePojoItem(Integer id, String name, String short_name, List<OwnersItem> owners, List<OrganizationsItem> organizations, String created_at, String updated_at) {
		this.id = id;
		this.name = name;
		this.short_name = short_name;
		this.owners = owners;
		this.organizations = organizations;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<OwnersItem> getOwners() {
		return owners;
	}

	public void setOwners(List<OwnersItem> owners) {
		this.owners = owners;
	}

	public List<OrganizationsItem> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<OrganizationsItem> organizations) {
		this.organizations = organizations;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "OrganizationServicePojoItem{" +
				"id=" + id +
				", name='" + name + '\'' +
				", short_name='" + short_name + '\'' +
				", owners=" + owners +
				", organizations=" + organizations +
				", created_at='" + created_at + '\'' +
				", updated_at='" + updated_at + '\'' +
				'}';
	}
}