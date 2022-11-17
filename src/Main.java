public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        System.out.println("ДЗ 2:");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("ДЗ 3:");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName1.replace('ё', 'e'));
    }
}
