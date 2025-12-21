#!/usr/bin/env ruby

# Exemplos simples de estruturas condicionais em Ruby
# Rode: ruby condicionais.rb

puts "--- Condicionais em Ruby: exemplos simples ---"

puts "\n1) if / else"
age = 18
if age >= 18
	puts "Maior de idade (age = #{age})"
else
	puts "Menor de idade (age = #{age})"
end

puts "\n2) if / elsif / else"
score = 72
if score >= 90
	puts "Nota A"
elsif score >= 75
	puts "Nota B"
elsif score >= 60
	puts "Nota C"
else
	puts "Nota F"
end

puts "\n3) unless (executa quando a condição é falsa)"
is_raining = false
unless is_raining
	puts "Não está chovendo — vou caminhar"
else
	puts "Está chovendo — melhor ficar em casa"
end

puts "\n4) formas modificadoras (postfix): expressão if/unless"
hungry = true
puts "Vou comer" if hungry
puts "Não estou com fome" unless hungry

puts "\n5) operador ternário"
time = 20
puts time < 12 ? "Bom dia" : "Boa tarde/noite"

puts "\n6) atribuição condicional (||=)"
name = nil
name ||= "Visitante"
puts "Nome: #{name}"

puts "\n7) case (similar a switch) — valores simples e múltiplos when"
letter = 'b'
case letter
when 'a'
	puts "Letra A"
when 'b', 'c'
	puts "Letra B ou C"
else
	puts "Outra letra"
end

puts "\n8) case com ranges (útil para notas/intervalos)"
grade = 85
case grade
when 90..100
	puts "Conceito A"
when 75...90
	puts "Conceito B"
when 60...75
	puts "Conceito C"
else
	puts "Conceito F"
end

puts "\n9) operador lógico e curto-circuito"
a = nil
b = "valor padrão"
result = a || b  # se a for nil/false, usa b
puts "result: #{result}"

puts "\n10) if aninhado (exemplo simples)"
x = 10
if x > 0
	if x > 5
		puts "x é maior que 5"
	else
		puts "x é entre 1 e 5"
	end
else
	puts "x é zero ou negativo"
end

# 11) pattern matching (Ruby 2.7+) — executa só se a versão suportar
if RUBY_VERSION >= '2.7'
	puts "\n11) pattern matching (case/in) — disponível em Ruby >= 2.7"
	value = { name: "Lucas", age: 30 }
	case value
	in { name: n, age: a }
		puts "Nome: #{n}, idade: #{a} (pattern matching)"
	else
		puts "Não casou"
	end
else
	puts "\n(11) Pattern matching não disponível nesta versão do Ruby (#{RUBY_VERSION})"
end

puts "\n--- Fim dos exemplos ---"
