package ${package}.data.dao;

import ${package}.data.domain.Sample;
import ${package}.data.repository.SampleRepository;
import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import org.springframework.stereotype.Component;

@Component
public class SampleDAO extends BaseJPADAO<SampleRepository, Sample, Integer> {

	public SampleDAO(SampleRepository repository) {
		super(repository);
	}
}