class Pessoa
  attr_accessor :nome
  attr_accessor :idade


  def initialize(nome, idade)
    @nome = nome
    @idade = idade
  end
end

p1 = Pessoa.new("Lucas", 22)
puts p1.nome
puts p1.idade