package ${package}.data.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "samples")
public class Sample {

	@Id
	private int id;
}