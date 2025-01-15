package com.example.SpringJobApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.SpringJobApp.model.JobPost;
import com.example.SpringJobApp.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService service;

	@GetMapping({ "/", "home" })
	public String home() {
		return "home";
	}

	@GetMapping("addjob")
	public String addjob() {
		System.out.println("CHECJOBS");
		return "addJob";
	}

	@PostMapping("handleForm")
	public String handleForm(JobPost jobpost) {
		System.out.println("CHECKJOBADDED");
		service.addJob(jobpost);
		return "success";
	}

	@GetMapping("viewalljobs")

	public String viewJobs(Model model) {
		List<JobPost> jobs = service.getAllJobPosts();
		model.addAttribute("jobPosts", jobs);
		return "viewalljobs";
	}

}
