package bishri;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationStateServicePojo {
	private String name;
	private String description;
	private int id;
	public void setName(String name){
		this.name = name;
	}
	public OrganizationStateServicePojo() {
	}
	public String getName(){
		return name;
	}

	public void setDescription(String description){

		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"OrganizationStateServicePojo{" +
			"name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
