package namvn.project2.parkwar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "phongs")
public class Phong {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaPhong;
    @NotNull
    @Size(max = 30)
    private String TenPhong,TenMap;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taikhoan_id", nullable = false,foreignKey = @ForeignKey(name = "PHONG_TAIKHOAN_FK"))
    private TaiKhoan taiKhoan;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "phong")
    private Phe phe;
    public Integer getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(Integer maPhong) {
        MaPhong = maPhong;
    }

    public String getTePhong() {
        return TenPhong;
    }

    public void setTePhong(String tePhong) {
        TenPhong = tePhong;
    }

    public String getTenMap() {
        return TenMap;
    }

    public void setTenMap(String tenMap) {
        TenMap = tenMap;
    }



}
