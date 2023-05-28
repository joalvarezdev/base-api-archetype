package ${package}.data.mapper;

import ${package}.data.domain.Sample;
import ${package}.data.dto.SampleDTO;
import com.joalvarez.baseframework.data.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public class SampleMapper extends BaseMapper<SampleDTO, Sample> {

}