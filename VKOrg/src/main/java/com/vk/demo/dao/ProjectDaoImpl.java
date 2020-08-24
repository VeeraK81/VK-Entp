package com.vk.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vk.demo.entities.Project;
import com.vk.demo.exception.IdNotFoundException;
import com.vk.demo.repositories.ProjectRepository;

@Component
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> getAllProjects(){
		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public Project getProjectById(int pId) {
		
//		Project prj = new Project();
//		if(projectRepository.findOne(pId).equals(prj)){
//			throw new IdNotFoundException(pId);
//		}else {
//			return projectRepository.findOne(pId);
//		}
		return projectRepository.getOne(pId);
		
	}

	@Override
	public List<Project> findByProjectId(Integer projectid) {
		return projectRepository.findByProjectId(projectid);
	}

	@Override
	public List<Project> findByTitle(String title) {
		return projectRepository.findByTitle(title);
	}

	

}
