package com.bnpinnovation.protobuf.dto;

import lombok.Getter;
import lombok.ToString;

public interface SCVDto {
    @ToString
    @Getter
    public class Request {
        String username;
        String password;
        String email;
    }
}
