package enumTest2;

public enum Plant {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);
    private final double mass;
    private final double radius;

    Plant(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

    public static void main(String[] args) {


        if (args.length != 1) {
            System.out.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }

        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / EARTH.surfaceGravity();

        for (Plant p : Plant.values())
            System.out.printf("Your weigh on %s is %f%n", p, p.surfaceWeight(mass));
    }

}
