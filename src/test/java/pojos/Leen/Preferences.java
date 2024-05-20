package pojos.Leen;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Preferences{
	private Integer sales_target;

	public Preferences() {
	}

	public Preferences(Integer sales_target) {
		this.sales_target = sales_target;
	}

	public Integer getSales_target() {
		return sales_target;
	}

	public void setSales_target(Integer sales_target) {
		this.sales_target = sales_target;
	}

	@Override
	public String toString() {
		return "Preferences{" +
				"sales_target=" + sales_target +
				'}';
	}
}
