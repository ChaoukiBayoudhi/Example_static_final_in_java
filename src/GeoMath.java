public class GeoMath {
    public final static int x=20;//declaration d'une constante stitique
    public final int z=30;//declaration d'une constante publique
    private int y;
    private static int a;//declaration d'un attribut statique private
    //son getter et son setters doivent être satic
    private final int b=20;//declaration d'une constante private
    //on peut definir uniquement le getter.
    //pas de setter pour les constantes.

//dans le constructeur on ne peut pas initialiser ni attribut final static, ni final
    public GeoMath(int y) {
        this.y = y;
        a=50;
        //b=0;//erreur car b est une constante
        //de même pour x et z
    }

    public static double getSquareSurface(double rayoun)
    {
        //y=30;//Erreur var y est un attribut d'instance ==>il ne peut pas être appelé dans une methode de classe (statique)
        //x=10;//Erreur car x est une constante
        return Math.PI*Math.pow(rayoun,2);
    }
    public static double getSquarePerimeter(double rayoun)
    {
       // showY();//Erreur car la méthode showY est une méthode d'instance, donc elle ne peut pas
        //être appelée dans une méthode de classe (statique)
        return 2*Math.PI*rayoun;
    }
    public static double getRectangleSurface(double lg,double ln)
    {return lg*ln;}
    public static double getRectanglePerimeter(double lg,double ln)
    {return 2*(lg+ln);}
    public void showY()
    {
        System.out.println("y= "+this.y);
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        GeoMath.a = a;
    }

    public int getB() {
        return b;
    }
    //pas de set pour l'aatribut b car elle est une constante
}
