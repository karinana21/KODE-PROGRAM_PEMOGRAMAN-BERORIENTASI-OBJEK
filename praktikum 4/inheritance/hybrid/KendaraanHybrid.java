class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan bisa jalan");
    }
}

interface Mesin {
    void nyalakanMesin();
}

class Mobil extends Kendaraan implements Mesin {
    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan");
    }
}

class Motor extends Kendaraan implements Mesin {
    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan");
    }
}
