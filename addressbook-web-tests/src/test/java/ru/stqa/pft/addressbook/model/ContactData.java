package ru.stqa.pft.addressbook.model;

public class ContactData {

    //po umolchaniu novomu kontaktu prisvaevaetsa samoe bolshoe celoe chislo
    private int id = Integer.MAX_VALUE;
    private String firstname;
    private String lastname;
    private String group;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() {
        return group;
    }

    //etot metod vizvrashaet tot ze obekt, v kotorom on vizvan
    public ContactData withId(int id) {
        this.id = id;
        return this;
    }
    //etot metod vizvrashaet tot ze obekt, v kotorom on vizvan
    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }
    //etot metod vizvrashaet tot ze obekt, v kotorom on vizvan
    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }
    //etot metod vizvrashaet tot ze obekt, v kotorom on vizvan
    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;

    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }

}