// Организовать ввод и хранение данных пользователей. ФИО возраст и пол
// вывод в формате Фамилия И.О. возраст пол
// добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class program4
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> fio = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String text = " ";
        FileReader reader = new FileReader("TextProgram4.txt");
        while (reader. ready ()) {
            text += (char) reader. read();
        }
        reader.close();
        String [] str = text.split("\r\n");
        for (int i = 1; i < str.length; i++){
            String [] sb = str[i].split(" ");

            fio.add(sb[0] + " ");
            age.add(Integer.valueOf(sb[1]));
            gender.add(sb[2] == "M" ? true : false);
            index.add(i);
        }

        for (int i = 0; i < index.size(); i++){
            System.out.printf(fio.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf((gender.get(i) ? "M" : "Ж"));
            System.out.println();
        }
        
    }
    
}