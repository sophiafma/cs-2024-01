# Rest API 
### O que são APIs?
As interfaces de programação de aplicativos (APIs) são conjuntos de ferramentas, definições e protocolos para a criação de aplicações de software. APIs conectam soluções e serviços, sem a necessidade de saber como esses elementos foram implementados.  

### Características de uma API Rest
API Rest é uma API em conformidade com as restrições do estilo de arquitetura REST(Representational State Transfer), permitindo a interação com serviços web RESTful.  
A comunicação entre o cliente e o servidor ocorre através de solicitações HTTP, nas quais o servidor envia representações do estado de um recurso (por exemplo, em formatos como JSON, HTML ou texto plano) em resposta às solicitações do cliente.  
Essas solicitações e respostas incluem cabeçalhos e parâmetros que carregam informações como identificação do recurso, metadados, autorizações e instruções de cache, facilitando uma interação eficiente e flexível entre sistemas na web, sem depender de um protocolo ou padrão específico, mas seguindo um conjunto de restrições arquitetônicas.


Critérios para uma API ser considerada do tipo Restful:  
* Arquitetura cliente/servidor: Interação entre clientes, servidores e recursos, com comunicação via HTTP.
* Comunicação Stateless: Cada solicitação é independente, sem armazenar informações do cliente entre as interações.
* Armazenar dados em cache
* Sistema em Camadas: Organização hierárquica de servidores
* Código sob Demanda (Opcional): Permite enviar código executável do servidor para o cliente, ampliando a funcionalidade.
* Interface Uniforme: Inclui identificação clara de recursos, representações manipuláveis pelo cliente, mensagens autodescritivas e uso de hipertexto/hipermídia para a navegação.
