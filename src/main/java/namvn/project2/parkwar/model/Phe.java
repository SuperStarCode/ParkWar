package namvn.project2.parkwar.model;

import javax.persistence.*;

@Entity
@Table(name = "Phes")
public class Phe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaPhe;
    private String TenPhe;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taikhoan_id", nullable = false,foreignKey = @ForeignKey(name = "PHE_TAIKHOAN_FK"))
    private TaiKhoan taiKhoan;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phong_id", nullable = false,foreignKey = @ForeignKey(name = "PHE_PHONG_FK"))
    private Phong phong;
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


}
