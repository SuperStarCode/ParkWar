package namvn.project2.parkwar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PhanHois")
public class PhanHoi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer MaPh;
    @NotNull
    @Size(max = 200)
    private String Mota;
    private int Rank;

    public PhanHoi() {
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taikhoan_id", nullable = false,foreignKey = @ForeignKey(name = "PHANHOI_TAIKHOAN_FK"))
    private TaiKhoan taiKhoan;

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

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





    public Integer getMaPh() {
        return MaPh;
    }

    public void setMaPh(Integer maPh) {
        MaPh = maPh;
    }
}
