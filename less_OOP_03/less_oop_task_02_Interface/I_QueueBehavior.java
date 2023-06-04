package less_OOP_03.less_oop_task_02_Interface;

public interface I_QueueBehavior {
    void addGood(Goods goods); // добавляет товар в каталог
    //void removeGood (); // удаляет товар из каталога
    void MarketBehaviour(Customer user); //помещает и удаляет человека из очереди
    Integer Update(Goods order, Integer count); // обновляет состояни
} 
