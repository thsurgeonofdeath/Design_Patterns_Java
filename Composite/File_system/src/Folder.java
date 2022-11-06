import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }
    @Override
    public void view() {
        String tab = identation();
        System.out.println(tab+"Folder: "+name);
        for(Component c:components){
           c.view();
        }
    }
    public Component addComponent(Component c){
        c.level = this.level + 1;
        c.parent = this;
        this.components.add(c);
        return c;
    }
    public void removeComponent(Component c){
        this.components.remove(c);
    }
    public Component getComponent(String name){
        for(Component c:components){
            if(c.name.equals(name)) return c;
        }
        return null;
    }
}
