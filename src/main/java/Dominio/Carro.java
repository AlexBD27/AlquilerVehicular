package Dominio;

public class Carro extends Vehiculo {
    private Categoria categoria;

    public Carro(){
        //super(0, "");
    }
     // solo para poblar

    public Carro(int identificador, String descripción, double precioHora, String tipo) {
        super(identificador, descripción, precioHora, tipo);
    }
		
    public Categoria getCategoria() {
            return this.categoria;
    }

    public void setCategoria(Categoria c) {
            this.categoria = c;
    }

    @Override
    public double getPrecioHora() {
            switch(categoria) {
                    case A -> this.precioHora = 18;
                    case B -> this.precioHora = 14;
                    case C -> this.precioHora = 10;
            }
            return precioHora;
    }

}
