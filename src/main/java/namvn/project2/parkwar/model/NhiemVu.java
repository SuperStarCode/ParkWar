package namvn.project2.parkwar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhiemVu {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaNv;
    private String Mota,Thoigian;
    private int Vang,Bve,Lxa,Hsinh;
    private Integer MaTk;



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

    public Integer getMaTk() {
        return MaTk;
    }

    public void setMaTk(Integer maTk) {
        MaTk = maTk;
    }
}
