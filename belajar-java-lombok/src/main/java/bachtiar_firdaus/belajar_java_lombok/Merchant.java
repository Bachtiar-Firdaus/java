package bachtiar_firdaus.belajar_java_lombok;


import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Merchant {

    private final String id;

    private String name;

}
