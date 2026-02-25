public class DataDosen10 {
    void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        int i = 1;
        for (Dosen10 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i++);
            tampilkan(d);
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen10 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen10 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / countPria));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / countWanita));
    }

    void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 tertua = arrayOfDosen[0];
        for (Dosen10 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua");
        tampilkan(tertua);
    }

    void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 termuda = arrayOfDosen[0];
        for (Dosen10 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda");
        tampilkan(termuda);
    }

    void tampilkan(Dosen10 d) {
        System.out.println("Kode          : " + d.kode);
        System.out.println("Nama          : " + d.nama);
        System.out.println("Jenis Kelamin : " + d.getJenisKelamin());
        System.out.println("Usia          : " + d.usia);
        System.out.println("---------------------------");
    }
}
