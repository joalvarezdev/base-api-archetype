package ${package}.controller;

import ${package}.service.SampleService;
import ${package}.data.dao.SampleDAO;
import ${package}.data.mapper.SampleMapper;
import ${package}.data.dto.SampleDTO;
import ${package}.data.domain.Sample;
import com.joalvarez.baseframework.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("sample")
public class SampleController extends BaseController<SampleService, SampleDAO, SampleMapper, SampleDTO, Sample, Integer> {

	public SampleController (SampleService service) {
		super(service);
	}
}
