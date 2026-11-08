package adapter;

public aspect TicketGoAdapterAspect {
    
    // Hace que TicketGo implemente VentaEntradas dinamicamente
    declare parents: TicketGo implements VentaEntradas;

    // Implementa el método requerido y lo delega al método original
    public void TicketGo.comprarEntrada(String artista) {
        this.comprarTicket(artista);
    }
}