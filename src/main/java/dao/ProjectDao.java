package dao;

import jpa.business.Project;

public class ProjectDao extends AbstractJpaDao<Long, Project>{

	public ProjectDao() {
		super(Project.class);
	}

}