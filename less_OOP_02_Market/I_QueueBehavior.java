package less_OOP_02_Market;




/*
 * MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 */
public interface I_QueueBehavior {
    void addGood(Goods goods); // добавляет товар в каталог
    //void removeGood (); // удаляет товар из каталога
    void MarketBehaviour(Customer user); //помещает и удаляет человека из очереди
    Integer Update(Goods order, Integer count); // обновляет состояние 

}
