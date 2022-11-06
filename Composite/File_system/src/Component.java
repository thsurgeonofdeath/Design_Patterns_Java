public abstract class Component {
    protected String name;
    protected int level;
    protected Folder parent;
    public Component(String name) {
        this.name = name;
    }
    public abstract void view();
    public String identation(){
        String str="";
        for(int i=0;i< level;i++){
            str +="\t";
        }
        return str;
    }
}

