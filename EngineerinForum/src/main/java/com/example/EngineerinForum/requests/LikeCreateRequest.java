package com.example.EngineerinForum.requests;

import lombok.Data;

@Data
public class LikeCreateRequest {
    Long PostId;
    Long Id;
    Long userId;
}
