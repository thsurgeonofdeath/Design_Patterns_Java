public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        Folder d1 = new Folder("Structure");
        Folder d2 = new Folder("Comportement");
        Folder d3 = new Folder("Creation");
        Folder f1 = new Folder("Strategy Pattern");

        root.addComponent(d1);
        root.addComponent(d2);
        root.addComponent(d3);
        d2.addComponent(f1);

        d1.addComponent(new File("Pattern Composite"));
        d1.addComponent(new File("Decorator Composite"));
        d3.addComponent(new File("Singleton Composite"));
        d3.addComponent(new File("Builder Composite"));

        d1.addComponent(new Folder("fSt1"));
        Folder fSt1 = (Folder) d1.getComponent("fSt1");
        fSt1.addComponent(new File("Composite V.02"));

        root.view();
    }
}