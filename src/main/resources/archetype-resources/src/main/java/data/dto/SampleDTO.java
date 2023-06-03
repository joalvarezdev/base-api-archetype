package ${package}.data.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.joalvarez.baseframework.data.dto.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SampleDTO implements BaseDTO {

	private String name;
	private String email;

	public SampleDTO() {}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private final SampleDTO sample;

		public Builder() {
			this.sample = new SampleDTO();
		}

		public Builder name(String name) {
			this.sample.name = name;
			return this;
		}

		public Builder email(String email) {
			this.sample.email = email;
			return this;
		}

		public SampleDTO build() {
			return this.sample;
		}
	}
}