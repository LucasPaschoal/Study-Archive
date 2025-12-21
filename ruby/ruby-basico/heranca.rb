class Pai
  attr_accessor :nome

  def initialize(nome)
    @nome = nome
  end

  def falr(texto = "Alo")
    texto
  end
end

class Filha < Pai
  attr_accessor :idade

  def initialize(nome, idade)
    super(nome)
    @idade = idade
  end
end


pai = Pai.new("Jose")
puts pai.nome

puts "------"

filha = Filha.new("Fulano", 22)
puts filha.nome
puts filha.idade