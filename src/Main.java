import java.util.*;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 11.08.2022
 */
public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = (Queue<Person>) generateClients();
        while (!attraction.isEmpty()) {
            if (attraction.peek().getTicket() > 1) {
                attraction.peek().deleteTicket();
                attraction.offer(attraction.poll());
            } else {
                attraction.peek().deleteTicket();
                attraction.poll();
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Иван", "Кудрявцев", new Random().nextInt(5) + 1));
        clients.add(new Person("Семен", "Никифоров", new Random().nextInt(5) + 1));
        clients.add(new Person("Николя", "Семенов", new Random().nextInt(5) + 1));
        clients.add(new Person("Светлана", "Аникеева", new Random().nextInt(5) + 1));
        clients.add(new Person("Павлунтий", "Василенко", new Random().nextInt(5) + 1));
        return clients;
    }
}
