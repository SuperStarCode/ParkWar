package namvn.project2.parkwar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhanHoi {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer MaPh;
    private String Mota;
    private int Rank;

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public Integer getMatk() {
        return Matk;
    }

    public void setMatk(Integer matk) {
        Matk = matk;
    }

    private Integer Matk;

    public Integer getMaPh() {
        return MaPh;
    }

    public void setMaPh(Integer maPh) {
        MaPh = maPh;
    }
}
