import VCD.*;
import javax.swing.JOptionPane;

public class App extends FilmVcd {
    public static void main(String[] args) throws Exception {
        App Vcd = new App();
        String judul, aktor, sutradara, publisher, kategori, stok;

        String input = JOptionPane.showInputDialog("Masukkan jumlah data VCD yang akan dientrikan: ");
        int jumlahVcd = Integer.parseInt(input);

        for (int i=0;i<jumlahVcd;i++){
            JOptionPane.showMessageDialog(null, "Data VCD ke "+(i+1));
            System.out.println("Data VCD ke "+(i+1));
        
        judul = JOptionPane.showInputDialog("Judul: ");
        Vcd.setJudul(judul);
        Vcd.tampil("Judul: "+ Vcd.getJudul());

        aktor = JOptionPane.showInputDialog("Aktor: ");
        Vcd.setAktor(aktor);
        Vcd.tampil("Aktor: "+Vcd.getAktor());

        sutradara = JOptionPane.showInputDialog ("Sutradara: ");
        Vcd.setSutradara(sutradara);
        Vcd.tampil("Sutradara: "+Vcd.getSutradara());

        publisher = JOptionPane.showInputDialog ("Publisher: ");
        Vcd.setPublisher(publisher);
        Vcd.tampil("Publisher: "+Vcd.getPublisher());

        kategori = JOptionPane.showInputDialog ("Kategori: ");
        Vcd.setKategori(kategori);
        Vcd.tampil("Kategori: "+Vcd.getKategori());

        stok = JOptionPane.showInputDialog ("Stok: ");
        Vcd.setStok(stok);
        Vcd.tampil("Stok: "+Vcd.getStok());
        
        Vcd.hapus();
        judul=null;
        aktor=null;
        sutradara=null;
        publisher=null;
        kategori=null;
        stok=null;
        Vcd=null;
        }
        System.exit(0);        
    }
}
