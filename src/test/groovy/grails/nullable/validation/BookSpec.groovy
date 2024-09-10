package grails.nullable.validation

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class BookSpec extends Specification implements DomainUnitTest<Book> {

    void "title is not nullable by default"() {
        given:
        Book book = new Book()

        expect:
        !book.validate()
        book.errors.getFieldError("title").code == "nullable"
    }
}
