package com.portfolio.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping(path = "/comment")
    public @ResponseBody String addNewComment(
            @RequestParam String name,
            @RequestParam String comment
    ) {
        Comment c = new Comment();
        c.setName(name);
        c.setComment(comment);
        commentRepository.save(c);

        return "Saved";
    }

    @GetMapping(path = "/comment")
    public @ResponseBody Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}


