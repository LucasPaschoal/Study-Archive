=begin
class Pessoa
  @nome = nil
  @idade = nil

  def set_nome(nome)
    @nome = nome
  end

  def get_nome
    @nome
  end

  #dessa forma eu consigo definir um valor default caso o seja passado nada como parametro
  def gritar(texto = "Grrrrh!")
    puts "Grintando... #{texto}"
  end

  def agradecer
    puts "Obrigado!"
  end
end
=end

class Pessoa
  attr_accessor :nome
  attr_accessor :idade

  #def nome=(nome)
  #  @nome = nome
  #end

  #def nome
  #  @nome
  #end

  #dessa forma eu consigo definir um valor default caso o seja passado nada como parametro
  def gritar(texto = "Grrrrh!")
    puts "Grintando... #{texto}"
  end

  def agradecer
    puts "Obrigado!"
  end
end

obj = Pessoa.new
obj.gritar("AAAI")
obj.agradecer
obj.nome = "Lucas"
puts obj.nome