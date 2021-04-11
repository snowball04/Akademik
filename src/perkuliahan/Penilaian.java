
package perkuliahan;

public class Penilaian {
    public String hitungNilaiHuruf(int nilaiMatematika, int nilaiFisika, int nilaiKimia, int nilaiBiologi, int nilaiKomputer){
        String nilaiDalamHuruf;
        int nilaiRataRata = (nilaiMatematika + nilaiFisika + nilaiKimia + nilaiBiologi + nilaiKomputer) / 5;
        
        if(nilaiRataRata <= 100 && nilaiRataRata >= 90){
            nilaiDalamHuruf = "A";
        }else if(nilaiRataRata <= 89 && nilaiRataRata >= 80){
            nilaiDalamHuruf = "B";
        }else if(nilaiRataRata <= 79 && nilaiRataRata >= 70){
            nilaiDalamHuruf = "C";
        }else if(nilaiRataRata <= 69 && nilaiRataRata >= 60){
            nilaiDalamHuruf = "D";
        }else if(nilaiRataRata <= 59 && nilaiRataRata >= 50){
            nilaiDalamHuruf = "E";
        }else {
            nilaiDalamHuruf = "nilai dalam jangkauan";
        } 
        return nilaiDalamHuruf;
    }
    
}
