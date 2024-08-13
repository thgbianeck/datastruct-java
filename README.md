# Projeto Java com Gradle

Este projeto Java está configurado com Gradle, utilizando Java 21 e Gradle 8.9. O foco inicial é a implementação e teste de uma classe de estrutura de dados básica chamada `Array`. No entanto, o projeto está em expansão e novos estudos e implementações de diferentes estruturas de dados estão planejados.

## Sumário

- Visão Geral
- Estrutura do Projeto
- Requisitos
- Instalação
- Uso
- Executando Testes
- Estudos Futuros
- Contribuição
- Licença
- Contato

## Visão Geral

Este projeto demonstra a implementação inicial de uma classe de estrutura de dados em Java, começando com uma classe `Array`. A classe inclui métodos para adicionar, remover e acessar elementos, além de verificar o tamanho do array. O projeto utiliza Gradle para construção e JUnit 5 para testes.

Além da implementação atual, o projeto está planejado para expandir e incluir outras estruturas de dados, como Listas Ligadas, Pilhas, Filas, Conjuntos e Mapas, entre outros. O objetivo é explorar e implementar uma variedade de estruturas de dados para fortalecer o entendimento e a aplicação prática desses conceitos.

## Estrutura do Projeto

A estrutura do projeto é a seguinte: (Em modificação)


## Requisitos

- **Java 21**: Certifique-se de ter o JDK 21 instalado no seu sistema.
- **Gradle 8.9**: O Gradle é usado para gerenciamento de dependências e construção do projeto.

## Instalação

1. Clone o repositório para sua máquina local:
```bash
   git clone https://github.com/usuario/projeto-java.git
```
2. Navegue até o diretório do projeto:
```bash
   cd projeto-java
```
3. Compile o projeto e baixe as dependências usando Gradle:
```bash
   ./gradlew build
```
## Uso

Para usar a classe `Array`, você pode instanciá-la e utilizar seus métodos conforme mostrado no exemplo abaixo:

```java
import br.com.bnck.datastruct.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        array.add(10);
        array.add(20);
        System.out.println("Elemento no índice 0: " + array.get(0)); // Saída: 10
        array.remove(0);
        System.out.println("Elemento no índice 0 após remoção: " + array.get(0)); // Saída: 20
    }
}
```

## Executando Testes

Para executar os testes unitários, utilize o comando Gradle:

```bash
./gradlew test
```

Isso irá executar todos os testes definidos na pasta `src/test/java` e fornecer um relatório com os resultados.

## Estudos Futuros

Este projeto está em contínua expansão. Em futuras atualizações, novas estruturas de dados serão adicionadas para estudo e implementação prática. Algumas das estruturas planejadas incluem:

- **Listas Ligadas**: Implementações de listas ligadas simples e duplamente encadeadas.
- **Pilhas**: Implementação de pilhas baseadas em arrays e listas.
- **Filas**: Implementações de filas simples e de prioridade.
- **Conjuntos e Mapas**: Implementações de conjuntos e mapas usando diferentes abordagens.

Acompanhe o projeto para novas atualizações e contribuições futuras!

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para o projeto, siga estas etapas:

1. Faça um fork do repositório.
2. Crie uma branch para suas alterações:

   git checkout -b minha-contribuicao

3. Faça suas alterações e commit:
```bash
   git add .
   git commit -m "Descrição das mudanças"
```

4. Envie suas alterações para o repositório remoto:
```bash
   git push origin minha-contribuicao
```
5. Abra um Pull Request no GitHub para revisão.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Contato

Para mais informações, entre em contato com [Thiago Bianeck](mailto:thgbianeck@gmail.com).
