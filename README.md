# Backend_Developer_Challenge
Este projeto foi desenvolvido com intuito Educativo, para os que deseja aprender mais sobre spring boot

=>Denselvimento de uma API Restfull com Sprig boot<=

#================COMO INSTALAR=====================

#Requisitos
Antes de rodar este projecto deve instalar a versao 8 ou acima de 8 de java e o apache maven https://maven.apache.org/download.cgi na sua maquina

#End-points de teste da aplicacao

#Listagem de paises sem nenhuma ordem (GET)
Exemplo:  GET base_url/api/v1/paises/listarpaises

#=>>Listagem de de paises por ordem alfabetica (GET)<<=

Exemplo: GET base_url/api/v1/paises/listarpaises

#==Eliminar um pais (DELETE)==

Deve-se fornecer na rota o id do pais no qual pretende-se eliminar
Exempl0: DELETE base_url/api/v1/paises/eliminar_pais/1102

#==Atualizar um registo ja cadastrado==

ATributos que podem ser atualizados: (nome_pais,  capital,regiao, area, sub_regiao)

Se pretender atualizar todos atributos anteriormente mencionados, use a segunte url

Exemplo: PUT base_url/api/v1/paises/atualizar_pais/1103?nome_pais=KY&capital=xyz&area=980009km&sub_regiao=dddd&regiao=xyz

Se pretender atualizar apenas um e unico registo deve fornecer o atributo no qual deseja atualizar
PUT base_url/api/v1/paises/atualizar_pais/1103?nome_pais=KY

#Cadastrar um novo registo
Para o cadastro de um novo registo devera antes conhecer a estrutura de um json
#
A Estrutura do Json no qual devera fornecer a url de cadastro deve estar da seguinte maneira:
{
    "area": "32548 km2",
    "capital": "Y",
    "nome_pais": "X",
    "regiao": "WF",
    "sub_region": "XXY"
}
Tendo esta estrutura agora podes fazer o seu cadastro com a seguinte url(POST):

Exemplo: POST base_url/api/v1/paises/postpaises

Content-Type: application/json
{
    "area": "32548 km2",
    "capital": "Y",
    "nome_pais": "X",
    "regiao": "WF",
    "sub_region": "XXY"
}

#Notas
Estes testes podem ser realizados no navegador ou no postman e se nao tiver este, baixe neste link(https://www.postman.com/downloads/) ou no Insomnia e se nao tiver este, baixe neste link(https://insomnia.rest/download)
#Estrutura do Projecto
O projeto implementa uma arquitetura MVC e esta orientado a Objectos.

#Funcao de cada Classe Criada
O subpackege paises do package Backend_dev_challenge encontram-se la todas as classes principais.
1. Classe paises-> Esta classe cria os atributos que sera usado como classe dos nossos objectos. E eventualmente serao os mesmos atributos no processo de criacao da base de dados Paises
2. PaisesConfig-> Classe que faz o primeiro registo dos paises por default(padrao)
3. PaisesController-> Classe que define a regra de negocio entre o cliente, e define como eh que cada Instancia de um objecto deve ser acessado, resumindo eh o Controlador.
4. PaisesRepository-> Eh uma interface da aplicacao
5. PaisesServices-> Esta classe define a regra de negocio de como os dados devem ser acessados ao serem requisitados e de como estes devem ser mostrados. resumindo eh o MODELO

#Ficheiro de configuracao para conexao com banco de dados

Abra o diretorio basepath>src>main>resources>application.propaties

