package id.go.kemenkeu.perpustakaan_kemenkeu.model;
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int harga;
    private char header;

    public Buku(int id, String judul, String penulis, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public Buku(int id, String judul, String penulis, int tahunTerbit, int harga, char header) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.header = header;
    }

    public Buku(String judul) {
        this.judul = judul;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getHeader() {
        return header;
    }

    public void setHeader(char header) {
        this.header = header;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void info(){
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Harga: " + harga);
    }
    public void info(int tipe){
        if(tipe == 1){
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
        }else {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
        }
    }
    public void info(String tipe){

    }
}
