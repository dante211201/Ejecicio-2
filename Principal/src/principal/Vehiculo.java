/*
 * VAZQUEZ SILVA DANTE
 * 2S11
 */
package principal;

public class Vehiculo {
    int opt;
    int ruedas;
    int matricula;
    int puertas;
    int pasajeros;

    public Vehiculo(int Ruedas,int Matricula,int Puertas,int Pasajeros){
        this.opt=opt;
        this.ruedas=Ruedas;
        this.matricula=Matricula;
        this.puertas=Puertas;
        this.pasajeros=Pasajeros;
    }

    public int getRuedas(){
        return ruedas;
    }

    public void setRuedas(int Ruedas){
        this.ruedas=Ruedas;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int Matricula){
        this.matricula=Matricula;
    }

    public int getPuertas(){
        return puertas;
    }
    public void setPuertas( int Puertas){
        this.puertas=Puertas;        
    }

    public int getPasajeros(){
        return pasajeros;
    }

    public void setPasajeros(int Pasajeros){
        this.pasajeros=Pasajeros;
    }

}   

