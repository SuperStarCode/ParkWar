package namvn.project2.parkwar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phong {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaPhong;

    public Integer getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(Integer maPhong) {
        MaPhong = maPhong;
    }

    public String getTePhong() {
        return TePhong;
    }

    public void setTePhong(String tePhong) {
        TePhong = tePhong;
    }

    public String getTenMap() {
        return TenMap;
    }

    public void setTenMap(String tenMap) {
        TenMap = tenMap;
    }

    public Integer getMatk() {
        return Matk;
    }

    public void setMatk(Integer matk) {
        Matk = matk;
    }

    private String TePhong,TenMap;
    private Integer Matk;
}
