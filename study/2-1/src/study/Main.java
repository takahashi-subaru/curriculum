package study;

/**
 *
 * 本課題では、フィールド変数、メソッドの基本的な使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   Main.java: 問①から問③
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

      //① firstNameとlastNameという名前の変数を定義し、
      //   firstNameには自分の名前、lastNameには自分の名字で初期化しなさい
<<<<<<< HEAD
         String firstName = ("kohei");
         String lastName = ("takahashi");
=======
    	final String firstName = "takahashi";
    	final String lastName = "kohei";
>>>>>>> 0d8152d7aef775d2ad35c4ff9d601e2023c91add


        //getName関数の呼び出しと出力
        System.out.println(getName(firstName, lastName));
        System.out.println();

<<<<<<< HEAD
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //③ arr 配列をループさせ、isOdd関数を使って配列の要素が奇数かどうかの判定を行いなさい。
        //   要素が奇数の場合には「nは奇数です。」と出力されます。
        for(int i = 0; i < arr.length; i++) {
            isOdd(arr[i]);
=======
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //③ arr 配列をループさせ、を行いなさい。
        //   要素が奇数の場合には「nは奇数です。」と出力されます。
        for (int num = 0; num < arr.length; num++) {
        	isOdd(num);
          }
>>>>>>> 0d8152d7aef775d2ad35c4ff9d601e2023c91add
        }



<<<<<<< HEAD
    }




=======
>>>>>>> 0d8152d7aef775d2ad35c4ff9d601e2023c91add

    //② 関数を定義しなさい。
    //   関数名：getName
    //  修飾子：public
    //   引数には①で定義したfirstNameとlastNameを引数で受け取り、
    //  last_name と first_name を連結した値を返り値とする変数を定義しなさい。
    public static String getName(String firstName,String lastName) {
<<<<<<< HEAD
        String first_name = firstName;
        String last_name = lastName;
        return last_name + first_name;
    }


=======
		return firstName + lastName;
	}
>>>>>>> 0d8152d7aef775d2ad35c4ff9d601e2023c91add


    //奇数の判定を行う。
    public static void isOdd(int num) {
      if(num % 2 != 0) {
        System.out.println(num + "は奇数です。");
        }
  }
}