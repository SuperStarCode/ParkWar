package namvn.project2.parkwar.repository;

import namvn.project2.parkwar.model.TaiKhoan;
import org.springframework.data.repository.CrudRepository;

public interface TaiKhoanRepository extends CrudRepository<TaiKhoan,Long>{
   // TaiKhoan findTaiKhoanByTentkAndMatKhau(TaiKhoan taiKhoan);
}
