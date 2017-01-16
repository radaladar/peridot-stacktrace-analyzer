/// Created by BB on 2017-01-16.
package packages;

import model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository {
    List<User> findAllById();
}
