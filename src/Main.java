public class Main {
    public static void main(String[] args) {
        Class cl = new Class(12,"Beka",new int[]{23,434,55,67,78});
        System.out.println(cl.getNomer());
        System.out.println(cl.getSoz());

        for (int e:cl.getMassiv()) {
            System.out.print("   "+e);
        }
    }
}