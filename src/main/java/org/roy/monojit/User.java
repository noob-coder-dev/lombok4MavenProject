package org.roy.monojit;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String enail;
}
