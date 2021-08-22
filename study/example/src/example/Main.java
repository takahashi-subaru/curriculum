package example;

public class Main {

    public static void main(String[] args) {
        Cat pepe = new Cat("ぺぺ", 3);  // ←こちらで3歳と設定していますが、、、
        pepe.agePlus();
        pepe.age = 0;     //←ageはカプセル化されてないために、このように不正な代入が行われる可能性がある！
        pepe.showName();
        pepe.showAge();
    }
}
/*
public class Main {

    public static void main(String[] args) {
        Cat pepe = new Cat("ぺぺ", 3);
        pepe.agePlus();
        pepe.age = 0;
        pepe.name = "タマ";     //←追加
        pepe.showName();
        pepe.showAge();
    }
}
*/