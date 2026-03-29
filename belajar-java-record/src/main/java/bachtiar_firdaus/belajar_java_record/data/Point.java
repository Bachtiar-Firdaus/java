package bachtiar_firdaus.belajar_java_record.data;

public record Point(int x, int y) {

    public Point{
        System.out.println("Create Point");
    }

}
