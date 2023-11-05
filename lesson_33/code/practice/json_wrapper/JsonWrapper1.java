package practice.json_wrapper;

// имя Леонид, возраст 59, - данные в одной программе
// {name: Leonid, age: 59} - ограничитель начала и конца строки(тела)
// json который передают другой программе которая может его прочитать (парсинг)



public class JsonWrapper1 {

    // поле класса
    private Object value;

    // конструктор


    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: " + value +
                "}";
    }
}

