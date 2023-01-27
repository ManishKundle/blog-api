package com.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
