package com.github.affandes.kuliah.pm;

import java.util.LinkedList;

public class BrowserHistory {
    private LinkedList<String> history; // Menyimpan daftar history

    // Konstruktor untuk menginisialisasi history
    public BrowserHistory() {
        history = new LinkedList<>();
    }

    // Metode untuk menampilkan semua history
    public void view() {
        if (history.isEmpty()) {
            System.out.println("History browser kosong.");
            return;
        }
        System.out.println("History Browser (dari yang terbaru):");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }

    // Metode untuk menambahkan website baru ke dalam history
    public void browse(String website) {
        history.add(website); // Menambahkan website ke history
        System.out.println("Mengunjungi: " + website);
    }

    // Metode untuk kembali ke website sebelumnya dan menghapus history terakhir
    public void back() {
        if (history.isEmpty()) {
            System.out.println("Tidak ada history untuk kembali.");
            return;
        }
        String lastVisited = history.removeLast(); // Menghapus website terakhir
        System.out.println("Kembali dari: " + lastVisited);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        // Menambahkan website ke dalam history
        browserHistory.browse("www.google.com");
        browserHistory.browse("www.wikipedia.org");
        browserHistory.browse("www.github.com");

        // Menampilkan history
        browserHistory.view(); // Menampilkan semua history

        // Kembali ke website sebelumnya
        browserHistory.back(); // Menghapus history terakhir
        browserHistory.view(); // Menampilkan history setelah kembali

        // Kembali lagi
        browserHistory.back(); // Menghapus history terakhir
        browserHistory.view(); // Menampilkan history setelah kembali

        // Kembali lagi
        browserHistory.back(); // Menghapus history terakhir
        browserHistory.view(); // Menampilkan history setelah kembali

        // Mencoba kembali saat history kosong
        browserHistory.back(); // Output: Tidak ada history untuk kembali.
    }
}
