package ${package}.service;

import ${package}.data.dao.SampleDAO;
import ${package}.data.mapper.SampleMapper;
import ${package}.data.dto.SampleDTO;
import ${package}.data.domain.Sample;
import com.joalvarez.baseframework.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SampleService extends BaseService<SampleDAO, SampleMapper, SampleDTO, Sample, Integer> {

	public SampleService(SampleDAO dao, SampleMapper mapper) {
		super(dao, mapper);
	}

}