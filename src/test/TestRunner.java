
package test;

import perkuliahan.Penilaian;

public class TestRunner {
    public static void main(String[] args) {
        Penilaian perkuliahan = new Penilaian();
        
        System.out.println(perkuliahan.hitungNilaiHuruf(65, 100, 80, 95, 100));
        System.out.println(perkuliahan.hitungNilaiHuruf(80, 90, 90, 90, 95));
        System.out.println(perkuliahan.hitungNilaiHuruf(95, 90, 95, 100, 80));
        System.out.println(perkuliahan.hitungNilaiHuruf(75, 65, 85, 70, 55));
        System.out.println(perkuliahan.hitungNilaiHuruf(60, 60, 65, 60, 60));
        System.out.println(perkuliahan.hitungNilaiHuruf(50, 70, 50, 50, 50));
    }
    
}
