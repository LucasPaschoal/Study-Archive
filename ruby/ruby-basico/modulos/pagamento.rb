module Pagamento
  def pagar (bandeira, valor)
    "Pagando o cartão #{bandeira} o valor de #{valor}"
  end

  class Visa
    def pagando
      "pagando ..."
    end
  end
end