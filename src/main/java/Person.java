public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean hasAge() {
        if ( (Integer) this.age == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasAddress() {
        if ( this.city == "") {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    //public PersonBuilder newChildBuilder() { /*...*/ }

    public Person build() {
        return new Person(name,surname,age,city);
    }

}
