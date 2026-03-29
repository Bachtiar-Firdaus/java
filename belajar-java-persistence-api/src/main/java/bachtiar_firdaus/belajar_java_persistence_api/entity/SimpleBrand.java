package bachtiar_firdaus.belajar_java_persistence_api.entity;

public class SimpleBrand {

    private String id;

    private String name;

    public SimpleBrand(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
