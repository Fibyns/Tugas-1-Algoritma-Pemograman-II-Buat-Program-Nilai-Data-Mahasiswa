/*kelompok algoritma Tugas 1 :
Fiby Naya Sari 227064516076
Nadya Mahza Khairani 227064516102*/
package programtugas1;
import java.util.Scanner;
public class programtugas1no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //membuat scanner baru dgn nama input
        double rata = 0, total = 0, uts = 0, uas = 0; //mendeklarasikan variable rata, total, uts, uas dengan tipe data double

        System.out.print("a. Jumlah Data ? "); //menampilkan tulisan "a. Jumlah Data ? " untuk inputan dari keyboard
        int n = input.nextInt(); //menyimpan inputan ke var n
        String[] nama = new String[n]; //mendeklarasi array dgn user nama
        
        int[][] d = new int[n][5]; //mendeklarasikan array 2 dimensi dgn tipe data integer. Dimensi ke-1 = n elemen, dimensi ke-2 = 5 elemen
        
        //mengisi data nilai mahasiswa
        for(int i=0; i<n; i++){ //melakukan perulangan 0 sampai kurang dri n
            System.out.print("b. Nama ? "); //menampilkan tulisan "b. Nama ? " untuk inputan dari keyboard
            nama[i] = input.next(); //menyimpan inputan ke var nama[i] dengan menggunakan scanner
            System.out.print("c. Nilai UTS ? "); //menampilkan tulisan "c. Nilai UTS ? " untuk inputan dari keyboard
            d[i][0] = input.nextInt(); //menyimpan inputan ke var d[i][0] / var uts dengan menggunakan scanner
            System.out.print("d. Nilai UAS ? "); //menampilkan tulisan "d. Nilai UAS ? " untuk inputan dari keyboard
            d[i][1] = input.nextInt(); //menyimpan inputan ke var d[i][1] / var uas dengan menggunakan scanner
            d[i][2] = d[i][0] + d[i][1]; //mengitung total atau d[i][2], dgn cara var d[i][0]+d[i][1]
            System.out.println(); //membuat baris baru
        }
        System.out.println(); //membuat baris baru
        System.out.println("No\tNama\tUTS\tUAS\tTotal\tRata-Rata"); //menampilkan tulisan "No\tNama\tUTS\tUAS\tTotal\tRata-Rata" 
        System.out.println("================================================="); //menampilkan tulisan "================================================="
        
        //menampilkan isi array yang sudah tersimpan dalam variabel
        for(int i=0; i<d.length; i++){ 
            System.out.print((i+1)+"."+"\t"+nama[i]+"\t"); //menampilkan var nama[i]
            for(int j=0; j<3; j++){
                System.out.print(d[i][j]+"\t"); //menampilkan var d[i][j]
            }
            uts=d[i][0]; //memasukkan nilai d[i][0] ke dalam variabel uts
            uas=d[i][1]; //memasukkan nilai d[i][1] ke dalam variabel uas
            total=d[i][2]; //memasukkan nilai d[i][2] ke dalam variabel total
            total=uts+uas; //menghitung total dgn var uts+uas
            rata=total/2; //menghitung rata-rata dgn cara total di bagi 2, karena ar 2 = uts & uas
            System.out.println(rata+"\t"); //menampilkan isi dari var rata 
        }
    }
}
