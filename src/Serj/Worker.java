package Serj;

public class Worker {

        String name;
        String position;
        String email;
        String telephone;
        int salary;
        int age;
Worker(String name,String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
}

        void method() {
        System.out.println("Name:" + name);
                System.out.println("Position:" + position);
                System.out.println("email:" + email);
                System.out.println("Telephone:" + telephone);
                System.out.println("Salary:" + salary + " RUB");
                System.out.println("Age:" + age);
                System.out.println();

        }
}

