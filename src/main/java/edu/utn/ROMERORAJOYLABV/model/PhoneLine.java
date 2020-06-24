package edu.utn.ROMERORAJOYLABV.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class PhoneLine {

    private Integer entityId;

    private Integer number;

    private String type;

    private User user;
}

