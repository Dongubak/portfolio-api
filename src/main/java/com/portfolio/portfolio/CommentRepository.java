package com.portfolio.portfolio;

import org.springframework.data.repository.CrudRepository;
import com.portfolio.portfolio.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {}