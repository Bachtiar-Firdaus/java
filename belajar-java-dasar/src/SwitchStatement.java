public class SwitchStatement {
    static void main(String[] args) {
        var nilai = "D";

        // switch versi old
        switch (nilai) {
            case "A":
                System.out.println("wow anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("wow anda lulus dengan baik");
            case "B", "C" ->  System.out.println("anda tidak lulus");
            default -> System.out.println("mungkin anda salah jurusan");
        }

        // switch dengan yield
        String ucapan = switch (nilai) {
            case "A":
                yield "wow anda lulus";
            case "B", "C":
                yield "anda tidak lulus";
            default:
                yield "mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
