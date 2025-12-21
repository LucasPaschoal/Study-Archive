require_relative 'pagamento'

include Pagamento

puts "Digite a bandeira: "
b = gets.chomp
puts "Digite o valor: "
v = gets.chomp

puts pagar(b, v)

p = Pagamento::Visa.new
puts p.pagando