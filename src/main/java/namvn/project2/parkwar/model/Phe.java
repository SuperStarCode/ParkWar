package namvn.project2.parkwar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaPhe;
    private String TenPhe;
    private Integer MaTk,MaPhong;

    public Integer getMaPhe() {
        return MaPhe;
    }

    public void setMaPhe(Integer maPhe) {
        MaPhe = maPhe;
    }

    public String getTenPhe() {
        return TenPhe;
    }

    public void setTenPhe(String tenPhe) {
        TenPhe = tenPhe;
    }

    public Integer getMaTk() {
        return MaTk;
    }

    public void setMaTk(Integer maTk) {
        MaTk = maTk;
    }

    public Integer getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(Integer maPhong) {
        MaPhong = maPhong;
    }
}
