public class SuperClase {
    int mcount = 0;
    int icount = 0;
    int tcount = 0;
    double aux=0.0;

    public SuperClase() {
        this.icount++;
    }
    
    // Añade los métodos que se te piden en el enunciado
    
    public double media(int[] valores) {
        // Completa lo que se te pide en el enunciado 
        for(int i=1;i<valores.length;i++){
            aux=aux+valores[i];
        }
        aux=aux/valores.length;
        mcount++;
        return aux;
    }

    public double dosDecimales(double d){
        mcount++;
        return Math.round(d * 100.0) / 100.0;
    }

    //Creo un metodo que quita los caracteres duplicados de un string
    String QuitaDuplicados(String s) {
        StringBuilder noDup = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
        String si = s.substring(i, i + 1);
        if (noDup.indexOf(si) == -1) {
        noDup.append(si);
        mcount++;
        } 
    }
    return noDup.toString();
    }

    public int suma(int a, int b) {
        this.mcount++;
        return a+b;
    }

}
