package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImpl implements StudentDAO{

	@Autowired
	private HibernateTemplate template;
	@Override
	public void add(Student ref) {
		template.save(ref);
	}

}
