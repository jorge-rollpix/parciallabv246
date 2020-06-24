package edu.utn.ROMERORAJOYLABV.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {


    private Integer entityId;

    private Integer dni;

    private String firstname;

    private String lastname;

    private String username;

    private String email;

    private String password;

    private String type;


}
