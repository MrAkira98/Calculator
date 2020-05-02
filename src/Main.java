import java.util.Scanner;


//VSC Git Pull - принять все изменения с GitHub
//VSC Git add - добавить под управления Git
//VSC commit - пишем комент к программе
//VSC Git Push - отправить на GitHub

























class Calculator {
    // Объявили метод mein() не возврощает данные
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in); // class сканер, сканирует входные данные, более точная инфа о (System.in); ( http://tutorials.jenkov.com/java-io/system-in-out-error.html )

        int first, second;  // объявил переменную с плавоющей точкой 4б

        System.out.println("Enter first num: ");// Выводим в консоль
        first = num.nextInt(); // Читает значение int от пользователя

        System.out.println("Enter second num: ");
        second = num.nextInt();

        System.out.println("Enter Charapter");
        char character = num.next().charAt(0); // class Scaner не подерживает num.nextChar() Чтобы прочитать символ, мы используем next (). CharAt (0)
	
	int result = 0;

	    if(character == '+'){
            result = first + second;
        }

        if(character == '-'){
            result = first - second;
        }

        if(character == '/'){
            result = first / second;
        }

        if(character == '*'){
            result = first * second;
        }

        System.out.println("Вот ну как бы Нащайника я насчитал как то так   " + result);
    }
}




