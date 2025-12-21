puts "Put your age: "
v1 = gets.chomp
=begin
todo valor lido pelo gets eh um valor do tipo string
temos que converter esse valor e podemos usar os sguintes operadores
.to_i     - inteiro
.to_f     - float
.to_s     - String
=end
v2 = v1.to_i + 1
puts "Your age in next year will: #{v2}"

