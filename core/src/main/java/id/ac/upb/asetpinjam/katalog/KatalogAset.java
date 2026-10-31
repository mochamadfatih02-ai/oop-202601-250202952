package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;
import java.util.ArrayList;
import java.util.List;

/** Katalog aset di memori. tambah() dan semua() DISEDIAKAN; Anda mengerjakan dua overload cari() (minggu 4). */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    
    public List<Aset> cari(String kata) {
        List<Aset> hasil = new ArrayList<>();
        String kunci = kata.toLowerCase();
        for (Aset a : daftar) {
            if (a.getNama().toLowerCase().contains(kunci)) {
                hasil.add(a);
            }
        }
        return hasil;
    }

   
    public List<Aset> cari(String kata, JenisAset jenis) {
        List<Aset> hasil = new ArrayList<>();
        for (Aset a : cari(kata)) {
            if (a.getJenis() == jenis) {
                hasil.add(a);
            }
        }
        return hasil;
    }
}
