package Adaptador;

public aspect TicketGoAspect {
    declare parents: TicketGo implements VentaEntradas;

    public void TicketGo.comprarEntrada(String artista) {
        this.comprarTicket(artista);
    }
}
