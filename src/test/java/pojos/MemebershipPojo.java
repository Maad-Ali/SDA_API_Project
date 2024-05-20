package pojos;

public class MemebershipPojo{
	private String default_role_name;
	private Boolean is_active;

	private Integer membership_type_id;

	private Boolean is_owner;

	private String created_at;

	private String app_short_name;

	private String organization_name;

	private Boolean is_default;

	private Integer created_by;

	private String lastname;
	private String subscription_id;

	private String app_name;

	private String updated_at;

	private Integer user_id;

	private String organization_currency;

	private Long organization_id;

	private String name;
	private Integer updated_by;

	private Integer default_role_id;

	private String app_logo_url;

	private Integer id;
	private Boolean is_individual_membership;

	private Integer app_id;

	private String username;

	public MemebershipPojo() {
	}

	public MemebershipPojo(String default_role_name, Boolean is_active, Integer membership_type_id, Boolean is_owner, String created_at, String app_short_name, String organization_name, Boolean is_default, Integer created_by, String lastname, String subscription_id, String app_name, String updated_at, Integer user_id, String organization_currency, Long organization_id, String name, Integer updated_by, Integer default_role_id, String app_logo_url, Integer id, Boolean is_individual_membership, Integer app_id, String username) {
		this.default_role_name = default_role_name;
		this.is_active = is_active;
		this.membership_type_id = membership_type_id;
		this.is_owner = is_owner;
		this.created_at = created_at;
		this.app_short_name = app_short_name;
		this.organization_name = organization_name;
		this.is_default = is_default;
		this.created_by = created_by;
		this.lastname = lastname;
		this.subscription_id = subscription_id;
		this.app_name = app_name;
		this.updated_at = updated_at;
		this.user_id = user_id;
		this.organization_currency = organization_currency;
		this.organization_id = organization_id;
		this.name = name;
		this.updated_by = updated_by;
		this.default_role_id = default_role_id;
		this.app_logo_url = app_logo_url;
		this.id = id;
		this.is_individual_membership = is_individual_membership;
		this.app_id = app_id;
		this.username = username;
	}

	public String getDefault_role_name() {
		return default_role_name;
	}

	public void setDefault_role_name(String default_role_name) {
		this.default_role_name = default_role_name;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}

	public Integer getMembership_type_id() {
		return membership_type_id;
	}

	public void setMembership_type_id(Integer membership_type_id) {
		this.membership_type_id = membership_type_id;
	}

	public Boolean getIs_owner() {
		return is_owner;
	}

	public void setIs_owner(Boolean is_owner) {
		this.is_owner = is_owner;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getApp_short_name() {
		return app_short_name;
	}

	public void setApp_short_name(String app_short_name) {
		this.app_short_name = app_short_name;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public Boolean getIs_default() {
		return is_default;
	}

	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSubscription_id() {
		return subscription_id;
	}

	public void setSubscription_id(String subscription_id) {
		this.subscription_id = subscription_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getOrganization_currency() {
		return organization_currency;
	}

	public void setOrganization_currency(String organization_currency) {
		this.organization_currency = organization_currency;
	}

	public Long getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(Long organization_id) {
		this.organization_id = organization_id;
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

	public Integer getDefault_role_id() {
		return default_role_id;
	}

	public void setDefault_role_id(Integer default_role_id) {
		this.default_role_id = default_role_id;
	}

	public String getApp_logo_url() {
		return app_logo_url;
	}

	public void setApp_logo_url(String app_logo_url) {
		this.app_logo_url = app_logo_url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIs_individual_membership() {
		return is_individual_membership;
	}

	public void setIs_individual_membership(Boolean is_individual_membership) {
		this.is_individual_membership = is_individual_membership;
	}

	public Integer getApp_id() {
		return app_id;
	}

	public void setApp_id(Integer app_id) {
		this.app_id = app_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MemebershipPojo{" +
				"default_role_name='" + default_role_name + '\'' +
				", is_active=" + is_active +
				", membership_type_id=" + membership_type_id +
				", is_owner=" + is_owner +
				", created_at='" + created_at + '\'' +
				", app_short_name='" + app_short_name + '\'' +
				", organization_name='" + organization_name + '\'' +
				", is_default=" + is_default +
				", created_by=" + created_by +
				", lastname='" + lastname + '\'' +
				", subscription_id='" + subscription_id + '\'' +
				", app_name='" + app_name + '\'' +
				", updated_at='" + updated_at + '\'' +
				", user_id=" + user_id +
				", organization_currency='" + organization_currency + '\'' +
				", organization_id=" + organization_id +
				", name='" + name + '\'' +
				", updated_by=" + updated_by +
				", default_role_id=" + default_role_id +
				", app_logo_url='" + app_logo_url + '\'' +
				", id=" + id +
				", is_individual_membership=" + is_individual_membership +
				", app_id=" + app_id +
				", username='" + username + '\'' +
				'}';
	}
}
