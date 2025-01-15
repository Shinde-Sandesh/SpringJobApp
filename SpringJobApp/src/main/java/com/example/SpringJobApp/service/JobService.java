
package com.example.SpringJobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJobApp.model.JobPost;
import com.example.SpringJobApp.repo.JobRepo;
/*import com.example.SpringJobApp.repo.JobRepo;*/

@Service
public class JobService {

	@Autowired
	private JobRepo repo;

	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}

	public List<JobPost> getAllJobPosts() {
		return repo.getAllJobs();

	}
}
