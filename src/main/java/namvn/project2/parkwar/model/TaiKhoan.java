package namvn.project2.parkwar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaiKhoan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer MaTk;
    private String Tentk, MatKhau, Gmail, Sdt, Level, Capbac, Trangbi;
    public void setMaTk(Integer maTk) {
        MaTk = maTk;
    }

    public String getTentk() {
        return Tentk;
    }

    public void setTentk(String tentk) {
        Tentk = tentk;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getCapbac() {
        return Capbac;
    }

    public void setCapbac(String capbac) {
        Capbac = capbac;
    }

    public String getTrangbi() {
        return Trangbi;
    }

    public void setTrangbi(String trangbi) {
        Trangbi = trangbi;
    }
}
