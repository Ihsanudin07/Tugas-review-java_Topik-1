package ihsanudin;

public class Buku {
    //atribut dari class jualbuku
    private String judul;
    private String pengarang;
    private double harga;

    //konstruktor dengan menggunakan 3 paramater
    public Buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    //membuat method set
    void setJudul(String judul){
        this.judul = judul;
    }

    void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    void setHarga(double harga){
        this.harga = harga;
    }

    //membuat method get
    public String getJudul(){
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public double getHarga(){
        return harga;
    }

    public static void main(String[] args) {
        //menyimpan data buku dengan menggunakan 3 paramater
        Buku jualbuku1 = new Buku("Harry Potter","J.K.Rowling",300000);
        Buku jualbuku2 = new Buku("UML","Ivar Jacobson",400000);

        System.out.println("Judul = "+jualbuku1.getJudul()+"\n" +
                "Pengarang = "+jualbuku1.getPengarang()+"\n" +
                "Harga = "+jualbuku1.getHarga());
        System.out.println("--------------------------");
        System.out.println("Judul = "+jualbuku2.getJudul()+"\n" +
                "Pengarang = "+jualbuku2.getPengarang()+"\n" +
                "Harga = "+jualbuku2.getHarga());
    }
}
