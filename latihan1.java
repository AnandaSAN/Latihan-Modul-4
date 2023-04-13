import java.util.HashMap;
import java.util.Scanner;

public class latihan1 {
    String nama, kelas, matkulPraktikum;
    int nim;

    public latihan1(String nama, String kelas, String mat, int nim){
        this.nama = nama;
        this.kelas = kelas;
        this.matkulPraktikum = mat;
        this.nim = nim;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, latihan1> hashMap = new HashMap<>();
        String userInput;
        latihan1 data;

        hashMap.put("1", new latihan1("Ananda", "3A", "Struktur Data", 2020201));
        hashMap.put("2", new latihan1("Salasa", "3B", "Basis Data", 2020202));
        hashMap.put("3", new latihan1("Artha", "3C", "Pemrograman Lanjut", 2020203));

        System.out.print("Masukkan ID: ");
        userInput = input.nextLine();
        data = hashMap.get(userInput);

        if (data != null){
            System.out.println("Data Mahasiswa: "+data.nama+", kelas: "+data.kelas+", matkul: "+data.matkulPraktikum + ", nim: "+data.nim);
        }
    }
}