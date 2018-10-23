public class Zadanie {

    public static void main(String[] args) {
        System.out.println("Wyjątki dzielimy na dwie kategorie które trzeba obsłużyć i inne wyjatki które można, ale nie trzeba obsłużyć.\n" +
                "Wyjątki nieobslugiwane dziedziczą po klasie RuntimeException\n" +
                "Wyjątki rzucamy korzystając z instrukcji throw, jeśli rzucamy wyjątek kontrolowany musimy dodatkowo w sygnaturze metody/konstruktora zadeklarować wyjątek używając słowa throws\n" +
                "Do bloku try-catch możemy dodać dodatkowo blok finally, który wykona się zawsze, niezależnie, czy w bloku try wyjątek wystąpił, czy nie");
    }
}
