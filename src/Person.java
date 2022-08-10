/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 11.08.2022
 */
public class Person {
    private String firstName;
    private String lastName;
    private int ticket;

    public Person(String firstName, String lastName, int ticket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public void deleteTicket() {
        ticket--;
        System.out.println(firstName + " " + lastName + " прокатился на аттракционе, осталось билетов: " + ticket);
    }

    @Override
    public String toString() {
        return "Клиент " +
                firstName +
                " " + lastName +
                ", количество билетов: " + ticket;
    }
}
