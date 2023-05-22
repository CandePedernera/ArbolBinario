public class Nodo {
    protected Object dato;
    protected Nodo izdo;
    public Nodo getDcho() {
        return dcho;
    }
    protected Nodo dcho;

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo(Object valor){
        dato = valor;
        izdo = dcho = null;
    }

    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;

    }
    public void visitar(){
        System.out.print(dato + " ");
    }
}
