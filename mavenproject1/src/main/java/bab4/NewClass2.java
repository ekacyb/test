/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;
import java.util.Scanner;
/**
 *
 * @author A-22
 */
public class NewClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.println("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Input umur
        System.out.println("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        // Menampilkan keterangan sesuai umur
//        String keterangan = switch (umur) {
//            case 17 -> "Sudah boleh mendapatkan SIM";
//            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33 -> "Anda dalam masa keemasan, manfaatkan waktu sebaik-baiknya";
//            case 50 -> "Sebaiknya anda sudah berhati-hati untuk kulineran";
//            default -> {
//                if (umur < 10) {
//                    yield "Terlalu muda untuk membuat akun Facebook";
//                } else {
//                    yield "Tidak ada keterangan khusus";
//                }
//            }
//        };
        String keterangan;
        switch (umur) {
            // Kasus khusus untuk umur 17
            case 17:
                keterangan = "Sudah boleh mendapatkan SIM";
                break;
            // Kasus khusus untuk umur 18
            case 18:
                keterangan = "Anda dalam masa keemasan, manfaatkan waktu sebaik-baiknya";
                break;
            // Kasus khusus untuk umur kurang dari 10 tahun
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                keterangan = "Terlalu muda untuk membuat akun Facebook";
                break;
            // Default case untuk umur di atas 50 tahun
            default:
                if (umur > 50) {
                    keterangan = "Sebaiknya anda sudah berhati-hati untuk kulineran";
                } else {
                    keterangan = "Tidak ada keterangan khusus";
                }
        }


        // Menampilkan nama dan keterangan
        System.out.println("Nama: " + nama);
        System.out.println("Keterangan: " + keterangan);
    }
}

