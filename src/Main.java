public class Main {
    public static void main(String[] args) {
        // ��������� ��'��� �����������
        User user = new User("John Doe");

        // ��������� ��'��� ������
        Address address = new Address("123 Main St", "Kyiv", "01001", "Ukraine");

        // ������������ ������ ��� �����������
        user.setAddress(address);

        // �������� ������ ����������� �� �������
        System.out.println("User: " + user.getName());
        System.out.println("Address: " + user.getAddress());
    }
}
