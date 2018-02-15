package test;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, String> {

    List<BuddyInfo> findByName(String name);
}
