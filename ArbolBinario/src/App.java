public class App {
    public static void main(String[] args) throws Exception {
        borrar();
        ArbolBinario arbol;
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();
        a1 = ArbolBinario.nuevoArbol(null, "Maria", null);
        a2 = ArbolBinario.nuevoArbol(null, "Rodrigo", null);
        a = ArbolBinario.nuevoArbol(a1, "Camila", a2);
        pila.insertar(a);
        a1 = ArbolBinario.nuevoArbol(null, "Anyora", null);
        a2 = ArbolBinario.nuevoArbol(null, "Abel", null);
        a = ArbolBinario.nuevoArbol(a1, "Jesus", a2);
        pila.insertar(a);
        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
        arbol = new ArbolBinario(a);
        System.out.println("PREORDEN");
        ArbolBinario.preOrden(a);

        System.out.println("\n EN ORDEN");
        ArbolBinario.enOrden(a);
        
        System.out.println("\n POST ORDEN");
        ArbolBinario.postOrden(a);

    }
    public static void borrar(){
        System.out.print("\033[H\033[2J");
    }
}
