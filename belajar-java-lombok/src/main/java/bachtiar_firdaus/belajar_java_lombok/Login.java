package bachtiar_firdaus.belajar_java_lombok;

import lombok.*;

@Getter
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor(staticName = "createEmpy")
@ToString(exclude = {
        "password"
})
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;

}
