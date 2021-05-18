package Modul4;

public class Balok extends BangunRuang {

    double luas, volume, r = 2, t = 3;

    @Override
    int getLuasPermukaan() {
        luas = 2 * Math.PI * r * (r + t);
        System.out.println("Luas Permukaan:" + luas);
        return 0;
    }

    @Override
    int getVolume() {
        volume = Math.PI * r * 2 * t;
        System.out.println("Volume :" + volume);
        return 0;
    }

}
