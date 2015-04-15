package demo.domain;

import org.springframework.data.annotation.Id;

/**
 * Created with IntelliJ IDEA.
 * User: Abderrazak BOUADMA
 * Date: 4/15/15
 * Time: 9:55 AM
 */
public class Book {

    @Id
    private String id;
    private String title;
    private String author;

}
