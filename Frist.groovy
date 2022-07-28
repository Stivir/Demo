
package Demo


def pp1, pp2, pp3, pp4, pp5, nocio, id, ip, resl1, resl2, resl3 = 1,a, nome, maior;

Scanner s = new Scanner(System.in);
println "Digite o seu nome"
nome = s.next();
println "Digite a sua Nacionalidade"
nocio = s.next();
println "Digite a sua Idade"
id = s.nextInt();
println "Digite a sua Provincia"
ip = s.next();

println "Digite o primeiro valor de pagamento";
pp1 = s.nextInt();
println "Digite o Segundo valor de pagamento";
pp2 = s.nextInt();
println "Digite o Terceiro valor de pagamento";
pp3 = s.nextInt();
println "Digite o Quarto valor de pagamento";
pp4 = s.nextInt();

println "Digite o Quinto valor de pagamento";
pp5 = s.nextInt();

resl1 = (pp1  + pp2 + pp3 + pp4 + pp5 + 100 );
resl2 = (pp1  + pp2 + pp3 + pp4 + pp5 )/5;


 
lista = [pp1,pp2,pp3,pp4,pp5]

if (lista > maior) {
	maior = lista
}

println "///////////////////"
println " Nome: " + nome
println " Nacionalidade: " + nocio
println " Idade: " + id
println " Provincia: " + ip
println " Soma dos valores: " + "= $resl1";
println " Media dos  dos valores: " + "= $resl2";

println " Maior Numero: " +maior
println " Maior Numero: " +lista.max() 
println " Menor Numero: " +lista.min()

