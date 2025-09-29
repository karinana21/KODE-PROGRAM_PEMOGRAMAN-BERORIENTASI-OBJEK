class Hewan {
    void hidup() {
        System.out.println("Hewan bisa hidup");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk guk...");
    }
}
