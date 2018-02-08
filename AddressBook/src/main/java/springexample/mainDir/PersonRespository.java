package springexample.mainDir;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by hamzaarab on 2/8/2018.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public class PersonRespository {

    //List<Person> findByLastName(@Param("name") String lastName);

}
