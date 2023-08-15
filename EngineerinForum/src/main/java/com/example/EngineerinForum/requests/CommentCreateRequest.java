package com.example.EngineerinForum.requests;

import lombok.Data;

@Data
public class CommentCreateRequest {
    Long PostId;
    String text;
    Long Id;
    Long userId;

}
