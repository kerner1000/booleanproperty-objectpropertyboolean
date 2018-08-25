
import javafx.beans.property.*;
import org.junit.Test;


public class Example {

    @Test
    public void test00()

    {
        StringProperty p1 = new SimpleStringProperty();
        StringProperty p2 = new SimpleStringProperty();

        p1.addListener((o, ov, nv) -> System.err.println("p1 Changed " + ov + " -> " + nv));
        p2.addListener((o, ov, nv) -> System.err.println("p2 Changed " + ov + " -> " + nv));

        p1.bindBidirectional(p2);

        System.err.println("Setting p2");
        p2.set("T");
        p2.setValue("F");

        System.err.println("Setting p1");
        p1.set("T");
        p1.setValue("F");


    }

    @Test
    public void test01()

    {
        BooleanProperty p1 = new SimpleBooleanProperty();
        ObjectProperty<Boolean> p2 = new SimpleObjectProperty<>();

        p1.addListener((o, ov, nv) -> System.err.println("p1 Changed " + ov + " -> " + nv));
        p2.addListener((o, ov, nv) -> System.err.println("p2 Changed " + ov + " -> " + nv));

        p1.bindBidirectional(p2);

        System.err.println("Setting p2");
        p2.set(true);
        p2.setValue(false);

        System.err.println("Setting p1");
        p1.set(true);
        p1.setValue(false);


    }

    @Test
    public void test02()

    {
        BooleanProperty p1 = new SimpleBooleanProperty();
        ObjectProperty<Boolean> p2 = new SimpleObjectProperty<>();

        p1.addListener((o, ov, nv) -> System.err.println("p1 Changed " + ov + " -> " + nv));
        p2.addListener((o, ov, nv) -> System.err.println("p2 Changed " + ov + " -> " + nv));

        p2.bindBidirectional(p1);

        System.err.println("Setting p2");
        p2.set(true);
        p2.setValue(false);

        System.err.println("Setting p1");
        p1.set(true);
        p1.setValue(false);


    }

}
