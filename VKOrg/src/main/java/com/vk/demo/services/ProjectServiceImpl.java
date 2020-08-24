package com.vk.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.demo.dao.ProjectDao;
import com.vk.demo.entities.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao;
	
	public List<Project> getAllProjects(){
		return projectDao.getAllProjects();
	}

	@Override
	public Project getProjectById(int pId) {
		return projectDao.getProjectById(pId);
	}

	@Override
	public List<Project> findByProjectId(Integer projectid) {
		return projectDao.findByProjectId(projectid);
	}

	@Override
	public List<Project> findByTitle(String title) {
		return projectDao.findByTitle(title);
	}


}