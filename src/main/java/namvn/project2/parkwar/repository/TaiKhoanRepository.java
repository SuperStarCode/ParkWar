package namvn.project2.parkwar.repository;

import namvn.project2.parkwar.model.TaiKhoan;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface TaiKhoanRepository extends CrudRepository<TaiKhoan,Long>{
    // public TaiKhoan findByTentk(String name);
}
