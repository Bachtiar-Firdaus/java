package belajar.pakage.data;

public enum Level {
    STANDARD("standard level"),
    PREMIUM("premium level"),
    VIP("vip level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
