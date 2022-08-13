import java.util.*;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 11.08.2022
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = (Queue<Person>) generateClients();
        while (!attraction.isEmpty()) {
            Person person = attraction.poll();
            if (person.getTicket() > 0) {
                if (person.getTicket() > 1) {
                    person.deleteTicket();
                    attraction.offer(person);
                } else {
                    person.deleteTicket();
                }
            }else {
                System.out.println(person + ". Нет билет! Штраф пожалуйста заплатите...");
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Иван", "Кудрявцев", new Random().nextInt(5) + 1));
        clients.add(new Person("Семен", "Никифоров", new Random().nextInt(5) + 1));
        clients.add(new Person("Николя", "Семенов", new Random().nextInt(5) + 1));
        clients.add(new Person("Светлана", "Аникеева", new Random().nextInt(5) + 1));
        clients.add(new Person("Павлунтий", "Василенко",0));
        return clients;
    }
}
