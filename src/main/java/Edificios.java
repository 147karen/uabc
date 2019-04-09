public class Edificios {

    protected int numPisos;
    protected int departamento;
    protected String empresa;
    protected String oficinas;

    public  Edificios(){

    }

    public Edificios(int numPisos, int departamento, String empresa, String oficinas) {
        this.numPisos = numPisos;
        this.departamento = departamento;
        this.empresa = empresa;
        this.oficinas = oficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getOficinas() {
        return oficinas;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    @Override
    public String toString() {
        return "Edificios{" +
                "numPisos=" + numPisos +
                ", departamento=" + departamento +
                ", empresa='" + empresa + '\'' +
                ", oficinas='" + oficinas + '\'' +
                '}';
    }
}
