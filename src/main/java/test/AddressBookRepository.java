package test;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hamzaarab on 2/15/2018.
 */
public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {
    List<AddressBook> findById(Integer id);
}
