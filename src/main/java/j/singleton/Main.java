package j.singleton;

import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args){
        System.out.println("---start---");
        IntStream.range(0, 10).forEach(i -> System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber()));
        Triple alpha = Triple.getInstance("ALPHA");
        System.out.println(alpha + "---end---");
    }
}
