package belajar.pakage.data;

public class Category {
    private String id;
    private boolean expensive;

    // membuat setter dan getter menggunakan awalan set dan get khusus booleand mengunakan awalan is
    // untuk generate code bisa di tab code.generate.getter&setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
