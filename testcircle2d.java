public class testcircle2d {
    public static void main(String[] args) throws Exception {
        circle2d oby1 = new circle2d(2, 2, 5.5);

        if (oby1.contains(10, 10))
            System.out.println("Titik di dalam lingkaran"); 
        else 
            System.out.println("Titik luar lingkaran");

        System.out.println("Luas lingkarannya adalah: " + oby1.getArea());
        System.out.println("Keliling lingkarannya adalah " + oby1.getPerimeter());
        
        int hasil = oby1.contains(new circle2d(10, 10, 10));

        if (hasil == 1) {
            System.out.println("Lingkaran 2 di dalam lingkaran 1"); 
        } else if (hasil == 2){  
            System.out.println("Lingkaran 2 beririsan dengan lingkaran 1");
        } else {
            System.out.println("Lingkaran 2 di luar lingkaran 1");  
        }
        
    }
}
