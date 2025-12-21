class Teste 
  def ola
    puts "Olá"
  end

  def self.hello #self é usado para indicar que o método é da classe, como o static do java.
    puts "Hello"
  end
end

t = Teste.new
t.ola

Teste.hello