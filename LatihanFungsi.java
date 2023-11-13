import java.util.Scanner;

public class LatihanFungsi {
        static void tampilNama(int id){
            String namapelanggan[]={"Ali", "Budi", "Dani", "Edi","umar"};
            System.out.println(namapelanggan[id-1]);
        }

        static int hitunganTarif(int jumlahpakai){
        int harga=0;
            if(jumlahpakai <10 || jumlahpakai<10){
                jumlahpakai=10;
                harga=jumlahpakai*2000;
            }
            else if(jumlahpakai>=11 && jumlahpakai<=20){
                    harga =jumlahpakai*3000;
            }
            else if(jumlahpakai>=21 && jumlahpakai<=30){
                    harga =jumlahpakai*4000;
            }
            
            else if(jumlahpakai>=31){
             harga = jumlahpakai*5000;
            
            }
            
            System.out.println(harga);
            return harga;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;

        do{
            System.out.println("Masukkan ID Pelanggan : ");
            int namaPelanggan = input.nextInt();
            System.out.println("ID Pelanggan : " + namaPelanggan);
            System.out.print("Nama Pelanggan : ");
            tampilNama(namaPelanggan);

            System.out.print("Masukkan Banyak Pemakaian Air : ");
            int jumlahpakai = input.nextInt();
            System.out.print("Jumlah Tarif : ");
            hitunganTarif(jumlahpakai);

            System.out.println("Ingin Coba Lagi ? Y/N");
            String ulang = input.next();
            if(ulang.equalsIgnoreCase("N")){
                status = false;
            }else{
                status = true;
            }
            }while (status);
input.close();            
}
}