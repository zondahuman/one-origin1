package org.avenir.capital;

import com.abin.lee.algo.util.DateUtil;
import com.abin.lee.algo.util.JsonUtil;
import org.junit.Test;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 使用java让你实现一个queue，里面有offer，take，isEmpty方法。
 * 比如股票交易，offer同一只股票不同价格，和不同股票不断地写入，take只消费同一只股票最新的一条数据，不消费之前的数据，怎么实现？
 */
public class StackPriorityQueue {
    private ConcurrentHashMap<String, StockBean> concurrentHashMap = new ConcurrentHashMap<>();
    private BlockingQueue<StockBean> blockingQueue = new LinkedBlockingQueue<>();

    private void offer(StockBean stockBean){
        blockingQueue.offer(stockBean);
        concurrentHashMap.put(stockBean.getStockCode(), stockBean);
    }


    private StockBean take() throws InterruptedException {
        while(true){
            StockBean stockBean = blockingQueue.poll();
            if(null == stockBean){
                stockBean = blockingQueue.take();
            }
            StockBean realBean = concurrentHashMap.get(stockBean.getStockCode());
            if(Objects.nonNull(stockBean) && stockBean.getPrice().equals(realBean.getPrice())){
                concurrentHashMap.remove(stockBean.getStockCode());
                return stockBean;
            }
        }
    }

    private boolean isEmpty(){
        return blockingQueue.isEmpty();
    }


    static int temp = 0;

    public static void main(String[] args) throws InterruptedException {
        StackPriorityQueue stackPriorityQueue = new StackPriorityQueue();
        int loop = 10;
        while(true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        stackPriorityQueue.offer(new StockBean("stock" + i, new Double(i + "")));
                    }
                    for (int i = 0; i < 10; i++) {
                        stackPriorityQueue.offer(new StockBean("stock" + i, new Double(i + 1 + "")));
                    }
                    temp++;
                }
            }).start();

            StockBean stockBean=stackPriorityQueue.take();
            System.out.println(DateUtil.getYMDHMSTime() + "  ,------, "+ JsonUtil.toJson(stockBean));
            if(temp == loop){
                break;
            }
        }

    }

    @Test
    public void test1() throws InterruptedException {
//        StockBean stockBean=new StackPriorityQueue().take();
//        System.out.println(DateUtil.getYMDHMSTime() + "  ,------, "+ JsonUtil.toJson(stockBean));
    }


}
