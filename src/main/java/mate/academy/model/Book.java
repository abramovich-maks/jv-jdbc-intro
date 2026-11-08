package mate.academy.model;

import java.math.BigDecimal;

public class Book {
    private Long id;
    private String title;
    private BigDecimal price;

    Long getId() {
        return id;
    }

    Book setId(final Long id) {
        this.id = id;
        return this;
    }

    String getTitle() {
        return title;
    }

    Book setTitle(final String title) {
        this.title = title;
        return this;
    }

    BigDecimal getPrice() {
        return price;
    }

    Book setPrice(final BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

