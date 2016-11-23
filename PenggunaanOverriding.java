public class PenggunaanOverriding {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();
        Binatang bm = new Mamalia();
        
        b.begerak();
        m.begerak();
        bm.begerak();
        bm.berkembangBiak();
    }
}

