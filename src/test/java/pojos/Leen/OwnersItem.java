package pojos.Leen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnersItem {
	private Preferences preferences;
	private String address;
	private Boolean is_email_verified;
	private String created_at;
	private String lastname;
	private Integer status_id;
	private String updated_at;
	private String phone;
	private String name;
	private Integer updated_by;
	private Integer id;
	private String email;
	private String username;

	public OwnersItem() {
	}

	public OwnersItem(Preferences preferences, String address, Boolean is_email_verified, String created_at, String lastname, Integer status_id, String updated_at, String phone, String name, Integer updated_by, Integer id, String email, String username) {
		this.preferences = preferences;
		this.address = address;
		this.is_email_verified = is_email_verified;
		this.created_at = created_at;
		this.lastname = lastname;
		this.status_id = status_id;
		this.updated_at = updated_at;
		this.phone = phone;
		this.name = name;
		this.updated_by = updated_by;
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public Preferences getPreferences() {
		return preferences;
	}

	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getIs_email_verified() {
		return is_email_verified;
	}

	public void setIs_email_verified(Boolean is_email_verified) {
		this.is_email_verified = is_email_verified;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Integer getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Integer updated_by) {
		this.updated_by = updated_by;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "OwnersItem{" +
				"preferences=" + preferences +
				", address='" + address + '\'' +
				", is_email_verified=" + is_email_verified +
				", created_at='" + created_at + '\'' +
				", lastname='" + lastname + '\'' +
				", status_id=" + status_id +
				", updated_at='" + updated_at + '\'' +
				", phone='" + phone + '\'' +
				", name='" + name + '\'' +
				", updated_by=" + updated_by +
				", id=" + id +
				", email='" + email + '\'' +
				", username='" + username + '\'' +
				'}';
	}
}

