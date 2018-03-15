package namvn.project2.parkwar.model;

import javax.persistence.*;
import javax.persistence.metamodel.ManagedType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TaiKhoans")
public class TaiKhoan implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer MaTk;
    @NotNull
    @Size(max = 20)
    @Column(unique = true)
    private String Tentk, MatKhau;
    @NotNull
    @Size(max = 30)
    private String Gmail, Sdt, Level, Capbac;
    @NotNull
    @Size(max = 30)
    private String Trangbi;
    @OneToMany(mappedBy = "taiKhoan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PhanHoi> phanHois = new HashSet<>();

    public NhiemVu getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(NhiemVu nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "taiKhoan")
    private NhiemVu nhiemVu;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "taiKhoan")
    private Phong phong;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "taiKhoan")
    private Phe phe;
    public TaiKhoan() {
    }

    public Set<PhanHoi> getPhanhois() {
        return phanHois;
    }


    public void setPhanhois(Set<PhanHoi> phanhoiss) {
        phanHois = phanhoiss;
    }

    public TaiKhoan(String tentk, String matKhau) {
        Tentk = tentk;
        MatKhau = matKhau;
    }

    public Integer getMaTk() {
        return MaTk;
    }

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

