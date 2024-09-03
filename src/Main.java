public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт користувача
        User user = new User("John Doe");

        // Створюємо об'єкт адреси
        Address address = new Address("123 Main St", "Kyiv", "01001", "Ukraine");

        // Встановлюємо адресу для користувача
        user.setAddress(address);

        // Виводимо адресу користувача на консоль
        System.out.println("User: " + user.getName());
        System.out.println("Address: " + user.getAddress());
    }
}
