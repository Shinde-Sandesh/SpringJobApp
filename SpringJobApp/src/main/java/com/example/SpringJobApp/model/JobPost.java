package com.example.SpringJobApp.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

	private int postId;
	private String postProfile;
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;

	// Getter and Setter for postProfile
	public String getPostProfile() {
		return postProfile;
	}

	
	  public int getPostId() { return postId; }
	  
	  public void setPostId(int postId) { this.postId = postId; }
	  
	  public String getPostDesc() { return postDesc; }
	  
	  public void setPostDesc(String postDesc) { this.postDesc = postDesc; }
	  
	  public Integer getReqExperience() { return reqExperience; }
	  
	  public void setReqExperience(Integer reqExperience) { this.reqExperience =
	  reqExperience; }
	  
	  public List<String> getPostTechStack() { return postTechStack; }
	  
	  public void setPostTechStack(List<String> postTechStack) { this.postTechStack
	  = postTechStack; }
	 

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}
}
