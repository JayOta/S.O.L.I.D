package L.right;


class A {
    public String getNome() {
        return "Meu nome é A";
    }
}

class B extends A{
    @Override
    public String getNome() {
        return "Meu nome é B";
    }
}

public class Main {
    
    public static void imprimeNome(A objeto) {
            System.out.println(objeto.getNome());
        }
    public static void main(String[] args) {
        A objeto1 = new A();
        B objeto2 = new B();
            
        imprimeNome(objeto1); // Meu nome é A
        imprimeNome(objeto2); // Meu nome é B
    }


}
