package com.codewithshree.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshree.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
