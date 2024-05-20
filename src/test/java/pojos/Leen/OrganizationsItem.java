package pojos.Leen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationsItem{
	private String website;
	private String address;
	private Integer founder_id;
	private String created_at;
	private Integer organization_group_id;
	private Integer status_id;
	private String updated_at;
	private String phone;
	private String name;
	private String short_name;
	private String currency;
	private Long id;
	private String fax;
	private String email;

	public OrganizationsItem() {
	}

	public OrganizationsItem(String website, String address, Integer founder_id, String created_at, Integer organization_group_id, Integer status_id, String updated_at, String phone, String name, String short_name, String currency, Long id, String fax, String email) {
		this.website = website;
		this.address = address;
		this.founder_id = founder_id;
		this.created_at = created_at;
		this.organization_group_id = organization_group_id;
		this.status_id = status_id;
		this.updated_at = updated_at;
		this.phone = phone;
		this.name = name;
		this.short_name = short_name;
		this.currency = currency;
		this.id = id;
		this.fax = fax;
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getFounder_id() {
		return founder_id;
	}

	public void setFounder_id(Integer founder_id) {
		this.founder_id = founder_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Integer getOrganization_group_id() {
		return organization_group_id;
	}

	public void setOrganization_group_id(Integer organization_group_id) {
		this.organization_group_id = organization_group_id;
	}

	public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "OrganizationsItem{" +
				"website='" + website + '\'' +
				", address='" + address + '\'' +
				", founder_id=" + founder_id +
				", created_at='" + created_at + '\'' +
				", organization_group_id=" + organization_group_id +
				", status_id=" + status_id +
				", updated_at='" + updated_at + '\'' +
				", phone='" + phone + '\'' +
				", name='" + name + '\'' +
				", short_name='" + short_name + '\'' +
				", currency='" + currency + '\'' +
				", id=" + id +
				", fax='" + fax + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
