package HashcodeEquals;
import lombok.ToString;

import java.util.Objects;

@ToString
public class Adress {
    int pastcode;
    int apartment;
    String city;
    String country;

    public Adress(int pastcode, int apartment, String city, String country) {
        this.pastcode = pastcode;
        this.apartment = apartment;
        this.city = city;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("equals " + ((Adress)o).apartment);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return pastcode == adress.pastcode && apartment == adress.apartment && Objects.equals(city, adress.city) && Objects.equals(country, adress.country);
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode " + this.apartment);
        return Objects.hash(pastcode, apartment, city, country);
    }
}
