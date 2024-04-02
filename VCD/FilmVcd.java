package VCD;

public class FilmVcd extends Vcd {
    private int stok;
    protected String namaClass = "FilmVcd";

    protected void setStok (String stok) {
        this.stok = Integer.parseInt(stok);
        stok = null;
    }
    protected long getStok () {
        return stok;
    }
    protected String keterangan(){
        return (namaClass + " : ini adalah class" + namaClass);
    }
    public String keterangan_String(){
        return super.namaClass+ " : "+super.keterangan();
    }
    protected void hapus(){
        stok = 0;
        super.hapus();
    }
}
