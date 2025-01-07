package test.shani.krimelovsky;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.lang.Integer.parseInt;

public class Transaction {
    private int id;
    private String description;
    private int schoolId;
    private double price;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public Transaction(String id, String description, String date, String
            price, String schoolId) {
        this.id = parseInt(id);
        this.schoolId= parseInt(schoolId);
        this.price=Double.parseDouble(price);
        this.description = description;
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

