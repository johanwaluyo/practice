package com.johanwaluyo.java.practice.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDTO {

    private UUID id;

    @NotNull
    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String userId;

    @Size(max = 255)
    private String password;

    @Size(max = 255)
    private String loginDate;

}
