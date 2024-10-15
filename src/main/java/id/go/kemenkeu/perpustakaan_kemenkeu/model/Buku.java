package id.go.kemenkeu.perpustakaan_kemenkeu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
public class Buku {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int harga;
    private char header;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }



}
