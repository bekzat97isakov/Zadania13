import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int[] massiv = new int[]{};

    public int getNomer() {
        return nomer;
    }

    public String getSoz() {
        return soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nomer=" + nomer +
                ", soz='" + soz + '\'' +
                ", massiv=" + Arrays.toString(massiv) +
                '}';
    }

    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }
}
