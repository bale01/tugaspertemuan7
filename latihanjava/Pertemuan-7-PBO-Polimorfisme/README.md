# Pertemuan 7 PBO Polimorfisme
Saya membuat project ini dengan menggunakan Apche NetBeans IDE 15 dan membuat 5 file java dengan salah satu diantaranya adalah Main.java sebagai Class utama. Pada Project kali ini saya akan membuat perhitungan bangun ruas Persegi, Lingkaran dan Segitiga. Dan ketiga file tersebut merupakan child class dari BangunDatar.java sebagai parent class. Jadi strukturnya akan seperti ini,

    - Main.java           (Main Class)
    - BangunDatar.java    (Parent Class)
    - Lingkaran.java      (Child Class)
    - Persegi.java        (Child Class)
    - Segitiga.java       (Child Class)



Setelah ini saya mulai menulis baris code untuk parent class nya terlebih dahulu, saya membuat dua fungsi yang akan di jadikan override di kelas child yaitu luas dan keliling kedua fungsi ini akan di turunkan juga di child class

        public class BangunDatar {
            public float luas(){
                return 0;
            }
            public float keliling(){
                return 0;
            }
        } 


Setelah saya membuat fungsi di class BangunDatar.java, saya langsung membuat override untuk ketiga kelas child, namun sebelum itu override sendiri artinya adalah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.

Maka code di dalam child class tidak akan berbeda jauh, hanya berbeda dari segi rumus penyelesaian, selebihnya akan sama saja dalam penerapan code nya. Dan sample code nya akan menjadi seperti ini.
- Persegi


      public class Persegi extends BangunDatar {
          private final double sisi = 5;

          public float luas(){
              return (float) (this.sisi * this.sisi);
          }

          public float keliling(){
              return (float) (4 * this.sisi);
          }
      }

- Lingkaran


      public class Lingkaran extends BangunDatar{
          protected final int r = 10;

          public float luas(){
              double phi = 3.14;
              return (float) (phi * r * r);
          }

          public float keliling(){
              double phi = 3.14;
              return (float) (2 * phi * r);
          }
      }

- Segitiga


      public class Segitiga extends BangunDatar {
          protected final int alas = 5;
          protected final int tinggi = 10;

          public float luas(){
              return (float) (0.5 * this.alas * this.tinggi);
          }

          public float keliling(){
              return (float) (3 * this.alas);
          }
      }

Dan di akhir kita hanya membuat objek di class Main atau file utama kita, sehingga program kita bisa di jalankan dan mengeluarkan output. Sehingga full code Main.java akan menjadi sebagi berikut,

      public class Main {
          public static void main(String[] args) {
              Lingkaran lingkaran = new Lingkaran();
              Segitiga segitiga = new Segitiga();
              Persegi persegi = new Persegi();

              // Lingkaran
              System.out.println("Luas Lingkaran          : " + lingkaran.luas());
              System.out.println("Keliling Lingkaran      : " + lingkaran.keliling() + "\n");

              // Segitiga
              System.out.println("Luas Segitiga           : " + segitiga.luas());
              System.out.println("Keliling Segitiga       : " + segitiga.keliling() + "\n");

              // Persegi
              System.out.println("Luas Persegi            : " + persegi.luas());
              System.out.println("Keliling Persegi        : " + persegi.keliling() + "\n");
          }
      }

Maka jika Program di Run hasil output yang dikeluarkan akan menjadi seperti gambar di bawah ini,

![image](https://user-images.githubusercontent.com/115923969/200831769-e23e0565-45fb-4f90-9460-cdefc5416b6f.png)

