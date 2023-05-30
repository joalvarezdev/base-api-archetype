package ${package}.data.dto;

import com.joalvarez.baseframework.data.dto.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SampleDTO implements BaseDTO {

}