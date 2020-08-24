package com.vk.demo.services;

import java.util.List;

import com.vk.demo.entities.Project;

public interface ProjectService {

	List<Project> getAllProjects();

	Project getProjectById(int pId);

	public List<Project> findByProjectId(Integer projectid);
	
	public List<Project> findByTitle(String title);

}
