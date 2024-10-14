public class NonStaticDefault {
    int tempInt;
    long templong;
    float tempFloat;
    boolean tempboolean;
    double tempdouble;
    Integer tempInteger;
    Long tempLong;
    Float tempFloatF;
    Double tempDouble;
    Boolean tempBoolean;

    public static void main(String[] args) {
        NonStaticDefault s=new NonStaticDefault();
        System.out.println("temp variable of int "+s.tempInt);
        System.out.println("temp variable of long"+s.templong);
        System.out.println("temp variable of float"+s.tempFloat);
        System.out.println("temp variable of double"+s.tempdouble);
        System.out.println("temp variable of boolean"+s.tempboolean);
        System.out.println("temp variable of Long"+s.tempLong);
        System.out.println("temp variable of Integer"+s.tempInteger);
        System.out.println("temp variable of Float"+s.tempFloatF);
        System.out.println("temp variable of Double"+s.tempDouble);
        System.out.println("temp variable of Boolean"+s.tempBoolean);
    }

}
