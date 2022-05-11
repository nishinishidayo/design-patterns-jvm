package j.template_method;

public class Main {
    public static void main(String[] args){
        AbstractDisplay disp = new CharDisplay('A');
        disp.display();
    }
}
