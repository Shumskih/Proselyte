package main.java.net.proselyte.chapter03;

//Вычислить расстояние, проходимое светом,
//используя переменные типа long
class Light {
    public static void main (String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //Приблизительная скорость света(миль в сек.)
        lightspeed = 186000;

        days = 1000; //Количество дней

        seconds = days * 24 * 60 * 60; //Преобразовать в секунды

        distance = lightspeed * seconds; //Вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " миль.");



    }
}
