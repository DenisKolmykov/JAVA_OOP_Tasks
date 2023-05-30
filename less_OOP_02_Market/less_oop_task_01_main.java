package less_OOP_02_Market;

import java.util.ArrayList;
import java.util.Random;

/*
 * Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдаёт заказы)

Формат сдачи: ссылка на гитхаб проект
 */
public class less_oop_task_01_main {
    public static void main(String[] args){
        Random rd = new Random();

        Market newMarket = new Market();

        // формирование Cписка товаров
        String [] goods = {"Велосипед", "Магнитола", "Плеер", "Телевизор", "Стиральная машина", 
                            "Хлеб", "Сок", "Детская игрушка", "Батарейки", "Тарелка", "Постельное белье"};
        
        
        for (String n : goods) {
            Goods newGoods = new Goods();
            newGoods.setGoodsName(n);
            Double cost = rd.nextDouble(10000);
            newGoods.setPrice(cost);
            //System.out.println(newGoods);
            newMarket.addGood(newGoods);
        }
        newMarket.printAvailableGoods();
        //-----------------------------------
        
        // Регистрация покупателей (формирование Списка покупателей)
        String [] castomerNames = {"Иван", "Петр", "Сергей", "Марина", "Юля", "Илья", 
                                    "Василий", "Борис", "Денис", "Татяна", "Ирина", "Светлана"};
        ArrayList <Customer> customerList = new ArrayList<>();
        
        int x = 2; // количество покупателей
        for (int i = 0; i < x; i++){
            Customer newCustomer = new Customer();
            String custName = castomerNames[rd.nextInt(castomerNames.length-1)];
            newCustomer.setCustomerName(custName);
            //System.out.println(newCustomer);
            customerList.add(newCustomer);
        }
        //-----------------------------------

        // имитация появления покупателей в магазине (формирование очереди)
        ArrayList <Customer> customerListCopy = new ArrayList<>(customerList); // для рандомного формирования очереди
        while (customerListCopy.size() > 0) {
            int index  = rd.nextInt(customerListCopy.size());
            Customer myCustomer = customerListCopy.get(index);
            customerListCopy.remove(index);
            newMarket.MarketBehaviour(myCustomer);
        }
        newMarket.printQueue(); // смотрим очередь покупателей
        //-----------------------------------

        newMarket.startSale(); // запускаем РАСПРОДАЖУ
        //-----------------------------------
        
        // выводим список покупателей и их покупки
        for (Customer cus : customerList){
            cus.printPurchaseGoods();
        }

        newMarket.printAvailableGoods(); // остатки товара
    }
}
