package demo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Abderrazak BOUADMA
 * Date: 4/15/15
 * Time: 9:56 AM
 */
@Repository
public interface BookRepository extends MongoRepository<Book,String>{
}
