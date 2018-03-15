package namvn.project2.parkwar.repository;

import namvn.project2.parkwar.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,Long>{
    @Query(value = "select * from taikhoans b where b.tentk=?1", nativeQuery = true)
    public List<TaiKhoan> findByTentk(String tentk);
    // public TaiKhoan findBy(String name);
}
