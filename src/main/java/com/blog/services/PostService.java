package com.blog.services;

import java.util.List;

import com.blog.models.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy, String sortDirection);

	// get post by Id
	PostDto getPostById(Integer postId);

	// get all posts by category

	List<PostDto> getPostByCategory(Integer categoryId);

	// get all posts by user

	List<PostDto> getPostByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String keyword);

}
