
package com.example.SpringJobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringJobApp.model.JobPost;

@Repository
public class JobRepo {

	List<JobPost> jobs = new ArrayList<>(Arrays.asList(
			new JobPost(1, "Frontend Developer", "Experience in building responsive web applications using React", 3,
					List.of("HTML", "CSS", "JavaScript", "React")),
			new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
					List.of("HTML", "CSS", "JavaScript", "React")),
			new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
					List.of("iOS Development", "Android Development", "Mobile App")),
			new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4,
					List.of("DevOps", "CI/CD", "Docker", "Kubernetes"))));

	public List<JobPost> getAllJobs() {
		return jobs;
	}

	public void addJob(JobPost job) {
		jobs.add(job);
		System.out.println("Job added: " + jobs);
	}

}
