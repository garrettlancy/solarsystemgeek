package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	
	@Autowired
	ForumDao forumDao;
	
	@RequestMapping(path="/spaceForumDisplay", method=RequestMethod.GET)
	public String displaySpaceForum(Model modelHolder) {
		List<ForumPost> forumPosts = forumDao.getAllPosts();
		
		modelHolder.addAttribute("posts", forumPosts);
		
		return "spaceForum";
	}
	
	@RequestMapping(path="/spaceForumInput", method=RequestMethod.GET)
	public String displaySpaceForumForm() {
		
		return "spaceForumInput";
	}
	
	@RequestMapping(path="/spaceForumResult", method=RequestMethod.POST)
	public String processForumPost(@ModelAttribute ForumPost post) {
		post.setDatePosted(LocalDateTime.now());
		forumDao.save(post);
		return "redirect:/spaceForumDisplay";
	}

}
