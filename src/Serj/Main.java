package Serj;

public class Main
{
public static void main(String[] args)
{
    Worker[] persArray = new Worker[5]; // Вначале объявляем массив объектов
    persArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 80000, 41); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Worker("Vasya", "Technologist", "VasVas@mail.ru", "89008009001", 80, 30);
    persArray[2] = new Worker("Petya", "Administrator", "PetPet@mail.ru", "89008009002",50,25);
    persArray[3] = new Worker("Nikita","Analyst", "NikNik@mail.ru", "89008009003", 80,28);
    persArray[4] = new Worker("Andrey", "Developer", "AndAnd@mail.ru", "89008009004",120,28);


    persArray[0].method();
}
    public static void older40(Worker[] array, int age){

        for (int i = 0; i < array.length; i++){
            int ageWorker = array[i].age;
            if (ageWorker >= age ){
                array[i].method();
            }
        }
    }
}
