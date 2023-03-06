// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;


public class task2 {
public static void main(String[] args) {

Random rand = new Random();
ArrayList<Integer> list = new ArrayList<>();

for (int i = 0; i < 10; i++) {
list.add(rand.nextInt(100));
}
System.out.print(list);

System.out.println();
DeleteEvenNumber(list);
System.out.print(list);
}
public static void DeleteEvenNumber(ArrayList<Integer> list){
    int i = 0;
    while (i < list.size()){
        if(list.get(i) % 2 == 0) list.remove(i);
        else i++;
    }
}
}
