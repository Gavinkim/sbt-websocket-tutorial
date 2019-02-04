package com.example.ws.model;

import lombok.*;

/**
 * Created by gavinkim at 2019-02-04
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Chatparticipant {

    private String firstName;
    private String lastName;
    private String shortName;
    private String participantType;

}
