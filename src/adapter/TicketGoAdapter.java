package adapter;

public class TicketGoAdapter implements VentaEntradas {

    private TicketGo ticketGo;
    
    public TicketGoAdapter(TicketGo ticketGo) {
        this.ticketGo = ticketGo;
    }

    @Override
    public void comprarEntrada(String artista) {
        ticketGo.comprarTicket(artista);
    }
}

