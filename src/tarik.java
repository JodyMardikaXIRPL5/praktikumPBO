/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jody Mardika
 */
import javax.swing.JOptionPane;
public class tarik {
    private int saldo ;
    public void ambil (int tab,int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BEI tidak menerima uang koin\nSilahkan ulangi lagi","Transaksi Gagal",0);
        else{
            if (t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi\nSilahkan lakukan penyetoran","Transaksi Gagal",0);
            else if (t<50000)
                JOptionPane.showMessageDialog(null, "Besaran minimal pengambilan adalah Rp 50000","Transaksi Gagal",0);
            else{
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00,","CAUTION",2);
            }
        }
    }
public int getsaldo(){
    return saldo;
}
}
