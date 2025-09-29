class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan bisa berjalan");
    }
}

class Mobil extends Kendaraan {
    void roda() {
        System.out.println("Mobil punya 4 roda");
    }
}

class Sedan extends Mobil {
    void tipe() {
        System.out.println("Ini adalah mobil sedan");
    }
}
