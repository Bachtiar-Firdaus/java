public class TernaryOperator {
    static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if(nilai >= 75){
            ucapan = "Selamat anda lulus";
        }else{
            ucapan = "silahkan coba lagi";
        }

        System.out.println(ucapan);

        String ucapanTernary = nilai >= 75 ? "Selamat anda lulus" : "silahkan coba lagi";
        System.out.println(ucapanTernary);
    }
}
