
package javaapplication1;
import java.util.Scanner;
public class MenghitungPPH {
    public static void main(String[] args) {
        int pph = 0, ptkp = 0, pkp, pph1,pph2, pph3, pph4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Gaji Bruto : ");
        int gaji = sc.nextInt();
        System.out.println("NPWP : ");
        System.out.println("(1) Punya");
        System.out.println("(2) Tidak Punya");
        int npwp = sc.nextInt();
        System.out.println("Status Kawin : ");
        System.out.println("(1) Sudah ");
        System.out.println("(2) Belum ");
        int kawin = sc.nextInt();
        ptkp=54000000;
        if(kawin==1){
            ptkp = ptkp + 4500000;
        }
        System.out.println("Jumlah Tanggungan : ");
        int tanggungan = sc.nextInt();
        if(tanggungan>3){
            tanggungan = 3;
        }
        ptkp = ptkp + 4500000 * tanggungan;
        pkp = gaji - ptkp;
        if(pkp<50000000){
            pph = pkp * 5 / 100;
        }else if(pkp<=250000000){
            pph1=50000000 * 5 / 100;
            pph2=(pkp-50000000)*15/100;
            pph=pph1 + pph2;
        }else if (pkp<=500000000){
            pph1=50000000 * 5 / 100;
            pph2=200000000 * 15 /100;
            pph3=(pkp-250000000)*25/100;
            pph=pph1+pph2+pph3;
        }else{
            pph1=50000000 * 5 / 100;
            pph2=200000000 * 15 /100;
            pph3=250000000 * 25/100;
            pph4=(pkp-500000000)*30/100;
            pph=pph1+pph2+pph3+pph4;
            
        }
            
        if(npwp==2){
            pph = pph * 120 / 100;
        }else{
            pph = pph;
        }
            
        System.out.println("PPH : "+pph);
    }
    
}
