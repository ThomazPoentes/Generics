# Generics
Polimorfismo Paramétricos no java é implementado como generics, então segue um repositório com explicações e demonstrações práticas sobre o tema.

Usaremos como referencia o LinkedList do java utils 
Criaremos uma classe comum em java, porém, oque a definirá como genérica será o parametro que iremos passar em sua declaração <T>: 
# "class GenericLinkedList <T>"

Neste exemplo, a classe GenericLinkedList é genérica e aceita um tipo de dado (T) como parâmetro. O tipo de dado determina o tipo de elementos que podem ser armazenados na lista.

No método main, três instâncias diferentes de GenericLinkedList são criadas: uma para armazenar strings, outra para armazenar números longos e uma terceira para armazenar números BigDecimal.

Os elementos são adicionados a cada lista usando o método add. Os elementos são acessados usando o método get e os valores são impressos na tela.

Desta forma, o uso dos tipos: String, Long e BigDecimal é ilustrado através do uso de uma classe genérica e de uma lista vinculada.
