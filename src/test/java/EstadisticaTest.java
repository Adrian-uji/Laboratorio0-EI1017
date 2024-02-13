import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.Assert.assertEquals;

class EstadisticaTest {
    private Estadistica prueba;
    @BeforeEach
    void before(){
        prueba = new Estadistica();
    }
    @Test
    void media() {
        //Estadistica prueba = new Estadistica();
        float[] p1 = new float[0];
        System.out.println("Comprobamos que se puede hacer la media de un conjunto vacío -> 0 / " + prueba.media(p1));
        assertEquals(0,prueba.media(p1),0.0);
        float[] p2 = {5,5,5};
        System.out.println("Comprobamos que la media de tres números iguales da ese número {5,5,5} -> 5 / "+prueba.media(p2));
        assertEquals(5.0,prueba.media(p2),0.0);
        float[] p3 = {1};
        System.out.println("Comprobamos, solo un elemento {1} -> 1 / " + prueba.media(p3));
        assertEquals(1.0,prueba.media(p3),0.0);
        float[] p4 = {0,1,5,-22};
        System.out.println("Comprobamos con números negativos {0,1,5,-22} -> -4 / " + prueba.media(p4));
        assertEquals(-4,prueba.media(p4),0.0);
        float[] p5 = {9, 7.5F,-4.5F,-3};
        System.out.println("Comprobamos con números aleatorios y flotantes {9,7.5,-4.5,-3} -> 2,25 / " + prueba.media(p5));
        assertEquals(2.25,prueba.media(p5),0.0);
        float[] p6 = null;
        System.out.println("Comprobamos que funcione cuando le pasamos null -> 0 / " + prueba.media(p6));
        assertEquals(0, prueba.media(p6),0.0);
    }

    @Test
    void variancia() {
        //Estadistica prueba = new Estadistica();
        float[] p1 = {};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un conjunto vacío -> 0 / "+prueba.variancia(p1));
        assertEquals(0,prueba.variancia(p1),0.0);
        float[] p2 = null;
        System.out.println("Comprobamos que ocurre cuando el valor dado es null -> 0 / "+prueba.variancia(p2));
        assertEquals(0,prueba.variancia(p2),0.0);
        float[] p3 = {-8,-7,-5,-2};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un conjunto de números negativos {-8,-7,-5,-2} -> 5.25 / "+prueba.variancia(p3));
        assertEquals(5.25,prueba.variancia(p3),0.0);
        float[] p4 = {100};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un único elemento {100} -> 0.0 / "+prueba.variancia(p4));
        assertEquals(0,prueba.variancia(p4),0);
        float[] p5 = {-7,-7,-1.2F,2.5F,6.8F};
        System.out.println("Comprobamos que ocurre cuando el valor dado son valores aleatorios y flotantes {-7,-7,-1.2,2.5,6.8} -> 28.9936 / "+prueba.variancia(p5));
        assertEquals(28.9936,prueba.variancia(p5),0.0001);


    }

    @Test
    void desviacion() {
        //Estadistica prueba = new Estadistica();
        float p1[] = {};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un conjunto vacío -> 0 / "+prueba.desviacion(p1));
        assertEquals(0,prueba.desviacion(p1),0.0);
        float p2[] = {1,1,1};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un son tres números iguales -> 0 / "+prueba.desviacion(p2));
        assertEquals(0,prueba.desviacion(p2),0.0);
        float p3[] = {1};
        System.out.println("Comprobamos que ocurre cuando el valor dado es un único número -> 0 / "+prueba.desviacion(p3));
        assertEquals(0,prueba.desviacion(p3),0.0);
        float p4[] = {8,2,4,6};
        System.out.println("Comprobamos que ocurre cuando el valor es un conjunto aleatorio {8,2,4,6} -> 2.2360 / "+(prueba.desviacion(p4)- prueba.desviacion(p4)%0.0001));
        assertEquals(2.2360,prueba.desviacion(p4),0.0001);
        float p5[] = {-9,-7.2F,-3.6F,4,4.7F,7};
        System.out.println("Comprobamos que ocurre cuando el valor es un conjunto aleatorio con números negativos y flotantes {-9,-7.2,-3.6,4,4.7,7} -> 6.1925 / "+(prueba.desviacion(p5)- prueba.desviacion(p5)%0.0001));
        assertEquals(6.1925,prueba.desviacion(p5),0.0001);
        float p6[] = null;
        System.out.println("Comprobamos que ocurre cuando el valor dado es null -> 0 / "+prueba.desviacion(p6));
        assertEquals(0,prueba.desviacion(p6),0.0);

    }
}

//EJEMPLO - TRY CATCH
    /*boolean excepcion = false;
        try {
                l.remove();
                } catch (NullPointerException e) {
                System.out.println(" ...OK");
                excepcion = true;
                }
                assertTrue("Excepcion no lanzada", excepcion);*/