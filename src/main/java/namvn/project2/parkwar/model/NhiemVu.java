package namvn.project2.parkwar.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "NhiemVus")
public class NhiemVu {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaNv;
    @NotNull
    @Size(max = 50)
    private String Mota,Thoigian;
    private int Vang,Bve,Lxa,Hsinh;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taikhoan_id", nullable = false,foreignKey = @ForeignKey(name = "NHIEMVU_TAIKHOAN_FK"))
    private TaiKhoan taiKhoan;


    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getThoigian() {
        return Thoigian;
    }

    public void setThoigian(String thoigian) {
        Thoigian = thoigian;
    }

    public int getVang() {
        return Vang;
    }

    public void setVang(int vang) {
        Vang = vang;
    }

    public int getBve() {
        return Bve;
    }

    public void setBve(int bve) {
        Bve = bve;
    }

    public int getLxa() {
        return Lxa;
    }

    public void setLxa(int lxa) {
        Lxa = lxa;
    }

    public int getHsinh() {
        return Hsinh;
    }

    public void setHsinh(int hsinh) {
        Hsinh = hsinh;
    }

    public Integer getMaNv() {
        return MaNv;
    }

    public void setMaNv(Integer maNv) {
        MaNv = maNv;
    }


}
