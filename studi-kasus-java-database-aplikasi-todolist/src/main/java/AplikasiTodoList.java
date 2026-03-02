public class AplikasiTodoList {
    // declration
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);


    static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
//        testRemoveTodoList();
//        testInput();
//        testViewShowTodoList();
//        testViewAddTodoList();
//        testViewRemoveTodoList();
        viewShowTodoList();
    }

    /*
     * Menampilkan todo list
     */
    public static void showTodoList () {
        System.out.println("TODO LIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[2] = "Aplikasi Todo Lsit";

        showTodoList();
    }

    /*
     * Menambahkan todo list
     */
    public static void addTodoList (String todo) {
        // cek apakah model penuh?
        var isFull = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                isFull = false;
                break;
            }
        }

        // jika penuh, kita lakukan resize ukuran array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList () {
        for (var i = 0; i < 25; i++){
            addTodoList("Contoh todo ke. " + i);
        }
        showTodoList();
    }

    /*
     * Menghapus todo list
     */
    public static boolean removeTodoList (Integer number) {
        if((number - 1) >= model.length){
            return false;
        }else if(model[number - 1] == null){
            return false;
        }else{
            for(int i = (number - 1); i < model.length; i++){
                if(i == (model.length - 1)){
                    model[i]=null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }
    public static void testRemoveTodoList () {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        addTodoList("enam");

        var result = removeTodoList(20);
        System.out.println(result);
        result = removeTodoList(7);
        System.out.println(result);
        result = removeTodoList(2);
        System.out.println(result);
        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        var old = input("Umur");
        System.out.println("Hi "+ name);
        System.out.println("Umur " +old);
    }

    /*
     * Menampilkan view todo list
     */
    public static void viewShowTodoList () {
        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("X. Keluar");

            var input = input("Pilih");
            if (input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("X")) {
                break;
            } else {
                System.out.println("Pilihan tidak di mengerti");
            }
        }
    }

    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }

    /*
     * Menambahkan view todo list
     */
    public static void viewAddTodoList () {
        System.out.println("Menambah todo list");
        var todo = input("Todo (X Jika Batal)");
        if(todo.equals("X")){
         // batal
        }else{
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        viewAddTodoList();
        showTodoList();

    }

    /*
     * Menghapus view todo list
     */
    public static void viewRemoveTodoList () {
        System.out.println("Menghapus todo list");
        var number = input("Nomor Yang Dihapus (X Jika Batal)");
        if(number.equals("X")){
            // batal
        }else{
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }

    }

    public static void testViewRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        showTodoList();
        viewRemoveTodoList();
        showTodoList();

    }
}
