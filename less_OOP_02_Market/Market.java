package less_OOP_02_Market;
/*
 * Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;


public class Market implements I_QueueBehavior{
    private Random rd = new Random();
    
    String name = "MyMarket";
    ArrayList<Goods> catalog = new ArrayList<>();
    Queue <Customer> marketQueue = new ArrayDeque<Customer>();

    @Override
    public void addGood(Goods g) {
        this.catalog.add(g);
    }

    public void removeGood(Goods g) {
        this.catalog.remove(g);
    }
    
    @Override
    public void MarketBehaviour(Customer newUser) {
        marketQueue.add(newUser);
    }

    @Override
    // передаем приобретаемый товар и его количчество, возвращаем количество купленного товара
    public  Integer Update(Goods order, Integer quantityThisCustomerGoods) { 
            Integer quantityThisMarketGoods = order.getQuantity(); // Доступное количество товара в Магазине 

            if (quantityThisMarketGoods == 0){
                System.out.printf("МАГАЗИН --> !!!Attention!!! Товар #%d'%s' сейчас ОТСУТСТВУЕТ!\n",order.getGoodsID(), order.getGoodsName());
                quantityThisCustomerGoods = 0;
            }
            else{
                if (quantityThisCustomerGoods > quantityThisMarketGoods){
                    System.out.printf("МАГАЗИН --> !!!Attention!!! Вы запрашиваете %d ед. товара #%d '%s'.\nМАГАЗИН --> Остаток в магазине сейчас только: %d ед.!\n",quantityThisCustomerGoods,order.getGoodsID(), order.getGoodsName(), quantityThisMarketGoods);
                    quantityThisCustomerGoods = quantityThisMarketGoods;
                }
                System.out.printf("МАГАЗИН --> Вам продано %d ед. #%d'%s' на общую сумму: %.2f руб.\n", quantityThisCustomerGoods, order.getGoodsID(), order.getGoodsName(),order.getPrice()*quantityThisMarketGoods);
            }
            Integer remain = quantityThisMarketGoods - quantityThisCustomerGoods;// остатки товара в магазине
            order.setQuantity(remain);

            System.out.println("-----");
        return quantityThisCustomerGoods;
    }
    
    public void printCatalog() {
        for (Goods i : this.catalog){
            System.out.println(i);
        }
    }

    public void printAvailableGoods() {
        System.out.printf("\nМАГАЗИН --> В магазине '%s' cейчас доступны следующие товары:\n",this.name);
        for (Goods i : this.catalog){
            if (i.getQuantity() > 0){
                System.out.println(i);   
            }
        }
    }
    public void printQueue(){
        System.out.printf("\nВ магазине '%s' cформировалась очередь покупателей:\n", this.name);
        for (Customer que : marketQueue) {
            System.out.println(que);
        }
    }

    public void startSale() {
        System.out.println("\n---РАСПРОДАЖА НАЧАЛАСЬ!---");
        while (marketQueue.size() > 0){
            System.out.printf("-----!Свободная касса!-----");
            Customer que = marketQueue.remove(); 
                
            int count = rd.nextInt(1, this.catalog.size()); 
            System.out.printf("\nПокупатель из очереди #%03d %s:\n",que.getcustomerID(), que.getCustomerName());
            for (int i = 1; i <= count; i++){
                //printCatalog();
                Goods purshGoods = this.catalog.get(rd.nextInt(this.catalog.size())); // покупатель покупает случайные товары
                Integer quantThisG = rd.nextInt(1, 100);// имитация приобретения опредленного количества товаров
                System.out.printf("%7s --> Хочу купить: %d шт. #%d'%s'!\n", que.getCustomerName(), quantThisG, purshGoods.getGoodsID(), purshGoods.getGoodsName());
                
                Integer x = Update (purshGoods,quantThisG); // обновление остатков
                que.purchaseGoods(purshGoods, x); // формирование списка купленных товаров конкретным покупателем
            }
            //que.printPurchaseGoods();
        }
    }
}
