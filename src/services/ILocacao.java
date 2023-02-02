package services;

import models.Contrato;
import models.Pagamento;

public interface ILocacao {
    public void assinar (Contrato contrato) throws Exception;
}
