/*
 Classe principal - controle remoto
 */
package aula06;
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean tocando;
    private boolean ligado;
    //Métodos Especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isLigado() {
        return true;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }
   
    @Override
    public void abrirMenu() {
        System.out.println("---Menu---");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está Tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i =0; i<= this.getVolume(); i+=10){
        System.out.print("|");
    }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() == true) {
            this.setVolume(this.getVolume()+3);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()== true){
            this.setVolume(this.getVolume()-3);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getVolume()>0 && isLigado()== true){
            this.setVolume(0);
            
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado()== true && getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando()==true)){
            this.setTocando(true);
        }
            
    }

    @Override
    public void pause() {
        if (this.isLigado() && (this.isTocando()== true)){
            this.setTocando(false);
        }
    }
    
    
    
    
}
