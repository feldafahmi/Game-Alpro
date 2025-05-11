package com.game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    boolean isRun = true;

        System.out.print("\n====WELCOME=====\n");
        System.out.println("The Last Stick - Ambatang's Challenge\n");

        System.out.println("""
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢟⣛⣛⣛⣛⡻⠿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢁⣺⣿⣿⣿⣿⣿⣿⣿⣶⠈⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠃⠼⢽⣿⣿⠿⠻⠛⠻⢿⣿⠀⣾
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠙⠁⠀⠀⢠⡀⠀⢬⠃⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠻⡄⠀⣇⠀⠃⠀⠘⡇⠀⠄⢿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⢈⢸⡿⣦⣀⢀⣀⣴⣿⡆⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠙⠳⠞⠁⠸⠷⠦⠈⠉⠉⠉⠀⠀⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠆⠀⠀⠤⠿⠂⠀⠀⠀⠀⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡄⠀⠀⠀⠈⣠⡼⠃⠀⠀⠀⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠛⠉⠀⢀⠠⠀⠀⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠠⠀⠀⠀⠀⢤⠘⠤⠁⢰⡆⢸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢠⠋⠤⡉⠐⡀⠀⢿⠸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠄⠀⠀⡘⢀⠆⠡⠀⠀⣈⠀
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⡐⠈⠤⢁⠂⠀⡟⢰
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⡀⠀⠀⠀⠠⠁⠂⠄⠀⣸⠁⣸
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠁⠀⠀⠀⠀⠀⠀⠀⠈⠁⢰⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢁⠆⠀⠀⠀⢀⣐⠀⠀⠀⢀⣸⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡁⠁⣼⡇⠀⠀⣿⣿⠀⡀⢀⣷⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⡔⠀⣼⣿⡇⣀⠀⣿⣿⡆⣡⠘⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⡿⢡⡞⢀⣾⣿⣿⣇⠀⠀⢿⣿⡇⠁⠀⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⡏⣴⡇⢠⣾⣿⣿⣿⣿⠀⠀⢸⣿⣧⠀⠀⣿⣿⣿
                ⣿⣿⣿⣿⣿⠏⣼⠍⢀⣿⣿⣿⣿⣿⣿⡀⠀⢸⣿⣿⡀⠀⣻⣿⣿
                ⣿⣿⣿⡿⠋⡸⠁⢀⣾⣿⣿⣿⣿⣿⣿⣇⢀⠈⣿⣿⡇⠀⢸⣿⣿
                ⣿⣿⠟⠁⠄⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⢿⡿⠁⠀⠘⣿⣿
                ⡿⠋⠀⠀⠀⣠⣾⣿⣿⣿⠿⠛⣛⣹⡏⠀⠀⠀⠀⢠⣾⣆⠀⢻⣿
                ⣦⣀⡀⠀⢰⣿⣿⣿⡃⠄⠤⡶⠋⠉⣁⣠⣴⡆⠰⠛⠻⠻⠢⠘⣿
                ⣿⣿⣿⣷⣿⣿⣿⣿⣿⣷⣶⣶⣾⣿⣿⣿⣯⣁⣀⡊⣘⣀⣀⣤⣿
                """);
        
    while (isRun){
        int pilih = menu();
        switch (pilih){
            case 1:
                gameplay();
                break;
            case 2:
                showPrologue();
                break;
            case 3:
                howToPlay();
                break;
            case 4:
                isRun = false;
                break;
            default:
                System.err.println("Input anda tidak ditemukan\nSilahkan pilih [1-3]");
        }
    }
    }


    // FUNCTION: main menu
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("\n===== MENU =====\n");
        System.out.println("1. Start");
        System.out.println("2. Story");
        System.out.println("3. How to play");
        System.out.println("4. Exit");
        System.out.println("---------------------------");
        System.out.print("Pilihan anda : ");
        pilih = input.nextInt();
        return pilih;
    }

    // FUNCTION: generate angka random
    public static int random(int max, int min){
        int num = (int)(Math.random() * (max - min + 1)) + min;
        return num;
    }

    // Function: How to play
    public static void howToPlay(){
        System.out.println("\n===HOW TO PLAY====\n");
        System.out.print("""
                1. Akan digenerate secara acak angka sebanyak n
                2. Akan dipilih secara random giliran bermain oleh komputer
                3. Setiap pemain harus mengambil 1, 2, atau 3 batang pada setiap gilirannya
                4. Pemain yang mengambil batang terakhir adalah pemain yang kalah
                """);
    }

    // FUNCTION: Prolog
    public static void showPrologue() {
        System.out.println("PROLOGUE: The Last Stick - Ambatang's Challenge\n");
        System.out.println("""
    Di ujung sebuah negeri yang damai, terdapat sebuah desa kecil bernama Maju Mundur.
    Selama bertahun-tahun, desa ini hidup tenteram, hingga langit berubah kelabu.

    Dari utara datanglah seorang tiran yang dikenal dengan nama Raja Ambatang
    seorang penguasa sombong, ahli dalam permainan batang kuno yang diwariskan dari para leluhurnya.

    "Barang siapa bisa mengalahkanku dalam permainan batang," katanya, "akan kuberikan kebebasannya. Tapi siapa pun yang gagal... akan menjadi pelayanku seumur hidup."

    Tak satu pun dari penduduk desa berhasil menang. Satu per satu, mereka tunduk di bawah kakinya.

    Namun hari ini...

    Seorang penantang baru berdiri.

    Kamu.

    Dibekali keberanian, akal, dan harapan dari seluruh desa, kamu menerima tantangan Raja Ambatang.
    Jika kamu gagal, kegelapan akan menyelimuti Desa Maju Mundur selamanya.

    Tapi jika kamu berhasil...

    Maka desa akan bebas, dan nama kamu akan dikenang sepanjang zaman.
    """);
        System.out.println("\n🪵 Let the game begin...\n");
    }

    // FUNCTION: Epilog
    public static void showEnding(boolean playerWon) {
        System.out.println("\n🎬 EPILOGUE\n");

        if (playerWon) {
            System.out.println("""
            Batang terakhir telah diambil... olehmu.
            Raja Ambatang terdiam. Wajahnya yang dulu congkak kini tak menyisakan satu pun senyum.
            "T-tidak... bagaimana mungkin kau tahu rahasia permainan ini?!" teriaknya, terhuyung.

            Kau menatapnya dengan tenang.
            "Permainanmu sudah berakhir, Raja."

            Raja menjatuhkan tongkatnya, dan perlahan... menghilang bersama kabut hitam.

            Sorak sorai terdengar dari arah desa.

            Anak-anak berlari, lonceng dibunyikan, dan seluruh penduduk keluar menyambut pahlawan mereka—kamu.
            Sejak hari itu, permainan batang tidak lagi menjadi kutukan, tapi menjadi simbol kecerdasan dan kebebasan.
            Dan namamu... diukir di batu tertinggi desa, dikenang oleh generasi yang akan datang.

            ✨ You have defeated King Ambatang. Peace has returned.
        """);
        } else {
            System.out.println("""
            Batang terakhir diambil... oleh Raja Ambatang.
            Dia tertawa, keras dan panjang.
            "Kau sudah berusaha... tapi tetap saja, tak seorang pun bisa mengalahkanku."
            
            Suara penduduk desa menghilang, satu demi satu cahaya padam.
            Tapi dalam kegelapan itu, harapan tak padam.
            "Kamu boleh kalah hari ini... tapi lain waktu, kamu akan kembali lebih kuat."
            
            🔁 Try again, and break his grip over your people.
        """);
        }
    }

    // FUNCTION: gameplay
    public static void gameplay() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n===== Game Start =====\n");

        System.out.print("Masukkan batas atas: ");
        int max = input.nextInt();
        System.out.print("Masukkan batas bawah: ");
        int min = input.nextInt();

        // Tentukan giliran pertama secara acak
        boolean isPlayerTurn = random(0, 1) == 1;
        if (isPlayerTurn == true)
            System.out.println("Player mengawali permainan");
        else
            System.out.println("Komputer mengawali permainan");

        // Generate jumlah batang awal sehingga komputer bisa memaksa kemenangan:
        // - Jika Player mulai -> batang % 4 == 1 (posisi kalah bagi yang mulai)
        // - Jika Komputer mulai -> batang % 4 != 1 (komputer punya langkah pemenang)
        int batang;
        do {
            batang = random(min, max);
        } while (batang < 2     // minimal 2 batang supaya game bisa berjalan
                || (isPlayerTurn  && batang % 4 != 1)
                || (!isPlayerTurn && batang % 4 == 1));
        System.out.println("\nJumlah batang awal: " + batang);

        // Loop utama
        while (batang > 0) {
            System.out.println("\nBatang tersisa: " + batang);
            dispbatang(batang);

            int ambil;
            if (isPlayerTurn) {
                // Giliran Player: bebas ambil 1–3
                do {
                    System.out.print("\nAmbil 1-3 batang: ");
                    ambil = input.nextInt();
                } while (ambil < 1 || ambil > 3 || ambil > batang);
                System.out.println("Kamu mengambil " + ambil + " batang.");
            } else {
                /*
                Giliran Komputer

                STRATEGI: buat Batang mod 4 == 1 (jika batang >= 4)
                Jika sisa %4 !=1, ambil untuk membuat sisa ≡1
                Misal,
                sisa 16 batang, ambil 3 agar sisa 13
                sisa 15 batang, ambil 2 agar sisa 13
                sisa 14 batang, ambil 1 agar sisa 13
                */
                int sisaMod = batang % 4;
                if (batang > 4) {
                    if (sisaMod != 1) {
                        if (sisaMod == 0)
                            ambil = 3;
                        else
                            ambil = sisaMod - 1;
                    }
                    else {
                        ambil = 1;
                    }
                } else {
                    /*
                    Saat batang <= 4, maka ambil batang-1
                    batang = 2, ambil 1
                    batang = 3, ambil 2
                    batang = 4, ambil 3
                     */
                    ambil = batang - 1;
                }

                System.out.println("\nKomputer mengambil " + ambil + " batang.");
            }

            batang -= ambil;

            // Cek selesai
            if (batang == 0) {
                if (isPlayerTurn) {
                    // Player mengambil batang terakhir, player kalah
                    System.out.println("\nKamu mengambil batang terakhir!");
                    System.out.println("=====KAMU KALAH=====");
                    System.out.println("======WEH CUPU======");
                    showEnding(false);
                } else {
                    // Komputer mengambil batang terakhir, player menang
                    System.out.println("\nKomputer mengambil batang terakhir!");
                    System.out.println("=====KAMU MENANG=====");
                    showEnding(true);
                }
                break;
            }

            isPlayerTurn = !isPlayerTurn;
        }
    }


    public static void dispbatang(int maxDisp) {
        while (maxDisp > 0) {
            System.out.print("🪵 ");
            maxDisp -= 1;
        }
    }
}
