package springexample.mainDir;

/**
 * Created by hamzaarab on 2/8/2018.
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, String> {

}
