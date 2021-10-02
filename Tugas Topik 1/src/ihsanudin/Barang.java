package ihsanudin;

public class Barang {
    //atribut dari class jualbarang
    private String idProduk, nama;
    private double harga;

    //Konstruktor dengan menggunakan 3 paramater
    public Barang(String idProduk, String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    //Konstruktor dengan menggunakan 2 paramater
    public Barang(String idProduk, String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }

    //menggunakan method set dan get untuk memanggil dan mensetting nilai pada variabel
    void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    void setHarga(double harga){
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }

    public String getIdProduk(){
        return idProduk;
    }

    public static void main(String[] args){
        //menyimpan data menggunakan 2 paramater kemudian pada variabel harga  gunakan set
        Barang jualbarang1 = new Barang("BRG-001","Tas Gucci");
        jualbarang1.setHarga(1200);
        Barang jualbarang2 = new Barang("BRG-002","Printer Epson L355");
        jualbarang2.setHarga(200);

        System.out.println("idProduk = "+jualbarang1.getIdProduk()+"\n" +
                "nama = "+jualbarang1.getNama()+"\n" +
                "harga = "+jualbarang1.getHarga());
        System.out.println("--------------------------");
        System.out.println("idProduk = "+jualbarang2.getIdProduk()+"\n" +
                "nama = "+jualbarang2.getNama()+"\n" +
                "harga = "+jualbarang2.getHarga());
        System.out.println("--------------------------");

        //menyimpan data menggunakan 3 paramater
        Barang jualbarang3 = new Barang("BRG-003", "Koper", 150);
        Barang jualbarang4 = new Barang("BRG-004", "Helm", 20);

        System.out.println("idProduk = "+jualbarang3.getIdProduk()+"\n" +
                "nama = "+jualbarang3.getNama()+"\n" +
                "harga = "+jualbarang3.getHarga());
        System.out.println("--------------------------");
        System.out.println("idProduk = "+jualbarang4.getIdProduk()+"\n" +
                "nama = "+jualbarang4.getNama()+"\n" +
                "harga = "+jualbarang4.getHarga());

        //menghitung total harga barang
        double jumlahHarga = jualbarang1.getHarga() + jualbarang3.getHarga() + jualbarang4.getHarga();
        System.out.println();
        System.out.println("Total harga dari BRG-001, BRG-003, dan BRG-004 adalah "+jumlahHarga);
    }
}
