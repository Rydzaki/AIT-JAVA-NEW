package home_work.residents;

import java.util.List;
import java.util.Map;

public interface Residents {
    //    в какой (каких) квартирах зарегистрировано наибольшее количество жильцов?
//в какой (каких) квартирах зарегистрировано наименьшее количество жильцов?
//на каком (каких) этажах имеется наибольшее кол-во жильцов?
//какое кол-во несовершеннолетних жильцов зарегистрировано в доме?

   void maxResidents (List <Resident> residents);
    void minResidents (List <Resident> residents);
    void maxFloorResidents (List <Resident> residents);
    void minUnderageResidents (List <Resident> residents);


}
