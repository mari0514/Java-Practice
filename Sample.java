import java.util.Scanner;

// Student class
// class Student {
//   public int num;
//   public void show() {
//     System.out.println(num);
//   }
// }

// New class
// class New {
//   public int num;
// }

// Students class
// class Students {
//   public int num;
// }

// Teacher class
// class Teacher {
//   public int num;
// }

// Teachers class
class Teachers {
  public int num;
}

public class Sample {
  // 関数 2:13;51~
  // public static void hello() {
  //   System.out.println("Hello World!");
  // }
  // public static void nibai(int x) {
  //   System.out.println(x * 2);
  // }
  // public static void keisan(int x, int y) {
  //   System.out.println("合計金額: " + ((100 * x) + (200 * y)));
  // }
  // public static int keisan2(int x) {
  //   int goukei = x * 200;
  //   return goukei;
  // }

  // average
  // public static void average(int[] x) {
  //   int i;
  //   int sum = 0;
  //   for(i = 0; i < x.length; i++) {
  //     sum += x[i];
  //   }
  //   System.out.println("Average score: " + sum / x.length);
  // }

  public static void main(String[] args) {
    // 文字列・数値
    // System.out.println("HelloWorld");
    // System.out.println("1000");
    // System.out.println("1000円");
    // System.out.println(10);
    // System.out.println(10 + 5);
    // System.out.println("10 + 5");
    // System.out.println("計算 " + (10 + 5));
    // System.out.println("Price: " + (1000 + 500) + "円");
    // System.out.println(10 * 3);
    // System.out.println(10 / 3);
    // System.out.println(10 % 3);
    // System.out.println(3.14);
    // System.out.println(3.14 + 10);

    // 変数
    // System.out.println(3 * 3 * 3.14);
    // int r = 3;
    // System.out.println(r * r * 3.14);
    // int apple = 10;
    // System.out.println(apple);
    // double pi = 3.14;
    // System.out.println((int)pi);
    // int x = 15;
    // x += 5;
    // System.out.println(x);
    // increment & decrement
    // int x = 10;
    // int y = 20;
    // x++;
    // y--;
    // System.out.println(x); // 11
    // System.out.println(y); // 19

    // if文
    // if(true)
    //   System.out.println("TRUE");
    // if(false)
    //   System.out.println("TRUE");
    // 等値演算子
    // int num = 10;
    // if(num == 10)
    //   System.out.println("Correct");
    // if(num != 10)
    //   System.out.println("Incorrect");
    // 関係演算子
    // int num1 = 5;
    // if(num1 > 10)
    //   System.out.println("num1 is greater than 10");
    // if(num1 < 10)
    //   System.out.println("num1 is less than 10");
    // if(num1 == 10)
    //   System.out.println("num1 is equal to 10");
    // 論理演算子
    // int num2 = 20;
    // if(num2 >= 5 && num2 <= 10)
    //   System.out.println("num2 is greater than 5 and less than 10");
    // if(num2 < 5 || num2 > 10)
    //   System.out.println("num2 is not greater than 5 and less than 10");
    // ブロック文
    // int num3 = 20;
    // if(num3 != 10) {
    //   System.out.println("num3 is not equal to 10");
    //   System.out.println("Input something else");
    // }
    // if else文
    // int num4 = 15;
    // if(num4 == 10)
    //   System.out.println("num4 is equal to 10");
    // else
    //   System.out.println("num4 is not eqaul to 10");
    // if, else if, else
    // int age = 15;
    // if(age <= 3)
    //   System.out.println("The price is 0");
    // else if(age <= 10)
    //   System.out.println("The price is 500");
    // else
    //   System.out.println("The price is 1000");
    // switch case
    // int num5 = 3;
    // switch (num5) {
    //   case 1:
    //     System.out.println("Harry");
    //     break;
    //   case 2:
    //     System.out.println("Mark");
    //     break;
    //   case 3:
    //     System.out.println("John");
    //     break;
    //   default:
    //     System.out.println("Number should be between 1 to 3");
    // }
    // 繰り返し　01:52:39~
    // int i;
    // for(i = 0; i < 3; i++) {
    //   System.out.println((i + 1) + "回目: Message");
    // }
    // for文　二重
    // 九九
    // int i, j;
    // for(i = 1; i <= 9; i++) {
    //   System.out.println(i + "の段: ");
    //   for(j = 1; j <= 9; j++) {
    //     System.out.print(String.format("%5s", i*j));
    //   }
    //   System.out.println();
    // }
    // while文
    // int num6 = 1;
    // int count = 0;
    // while(num6 < 1000) {
    //   num6 *= 2;
    //   count++;
    //   System.out.println(count + "回目: " + num6);
    // }
    // System.out.println(count + "回目に1000を超えます");
    // do while　条件式に関わらず一度は処理が実行される！
    // int num7 = 10;
    // do{
    //   num7 *= 2;
    //   System.out.println(num7);
    // }while(num7 < 5);
    // break文
    // int i;
    // for(i = 1; i <= 5; i++) {
    //   System.out.println(i + "回目の処理");
    //   if(i == 2)
    //     break;
    // }
    // continue文 (繰り返し中の処理を１回スキップする)
    // int i;
    // for(i = 0; i < 5; i++) {
    //   System.out.print(i);
    //   if(i == 4)
    //     continue;
    //   System.out.print(",");
    // }
    // System.out.println();
    

    // 関数 2:13;51~
    // hello(); // 3~5 lines

    // nibai関数
    // int num8 = 10;
    // nibai(num8);
    // int num9 = 20;
    // nibai(num9);

    // keisan関数
    // int apple, orange;
    // apple = 10;
    // orange = 5;
    // keisan(apple, orange);

    // keisan2関数
    // int apple = 10;
    // int result = keisan2(apple);
    // if(result > 3000)
    //   System.out.println("予算オーバーです");
    //   System.out.println("予算以内で購入できます");


    // 配列　array 2:47:10~
    // int[] array = {10, 20, 30};
    // System.out.println(array[0]);
    // System.out.println(array[1]);
    // System.out.println(array[2]);


    // int[] array2;
    // array2 = new int[4];
    // array2[0] = 1;
    // array2[1] = 2;
    // array2[2] = 3;
    // array2[3] = 4;
    // System.out.println(array2[0]);
    // System.out.println(array2[1]);
    // System.out.println(array2[2]);
    // System.out.println(array2[3]);


    // int[] array3 = new int[3];
    // array3[0] = 1;
    // array3[1] = 2;
    // array3[2] = 4;
    // System.out.println(array3[0]);
    // System.out.println(array3[1]);
    // System.out.println(array3[2]);


    //　配列とfor文
    // int i;
    // int[] array4 = {100, 200, 300, 400};
    // for(i = 0; i < array4.length; i++) {
    //   System.out.println((i + 1) + "番目: " + array4[i]);
    // }

    // int i;
    // System.out.println("要素数は幾つですか？");
    // Scanner obj = new Scanner(System.in); // System.in 値の入力
    // int num = obj.nextInt();
    // int[] array5 = new int[num];
    // System.out.println("数値を入力してください");
    // for(i = 0; i < num; i++) {
    //   array5[i] = obj.nextInt();
    // }
    // System.out.println("入力した数値はこちらです");
    // for(i = 0; i < num; i++) {
    //   System.out.println(i + "番目: " + array5[i]);
    // }


    // 配列を引数として渡す
    // avarage
    // int[] score = {68, 74, 81, 85, 92, 98};
    // average(score);


    // Student class
    // Student Tarou;
    // Tarou = new Student();
    // Tarou.num = 10;
    // Tarou.show();


    // New class
    // New Obj1;
    // Obj1 = new New(); // Newクラスの実体としてのインスタンスにObj1のアドレスを代入
    // New Obj2 = Obj1;
    // Obj1.num = 10;
    // Obj2.num = 20;
    // System.out.println(Obj1.num);


    // Students class
    // Students Mike = new Students();
    // Students Michelle = new Students();
    // Mike.num = 5;
    // Michelle.num = 10;
    // System.out.println(Mike.num);
    // System.out.println(Michelle.num);


    // Teacher class
    // Teacher[] arrayOfTheacher;
    // arrayOfTheacher = new Teacher[4];
    // int i;
    // for(i = 0; i < arrayOfTheacher.length; i++) {
    //   arrayOfTheacher[i] = new Teacher();
    // }
    // arrayOfTheacher[0].num = 10;
    // arrayOfTheacher[1].num = 20;
    // arrayOfTheacher[2].num = 30;
    // arrayOfTheacher[3].num = 40;
    // for(i = 0; i < arrayOfTheacher.length; i++) {
    //   System.out.println(arrayOfTheacher[i].num);
    // }


    // Teachers class
    Teachers Kate = new Teachers();
    Kate.num = 15;
    show(Kate);
    System.out.println(Kate.num);



    // カプセル化
    あ

  }

  // Teachers class
  public static void show(Teachers x) {
    System.out.println(x.num);
    x.num = 20;
  }
}