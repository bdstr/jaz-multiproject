package pl.edu.pjwstk.jazapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjwstk.jazapi.model.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    //    @Query(value="SELECT c FROM Car c WHERE c.manufacturer=?1")
    List<Car> getByManufacturer(String manufacturer);
}
