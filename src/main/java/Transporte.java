public class Transporte {

    protected String trsnsporteAereo;
    protected  String  transporteMartimo;
    protected  String getTransporteTerrestre;

    public Transporte(String trsnsporteAereo, String transporteMartimo, String getTransporteTerrestre) {
        this.trsnsporteAereo = trsnsporteAereo;
        this.transporteMartimo = transporteMartimo;
        this.getTransporteTerrestre = getTransporteTerrestre;
    }

    public String getTrsnsporteAereo() {
        return trsnsporteAereo;
    }

    public void setTrsnsporteAereo(String trsnsporteAereo) {
        this.trsnsporteAereo = trsnsporteAereo;
    }

    public String getTransporteMartimo() {
        return transporteMartimo;
    }

    public void setTransporteMartimo(String transporteMartimo) {
        this.transporteMartimo = transporteMartimo;
    }

    public String getGetTransporteTerrestre() {
        return getTransporteTerrestre;
    }

    public void setGetTransporteTerrestre(String getTransporteTerrestre) {
        this.getTransporteTerrestre = getTransporteTerrestre;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "trsnsporteAereo='" + trsnsporteAereo + '\'' +
                ", transporteMartimo='" + transporteMartimo + '\'' +
                ", getTransporteTerrestre='" + getTransporteTerrestre + '\'' +
                '}';
    }
}
