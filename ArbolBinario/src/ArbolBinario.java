//304 imp pila
public class ArbolBinario {
    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo raizArbol() {
        return raiz;
    }

    // Comprueba el estatus del árbol
    boolean esVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha) {
        
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }
    
    public static void preOrden(Nodo r) {
        if (r != null) {
            r.visitar();
            preOrden(r.getIzdo());
            preOrden(r.getDcho());
        }
    }
    public static void enOrden(Nodo r) {
        if (r != null) {
            enOrden(r.getIzdo());
            r.visitar();
            enOrden(r.getDcho());
        }
    }
    public static void postOrden(Nodo r) {
        if (r != null) {
            postOrden(r.getIzdo());
            postOrden(r.getDcho());
            r.visitar();
        }
    }
    
    
}
